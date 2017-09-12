/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.M_EncDatosPer;
import Modelo.M_EncDatosSalud;
import Modelo.M_EncuDatosSGSST;
import Modelo.M_EncuestaSocioDemografica;
import Modelo.M_IngresoSistema;
import Modelo.infoEmpEncuesta;
import Vista.Encuesta_SocioDemografica;
import Vista.IngresoUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class C_RealizarEncuesta implements ActionListener, KeyListener{
    Encuesta_SocioDemografica vista_realizarEncuesta=new Encuesta_SocioDemografica();
    M_EncuestaSocioDemografica modelo_encuesta=new M_EncuestaSocioDemografica();
    M_IngresoSistema datosEmpleado=new M_IngresoSistema();
ArrayList array=new ArrayList();
ArrayList arrayDatosPersona =new ArrayList();
ArrayList<M_EncuestaSocioDemografica> arrayDatosEmpresa=new ArrayList();
IngresoUsuario vista_ingreso = new IngresoUsuario();
infoEmpEncuesta datosEmpEncuesta=new infoEmpEncuesta();
M_EncDatosPer encuDatosPersonales;
M_EncDatosSalud encudatosSalud;
M_EncuDatosSGSST encudatosSGSST;
int idPersona;
int idEncuesta;
    public C_RealizarEncuesta(Encuesta_SocioDemografica vista_realizarEncuesta, M_EncuestaSocioDemografica modelo_encuesta) {
        idPersona=C_IngresoSistema.id;
        
        
        this.modelo_encuesta=modelo_encuesta;
        this.vista_realizarEncuesta=vista_realizarEncuesta;
        
        vista_realizarEncuesta.btn_GuardarEncuesta.addActionListener(this);
        vista_realizarEncuesta.txt_empresa.addKeyListener(this);
  
     
        arrayDatosEmpresa=modelo_encuesta.empresa();
        for(int i=0;i<arrayDatosEmpresa.size(); i++){
         vista_realizarEncuesta.txt_empresa.setText(String.valueOf(arrayDatosEmpresa.get(i).getNombre())); 
        }
       vista_realizarEncuesta.txt_sucursalEmpresa.setText(M_EncuestaSocioDemografica.getSucursal());
   
       arrayDatosPersona=datosEmpEncuesta.datosRealizarEncuesta(idPersona);
       vista_realizarEncuesta.txt_codigoEncuesta.setText(String.valueOf(infoEmpEncuesta.getCodigo()));
       vista_realizarEncuesta.txt_nombreEncuesta.setText(infoEmpEncuesta.getNombre()+" "+infoEmpEncuesta.getApellido_paterno()+" "+infoEmpEncuesta.getApellido_materno());
      vista_realizarEncuesta.txt_procesoEncuesta.setText(infoEmpEncuesta.getArea());
     //    arrayDatosEmpleado=datosEmpEncuesta.datosEmpEncuesta(C_IngresoSistema.user, C_IngresoSistema.contraseñatxt);
      idEncuesta=infoEmpEncuesta.getIdEncuesta();
   
         vista_realizarEncuesta.txtFecha.setText(fechaActual());
    }
    //Metodo que me retorna la Fecha Actual
    public static String fechaActual(){
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("yyyy-MM-dd");
    
    return formatoFecha.format(fecha);
    
    }
    
    
  
       /*
    String edad=vista_realizarEncuesta.cb_edad.getSelectedItem().toString();
    String estadoCivil=vista_realizarEncuesta.cb_estadoCivil.getSelectedItem().toString();
    
    String genero=vista_realizarEncuesta.cb_genero.getSelectedItem().toString();
    String perCargo=vista_realizarEncuesta.cb_perCargo.getSelectedItem().toString();
    String escolaridad=vista_realizarEncuesta.cb_escolaridad.getSelectedItem().toString();
    String residencia=vista_realizarEncuesta.cb_residencia.getSelectedItem().toString();
    String tipoLibre=vista_realizarEncuesta.cb_tiempoLibre.getSelectedItem().toString();
    String ingreso=vista_realizarEncuesta.cb_ingresos.getSelectedItem().toString();
    String tiempoEmpresa=vista_realizarEncuesta.cb_tiempoEmpresa.getSelectedItem().toString();
    String tiempoCargo=vista_realizarEncuesta.cb_tiempoCargo.getSelectedItem().toString();
   // String consBebida=vista_realizarEncuesta.cb_bebidas.getSelectedItem().toString();
    */
    
    

    
    

  
   

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==vista_realizarEncuesta.btn_GuardarEncuesta){
         
           encuDatosPersonales=new M_EncDatosPer();
            String[] datosPersonales=new String[10];
            datosPersonales[0]=vista_realizarEncuesta.cb_edad.getSelectedItem().toString();
           datosPersonales[1]=vista_realizarEncuesta.cb_estadoCivil.getSelectedItem().toString();
           datosPersonales[2]=vista_realizarEncuesta.cb_genero.getSelectedItem().toString();
           datosPersonales[3]=vista_realizarEncuesta.cb_perCargo.getSelectedItem().toString();
           datosPersonales[4]=vista_realizarEncuesta.cb_escolaridad.getSelectedItem().toString();
           datosPersonales[5]=vista_realizarEncuesta.cb_residencia.getSelectedItem().toString();
           datosPersonales[6]=vista_realizarEncuesta.cb_tiempoLibre.getSelectedItem().toString();
           datosPersonales[7]=vista_realizarEncuesta.cb_ingresos.getSelectedItem().toString();
           datosPersonales[8]=vista_realizarEncuesta.cb_tiempoEmpresa.getSelectedItem().toString();
           datosPersonales[9]=vista_realizarEncuesta.cb_tiempoCargo.getSelectedItem().toString();
           int datPer=0;
           int iddato=1;
           for(int i=0; i<datosPersonales.length; i++){
             String respuesta=datosPersonales[i];
          datPer =encuDatosPersonales.Insertardatos(iddato, respuesta, idEncuesta);
             
          iddato=iddato+1;
           }
           if(datPer!=0){
        
           }else{
           JOptionPane.showMessageDialog(null, "ERROR NO SE GUARDO DATOS PERSONALES","ERROR",JOptionPane.ERROR_MESSAGE);
           }
           
           encudatosSalud=new M_EncDatosSalud();
           String[] datosSalud=new String[5];
           datosSalud[0]=vista_realizarEncuesta.cb_bebidas.getSelectedItem().toString();
           datosSalud[1]=vista_realizarEncuesta.cb_fuma.getSelectedItem().toString();
           datosSalud[2]=vista_realizarEncuesta.cb_13participaActiv.getSelectedItem().toString();
           datosSalud[3]=vista_realizarEncuesta.cb_14algunaEnfermedad.getSelectedItem().toString();
           datosSalud[4]=vista_realizarEncuesta.cb_15pracDeporte.getSelectedItem().toString();
           
           String[] saludObservaciones=new String[5];
           saludObservaciones[0]=null;
           saludObservaciones[1]=null;
           saludObservaciones[2]=vista_realizarEncuesta.textA_13cualesActivi.getText();
           saludObservaciones[3]=vista_realizarEncuesta.textA_14cualEnfermedad.getText();
           saludObservaciones[4]=vista_realizarEncuesta.textA_15cualDep.getText();
           int almacenDatos=0;
           int idDato=1;
           for(int i=0; i<datosSalud.length; i++){
           String respuesta=datosSalud[i];
           String observacion=saludObservaciones[i];
         almacenDatos=encudatosSalud.InsertardatosSalud(idDato, respuesta, observacion, idEncuesta);
           idDato=idDato+1;
           }
           if(almacenDatos!=0){
           
           }else{
           JOptionPane.showMessageDialog(null, "ERROR NO SE GUARDO DATOS DE SALUD ","ERROR",JOptionPane.ERROR_MESSAGE);
           }
        
        
           encudatosSGSST=new M_EncuDatosSGSST();
            String[] datosSGSST=new String[15];
           datosSGSST[0]=vista_realizarEncuesta.cb_16ConoceRiesgos.getSelectedItem().toString();
           datosSGSST[1]=vista_realizarEncuesta.cb_17Iluminacion.getSelectedItem().toString();
           datosSGSST[2]=vista_realizarEncuesta.cb_18capacitacion.getSelectedItem().toString();
           datosSGSST[3]=vista_realizarEncuesta.cb_19infraestructura.getSelectedItem().toString();
           datosSGSST[4]=vista_realizarEncuesta.cb_20temperatura.getSelectedItem().toString();
           datosSGSST[5]=vista_realizarEncuesta.cb_21almacenamiento.getSelectedItem().toString();
           datosSGSST[6]=vista_realizarEncuesta.cb_22movimientosrep.getSelectedItem().toString();
           datosSGSST[7]=vista_realizarEncuesta.cb_23cansancio.getSelectedItem().toString();
           datosSGSST[8]=vista_realizarEncuesta.cb_24distribuciontrabajo.getSelectedItem().toString();
           datosSGSST[9]=vista_realizarEncuesta.cb_25aplicahabilidades.getSelectedItem().toString();
           datosSGSST[10]=vista_realizarEncuesta.cb_26basuras.getSelectedItem().toString();
           datosSGSST[11]=vista_realizarEncuesta.cb_27posicion.getSelectedItem().toString();
           datosSGSST[12]=vista_realizarEncuesta.cb_28prodquimicos.getSelectedItem().toString();
           datosSGSST[13]=vista_realizarEncuesta.cb_29cargas.getSelectedItem().toString();
           datosSGSST[14]=vista_realizarEncuesta.cb_30epp.getSelectedItem().toString();
          
           
           String[] SGSSTObservaciones=new String[15];
           SGSSTObservaciones[0]=vista_realizarEncuesta.txtA_16riesgos.getText();
           SGSSTObservaciones[1]=vista_realizarEncuesta.txtA_17Iluminacion.getText();
           SGSSTObservaciones[2]=null;
           SGSSTObservaciones[3]=vista_realizarEncuesta.txtA_19infraestructura.getText();
           SGSSTObservaciones[4]=vista_realizarEncuesta.txtA_20temperatura.getText();
            SGSSTObservaciones[5]=vista_realizarEncuesta.txtA_21almacenamiento.getText();
             SGSSTObservaciones[6]=null;
              SGSSTObservaciones[7]=null;
              SGSSTObservaciones[8]=null;
              SGSSTObservaciones[9]=null;
              SGSSTObservaciones[10]=null;
              SGSSTObservaciones[11]=null;
              SGSSTObservaciones[12]=null;
              SGSSTObservaciones[13]=null;
              SGSSTObservaciones[14]=vista_realizarEncuesta.txtA_30EPP.getText();
                   
           int almacenDatosSGSST=0;
           int idDatoSGSST=1;
           for(int i=0; i<datosSGSST.length; i++){
           String respuestaSGSST=datosSGSST[i];
           String observacionSGSST=SGSSTObservaciones[i];
         almacenDatosSGSST=encudatosSGSST.InsertardatosSGSST(idDatoSGSST, respuestaSGSST, observacionSGSST, idEncuesta);
           idDatoSGSST=idDatoSGSST+1;
           }
           if(almacenDatosSGSST!=0){

           }else{
           JOptionPane.showMessageDialog(null, "ERROR NO SE GUARDO DATOS DE SGSTT ","ERROR",JOptionPane.ERROR_MESSAGE);
           }
        }
        
        
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
