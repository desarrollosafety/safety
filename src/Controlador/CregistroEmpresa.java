/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author LENOVO
 */
 

import Modelo.Conexion;
import Modelo.MregistroEmpresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CregistroEmpresa {
    private Conexion mysql=new Conexion();
   private Connection cn=mysql.getConexion();
    Statement st;
    MregistroEmpresa tr = new MregistroEmpresa();
    
      public boolean inserEmp(MregistroEmpresa dts){
        
               
        
        try {

            PreparedStatement pst = cn.prepareStatement("update empresa set nitempresa=?, nombre_empresa=?, cantidad=?, razonsoc=?, actividad=?, nivelriesg=?, tamañoemp=? where idempresa=1");
            
            
            

          pst.setString(1, dts.getNitEmpresa());
          pst.setString(2, dts.getNomEmpresa());
          pst.setInt(3, dts.getCantEmpl());
          pst.setString(4, dts.getRazonSocial());
          pst.setInt(5, dts.getActEconomica());
          pst.setString(6, dts.getNivelRiesgo());
          pst.setString(7, dts.getTamaño());
          
                       
           int n = pst.executeUpdate();

            return true;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
                 
        
    }
    
    
          public void Regis_act() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select registro from empresa where idempresa=1");
            
            if(rs.next()){    
                
                     
            tr.setRegistro(Integer.parseInt(rs.getString("registro")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
    
        public boolean actRegis(MregistroEmpresa dts){
        
               
        
        try {

            PreparedStatement pst = cn.prepareStatement("update empresa set registro=? where idempresa=1");
            
            
            

         
          pst.setInt(1, dts.getRegistro());
          
          
                       
           int n = pst.executeUpdate();

            return true;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
                 
        
    }
    
}
