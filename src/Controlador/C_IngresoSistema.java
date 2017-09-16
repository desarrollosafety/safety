/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.M_Empleado;
import Modelo.M_IngresoSistema;
import Vista.CambiarContraseña;
import Vista.Encuesta_SocioDemografica;
import Vista.IngresoUsuario;
import Vista.Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author USUARIO
 */
public class C_IngresoSistema implements ActionListener, KeyListener {

    IngresoUsuario vista_ingreso = new IngresoUsuario();
    M_IngresoSistema modelo_ingreso = new M_IngresoSistema();
    Encuesta_SocioDemografica encuesta=new Encuesta_SocioDemografica();
    M_Empleado modelo_ingresoEmpleado = new M_Empleado();
    DefaultTableModel modelo = new DefaultTableModel();

    static int contador = 0;
   public static String user;
   public static String rol;
   public static String contraseñatxt;
   public static String encriptacion;
   public static String nombrecompleto;
   public static int id;
    public C_IngresoSistema(IngresoUsuario vista_ingreso, M_IngresoSistema modelo_ingreso) {
        this.modelo_ingreso = modelo_ingreso;
        this.vista_ingreso = vista_ingreso;

        vista_ingreso.btn_Ingresar.addActionListener(this);
        vista_ingreso.btn_Cancelar.addActionListener(this);
        vista_ingreso.txt_User.addKeyListener(this);
        vista_ingreso.txt_Contraseña.addKeyListener(this);

        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido1");
        modelo.addColumn("apellido2");
        modelo.addColumn("tipoDoc");
        modelo.addColumn("numDoc");
        modelo.addColumn("telefono");
        modelo.addColumn("idProceso");
        modelo.addColumn("idJefe");
        modelo.addColumn("Cargo");
        modelo.addColumn("fechaIngreso");
        modelo.addColumn("email");
        modelo.addColumn("user");
        modelo.addColumn("password");
        modelo.addColumn("idGerente");
        modelo.addColumn("estado");
        modelo.addColumn("password_antigua");
        this.vista_ingreso.table_IngresoUsuario.setModel(modelo);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista_ingreso.btn_Ingresar) {

             rol = (String) vista_ingreso.cb_Rol.getSelectedItem();
             user = vista_ingreso.txt_User.getText();
            char[] contraseña = vista_ingreso.txt_Contraseña.getPassword();
            contraseñatxt = new String(contraseña);
            String con = DigestUtils.md5Hex(contraseñatxt);
            encriptacion=DigestUtils.md5Hex(contraseñatxt);

            if (rol.equals("Administrador SGSST")) {
                System.out.println(encriptacion);
                ArrayList<M_IngresoSistema> array = modelo_ingreso.Ingreso_AdminSGSST(user, con);
                int cantidad = array.size();
               
                if (cantidad == 0) {
                    JOptionPane.showMessageDialog(null, "Error, Usuario y/o Contraseña Incorrectos ");
                    contador++;
                    if (contador >= 3) {
                        JOptionPane.showMessageDialog(null, " Lo Sentimos ha Agotado los intentos de Inicio de Sesion, El Programa se cerrara ");
                        System.exit(0);
                    }
                } else {
                    
                    Object[] fila = new Object[modelo.getColumnCount()];

                    for (int i = 0; i < array.size(); i++) {
                        fila[0] = array.get(i).getIdPersona();
                        fila[1] = array.get(i).getNombre();
                        fila[2] = array.get(i).getPrimerApellido();
                        fila[3] = array.get(i).getSegundoApellido();
                        fila[4] = array.get(i).getTipoDoc();
                        fila[5] = array.get(i).getNumeroDoc();
                        fila[6] = array.get(i).getTelefono();
                        fila[7] = array.get(i).getIdProceso();
                        fila[8] = array.get(i).getEmail();
                        fila[9] = array.get(i).getFechaIngreso();
                        fila[10] = array.get(i).getUser();
                        fila[11] = array.get(i).getPassword();
                        fila[12] = array.get(i).getIdGerente();
                        fila[13] = array.get(i).getEstado();
                        fila[14] = array.get(i).getPassword_antigua();

                        modelo.addRow(fila);
                        if (modelo.getRowCount() > 0) {
                            Principal principal = new Principal();
                            principal.label_nombreUser.setText(modelo.getValueAt(0, 1).toString() + " " + modelo.getValueAt(0, 2) + " " + modelo.getValueAt(0, 3));
                            principal.label_rol.setText("Administrador SGSST");
                            id=Integer.parseInt(modelo.getValueAt(0, 0).toString());
                            nombrecompleto=(modelo.getValueAt(0, 1).toString()+" "+modelo.getValueAt(0, 2)+" "+modelo.getValueAt(0, 3));
                            principal.pass.setText(modelo.getValueAt(0, 11).toString());
                            principal.id.setText(modelo.getValueAt(0, 0).toString());
                        
                          if(modelo.getValueAt(0, 11).toString().equals(modelo.getValueAt(0, 14).toString())){
                          principal.setVisible(true);
                          this.vista_ingreso.dispose();    
                          }else{
                          principal.setVisible(true);
                          this.vista_ingreso.dispose();    
                          CambiarContraseña ca = new CambiarContraseña();
                          ca.setLocationRelativeTo(null);
                          ca.setVisible(true);
                          }
                          } else {
                        }
                        
                    }
                }
            }

            if (rol.equals("Empleado")) {
                ArrayList<M_Empleado> array = modelo_ingresoEmpleado.ingreso_empleado(user, encriptacion);
                int cantidad = array.size();
                
                if (cantidad <= 0) {
                    JOptionPane.showMessageDialog(null, "Error, Usuario y/o Contraseña Incorrectos ");
                    contador++;
                } else{
                    if (contador >= 3) {
                        JOptionPane.showMessageDialog(null, " Lo Sentimos ha Agotado los intentos de Inicio de Sesion, El Programa se cerrara ");
                        System.exit(0);
                    } else {
                        Object[] fila = new Object[modelo.getColumnCount()];
                        for (int i = 0; i < array.size(); i++) {
                            fila[0] = array.get(i).getIdPersona();
                            fila[1] = array.get(i).getNombre();
                            fila[2] = array.get(i).getPrimerApellido();
                            fila[3] = array.get(i).getSegundoApellido();
                            fila[4] = array.get(i).getTipoDoc();
                            fila[5] = array.get(i).getNumeroDoc();
                            fila[6] = array.get(i).getTelefono();
                            fila[7] = array.get(i).getIdProceso();
                            fila[8] = array.get(i).getIdJefe();
                            fila[9] = array.get(i).getCargo();
                            fila[10] = array.get(i).getFechaIngreso();
                            fila[11] = array.get(i).getEmail();

                            fila[12] = array.get(i).getUser_empleado();
                            fila[13] = array.get(i).getContraseña_usuario();
                            fila[14] = array.get(i).getEstado_empleado();
                            fila[15] = array.get(i).getConstraseña_antigua();

                            modelo.addRow(fila);
                            if (modelo.getRowCount() > 0) {
                                Principal principal = new Principal();
                                principal.label_nombreUser.setText(modelo.getValueAt(0, 1).toString() + " " + modelo.getValueAt(0, 2) + " " + modelo.getValueAt(0, 3));
                                principal.label_rol.setText("Empleado");
                               principal.jm_realizarEvaluacion.setVisible(false);
                               principal.jm_registrarEmpresa.setVisible(false);
                               principal.me_registrarEmpleado.setVisible(false);
                               principal.btn_evaluacion.setVisible(false);
                               principal.btn_evaluacion.setEnabled(false);
                               principal.btn_primero.setEnabled(false);
                               principal.jm_Empresa.setVisible(false);
                               principal.txt_nombrePri.setText(modelo.getValueAt(0, 1).toString());
                               id=Integer.parseInt(modelo.getValueAt(0, 0).toString());
                          nombrecompleto=(modelo.getValueAt(0, 1).toString()+" "+modelo.getValueAt(0, 2)+" "+modelo.getValueAt(0, 3));
                                principal.setVisible(true);
                                principal.pass.setText(modelo.getValueAt(0, 13).toString());
                            principal.id.setText(modelo.getValueAt(0, 0).toString());
                        
                          if(modelo.getValueAt(0, 13).toString().equals(modelo.getValueAt(0, 15).toString())){
                          principal.setVisible(true);
                          this.vista_ingreso.dispose();    
                          }else{
                          principal.setVisible(true);
                          this.vista_ingreso.dispose();    
                          CambiarContraseña ca = new CambiarContraseña();
                          ca.setLocationRelativeTo(null);
                          ca.setVisible(true);
                          }
                          } else {
                        }
                        }
                    }
                }
            }
                

                    if (rol.equals("Gerente")) {
                        ArrayList<M_IngresoSistema> array = modelo_ingreso.Ingreso_Gerente(user, encriptacion);
                        int cantidad = array.size();
                       
                        if (cantidad == 0) {
                            JOptionPane.showMessageDialog(null, "Error, Usuario y/o Contraseña Incorrectos ");
                            contador++;
                        } else {
                            if (contador >= 3) {
                                JOptionPane.showMessageDialog(null, " Lo Sentimos ha Agotado los intentos de Inicio de Sesion, El Programa se cerrara ");
                                System.exit(0);
                            } else {
                                Object[] fila = new Object[modelo.getColumnCount()];

                                for (int i = 0; i < array.size(); i++) {
                                    fila[0] = array.get(i).getIdPersona();
                                    fila[1] = array.get(i).getNombre();
                                    fila[2] = array.get(i).getPrimerApellido();
                                    fila[3] = array.get(i).getSegundoApellido();
                                    fila[4] = array.get(i).getTipoDoc();
                                    fila[5] = array.get(i).getNumeroDoc();
                                    fila[6] = array.get(i).getTelefono();
                                    fila[7] = array.get(i).getIdProceso();
                                    fila[8] = array.get(i).getEmail();
                                    fila[9] = array.get(i).getFechaIngreso();
                                    fila[10] = array.get(i).getUser();
                                    fila[11] = array.get(i).getPassword();
                                    fila[12] = array.get(i).getEstado();
                                    fila[13] = array.get(i).getPassword_antigua();

                                    modelo.addRow(fila);
                                    if (modelo.getRowCount() > 0) {
                                        Principal principal = new Principal();
                                        principal.label_nombreUser.setText(modelo.getValueAt(0, 1).toString() + " " + modelo.getValueAt(0, 2) + " " + modelo.getValueAt(0, 3));
                                        
                                        principal.label_rol.setText("Gerente");
                                        principal.setVisible(true);
                                        
                                          id=Integer.parseInt(modelo.getValueAt(0, 0).toString());
                          nombrecompleto=(modelo.getValueAt(0, 1).toString()+" "+modelo.getValueAt(0, 2)+" "+modelo.getValueAt(0, 3));
                          principal.pass.setText(modelo.getValueAt(0, 11).toString());
                            principal.id.setText(modelo.getValueAt(0, 0).toString());
                        
                          if(modelo.getValueAt(0, 11).toString().equals(modelo.getValueAt(0, 13).toString())){
                          principal.setVisible(true);
                          this.vista_ingreso.dispose();    
                          }else{
                          principal.setVisible(true);
                          this.vista_ingreso.dispose();    
                          CambiarContraseña ca = new CambiarContraseña();
                          ca.setLocationRelativeTo(null);
                          ca.setVisible(true);
                          }
                          } else {
                        }
                                }
                            }
                        }

                    }

                    if (rol.equals("Jefe de Proceso")) {
                        ArrayList<M_IngresoSistema> array = modelo_ingreso.ingreso_JefeProceso(user, encriptacion);
                        int cantidad = array.size();

                        if (cantidad == 0) {
                            JOptionPane.showMessageDialog(null, "Error, Usuario y/o Contraseña Incorrectos ");
                            contador++;
                        } else {
                            if (contador >= 3) {
                                JOptionPane.showMessageDialog(null, " Lo Sentimos ha Agotado los intentos de Inicio de Sesion, El Programa se cerrara ");
                                System.exit(0);
                            } else {
                                Object[] fila = new Object[modelo.getColumnCount()];
                                for (int i = 0; i < array.size(); i++) {
                                    fila[0] = array.get(i).getIdPersona();
                                    fila[1] = array.get(i).getNombre();
                                    fila[2] = array.get(i).getPrimerApellido();
                                    fila[3] = array.get(i).getSegundoApellido();
                                    fila[4] = array.get(i).getTipoDoc();
                                    fila[5] = array.get(i).getNumeroDoc();
                                    fila[6] = array.get(i).getTelefono();
                                    fila[7] = array.get(i).getIdProceso();
                                    fila[8] = array.get(i).getEmail();
                                    fila[9] = array.get(i).getFechaIngreso();
                                    fila[10] = array.get(i).getUser();
                                    fila[11] = array.get(i).getPassword();
                                    fila[12] = array.get(i).getEstado();
                                    fila[13] = array.get(i).getPassword_antigua();
                                    modelo.addRow(fila);

                                    if (modelo.getRowCount() > 0){
                                        Principal principal = new Principal();
                                        principal.label_nombreUser.setText(modelo.getValueAt(0, 1).toString() + " " + modelo.getValueAt(0, 2) + " " + modelo.getValueAt(0, 3));
                                        principal.label_rol.setText("Jefe de Proceso");
                                        
                                          id=Integer.parseInt(modelo.getValueAt(0, 0).toString());
                          nombrecompleto=(modelo.getValueAt(0, 1).toString()+" "+modelo.getValueAt(0, 2)+" "+modelo.getValueAt(0, 3));
                          principal.pass.setText(modelo.getValueAt(0, 11).toString());
                            principal.id.setText(modelo.getValueAt(0, 0).toString());
                        
                          if(modelo.getValueAt(0, 11).toString().equals(modelo.getValueAt(0, 13).toString())){
                          principal.setVisible(true);
                          this.vista_ingreso.dispose();    
                          }else{
                          principal.setVisible(true);
                          this.vista_ingreso.dispose();    
                          CambiarContraseña ca = new CambiarContraseña();
                          ca.setLocationRelativeTo(null);
                          ca.setVisible(true);
                          }
                          } else {
                        }
                                }
                            }
                        }
                    }
                }
                //To change body of generated 
            }
            //To change body of generated methods, choose Tools | Templates.

            @Override
     public void keyTyped(KeyEvent ke) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
 public void keyPressed(KeyEvent ke) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public void keyReleased
            (KeyEvent ke
            
            
        
    

) {
         //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
