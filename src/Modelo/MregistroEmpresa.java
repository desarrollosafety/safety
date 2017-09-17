/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class MregistroEmpresa {
    
    
 private String nitEmpresa="";
    private String nomEmpresa="";
    private int cantEmpl=0;
    private String Tamaño="";
    private String razonSocial="";
    private int actEconomica=0;
    private String nivelRiesgo="";
    private static int registro;

    public static int getRegistro() {
        return registro;
    }

    public static void setRegistro(int registro) {
        MregistroEmpresa.registro = registro;
    }

   
    

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public int getCantEmpl() {
        return cantEmpl;
    }

    public void setCantEmpl(int cantEmpl) {
        this.cantEmpl = cantEmpl;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getActEconomica() {
        return actEconomica;
    }

    public void setActEconomica(int actEconomica) {
        this.actEconomica = actEconomica;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }
   

   

    
}
