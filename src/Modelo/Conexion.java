/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USUARIO
 */
public class Conexion {

    public Conexion() {
    }
     public Connection getConexion(){
         
    Connection con=null;
    
        try {
          Class.forName("com.mysql.jdbc.Driver").newInstance(); 
        con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/safety","root",""); 
        } catch (Exception e) {
        }
        
        return con;
    
    }
}
