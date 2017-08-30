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
public class Mgestion_resul {
    
             // variables de entrada base de datos anexo
 private static String path;
 private static int id;
 private int longitud;
 private String nombre;
 private FileInputStream fi11121;
 
// Item 53   
    private String i531="";
    private String a531;
    private String v531;
    private String j531;
             
// Item 54   
    private String i541="";
    private String a541;
    private String v541;
    private String j541;
    
// Item 55   
    private String i551="";
    private String a551;
    private String v551;
    private String j551;
   
 // item 56   
    private String i561="";
    private String a561;
    private String v561;
    private String j561; 

    public Mgestion_resul(int longitud, String nombre, FileInputStream fi11121, String i531, String a531, String v531, String j531, String i541, String a541, String v541, String j541, String i551, String a551, String v551, String j551, String i561, String a561, String v561, String j561) {
        this.longitud = longitud;
        this.nombre = nombre;
        this.fi11121 = fi11121;
        this.i531 = i531;
        this.a531 = a531;
        this.v531 = v531;
        this.j531 = j531;
        this.i541 = i541;
        this.a541 = a541;
        this.v541 = v541;
        this.j541 = j541;
        this.i551 = i551;
        this.a551 = a551;
        this.v551 = v551;
        this.j551 = j551;
        this.i561 = i561;
        this.a561 = a561;
        this.v561 = v561;
        this.j561 = j561;
    }

    public Mgestion_resul() {
    }

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        Mgestion_resul.path = path;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Mgestion_resul.id = id;
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

    public String getI531() {
        return i531;
    }

    public void setI531(String i531) {
        this.i531 = i531;
    }

    public String getA531() {
        return a531;
    }

    public void setA531(String a531) {
        this.a531 = a531;
    }

    public String getV531() {
        return v531;
    }

    public void setV531(String v531) {
        this.v531 = v531;
    }

    public String getJ531() {
        return j531;
    }

    public void setJ531(String j531) {
        this.j531 = j531;
    }

    public String getI541() {
        return i541;
    }

    public void setI541(String i541) {
        this.i541 = i541;
    }

    public String getA541() {
        return a541;
    }

    public void setA541(String a541) {
        this.a541 = a541;
    }

    public String getV541() {
        return v541;
    }

    public void setV541(String v541) {
        this.v541 = v541;
    }

    public String getJ541() {
        return j541;
    }

    public void setJ541(String j541) {
        this.j541 = j541;
    }

    public String getI551() {
        return i551;
    }

    public void setI551(String i551) {
        this.i551 = i551;
    }

    public String getA551() {
        return a551;
    }

    public void setA551(String a551) {
        this.a551 = a551;
    }

    public String getV551() {
        return v551;
    }

    public void setV551(String v551) {
        this.v551 = v551;
    }

    public String getJ551() {
        return j551;
    }

    public void setJ551(String j551) {
        this.j551 = j551;
    }

    public String getI561() {
        return i561;
    }

    public void setI561(String i561) {
        this.i561 = i561;
    }

    public String getA561() {
        return a561;
    }

    public void setA561(String a561) {
        this.a561 = a561;
    }

    public String getV561() {
        return v561;
    }

    public void setV561(String v561) {
        this.v561 = v561;
    }

    public String getJ561() {
        return j561;
    }

    public void setJ561(String j561) {
        this.j561 = j561;
    }
    
    
    
}
