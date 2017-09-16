/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.M_RegistrarEmpleado;
import Vista.RegistroEmpleados;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author USUARIO
 */
public class C_RegistrarEmpleado implements ActionListener, KeyListener{
    RegistroEmpleados vista_registrarEmpleado=new RegistroEmpleados();
    M_RegistrarEmpleado modelo_registrarEmpleado=new M_RegistrarEmpleado();
private static FileInputStream filestream;
private static int longitudBytes;
public static String ruta;
    public C_RegistrarEmpleado(RegistroEmpleados vista_registrarEmpleado, M_RegistrarEmpleado modelo_registrarEmpleado) {
        
        this.modelo_registrarEmpleado=modelo_registrarEmpleado;
        this.vista_registrarEmpleado=vista_registrarEmpleado;
        
        this.vista_registrarEmpleado.btn_subirFotoEmpleado.addActionListener(this);
        this.vista_registrarEmpleado.btn_guardarEmpleado.addActionListener(this);
     
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==vista_registrarEmpleado.btn_subirFotoEmpleado){
          final  JFileChooser jfc=new JFileChooser();
          jfc.setMultiSelectionEnabled(false);
          
          //  jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int estado = jfc.showOpenDialog(null);
            if(estado==JFileChooser.APPROVE_OPTION){
                try {
                    ruta=jfc.getSelectedFile().getAbsolutePath();
                   // filestream=new FileInputStream(jfc.getSelectedFile());
                   // longitudBytes=(int)jfc.getSelectedFile().length();
                   Image preview=Toolkit.getDefaultToolkit().getImage(ruta);
                   if(preview!=null){
                       if(!ruta.equals("")){
                           
                           Image icono=ImageIO.read(jfc.getSelectedFile()).getScaledInstance(vista_registrarEmpleado.lblFoto.getWidth(), vista_registrarEmpleado.lblFoto.getHeight(), Image.SCALE_DEFAULT);
                            vista_registrarEmpleado.lblFoto.setIcon(new ImageIcon(icono)); 
                       
                       }else{
                       
                       }
                   }
                 
                   
                   
                } catch (IOException e) {
                }
            }
        }

        
        if(ae.getSource()==vista_registrarEmpleado.btn_guardarEmpleado){
            String nombre=vista_registrarEmpleado.txt_nombreEmpleado.getText();
            String apellidoPa=vista_registrarEmpleado.txt_1apellidoEmpleado.getText();
            String apellidoMa=vista_registrarEmpleado.txt_2apellidoEmpleado.getText();
            String tipoDoc= vista_registrarEmpleado.cb_tipoDocEmpleado.getSelectedItem().toString();
            int numeroDoc=Integer.parseInt(vista_registrarEmpleado.txt_numDocEmpleado.getText());
            String genero=vista_registrarEmpleado.cb_generoEmpleado.getSelectedItem().toString();
            String telefono=vista_registrarEmpleado.txt_telefonoEmpleado.getText();
            String direccion=vista_registrarEmpleado.txt_direccionEmpleado.getText();
            String email=vista_registrarEmpleado.txt_emailEmpleado.getText();
            int idProceso=idArea();
            
           String cargo=vista_registrarEmpleado.txt_cargoEmpleado.getText();
            int idJefe=idJefe();
          
     java.util.Date fechautil=new java.util.Date();
     fechautil=vista_registrarEmpleado.fe_fechaIngreso.getDate();
     java.sql.Date sqlDate = new java.sql.Date(fechautil.getTime());
     Date fechaIngreso=sqlDate;
      
     String user=vista_registrarEmpleado.txt_userEmpleado.getText();
     String contraseña=vista_registrarEmpleado.txt_contraseñaEmpleado.getText();
      
    String encrip=DigestUtils.md5Hex(contraseña);
 
      
     
     
int resp=modelo_registrarEmpleado.registrarPersona(nombre, apellidoPa, apellidoMa, tipoDoc, numeroDoc, genero, telefono, direccion,idProceso, email);
     if(resp>0){
         String estadoEmpleado="Activo";
       
         int resEmp=modelo_registrarEmpleado.registrarEmple(cargo, user, encrip, idJefe, estadoEmpleado, fechaIngreso);
          if(resEmp!=0){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            this.vista_registrarEmpleado.dispose();
            }else
                  {
         JOptionPane.showMessageDialog(null, "Error");
         }
       //Revisar
        }
        //To change body of generated methods, choose Tools | Templates.
    }
    }
    public int idArea(){
        int idarea = 0;
        String area=RegistroEmpleados.cb_areaEmpleado.getSelectedItem().toString();
        Conexion conexion=new Conexion();
        try {
            Connection accesobd=conexion.getConexion();
            CallableStatement cs=accesobd.prepareCall("{call sp_idArea(?)}");
            cs.setString(1, area);
            ResultSet rs=cs.executeQuery();
            while (rs.next()){
            idarea=rs.getInt(1);
            }  
        } catch (Exception e) {
        }
    return idarea;
    }
    
    public static int idJefe(){
        Conexion conexion=new Conexion();
    int idjefe=0;
    String jefe=RegistroEmpleados.cb_jefeEmpleado.getSelectedItem().toString();
    
        try {
            Connection accesobd=conexion.getConexion();
            CallableStatement cs=accesobd.prepareCall("{call sp_idJefe(?)}");
            cs.setString(1, jefe);
            ResultSet rs=cs.executeQuery();
            while(rs.next()){
            idjefe=rs.getInt(1);
            }
             
        } catch (Exception e) {
        }
   return idjefe;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
