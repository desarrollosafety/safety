/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador; 

import Modelo.Conexion;
import Modelo.M_RegistroEmpresa;
import Vista.Registro_Empresa;
import Modelo.M_RegistroEmpresa;
import Modelo.Mrecursos;



import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author YOREL
 */
public class C_RegistroEmpresa implements ActionListener, KeyListener{
    
     private Conexion mysql=new Conexion();
   private Connection cn=mysql.getConexion();
    Statement st;
    
 /*   Registro_Empresa vista_registroEmpresa=new Registro_Empresa();
    M_RegistroEmpresa modelo_registro=new M_RegistroEmpresa();

    public C_RegistroEmpresa(Registro_Empresa vista_registroEmpresa, M_RegistroEmpresa modelo_registro) {
        
        this.modelo_registro = modelo_registro;
        this.vista_registroEmpresa = vista_registroEmpresa;
        
        
    }
     public void llamarDatos(){
    
    
    }*/
    
    M_RegistroEmpresa tr= new M_RegistroEmpresa();

    @Override
    public void actionPerformed(java.awt.event.ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String sSQL;
      public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       String [] titulos = {"Nit","Empresa","Cantidad de empleados","Ciudad","Departamento","Sucursal","Telefono","Razon social","Actividad economica","Nivel de riesgo","Tamaño"};
          
       String [] registro =new String [11];
         modelo = new DefaultTableModel(null, titulos);
       
             
       sSQL="select nitempresa, nombre_empresa, cantidad, ciudad, departamento, sucursal, telefono, razonsoc, actividad, nivelriesg, tamañoemp from empresa where estado='activo' ";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("nitempresa");
               registro [1]=rs.getString("nombre_empresa");
               registro [2]=rs.getString("cantidad");
               registro [3]=rs.getString("ciudad");
               registro [4]=rs.getString("departamento");
               registro [5]=rs.getString("sucursal");
               registro [6]=rs.getString("telefono");
               registro [7]=rs.getString("razonsoc");
                registro [8]=rs.getString("actividad");
                 registro [9]=rs.getString("nivelriesg");
                  registro [10]=rs.getString("tamañoemp");
                               
                       modelo.addRow(registro);
               
           }
            
            
            
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
    
    
    
    
    
    
    
    
    
    
    public boolean inserEmp(M_RegistroEmpresa dts){
        
               
        
        try {

            PreparedStatement pst = cn.prepareStatement("insert into empresa (nitempresa, nombre_empresa, cantidad, ciudad, departamento, sucursal,"
                    + "telefono, razonsoc, actividad, nivelriesg, tamañoemp, estado) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            
            
            

          pst.setString(1, dts.getNitEmpresa());
          pst.setString(2, dts.getNomEmpresa());
          pst.setInt(3, dts.getCantEmpl());
          pst.setString(4, dts.getCiudad());
          pst.setString(5, dts.getDepartamento());
          pst.setString(6, dts.getSucursal());
          pst.setInt(7, dts.getTelefono());  
          pst.setString(8, dts.getRazonSocial());
          pst.setInt(9, dts.getActEconomica());
          pst.setString(10, dts.getNivelRiesgo());
          pst.setString(11, dts.getTamaño());
          pst.setString(12, dts.getEstado());
                       
           int n = pst.executeUpdate();

            return true;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
        
               
        
    }
    
     public boolean eliminar (M_RegistroEmpresa dts){
       sSQL="update empresa set estado=? where nitempresa=?";
            
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getEstado());
           pst.setString(2, dts.getAnt2());
           
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
    
     
      public boolean editar (M_RegistroEmpresa dts){
       sSQL="update empresa set nitempresa=?, nombre_empresa=?, cantidad=?, ciudad=?, departamento=?, sucursal=?, telefono=?, razonsoc=?, actividad=?, nivelriesg=?, tamañoemp=? "+
               " where nitempresa=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNitEmpresa());
           pst.setString(2, dts.getNomEmpresa());
           pst.setInt(3, dts.getCantEmpl());
           pst.setString(4, dts.getCiudad());
           pst.setString(5, dts.getDepartamento());
           pst.setString(6, dts.getSucursal());
           pst.setInt(7, dts.getTelefono());
           pst.setString(8, dts.getRazonSocial());
           pst.setInt(9, dts.getActEconomica());
           pst.setString(10, dts.getNivelRiesgo());
           pst.setString(11, dts.getTamaño());
           
           pst.setString(12, dts.getAnt2());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
    
    
}
