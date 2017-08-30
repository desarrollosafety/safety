/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;

/**
 *
 * @author leandro
 */
public class Mgestion_amena {
    
           // variables de entrada base de datos anexo
 private static String path;
 private static int id;
 private int longitud;
 private String nombre;
 private FileInputStream fi11121;
 
// Item 51   
    private String i511="";
    private String a511;
    private String v511;
    private String v512;
    private String v513;
    private String j511;
   
   
    
                  
// Item 52   
    private String i521="";
    private String a521;
    private String v521;
    private String j521;

    public Mgestion_amena(int longitud, String nombre, FileInputStream fi11121, String i511, String a511, String v511, String v512, String v513, String j511, String i521, String a521, String v521, String j521) {
        this.longitud = longitud;
        this.nombre = nombre;
        this.fi11121 = fi11121;
        this.i511 = i511;
        this.a511 = a511;
        this.v511 = v511;
        this.v512 = v512;
        this.v513 = v513;
        this.j511 = j511;
        this.i521 = i521;
        this.a521 = a521;
        this.v521 = v521;
        this.j521 = j521;
    }

    public Mgestion_amena() {
    }

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        Mgestion_amena.path = path;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Mgestion_amena.id = id;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FileInputStream getFi11121() {
        return fi11121;
    }

    public void setFi11121(FileInputStream fi11121) {
        this.fi11121 = fi11121;
    }

    public String getI511() {
        return i511;
    }

    public void setI511(String i511) {
        this.i511 = i511;
    }

    public String getA511() {
        return a511;
    }

    public void setA511(String a511) {
        this.a511 = a511;
    }

    public String getV511() {
        return v511;
    }

    public void setV511(String v511) {
        this.v511 = v511;
    }

    public String getV512() {
        return v512;
    }

    public void setV512(String v512) {
        this.v512 = v512;
    }

    public String getV513() {
        return v513;
    }

    public void setV513(String v513) {
        this.v513 = v513;
    }

    public String getJ511() {
        return j511;
    }

    public void setJ511(String j511) {
        this.j511 = j511;
    }

    public String getI521() {
        return i521;
    }

    public void setI521(String i521) {
        this.i521 = i521;
    }

    public String getA521() {
        return a521;
    }

    public void setA521(String a521) {
        this.a521 = a521;
    }

    public String getV521() {
        return v521;
    }

    public void setV521(String v521) {
        this.v521 = v521;
    }

    public String getJ521() {
        return j521;
    }

    public void setJ521(String j521) {
        this.j521 = j521;
    }
    
    
    
}
