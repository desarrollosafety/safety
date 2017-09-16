/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.RegistroEmpleados;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class M_RegistrarEmpleado extends M_Persona {
    private String cargo;
    private int idJefe;
    private String estadoEmpleado;
    private Date fechaIngreso;
    private String userEmpleado;
    private String contraseñaEmpleado;

    Conexion conexion=new Conexion();
    public M_RegistrarEmpleado() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUserEmpleado() {
        return userEmpleado;
    }

    public void setUserEmpleado(String userEmpleado) {
        this.userEmpleado = userEmpleado;
    }

    public String getContraseñaEmpleado() {
        return contraseñaEmpleado;
    }

    public void setContraseñaEmpleado(String contraseñaEmpleado) {
        this.contraseñaEmpleado = contraseñaEmpleado;
    }
    
    public void cargarComboBox(){
 
       
        try {
           Connection accesobd=conexion.getConexion();
           CallableStatement cs=accesobd.prepareCall("{call sp_cargarProcesos()}"); 
           ResultSet rs=cs.executeQuery();
         RegistroEmpleados.cb_areaEmpleado.removeAllItems();
           while(rs.next()){
           RegistroEmpleados.cb_areaEmpleado.addItem(rs.getString(1));
       
           }
           
        } catch (Exception e) {
        }

    
    }
    
    public void cargarComboBoxJefe(){
        try {
            Connection accesoBD=conexion.getConexion();
            CallableStatement cs=accesoBD.prepareCall("{call sp_cargarJefes()}");
            ResultSet rs=cs.executeQuery();
            RegistroEmpleados.cb_jefeEmpleado.removeAllItems();
            while(rs.next()){
            RegistroEmpleados.cb_jefeEmpleado.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
    
    }
    
    public int registrarPersona(String nombre, String apellidoPa, String apellidoMa, String tipoDoc, int numDoc, String genero, String telefono, String direccion, int idProceso,  String email ){
        //Mejor pasar los valores como parametros 
int respuesta = 0;

 
        try {
            Connection accesoBD=conexion.getConexion();
   
            CallableStatement cs=accesoBD.prepareCall("{call sp_insertarPersona(?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, nombre);
            cs.setString(2, apellidoPa);
            cs.setString(3, apellidoMa);
            cs.setString(4, tipoDoc);
            cs.setInt(5, numDoc);
            cs.setString(6, genero);
            cs.setString(7, telefono);
            cs.setString(8, direccion);
            cs.setInt(9, idProceso);
            cs.setString(10, email);
           
            
          //  JOptionPane.showMessageDialog(null,"foto "+ foto+" Longitud "+longitud);
           
          

           respuesta=cs.executeUpdate();
        
        } catch (Exception e) {
        }
    return respuesta;
    }
    
    public int registrarEmple(String cargo, String user, String contraseña, int idJefe, String estado, Date fechaIngreso){
    int resEmp=0;
 
        try {
            Connection acceso=conexion.getConexion();
            CallableStatement cs=acceso.prepareCall("{call sp_registrarEmpleado(?,?,?,?,?,?)}");
            cs.setString(1, cargo);
            cs.setString(2, user);
            cs.setString(3, contraseña);
            cs.setInt(4, idJefe);
            cs.setString(5, estado);
            cs.setDate(6, fechaIngreso);
           
           
        
            resEmp=cs.executeUpdate();
             
        } catch (Exception e) {
        }
        return resEmp;
    }
    
}
