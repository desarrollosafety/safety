/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador; 

import Modelo.Conexion;
import Modelo.M_Sucursal;

import Vista.Registro_Sucursal;

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
public class C_RegistroSucursal implements ActionListener, KeyListener{
    
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
    
    M_Sucursal tr= new M_Sucursal();

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
       String [] titulos = {"Id sucursal","Nombre Sucursal","Dirección","Telefono","E-mail","Cantidad de empleados"};
          
       String [] registro =new String [11];
         modelo = new DefaultTableModel(null, titulos);
       
             
       sSQL="select idsucursal, nombre_sucursal, direccion_sucursal, telefono_sucursal, email, cantidademple from sucursales where estado_sucursal='activo' ";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idsucursal");
               registro [1]=rs.getString("nombre_sucursal");
               registro [2]=rs.getString("direccion_sucursal");
               registro [3]=rs.getString("telefono_sucursal");
               registro [4]=rs.getString("email");
               registro [5]=rs.getString("cantidademple");
               
                               
                       modelo.addRow(registro);
               
           }
            
            
            
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
    
    
    
    
    
    
    
    
    
    
    public boolean inserSucur (M_Sucursal dts){
        
               
        
        try {

            PreparedStatement pst = cn.prepareStatement("insert into sucursales (nombre_sucursal, direccion_sucursal, telefono_sucursal, estado_sucursal, idmunicipio, idempresa,"
                    + "email, cantidademple) values (?,?,?,?,?,?,?,?)");
            
            
            

          pst.setString(1, dts.getNombreSucursal());
          pst.setString(2, dts.getDireccionSucursal());
          pst.setString(3, dts.getTelefonoSucursal());
          pst.setString(4, dts.getEstadoSucursal());
          pst.setInt(5, dts.getIdMunicipio());
          pst.setInt(6, dts.getIdEmpresa());
          pst.setString(7, dts.getEmail());  
          pst.setInt(8, dts.getCantEmple());
          
               
           int n = pst.executeUpdate();

            return true;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
        
               
        
    }
    
     public boolean eliminar (M_Sucursal dts){
       sSQL="update sucursales set estado_sucursal=? where idsucursal=?";
            
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getEstadoSucursal());
           pst.setInt(2, dts.getIdsucursal());
           
           
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
    
     
      public boolean editar (M_Sucursal dts){
       sSQL="update sucursales set nombre_sucursal=?, direccion_sucursal=?, telefono_sucursal=?, estado_sucursal=?, idmunicipio=?, idempresa=?, email=?, cantidademple=? "+
               " where idsucursal=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombreSucursal());
          pst.setString(2, dts.getDireccionSucursal());
          pst.setString(3, dts.getTelefonoSucursal());
          pst.setString(4, dts.getEstadoSucursal());
          pst.setInt(5, dts.getIdMunicipio());
          pst.setInt(6, dts.getIdEmpresa());
          pst.setString(7, dts.getEmail());  
          pst.setInt(8, dts.getCantEmple());
           
         pst.setInt(9, dts.getIdsucursal());
           
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
