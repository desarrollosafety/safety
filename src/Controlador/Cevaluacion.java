/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Mevaluacion;
import Modelo.Mgestion_amena;
import Vista.Evaluacion_Ini;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Cevaluacion extends Conexion {
    private Conexion conexion =new Conexion();
   private Connection cn= conexion.getConexion();
  
   
    //Statement st;
    
       private String empItem;
        int con=1;
       private String empVeri;
       private String empEva;
       
       Mevaluacion tr = new Mevaluacion();
    
    
     public boolean empezarItem(Mevaluacion dts) {
         
     while(con<=60){    
                
        empItem = "update item set cumple=?, justifi=?, aplica=? where idItem="+con;
               
               
        try {

            PreparedStatement pst = cn.prepareStatement(empItem);
            
            pst.setString(1, dts.getUno());
            pst.setString(2, dts.getDos());
            pst.setString(3, dts.getTres());
                                
            pst.executeUpdate();
           con++;
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
     }
    return true;
}
  
    
      public boolean empezarVeri(Mevaluacion dts) {
         
     for(int i=1;i<=91;i++){    
                
        empVeri = "update verificacion set cumplimiento=? where idverificacion="+i;
               
               
        try {

            PreparedStatement pst = cn.prepareStatement(empVeri);
            
            pst.setString(1, dts.getCuatro());
                                           
            pst.executeUpdate();
      
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
     }
    return true;
}
      
      public void est_E0() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select estado from est_evalua where nombre='E'");
            
            if(rs.next()){    
                
          // Evaluacion_Ini.lbl1.setText(rs.getString("estado"));
            
            tr.setE0(Integer.parseInt(rs.getString("estado")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
      
    public void est_E1() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select estado from est_evalua where nombre='E1'");
            
            if(rs.next()){    
                
          // Evaluacion_Ini.lbl1.setText(rs.getString("estado"));
            
            tr.setE1(Integer.parseInt(rs.getString("estado")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
    
     public void est_E2() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select estado from est_evalua where nombre='E2'");
            
            if(rs.next()){    
                
          // Evaluacion_Ini.lbl1.setText(rs.getString("estado"));
            
            tr.setE2(Integer.parseInt(rs.getString("estado")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
     
      public void est_E3() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select estado from est_evalua where nombre='E3'");
            
            if(rs.next()){    
                
          // Evaluacion_Ini.lbl1.setText(rs.getString("estado"));
            
            tr.setE3(Integer.parseInt(rs.getString("estado")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
      
       public void est_E4() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select estado from est_evalua where nombre='E4'");
            
            if(rs.next()){    
                
          // Evaluacion_Ini.lbl1.setText(rs.getString("estado"));
            
            tr.setE4(Integer.parseInt(rs.getString("estado")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
   
        public void est_E5() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select estado from est_evalua where nombre='E5'");
            
            if(rs.next()){    
                
          // Evaluacion_Ini.lbl1.setText(rs.getString("estado"));
            
            tr.setE5(Integer.parseInt(rs.getString("estado")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
        
         public void est_E6() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select estado from est_evalua where nombre='E6'");
            
            if(rs.next()){    
                
          // Evaluacion_Ini.lbl1.setText(rs.getString("estado"));
            
            tr.setE6(Integer.parseInt(rs.getString("estado")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
         
          public void est_E7() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select estado from est_evalua where nombre='E7'");
            
            if(rs.next()){    
                
          // Evaluacion_Ini.lbl1.setText(rs.getString("estado"));
            
            tr.setE7(Integer.parseInt(rs.getString("estado")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
          
           public void est_E8() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select estado from est_evalua where nombre='E8'");
            
            if(rs.next()){    
                
          // Evaluacion_Ini.lbl1.setText(rs.getString("estado"));
            
            tr.setE8(Integer.parseInt(rs.getString("estado")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
                  public void Barra() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select barra from est_evalua where nombre='E'");
            
            if(rs.next()){    
                
                    
            tr.setBarra(Integer.parseInt(rs.getString("barra")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }
                  
          public void Puntaje() {
                         
         try {

            Statement pst = cn.createStatement();
            ResultSet rs = pst.executeQuery("select sum(valor_item) from item where cumple='si'");
            
            if(rs.next()){    
                
                    
            tr.setPunt(Double.parseDouble(rs.getString("sum(valor_item)")));         
          
            }
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
                 
      }        
           
           
           public void est_emp(Mevaluacion dts){
               
                try {

            PreparedStatement pst = cn.prepareStatement("update est_evalua set estado=? where nombre='E'");
            PreparedStatement pst1 = cn.prepareStatement("update est_evalua set estado=? where nombre='E1'");
            PreparedStatement pst2 = cn.prepareStatement("update est_evalua set estado=? where nombre='E2'");
            PreparedStatement pst3 = cn.prepareStatement("update est_evalua set estado=? where nombre='E3'");
            PreparedStatement pst4 = cn.prepareStatement("update est_evalua set estado=? where nombre='E4'");
            PreparedStatement pst5 = cn.prepareStatement("update est_evalua set estado=? where nombre='E5'");
            PreparedStatement pst6 = cn.prepareStatement("update est_evalua set estado=? where nombre='E6'");
            PreparedStatement pst7 = cn.prepareStatement("update est_evalua set estado=? where nombre='E7'");
            PreparedStatement pst8 = cn.prepareStatement("update est_evalua set estado=? where nombre='E8'");
            
            pst.setInt(1, dts.getE0());
            pst1.setInt(1, dts.getE1());
            pst2.setInt(1, dts.getE2());                                  
            pst3.setInt(1, dts.getE3());
            pst4.setInt(1, dts.getE4());
            pst5.setInt(1, dts.getE5());
            pst6.setInt(1, dts.getE6());                                  
            pst7.setInt(1, dts.getE7());
            pst8.setInt(1, dts.getE8());
            
            
            pst.executeUpdate();
            pst1.executeUpdate();
            pst2.executeUpdate();
            pst3.executeUpdate();
            pst4.executeUpdate();
            pst5.executeUpdate();
            pst6.executeUpdate();
            pst7.executeUpdate();
            pst8.executeUpdate();
            
           
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
           
        }
                       
           }
           
          public void est_empNuev(Mevaluacion dts){
               
                try {

            PreparedStatement pst = cn.prepareStatement("update est_evalua set estado=? where nombre='E'");
            PreparedStatement pst1 = cn.prepareStatement("update est_evalua set estado=? where nombre='E1'");
            PreparedStatement pst2 = cn.prepareStatement("update est_evalua set estado=? where nombre='E2'");
            PreparedStatement pst3 = cn.prepareStatement("update est_evalua set estado=? where nombre='E3'");
            PreparedStatement pst4 = cn.prepareStatement("update est_evalua set estado=? where nombre='E4'");
            PreparedStatement pst5 = cn.prepareStatement("update est_evalua set estado=? where nombre='E5'");
            PreparedStatement pst6 = cn.prepareStatement("update est_evalua set estado=? where nombre='E6'");
            PreparedStatement pst7 = cn.prepareStatement("update est_evalua set estado=? where nombre='E7'");
            PreparedStatement pst8 = cn.prepareStatement("update est_evalua set estado=? where nombre='E8'");
            PreparedStatement pst9 = cn.prepareStatement("update est_evalua set barra=? where nombre='E'");
            
            pst.setInt(1, dts.getE0());
            pst1.setInt(1, dts.getE1());
            pst2.setInt(1, dts.getE2());                                  
            pst3.setInt(1, dts.getE3());
            pst4.setInt(1, dts.getE4());
            pst5.setInt(1, dts.getE5());
            pst6.setInt(1, dts.getE6());                                  
            pst7.setInt(1, dts.getE7());
            pst8.setInt(1, dts.getE8());
            pst9.setInt(1, dts.getBarra());
            
            
            pst.executeUpdate();
            pst1.executeUpdate();
            pst2.executeUpdate();
            pst3.executeUpdate();
            pst4.executeUpdate();
            pst5.executeUpdate();
            pst6.executeUpdate();
            pst7.executeUpdate();
            pst8.executeUpdate();
            pst9.executeUpdate();
            
           
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
           
        }
                       
           }     
           
           
           
              public void est_recursos(Mevaluacion dts){
         
         try{
             
              PreparedStatement pst = cn.prepareStatement("update est_evalua set estado=? where nombre='E1'");
              PreparedStatement pst1 = cn.prepareStatement("update est_evalua set barra=? where nombre='E'");
              
              pst.setInt(1, dts.getE1());
              pst1.setInt(1, dts.getBarra());
              
               pst.executeUpdate();
               pst1.executeUpdate();
              
         
           } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
           
        }
         
         
     }          
 
              public void est_gestIntegral(Mevaluacion dts){
         
         try{
             
              PreparedStatement pst = cn.prepareStatement("update est_evalua set estado=? where nombre='E2'");
              PreparedStatement pst1 = cn.prepareStatement("update est_evalua set barra=? where nombre='E'");
              
              pst.setInt(1, dts.getE2());
              pst1.setInt(1, dts.getBarra());
              
               pst.executeUpdate();
               pst1.executeUpdate();
              
         
           } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
           
        }
         
         
     }    
              
              
              
     
      public void est_gestSalud(Mevaluacion dts){
         
         try{
             
              PreparedStatement pst = cn.prepareStatement("update est_evalua set estado=? where nombre='E3'");
              PreparedStatement pst1 = cn.prepareStatement("update est_evalua set barra=? where nombre='E'");
              
              pst.setInt(1, dts.getE3());
              pst1.setInt(1, dts.getBarra());
              
               pst.executeUpdate();
               pst1.executeUpdate();
              
         
           } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
           
        }
         
         
     }
    
       public void est_gestPeligros(Mevaluacion dts){
         
         try{
             
              PreparedStatement pst = cn.prepareStatement("update est_evalua set estado=? where nombre='E4'");
              PreparedStatement pst1 = cn.prepareStatement("update est_evalua set barra=? where nombre='E'");
              
              pst.setInt(1, dts.getE4());
              pst1.setInt(1, dts.getBarra());
              
               pst.executeUpdate();
               pst1.executeUpdate();
              
         
           } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
           
        }
         
         
     }
       
         public void est_gestAmena(Mevaluacion dts){
         
         try{
             
              PreparedStatement pst = cn.prepareStatement("update est_evalua set estado=? where nombre='E5'");
              PreparedStatement pst1 = cn.prepareStatement("update est_evalua set barra=? where nombre='E'");
              
              pst.setInt(1, dts.getE5());
              pst1.setInt(1, dts.getBarra());
              
               pst.executeUpdate();
               pst1.executeUpdate();
              
         
           } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
           
        }
    
}
         
                  public void est_gestResul(Mevaluacion dts){
         
         try{
             
              PreparedStatement pst = cn.prepareStatement("update est_evalua set estado=? where nombre='E6'");
              PreparedStatement pst1 = cn.prepareStatement("update est_evalua set barra=? where nombre='E'");
              
              pst.setInt(1, dts.getE6());
              pst1.setInt(1, dts.getBarra());
              
               pst.executeUpdate();
               pst1.executeUpdate();
              
         
           } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
           
        }
    
}
                  
                    public void est_accionPreven(Mevaluacion dts){
         
         try{
             
              PreparedStatement pst = cn.prepareStatement("update est_evalua set estado=? where nombre='E7'");
              PreparedStatement pst1 = cn.prepareStatement("update est_evalua set barra=? where nombre='E'");
              
              pst.setInt(1, dts.getE7());
              pst1.setInt(1, dts.getBarra());
              
               pst.executeUpdate();
               pst1.executeUpdate();
              
         
           } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
           
        }
    
}
         
}