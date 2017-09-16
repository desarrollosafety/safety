/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class M_Empleado extends M_Persona {
    private String cargo;
    private static String user_empleado;
    private String contraseña_usuario;
    private int idJefe;
    private Date fechaIngreso;
    private String estado_empleado;
    private String constraseña_antigua;

    public String getConstraseña_antigua() {
        return constraseña_antigua;
    }

    public void setConstraseña_antigua(String constraseña_antigua) {
        this.constraseña_antigua = constraseña_antigua;
    }

    Conexion conexion=new Conexion();
    public M_Empleado() {
    }

    public String getCargo() {
        return cargo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUser_empleado() {
        return user_empleado;
    }

    public void setUser_empleado(String user_empleado) {
        M_Empleado.user_empleado = user_empleado;
    }

    public String getContraseña_usuario() {
        return contraseña_usuario;
    }

    public void setContraseña_usuario(String contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getEstado_empleado() {
        return estado_empleado;
    }

    public void setEstado_empleado(String estado_empleado) {
        this.estado_empleado = estado_empleado;
    }
    
    
    public ArrayList<M_Empleado>ingreso_empleado(String user, String contraseña){
    ArrayList<M_Empleado> ingreso_empleado=new ArrayList();
    M_Empleado empleado;
        try {
            Connection accesoBD=conexion.getConexion();
            CallableStatement cs=accesoBD.prepareCall("{call sp_listaEmpleado(?,?)}");
            cs.setString(1, user);
            cs.setString(2, contraseña);
            ResultSet rs=cs.executeQuery();
            
            while(rs.next()){
            empleado=new M_Empleado();
            empleado.setIdPersona(rs.getInt(1));  
            empleado.setNombre(rs.getString(2));
            empleado.setPrimerApellido(rs.getString(3));
            empleado.setSegundoApellido(rs.getString(4));
            empleado.setTipoDoc(rs.getString(5));
            empleado.setNumeroDoc(rs.getInt(6));
            empleado.setTelefono(rs.getString(7));
            empleado.setIdProceso(rs.getInt(8));
            empleado.setIdJefe(rs.getInt(9));
            empleado.setCargo(rs.getString(10));
            empleado.setFechaIngreso(rs.getDate(11));
            empleado.setEmail(rs.getString(12));
            empleado.setUser_empleado(rs.getString(13));
           
            empleado.setContraseña_usuario(rs.getString(14));
            
            empleado.setEstado_empleado(rs.getString(15));
            empleado.setConstraseña_antigua(rs.getString(16));
               
            ingreso_empleado.add(empleado);
            
            }
        } catch (Exception e) {
        }
    return ingreso_empleado;
    }
}
