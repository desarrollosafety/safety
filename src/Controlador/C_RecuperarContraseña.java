/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.M_RecuperarContraseña;
import java.sql.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.codec.digest.DigestUtils;

public class C_RecuperarContraseña {
    
    public Integer totalregistros;
    public String sSQL="";
    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.getConexion();
    
    public boolean RecuperarContraseña(M_RecuperarContraseña c){
      
        try {
            
            System.out.println(c.getConAdmin());
            System.out.println(c.getContraseña());
            System.out.println(c.getAdmin());
            System.out.println(c.getDestinatario());
            
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable", "true");
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.user", c.getAdmin());
            p.setProperty("mail.stmp.auth", "true");
           
            Session s;
            s = Session.getDefaultInstance(p,null);
            BodyPart texto = new MimeBodyPart();
            texto.setText("Su nueva contraseña es : "+c.getContraseña()+ " \n \n gracias por preferirnos SAFETY");          
           
            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(texto);
            
            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(c.getAdmin()));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(c.getDestinatario()));
            mensaje.setSubject("Nueva Contraseña");
            mensaje.setContent(m);
            
            Transport t = s.getTransport("smtp");
            t.connect(c.getAdmin(),c.getConAdmin());
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            return true;
            
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }
       
    }
    
    public DefaultTableModel MostrarCorreos() {
        DefaultTableModel modelo;

        String[] titulos = {"email"};

        Object[] registro = new Object[1];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.email as em from persona p";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                
                registro[0] = rs.getString("em");
                
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    public boolean actualizarContraJefe(M_RecuperarContraseña dts){

        boolean res=false;
        
        sSQL = "UPDATE jefe_proceso j,persona p SET j.contraseña_jefe=? WHERE j.idPersona=p.idPersona and p.email=?";
        
         try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, DigestUtils.md5Hex(dts.getContraseña().toString()));
            pst.setString(2, dts.getDestinatario());
            
            int n = pst.executeUpdate();

            if (n != 0) {
              res= true;  
            } else {
            res= false;    
                }
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e);
                
            }
            return res;   
        }

    public boolean actualizarContraAdmin(M_RecuperarContraseña dts){

        boolean res=false;
        
        sSQL = "UPDATE administrador_sgsst j,persona p SET j.contraseña_admi=? WHERE j.idPersona=p.idPersona and p.email=?";
        
         try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, DigestUtils.md5Hex(dts.getContraseña().toString()));
            pst.setString(2, dts.getDestinatario());
            
            int n = pst.executeUpdate();

            if (n != 0) {
              res= true;  
            } else {
            res= false;    
                }
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e);
                
            }
            return res;   
        }
    
    public boolean actualizarContraEmp(M_RecuperarContraseña dts){

        boolean res=false;
        
        sSQL = "UPDATE empleados j,persona p SET j.contraseña_empleado=? WHERE j.idPersona=p.idPersona and p.email=?";
        
          try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, DigestUtils.md5Hex(dts.getContraseña().toString()));
            pst.setString(2, dts.getDestinatario());
            
            int n = pst.executeUpdate();

            if (n != 0) {
              res= true;  
            } else {
            res= false;    
                }
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e);
                
            }
            return res;   
        }    

    public boolean actualizarContraGerente(M_RecuperarContraseña dts){

        boolean res=false;
        
        sSQL = "UPDATE gerente j,persona p SET j.contraseña_gerente=? WHERE j.idPersona=p.idPersona and p.email=?";
        
          try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, DigestUtils.md5Hex(dts.getContraseña().toString()));
            pst.setString(2, dts.getDestinatario());
            
            int n = pst.executeUpdate();

            if (n != 0) {
              res= true;  
            } else {
            res= false;    
                }
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, e);
                
            }
            return res;   
        }
    
}

