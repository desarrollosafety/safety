/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;

/**
 *
 * @author LENOVO
 */
public class Macciones_preven {
    
                 // variables de entrada base de datos anexo
 private static String path;
 private static int id;
 private int longitud;
 private String nombre;
 private FileInputStream fi11121;
 
// Item 57   
    private String i571="";
    private String a571;
    private String v571;
    private String j571;
             
// Item 58   
    private String i581="";
    private String a581;
    private String v581;
    private String j581;
    
// Item 59   
    private String i591="";
    private String a591;
    private String v591;
    private String j591;
   
 // item 60   
    private String i601="";
    private String a601;
    private String v601;
    private String j601; 

    public Macciones_preven(int longitud, String nombre, FileInputStream fi11121, String i571, String a571, String v571, String j571, String i581, String a581, String v581, String j581, String i591, String a591, String v591, String j591, String i601, String a601, String v601, String j601) {
        this.longitud = longitud;
        this.nombre = nombre;
        this.fi11121 = fi11121;
        this.i571 = i571;
        this.a571 = a571;
        this.v571 = v571;
        this.j571 = j571;
        this.i581 = i581;
        this.a581 = a581;
        this.v581 = v581;
        this.j581 = j581;
        this.i591 = i591;
        this.a591 = a591;
        this.v591 = v591;
        this.j591 = j591;
        this.i601 = i601;
        this.a601 = a601;
        this.v601 = v601;
        this.j601 = j601;
    }

    public Macciones_preven() {
    }

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        Macciones_preven.path = path;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Macciones_preven.id = id;
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

    public String getI571() {
        return i571;
    }

    public void setI571(String i571) {
        this.i571 = i571;
    }

    public String getA571() {
        return a571;
    }

    public void setA571(String a571) {
        this.a571 = a571;
    }

    public String getV571() {
        return v571;
    }

    public void setV571(String v571) {
        this.v571 = v571;
    }

    public String getJ571() {
        return j571;
    }

    public void setJ571(String j571) {
        this.j571 = j571;
    }

    public String getI581() {
        return i581;
    }

    public void setI581(String i581) {
        this.i581 = i581;
    }

    public String getA581() {
        return a581;
    }

    public void setA581(String a581) {
        this.a581 = a581;
    }

    public String getV581() {
        return v581;
    }

    public void setV581(String v581) {
        this.v581 = v581;
    }

    public String getJ581() {
        return j581;
    }

    public void setJ581(String j581) {
        this.j581 = j581;
    }

    public String getI591() {
        return i591;
    }

    public void setI591(String i591) {
        this.i591 = i591;
    }

    public String getA591() {
        return a591;
    }

    public void setA591(String a591) {
        this.a591 = a591;
    }

    public String getV591() {
        return v591;
    }

    public void setV591(String v591) {
        this.v591 = v591;
    }

    public String getJ591() {
        return j591;
    }

    public void setJ591(String j591) {
        this.j591 = j591;
    }

    public String getI601() {
        return i601;
    }

    public void setI601(String i601) {
        this.i601 = i601;
    }

    public String getA601() {
        return a601;
    }

    public void setA601(String a601) {
        this.a601 = a601;
    }

    public String getV601() {
        return v601;
    }

    public void setV601(String v601) {
        this.v601 = v601;
    }

    public String getJ601() {
        return j601;
    }

    public void setJ601(String j601) {
        this.j601 = j601;
    }
    
    
    
}
