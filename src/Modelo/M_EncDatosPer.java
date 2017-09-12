/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class M_EncDatosPer {
    private String nombre_Dato;
    private String respuesta;
    private int idEncuesta;

    Conexion conexion=new Conexion();
    public M_EncDatosPer() {
    }

    public String getNombre_Dato() {
        return nombre_Dato;
    }

    public void setNombre_Dato(String nombre_Dato) {
        this.nombre_Dato = nombre_Dato;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta){
        this.idEncuesta = idEncuesta;
    }
    
    public int Insertardatos(int idDato, String respuesta, int encuestaId){
        
        int resp = 0;
        try {
             Connection accesoBD=conexion.getConexion();
            CallableStatement cs=accesoBD.prepareCall("{call sp_encuDatosPersonales(?,?,?)}"); 
            cs.setInt(1, idDato);
            cs.setString(2, respuesta);
            cs.setInt(3, encuestaId);
           
            resp=cs.executeUpdate();
            
        } catch (SQLException e) {
        }
  
    return resp;
    }
    
}
