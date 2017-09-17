/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Controlador.C_RegistroSucursal;
import java.io.FileInputStream;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane; 
/**
 *
 * @author YOREL
 */
public class M_RegistroSucursal {
    
    private static String ant2;
    private String nitEmpresa;
    private String nomEmpresa;
    private int cantEmpl;
    private String Tamaño;
    private String ciudad;
    private String departamento;
    private String sucursal;
    private int telefono;
    private String razonSocial;
    private int actEconomica;
    private String nivelRiesgo;
    private String estado;

    public M_RegistroSucursal(String nitEmpresa, String nomEmpresa, int cantEmpl, String Tamaño, String ciudad, String departamento, String sucursal, int telefono, String razonSocial, int actEconomica, String nivelRiesgo, String estado) {
        this.nitEmpresa = nitEmpresa;
        this.nomEmpresa = nomEmpresa;
        this.cantEmpl = cantEmpl;
        this.Tamaño = Tamaño;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.sucursal = sucursal;
        this.telefono = telefono;
        this.razonSocial = razonSocial;
        this.actEconomica = actEconomica;
        this.nivelRiesgo = nivelRiesgo;
        this.estado = estado;
    }

    public M_RegistroSucursal() {
    }

    public static String getAnt2() {
        return ant2;
    }

    public static void setAnt2(String ant2) {
        M_RegistroSucursal.ant2 = ant2;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
   
    
    
    
  
}


   
    
    

