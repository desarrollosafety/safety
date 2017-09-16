/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author cruz
 */
public class M_RecuperarContraseña {
    
    private String admin;
    private StringBuilder contraseña;
    private String ruta;
    private String nombre;
    private String destinatario;
    private String asunto;
    private String conAdmin;

    public String getConAdmin() {
        return conAdmin;
    }

    public void setConAdmin(String conAdmin) {
        this.conAdmin = conAdmin;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public StringBuilder getContraseña() {
        return contraseña;
    }

    public void setContraseña(StringBuilder contraseña) {
        this.contraseña = contraseña;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
}
