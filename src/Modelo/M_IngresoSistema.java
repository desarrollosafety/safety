/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author USUARIO
 */
public class M_IngresoSistema extends M_Persona {
    private Date fechaIngreso;
    private String user;
    private String password;
    private int idGerente;
    private String estado;
    private String password_antigua;
    
    private 

    Conexion conexion=new Conexion();
    
    private final Connection cn = conexion.getConexion();
    String sSQL;
    public M_IngresoSistema() {
    }

    public M_IngresoSistema(Date fechaIngreso, String user, String password, int idGerente, String estado) {
        this.fechaIngreso = fechaIngreso;
        this.user = user;
        this.password = password;
        this.idGerente = idGerente;
        this.estado = estado;
    }

    public String getPassword_antigua() {
        return password_antigua;
    }

    public void setPassword_antigua(String password_antigua) {
        this.password_antigua = password_antigua;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public  ArrayList<M_IngresoSistema> Ingreso_AdminSGSST(String userIngreso, String contraseñaIngreso){
        
     ArrayList<M_IngresoSistema> listaSGSST =new ArrayList();
     M_IngresoSistema ingreso;
        try {
            Connection accesoBD=conexion.getConexion();
            
            CallableStatement cs=accesoBD.prepareCall("{call sp_listAdminSGSST(?,?)}");
            
            cs.setString(1, userIngreso);
            cs.setString(2, contraseñaIngreso);
            ResultSet rs=cs.executeQuery();
            
            while(rs.next()){
            ingreso =new M_IngresoSistema();
            ingreso.setIdPersona(rs.getInt(1));
            ingreso.setNombre(rs.getString(2));
            ingreso.setPrimerApellido(rs.getString(3));
            ingreso.setSegundoApellido(rs.getString(4));
            ingreso.setTipoDoc(rs.getString(5));
            ingreso.setNumeroDoc(rs.getInt(6));
            ingreso.setTelefono(rs.getString(7));
            ingreso.setIdProceso(rs.getInt(8));
            ingreso.setEmail(rs.getString(9));
            ingreso.setFechaIngreso(rs.getDate(10));
            ingreso.setUser(rs.getString(11));
            ingreso.setPassword(rs.getString(12));
            ingreso.setIdGerente(rs.getInt(13));
            ingreso.setEstado(rs.getString(14));
            ingreso.setPassword_antigua(rs.getString(15));
            
            listaSGSST.add(ingreso);
            
            }
            
        } catch (Exception e) {
            
        }
     return listaSGSST;
    }
    
    
    public ArrayList<M_IngresoSistema>Ingreso_Gerente(String userGerente, String contraseñaGerente){
    ArrayList<M_IngresoSistema> listaGerente =new ArrayList();
    M_IngresoSistema ingreso;
    
        try {
            Connection accesoBD=conexion.getConexion();
            CallableStatement cs=accesoBD.prepareCall("{call sp_listGerente(?,?)}");
            cs.setString(1, userGerente);
            cs.setString(2, contraseñaGerente);
            
            ResultSet rs=cs.executeQuery();
            while(rs.next()){
            ingreso=new M_IngresoSistema();
            ingreso.setIdPersona(rs.getInt(1));
            ingreso.setNombre(rs.getString(2));
            ingreso.setPrimerApellido(rs.getString(3));
            ingreso.setSegundoApellido(rs.getString(4));
            ingreso.setTipoDoc(rs.getString(5));
            ingreso.setNumeroDoc(rs.getInt(6));
            ingreso.setTelefono(rs.getString(7));
            ingreso.setIdProceso(rs.getInt(8));
            ingreso.setEmail(rs.getString(9));
            ingreso.setFechaIngreso(rs.getDate(10));
            ingreso.setUser(rs.getString(11));
            ingreso.setPassword(rs.getString(12));
            ingreso.setEstado(rs.getString(13));
            ingreso.setPassword_antigua(rs.getString(14));
            
            listaGerente.add(ingreso);
            }
            
        } catch (Exception e) {
            
        }
    return listaGerente;
    }
    
    public ArrayList<M_IngresoSistema> ingreso_JefeProceso(String userJefe, String contraseñaJefe){
    ArrayList<M_IngresoSistema> listaJefe =new ArrayList();
    M_IngresoSistema ingreso;
    
        try {
             Connection accesoBD=conexion.getConexion();
            CallableStatement cs=accesoBD.prepareCall("{call sp_listJefeProceso(?,?)}");
            cs.setString(1, userJefe);
            cs.setString(2, contraseñaJefe);
            
            ResultSet rs=cs.executeQuery();
            while(rs.next()){
            ingreso=new M_IngresoSistema();
            ingreso.setIdPersona(rs.getInt(1));
            ingreso.setNombre(rs.getString(2));
            ingreso.setPrimerApellido(rs.getString(3));
            ingreso.setSegundoApellido(rs.getString(4));
            ingreso.setTipoDoc(rs.getString(5));
            ingreso.setNumeroDoc(rs.getInt(6));
            ingreso.setTelefono(rs.getString(7));
            ingreso.setIdProceso(rs.getInt(8));
            ingreso.setEmail(rs.getString(9));
            ingreso.setFechaIngreso(rs.getDate(10));
            ingreso.setUser(rs.getString(11));
            ingreso.setPassword(rs.getString(12));
            ingreso.setEstado(rs.getString(13));
            ingreso.setPassword_antigua(rs.getString(14));
            
            listaJefe.add(ingreso);
            }
        } catch (Exception e) {
        }
    return listaJefe;
    }
    
    public ArrayList<M_IngresoSistema>datosEncuesta(){
    ArrayList<M_IngresoSistema> datosEmpleado=new ArrayList();
    M_IngresoSistema datos;
    
        try {
            Connection accesoBD=conexion.getConexion();
            CallableStatement cs =accesoBD.prepareCall("");
        } catch (Exception e) {
        }
    return null;
    }
    
   public boolean actualizarContraJefe(M_IngresoSistema dts){

        boolean res=false;
        
        sSQL = "UPDATE jefe_proceso j,persona p SET j.contraseña_jefe=?,j.contraseña_antigua=? WHERE j.idPersona=p.idPersona and j.idPersona=?";
        
         try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, dts.getPassword());
            pst.setString(2, dts.getPassword());
            pst.setInt(3, dts.getIdPersona());
            
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

    public boolean actualizarContraAdmin(M_IngresoSistema dts){
        
        boolean res=false;
        
        sSQL = "UPDATE administrador_sgsst j,persona p SET j.contraseña_admi=?,j.contraseña_antigua=? WHERE j.idPersona=p.idPersona and j.idPersona=?";
        
         try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, dts.getPassword());
            pst.setString(2, dts.getPassword());
            pst.setInt(3, dts.getIdPersona());
            
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
    
    public boolean actualizarContraEmp(M_IngresoSistema dts){

        boolean res=false;
        
        sSQL = "UPDATE empleados j,persona p SET j.contraseña_empleado=?,j.contraseña_antigua=? WHERE j.idPersona=p.idPersona and j.idPersona=?";
        
          try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, dts.getPassword());
            pst.setString(2, dts.getPassword());
            pst.setInt(3, dts.getIdPersona());
            
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

    public boolean actualizarContraGerente(M_IngresoSistema dts){

        boolean res=false;
        
        sSQL = "UPDATE gerente j,persona p SET j.contraseña_gerente=?,j.contraseña_antigua=? WHERE j.idPersona=p.idPersona and j.idPersona=?";
        
          try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, dts.getPassword());
            pst.setString(2, dts.getPassword());
            pst.setInt(3, dts.getIdPersona());
            
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
