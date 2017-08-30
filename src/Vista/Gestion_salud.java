/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Cevaluacion;
import Controlador.Cgestion_salud;
import Controlador.Crecursos;
import Modelo.Mevaluacion;
import Modelo.Mgestion_salud;
import Modelo.Mrecursos;
import java.io.FileInputStream;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.UIManager;

/**
 *
 * @author LENOVO
 */
public class Gestion_salud extends javax.swing.JFrame {

    /**
     * Creates new form Gestion_salud
     */
    public Gestion_salud() {
        initComponents();
        // inhabilitar botones minimizar, cerrar y maximizar
         getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        this.setLocationRelativeTo(null);
        
         ButtonGroup rbnitem1 = new ButtonGroup();
        rbnitem1.add(rbjustiitem23);
        rbnitem1.add(rbnojustiitem23);

        ButtonGroup rbnitem2 = new ButtonGroup();
        rbnitem2.add(rbjustiitem24);
        rbnitem2.add(rbnojustiitem24);

        ButtonGroup rbnitem3 = new ButtonGroup();
        rbnitem3.add(rbjustiitem25);
        rbnitem3.add(rbnojustiitem25);

        ButtonGroup rbnitem4 = new ButtonGroup();
        rbnitem4.add(rbjustiitem26);
        rbnitem4.add(rbnojustiitem26);

        ButtonGroup rbnitem5 = new ButtonGroup();
        rbnitem5.add(rbjustiitem27);
        rbnitem5.add(rbnojustiitem27);

        ButtonGroup rbnitem6 = new ButtonGroup();
        rbnitem6.add(rbjustiitem28);
        rbnitem6.add(rbnojustiitem28);

        ButtonGroup rbnitem7 = new ButtonGroup();
        rbnitem7.add(rbjustiitem29);
        rbnitem7.add(rbnojustiitem29);

        ButtonGroup rbnitem8 = new ButtonGroup();
        rbnitem8.add(rbjustiitem30);
        rbnitem8.add(rbnojustiitem30);

        ButtonGroup rbnitem9 = new ButtonGroup();
        rbnitem9.add(rbjustiitem31);
        rbnitem9.add(rbnojustiitem31);

        ButtonGroup rbnitem10 = new ButtonGroup();
        rbnitem10.add(rbjustiitem32);
        rbnitem10.add(rbnojustiitem32);

        ButtonGroup rbnitem11 = new ButtonGroup();
        rbnitem11.add(rbjustiitem33);
        rbnitem11.add(rbnojustiitem33);
        
         ButtonGroup rbnitem12 = new ButtonGroup();
        rbnitem12.add(rbjustiitem34);
        rbnitem12.add(rbnojustiitem34);

        ButtonGroup rbnitem13 = new ButtonGroup();
        rbnitem13.add(rbjustiitem35);
        rbnitem13.add(rbnojustiitem35);

        ButtonGroup rbnitem14 = new ButtonGroup();
        rbnitem14.add(rbjustiitem36);
        rbnitem14.add(rbnojustiitem36);

        ButtonGroup rbnitem15 = new ButtonGroup();
        rbnitem15.add(rbjustiitem37);
        rbnitem15.add(rbnojustiitem37);

        ButtonGroup rbnitem16 = new ButtonGroup();
        rbnitem16.add(rbjustiitem38);
        rbnitem16.add(rbnojustiitem38);

        ButtonGroup rbnitem17 = new ButtonGroup();
        rbnitem17.add(rbjustiitem39);
        rbnitem17.add(rbnojustiitem39);

        ButtonGroup rbnitem18 = new ButtonGroup();
        rbnitem18.add(rbjustiitem40);
        rbnitem18.add(rbnojustiitem40);

        ButtonGroup mv111 = new ButtonGroup();
        mv111.add(rbsi231);
        mv111.add(rbno231);

        ButtonGroup mv112 = new ButtonGroup();
        mv112.add(rbsi241);
        mv112.add(rbno241);

        ButtonGroup mv113 = new ButtonGroup();
        mv113.add(rbsi242);
        mv113.add(rbno242);

        ButtonGroup mv114 = new ButtonGroup();
        mv114.add(rbsi251);
        mv114.add(rbno251);

        ButtonGroup mv121 = new ButtonGroup();
        mv121.add(rbsi261);
        mv121.add(rbno261);

        ButtonGroup mv131 = new ButtonGroup();
        mv131.add(rbsi262);
        mv131.add(rbno262);

        ButtonGroup mv141 = new ButtonGroup();
        mv141.add(rbsi263);
        mv141.add(rbno263);

        ButtonGroup mv142 = new ButtonGroup();
        mv142.add(rbsi271);
        mv142.add(rbno271);

        ButtonGroup mv151 = new ButtonGroup();
        mv151.add(rbsi281);
        mv151.add(rbno281);

        ButtonGroup mv161 = new ButtonGroup();
        mv161.add(rbsi282);
        mv161.add(rbno282);

        ButtonGroup mv162 = new ButtonGroup();
        mv162.add(rbsi291);
        mv162.add(rbno291);

        ButtonGroup mv171 = new ButtonGroup();
        mv171.add(rbsi301);
        mv171.add(rbno301);

        ButtonGroup mv181 = new ButtonGroup();
        mv181.add(rbsi311);
        mv181.add(rbno311);

        ButtonGroup mv182 = new ButtonGroup();
        mv182.add(rbsi321);
        mv182.add(rbno321);

        ButtonGroup mv191 = new ButtonGroup();
        mv191.add(rbsi331);
        mv191.add(rbno331);

        ButtonGroup mv192 = new ButtonGroup();
        mv192.add(rbsi332);
        mv192.add(rbno332);

        ButtonGroup mv1101 = new ButtonGroup();
        mv1101.add(rbsi333);
        mv1101.add(rbno333);
        
        ButtonGroup mv20 = new ButtonGroup();
        mv20.add(rbsi341);
        mv20.add(rbno341);

        ButtonGroup mv17 = new ButtonGroup();
        mv17.add(rbsi351);
        mv17.add(rbno351);

        ButtonGroup mv18 = new ButtonGroup();
        mv18.add(rbsi361);
        mv18.add(rbno361);

        ButtonGroup mv184 = new ButtonGroup();
        mv184.add(rbsi371);
        mv184.add(rbno371);

        ButtonGroup mv195 = new ButtonGroup();
        mv195.add(rbsi381);
        mv195.add(rbno381);

        ButtonGroup mv194 = new ButtonGroup();
        mv194.add(rbsi391);
        mv194.add(rbno391);

        ButtonGroup mv1 = new ButtonGroup();
        mv1.add(rbsi401);
        mv1.add(rbno401);
        
        
        
        
        
        
        noVisibles();
    }
    Mevaluacion ps= new Mevaluacion();
    Evaluacion_Ini gh= new Evaluacion_Ini();
    Cevaluacion cm= new Cevaluacion();
    
     public void noVisibles() {
        rbjustiitem23.setEnabled(false);
        rbjustiitem24.setEnabled(false);
        rbjustiitem25.setEnabled(false);
        rbjustiitem26.setEnabled(false);
        rbjustiitem27.setEnabled(false);
        rbjustiitem28.setEnabled(false);
        rbjustiitem29.setEnabled(false);
        rbjustiitem30.setEnabled(false);
        rbjustiitem31.setEnabled(false);
        rbjustiitem32.setEnabled(false);
        rbjustiitem33.setEnabled(false);
        rbjustiitem34.setEnabled(false);
        rbjustiitem35.setEnabled(false);
        rbjustiitem36.setEnabled(false);
        rbjustiitem37.setEnabled(false);
        rbjustiitem38.setEnabled(false);
        rbjustiitem39.setEnabled(false);
        rbjustiitem40.setEnabled(false);

        rbnojustiitem23.setEnabled(false);
        rbnojustiitem24.setEnabled(false);
        rbnojustiitem25.setEnabled(false);
        rbnojustiitem26.setEnabled(false);
        rbnojustiitem27.setEnabled(false);
        rbnojustiitem28.setEnabled(false);
        rbnojustiitem29.setEnabled(false);
        rbnojustiitem30.setEnabled(false);
        rbnojustiitem31.setEnabled(false);
        rbnojustiitem32.setEnabled(false);
        rbnojustiitem33.setEnabled(false);
         rbnojustiitem34.setEnabled(false);
        rbnojustiitem35.setEnabled(false);
        rbnojustiitem36.setEnabled(false);
        rbnojustiitem37.setEnabled(false);
        rbnojustiitem38.setEnabled(false);
        rbnojustiitem39.setEnabled(false);
        rbnojustiitem40.setEnabled(false);

        txtitem23.setEnabled(false);
        txtitem24.setEnabled(false);
        txtitem25.setEnabled(false);
        txtitem26.setEnabled(false);
        txtitem27.setEnabled(false);
        txtitem28.setEnabled(false);
        txtitem29.setEnabled(false);
        txtitem30.setEnabled(false);
        txtitem31.setEnabled(false);
        txtitem32.setEnabled(false);
        txtitem33.setEnabled(false);
        txtitem34.setEnabled(false);
        txtitem35.setEnabled(false);
        txtitem36.setEnabled(false);
        txtitem37.setEnabled(false);
        txtitem38.setEnabled(false);
        txtitem39.setEnabled(false);
        txtitem40.setEnabled(false);

        btnadjnoitem23.setEnabled(false);
        btnadjnoitem24.setEnabled(false);
        btnadjnoitem25.setEnabled(false);
        btnadjnoitem26.setEnabled(false);
        btnadjnoitem27.setEnabled(false);
        btnadjnoitem28.setEnabled(false);
        btnadjnoitem29.setEnabled(false);
        btnadjnoitem30.setEnabled(false);
        btnadjnoitem31.setEnabled(false);
        btnadjnoitem32.setEnabled(false);
        btnadjnoitem33.setEnabled(false);
        btnadjnoitem34.setEnabled(false);
        btnadjnoitem35.setEnabled(false);
        btnadjnoitem36.setEnabled(false);
        btnadjnoitem37.setEnabled(false);
        btnadjnoitem38.setEnabled(false);
        btnadjnoitem39.setEnabled(false);
        btnadjnoitem40.setEnabled(false);

      
        

        btnmv231.setEnabled(false);
        btnmv241.setEnabled(false);
        btnmv242.setEnabled(false);
        btnmv251.setEnabled(false);
        btnmv261.setEnabled(false);
        btnmv262.setEnabled(false);
        btnmv263.setEnabled(false);
        btnmv271.setEnabled(false);
        btnmv281.setEnabled(false);
        btnmv282.setEnabled(false);
        btnmv291.setEnabled(false);
        btnmv301.setEnabled(false);
        btnmv311.setEnabled(false);
        btnmv321.setEnabled(false);
        btnmv331.setEnabled(false);
        btnmv332.setEnabled(false);
        btnmv333.setEnabled(false); 
        btnmv341.setEnabled(false);
        btnmv351.setEnabled(false);
        btnmv361.setEnabled(false);
        btnmv371.setEnabled(false);
        btnmv381.setEnabled(false);
        btnmv391.setEnabled(false);
        btnmv401.setEnabled(false);
        

        lblcum23.setEnabled(false);
        lblcum24.setEnabled(false);
        lblcum25.setEnabled(false);
        lblcum26.setEnabled(false);
        lblcum27.setEnabled(false);
        lblcum28.setEnabled(false);
        lblcum29.setEnabled(false);
        lblcum30.setEnabled(false);
        lblcum31.setEnabled(false);
        lblcum32.setEnabled(false);
        lblcum33.setEnabled(false);
        lblcum34.setEnabled(false);
        lblcum35.setEnabled(false);
        lblcum36.setEnabled(false);
        lblcum37.setEnabled(false);
        lblcum38.setEnabled(false);
        lblcum39.setEnabled(false);
        lblcum40.setEnabled(false);
        
        
        
        lblnocum23.setEnabled(false);
        lblnocum24.setEnabled(false);
        lblnocum25.setEnabled(false);
        lblnocum26.setEnabled(false);
        lblnocum27.setEnabled(false);
        lblnocum28.setEnabled(false);
        lblnocum29.setEnabled(false);
        lblnocum30.setEnabled(false);
        lblnocum31.setEnabled(false);
        lblnocum32.setEnabled(false);
        lblnocum33.setEnabled(false);
        lblnocum34.setEnabled(false);
        lblnocum35.setEnabled(false);
        lblnocum36.setEnabled(false);
        lblnocum37.setEnabled(false);
        lblnocum38.setEnabled(false);
        lblnocum39.setEnabled(false);
        lblnocum40.setEnabled(false);

    }
    
    Mgestion_salud tr = new Mgestion_salud();
    
       public void Validar (){
           Cgestion_salud func = new Cgestion_salud();
           
           
        
           
       
    if(tr.getI231().equals("")){
        
        JOptionPane.showMessageDialog(null,"El item 1 del estandar E3.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI241().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 2 del estandar E3.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI251().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 3 del estandar E3.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI261().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 4 del estandar E3.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI271().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 5 del estandar E3.1 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI281().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 6 del estandar E3.1 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI291().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 7 del estandar E3.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI301().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 8 del estandar E3.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI311().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 9 del estandar E3.1 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI321().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E3.2 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI331().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 2 del estandar E3.2 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI341().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 3 del estandar E3.2 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI351().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E3.3 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI361().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 2 del estandar E3.3 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI371().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 3 del estandar E3.3 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI381().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 4 del estandar E3.3 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI391().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 5 del estandar E3.3 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI401().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 6 del estandar E3.3 no se ha diligenciado correctamente ");
        
    }
   
    
    if(!tr.getI231().equals("") && !tr.getI241().equals("") && !tr.getI251().equals("") && !tr.getI261().equals("") && !tr.getI271().equals("") && !tr.getI281().equals("") 
            && !tr.getI291().equals("") && !tr.getI301().equals("") && !tr.getI311().equals("") && !tr.getI321().equals("") && !tr.getI331().equals("")&& !tr.getI341().equals("")
            && !tr.getI351().equals("")&& !tr.getI361().equals("")&& !tr.getI371().equals("")&& !tr.getI381().equals("")&& !tr.getI391().equals("")&& !tr.getI401().equals("")){
     
        
    int dialogButton =JOptionPane.showConfirmDialog(null, "Esta seguro que desea guardar las respuesta diligenciadas en la evaluacion inicial,"
                                                        + " recuerde que si acepta no podra volver a diligenciar este formulario hasta que comience una nueva E. inicial ");
           if(dialogButton == JOptionPane.YES_OPTION){     
        
        func.insertarItem23(tr);
        func.insertarItem24(tr);
        func.insertarItem25(tr);
        func.insertarItem26(tr);
        func.insertarItem27(tr);
        func.insertarItem28(tr);
        func.insertarItem29(tr);
        func.insertarItem30(tr);
        func.insertarItem31(tr);
        func.insertarItem32(tr);
        func.insertarItem33(tr);
        func.insertarItem34(tr);
        func.insertarItem35(tr);
        func.insertarItem36(tr);
        func.insertarItem37(tr);
        func.insertarItem38(tr);
        func.insertarItem39(tr);

        if(func.insertarItem40(tr)){
            JOptionPane.showMessageDialog(rootPane, "Se han registrado los items satisfactoriamente");

        }
      ps.setE3(1);
      cm.Puntaje();
      gh.punt= ps.getPunt();
       gh.config();
       int valo=20;
       ps.setBarra(ps.getBarra()+valo);
       this.dispose();
       gh.val=ps.getBarra();
        gh.empezar();
        
        cm.est_gestSalud(ps);
       gh.setVisible(true);
       gh.toFront();
   
       
           }
       
     }
        
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblnocum23 = new javax.swing.JLabel();
        lblcum23 = new javax.swing.JLabel();
        noaplicaitem23 = new javax.swing.JCheckBox();
        rbjustiitem23 = new javax.swing.JRadioButton();
        rbnojustiitem23 = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtitem23 = new javax.swing.JTextArea();
        btnadjnoitem23 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        rbsi231 = new javax.swing.JRadioButton();
        rbno231 = new javax.swing.JRadioButton();
        btnmv231 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lblnocum24 = new javax.swing.JLabel();
        lblcum24 = new javax.swing.JLabel();
        noaplicaitem24 = new javax.swing.JCheckBox();
        rbjustiitem24 = new javax.swing.JRadioButton();
        rbnojustiitem24 = new javax.swing.JRadioButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtitem24 = new javax.swing.JTextArea();
        btnadjnoitem24 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        rbsi241 = new javax.swing.JRadioButton();
        rbno241 = new javax.swing.JRadioButton();
        btnmv241 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        rbsi242 = new javax.swing.JRadioButton();
        rbno242 = new javax.swing.JRadioButton();
        btnmv242 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblnocum25 = new javax.swing.JLabel();
        lblcum25 = new javax.swing.JLabel();
        noaplicaitem25 = new javax.swing.JCheckBox();
        rbjustiitem25 = new javax.swing.JRadioButton();
        rbnojustiitem25 = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtitem25 = new javax.swing.JTextArea();
        btnadjnoitem25 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rbsi251 = new javax.swing.JRadioButton();
        rbno251 = new javax.swing.JRadioButton();
        btnmv251 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        lblnocum26 = new javax.swing.JLabel();
        lblcum26 = new javax.swing.JLabel();
        noaplicaitem26 = new javax.swing.JCheckBox();
        rbjustiitem26 = new javax.swing.JRadioButton();
        rbnojustiitem26 = new javax.swing.JRadioButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtitem26 = new javax.swing.JTextArea();
        btnadjnoitem26 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        rbsi261 = new javax.swing.JRadioButton();
        rbno261 = new javax.swing.JRadioButton();
        btnmv261 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        rbsi262 = new javax.swing.JRadioButton();
        rbno262 = new javax.swing.JRadioButton();
        btnmv262 = new javax.swing.JButton();
        rbsi263 = new javax.swing.JRadioButton();
        rbno263 = new javax.swing.JRadioButton();
        btnmv263 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblnocum27 = new javax.swing.JLabel();
        lblcum27 = new javax.swing.JLabel();
        noaplicaitem27 = new javax.swing.JCheckBox();
        rbjustiitem27 = new javax.swing.JRadioButton();
        rbnojustiitem27 = new javax.swing.JRadioButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtitem27 = new javax.swing.JTextArea();
        btnadjnoitem27 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        rbsi271 = new javax.swing.JRadioButton();
        rbno271 = new javax.swing.JRadioButton();
        btnmv271 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lblnocum28 = new javax.swing.JLabel();
        lblcum28 = new javax.swing.JLabel();
        noaplicaitem28 = new javax.swing.JCheckBox();
        rbjustiitem28 = new javax.swing.JRadioButton();
        rbnojustiitem28 = new javax.swing.JRadioButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtitem28 = new javax.swing.JTextArea();
        btnadjnoitem28 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        rbsi281 = new javax.swing.JRadioButton();
        rbno281 = new javax.swing.JRadioButton();
        btnmv281 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        rbsi282 = new javax.swing.JRadioButton();
        rbno282 = new javax.swing.JRadioButton();
        btnmv282 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblnocum29 = new javax.swing.JLabel();
        lblcum29 = new javax.swing.JLabel();
        noaplicaitem29 = new javax.swing.JCheckBox();
        rbjustiitem29 = new javax.swing.JRadioButton();
        rbnojustiitem29 = new javax.swing.JRadioButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtitem29 = new javax.swing.JTextArea();
        btnadjnoitem29 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        rbsi291 = new javax.swing.JRadioButton();
        rbno291 = new javax.swing.JRadioButton();
        btnmv291 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblnocum30 = new javax.swing.JLabel();
        lblcum30 = new javax.swing.JLabel();
        noaplicaitem30 = new javax.swing.JCheckBox();
        rbjustiitem30 = new javax.swing.JRadioButton();
        rbnojustiitem30 = new javax.swing.JRadioButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtitem30 = new javax.swing.JTextArea();
        btnadjnoitem30 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        rbsi301 = new javax.swing.JRadioButton();
        rbno301 = new javax.swing.JRadioButton();
        btnmv301 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblnocum31 = new javax.swing.JLabel();
        lblcum31 = new javax.swing.JLabel();
        noaplicaitem31 = new javax.swing.JCheckBox();
        rbjustiitem31 = new javax.swing.JRadioButton();
        rbnojustiitem31 = new javax.swing.JRadioButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtitem31 = new javax.swing.JTextArea();
        btnadjnoitem31 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        rbsi311 = new javax.swing.JRadioButton();
        rbno311 = new javax.swing.JRadioButton();
        btnmv311 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lblnocum32 = new javax.swing.JLabel();
        lblcum32 = new javax.swing.JLabel();
        noaplicaitem32 = new javax.swing.JCheckBox();
        rbjustiitem32 = new javax.swing.JRadioButton();
        rbnojustiitem32 = new javax.swing.JRadioButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtitem32 = new javax.swing.JTextArea();
        btnadjnoitem32 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        rbsi321 = new javax.swing.JRadioButton();
        rbno321 = new javax.swing.JRadioButton();
        btnmv321 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        lblnocum33 = new javax.swing.JLabel();
        lblcum33 = new javax.swing.JLabel();
        noaplicaitem33 = new javax.swing.JCheckBox();
        rbjustiitem33 = new javax.swing.JRadioButton();
        rbnojustiitem33 = new javax.swing.JRadioButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtitem33 = new javax.swing.JTextArea();
        btnadjnoitem33 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        rbsi331 = new javax.swing.JRadioButton();
        rbno331 = new javax.swing.JRadioButton();
        btnmv331 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        rbsi333 = new javax.swing.JRadioButton();
        rbno333 = new javax.swing.JRadioButton();
        btnmv333 = new javax.swing.JButton();
        rbsi332 = new javax.swing.JRadioButton();
        rbno332 = new javax.swing.JRadioButton();
        btnmv332 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        lblnocum34 = new javax.swing.JLabel();
        lblcum34 = new javax.swing.JLabel();
        noaplicaitem34 = new javax.swing.JCheckBox();
        rbjustiitem34 = new javax.swing.JRadioButton();
        rbnojustiitem34 = new javax.swing.JRadioButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtitem34 = new javax.swing.JTextArea();
        btnadjnoitem34 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        rbsi341 = new javax.swing.JRadioButton();
        rbno341 = new javax.swing.JRadioButton();
        btnmv341 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        lblnocum35 = new javax.swing.JLabel();
        lblcum35 = new javax.swing.JLabel();
        noaplicaitem35 = new javax.swing.JCheckBox();
        rbjustiitem35 = new javax.swing.JRadioButton();
        rbnojustiitem35 = new javax.swing.JRadioButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtitem35 = new javax.swing.JTextArea();
        btnadjnoitem35 = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        rbsi351 = new javax.swing.JRadioButton();
        rbno351 = new javax.swing.JRadioButton();
        btnmv351 = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        lblnocum36 = new javax.swing.JLabel();
        lblcum36 = new javax.swing.JLabel();
        noaplicaitem36 = new javax.swing.JCheckBox();
        rbjustiitem36 = new javax.swing.JRadioButton();
        rbnojustiitem36 = new javax.swing.JRadioButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        txtitem36 = new javax.swing.JTextArea();
        btnadjnoitem36 = new javax.swing.JButton();
        jLabel122 = new javax.swing.JLabel();
        rbsi361 = new javax.swing.JRadioButton();
        rbno361 = new javax.swing.JRadioButton();
        btnmv361 = new javax.swing.JButton();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        lblnocum37 = new javax.swing.JLabel();
        lblcum37 = new javax.swing.JLabel();
        noaplicaitem37 = new javax.swing.JCheckBox();
        rbjustiitem37 = new javax.swing.JRadioButton();
        rbnojustiitem37 = new javax.swing.JRadioButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        txtitem37 = new javax.swing.JTextArea();
        btnadjnoitem37 = new javax.swing.JButton();
        jLabel128 = new javax.swing.JLabel();
        rbsi371 = new javax.swing.JRadioButton();
        rbno371 = new javax.swing.JRadioButton();
        btnmv371 = new javax.swing.JButton();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        lblnocum38 = new javax.swing.JLabel();
        lblcum38 = new javax.swing.JLabel();
        noaplicaitem38 = new javax.swing.JCheckBox();
        rbjustiitem38 = new javax.swing.JRadioButton();
        rbnojustiitem38 = new javax.swing.JRadioButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtitem38 = new javax.swing.JTextArea();
        btnadjnoitem38 = new javax.swing.JButton();
        jLabel134 = new javax.swing.JLabel();
        rbsi381 = new javax.swing.JRadioButton();
        rbno381 = new javax.swing.JRadioButton();
        btnmv381 = new javax.swing.JButton();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        lblnocum39 = new javax.swing.JLabel();
        lblcum39 = new javax.swing.JLabel();
        noaplicaitem39 = new javax.swing.JCheckBox();
        rbjustiitem39 = new javax.swing.JRadioButton();
        rbnojustiitem39 = new javax.swing.JRadioButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        txtitem39 = new javax.swing.JTextArea();
        btnadjnoitem39 = new javax.swing.JButton();
        jLabel140 = new javax.swing.JLabel();
        rbsi391 = new javax.swing.JRadioButton();
        rbno391 = new javax.swing.JRadioButton();
        btnmv391 = new javax.swing.JButton();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        lblnocum40 = new javax.swing.JLabel();
        lblcum40 = new javax.swing.JLabel();
        noaplicaitem40 = new javax.swing.JCheckBox();
        rbjustiitem40 = new javax.swing.JRadioButton();
        rbnojustiitem40 = new javax.swing.JRadioButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtitem40 = new javax.swing.JTextArea();
        btnadjnoitem40 = new javax.swing.JButton();
        jLabel146 = new javax.swing.JLabel();
        rbsi401 = new javax.swing.JRadioButton();
        rbno401 = new javax.swing.JRadioButton();
        btnmv401 = new javax.swing.JButton();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E3.1Condiciones de Salud en el Trabajo (9%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel8.setToolTipText("");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Modo de Verificación ");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel27.setText("Evaluación Médica Ocupacional (1%)");

        lblnocum23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem23.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem23.setText("No Aplica");
        noaplicaitem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem23ActionPerformed(evt);
            }
        });

        rbjustiitem23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem23.setText("Justifica");
        rbjustiitem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem23ActionPerformed(evt);
            }
        });

        rbnojustiitem23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem23.setText("No justifica");
        rbnojustiitem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem23ActionPerformed(evt);
            }
        });

        txtitem23.setColumns(20);
        txtitem23.setRows(5);
        txtitem23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem23KeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(txtitem23);

        btnadjnoitem23.setText("Adjuntar Doc");
        btnadjnoitem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem23ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel28.setText("1. Solicitar el documento consolidado que evidencie el cumplimiento de lo requerido en el criterio.");

        rbsi231.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi231.setText("Cumple");
        rbsi231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi231ActionPerformed(evt);
            }
        });

        rbno231.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno231.setText("No cumple");
        rbno231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno231ActionPerformed(evt);
            }
        });

        btnmv231.setText("Adjuntar Doc");
        btnmv231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv231ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jButton13.setText("Criterio");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblnocum23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcum23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem23)
                .addGap(96, 96, 96)
                .addComponent(rbjustiitem23)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(rbsi231)
                        .addGap(28, 28, 28)
                        .addComponent(rbno231)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmv231))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(rbnojustiitem23)
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnadjnoitem23, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(771, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum23)
                                    .addComponent(lblcum23)
                                    .addComponent(btnadjnoitem23)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton13)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbjustiitem23)
                                .addComponent(rbnojustiitem23)
                                .addComponent(noaplicaitem23))))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(rbno231)
                            .addComponent(rbsi231))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmv231)
                        .addGap(21, 21, 21)))
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel41.setText("Modo de Verificación ");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel42.setText("Actividades de Promoción y Prevención en Salud (1%)");

        lblnocum24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem24.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem24.setText("No Aplica");
        noaplicaitem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem24ActionPerformed(evt);
            }
        });

        rbjustiitem24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem24.setText("Justifica");
        rbjustiitem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem24ActionPerformed(evt);
            }
        });

        rbnojustiitem24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem24.setText("No justifica");
        rbnojustiitem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem24ActionPerformed(evt);
            }
        });

        txtitem24.setColumns(20);
        txtitem24.setRows(5);
        txtitem24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem24KeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(txtitem24);

        btnadjnoitem24.setText("Adjuntar Doc");
        btnadjnoitem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem24ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel43.setText("1. Solicitar las evidencias que constaten la definición y ejecución de las actividades de medicina del trabajo, promoción y prevención");

        rbsi241.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi241.setText("Cumple");
        rbsi241.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi241ActionPerformed(evt);
            }
        });

        rbno241.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno241.setText("No cumple");
        rbno241.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno241ActionPerformed(evt);
            }
        });

        btnmv241.setText("Adjuntar Doc");
        btnmv241.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv241ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel45.setText("de conformidad con las prioridades que se identificaron con base a los resultados del diagnóstico de las condiciones de salud y");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel46.setText("2. Solicitar el programa de vigilancia  epidemiológica de los trabajadores.");

        rbsi242.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi242.setText("Cumple");
        rbsi242.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi242ActionPerformed(evt);
            }
        });

        rbno242.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno242.setText("No cumple");
        rbno242.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno242ActionPerformed(evt);
            }
        });

        btnmv242.setText("Adjuntar Doc");
        btnmv242.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv242ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel49.setText("y peligros/riesgos de intervención prioritarios.");

        jButton14.setText("Criterio");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jButton14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noaplicaitem24)
                        .addGap(69, 69, 69)
                        .addComponent(rbjustiitem24)
                        .addGap(41, 41, 41)
                        .addComponent(rbnojustiitem24)
                        .addGap(31, 31, 31)))
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnadjnoitem24, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(842, 842, 842)
                        .addComponent(jLabel44))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel43)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbsi241)
                            .addComponent(rbsi242))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbno241)
                            .addComponent(rbno242))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmv242)
                            .addComponent(btnmv241))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum24)
                                    .addComponent(lblcum24))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton14)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel41))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem24)
                        .addComponent(rbnojustiitem24)
                        .addComponent(noaplicaitem24))
                    .addComponent(btnadjnoitem24)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(rbsi241)
                    .addComponent(rbno241)
                    .addComponent(btnmv241))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(4, 4, 4)
                .addComponent(jLabel49)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi242)
                            .addComponent(rbno242)
                            .addComponent(btnmv242))
                        .addGap(24, 24, 24)))
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Modo de Verificación ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Informar al médico de los perfiles de cargo (1%)");

        lblnocum25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem25.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem25.setText("No Aplica");
        noaplicaitem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem25ActionPerformed(evt);
            }
        });

        rbjustiitem25.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem25.setText("Justifica");
        rbjustiitem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem25ActionPerformed(evt);
            }
        });

        rbnojustiitem25.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem25.setText("No justifica");
        rbnojustiitem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem25ActionPerformed(evt);
            }
        });

        txtitem25.setColumns(20);
        txtitem25.setRows(5);
        txtitem25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem25KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(txtitem25);

        btnadjnoitem25.setText("Adjuntar Doc");
        btnadjnoitem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem25ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("1. Verificar que al médico que realiza las evaluaciones ocupacionales, se le remitieron los soportes documentales respecto de los ");

        rbsi251.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi251.setText("Cumple");
        rbsi251.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi251ActionPerformed(evt);
            }
        });

        rbno251.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno251.setText("No cumple");
        rbno251.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno251ActionPerformed(evt);
            }
        });

        btnmv251.setText("Adjuntar Doc");
        btnmv251.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv251ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel25.setText("perfiles del cargo, descripción de las tareas y el medio en el cual desarrollaran la labor  de los trabajadores.");

        jButton15.setText("Criterio");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblnocum25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcum25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jButton15)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(rbsi251)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno251)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmv251))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(noaplicaitem25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbjustiitem25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbnojustiitem25)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnadjnoitem25, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(231, 231, 231))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnocum25)
                    .addComponent(lblcum25)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15)))
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem25)
                        .addComponent(rbnojustiitem25)
                        .addComponent(noaplicaitem25))
                    .addComponent(btnadjnoitem25)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsi251)
                    .addComponent(rbno251)
                    .addComponent(btnmv251))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 4:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel47.setText("Modo de Verificación ");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel48.setText("Realización de los exámenes médicos ocupacionales. Peligros. Periodicidad (1%)");

        lblnocum26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem26.setText("No Aplica");
        noaplicaitem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem26ActionPerformed(evt);
            }
        });

        rbjustiitem26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem26.setText("Justifica");
        rbjustiitem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem26ActionPerformed(evt);
            }
        });

        rbnojustiitem26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem26.setText("No justifica");
        rbnojustiitem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem26ActionPerformed(evt);
            }
        });

        txtitem26.setColumns(20);
        txtitem26.setRows(5);
        txtitem26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem26KeyPressed(evt);
            }
        });
        jScrollPane9.setViewportView(txtitem26);

        btnadjnoitem26.setText("Adjuntar Doc");
        btnadjnoitem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem26ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel50.setText("1. Solicitar los conceptos de aptitud que demuestran la realización de las evaluaciones médicas.");

        rbsi261.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi261.setText("Cumple");
        rbsi261.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi261ActionPerformed(evt);
            }
        });

        rbno261.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno261.setText("No cumple");
        rbno261.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno261ActionPerformed(evt);
            }
        });

        btnmv261.setText("Adjuntar Doc");
        btnmv261.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv261ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel53.setText("2. Solicitar el documento o registro que evidencie la definición de la frecuencia de las evaluaciones médicas periódicas.");

        rbsi262.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi262.setText("Cumple");
        rbsi262.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi262ActionPerformed(evt);
            }
        });

        rbno262.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno262.setText("No cumple");
        rbno262.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno262ActionPerformed(evt);
            }
        });

        btnmv262.setText("Adjuntar Doc");
        btnmv262.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv262ActionPerformed(evt);
            }
        });

        rbsi263.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi263.setText("Cumple");
        rbsi263.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi263ActionPerformed(evt);
            }
        });

        rbno263.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno263.setText("No cumple");
        rbno263.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno263ActionPerformed(evt);
            }
        });

        btnmv263.setText("Adjuntar Doc");
        btnmv263.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv263ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel54.setText("3. Solicitar el documento que evidencie la comunicación por escrito al trabajador de los resultados de las evaluaciones médicas ");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel55.setText("ocupacionales.");

        jButton16.setText("Criterio");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi261)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno261)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv261)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(842, 842, 842)
                        .addComponent(jLabel51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblnocum26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblcum26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel48)
                                            .addComponent(jButton16)))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(noaplicaitem26)))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbjustiitem26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbnojustiitem26)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnadjnoitem26, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(rbsi263)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbno263)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnmv263))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(rbsi262)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbno262)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnmv262)))))
                        .addGap(16, 16, 16)))
                .addGap(18, 18, 18))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                        .addGap(482, 482, 482))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum26)
                                    .addComponent(lblcum26))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton16)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel47))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem26)
                        .addComponent(rbnojustiitem26)
                        .addComponent(noaplicaitem26))
                    .addComponent(btnadjnoitem26)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi261)
                            .addComponent(rbno261)
                            .addComponent(btnmv261)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi262)
                        .addComponent(rbno262)
                        .addComponent(btnmv262)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi263)
                        .addComponent(rbno263)
                        .addComponent(btnmv263)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 5:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Modo de Verificación ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setText("Custodia de Historias Clínicas (1%)");

        lblnocum27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem27.setText("No Aplica");
        noaplicaitem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem27ActionPerformed(evt);
            }
        });

        rbjustiitem27.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem27.setText("Justifica");
        rbjustiitem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem27ActionPerformed(evt);
            }
        });

        rbnojustiitem27.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem27.setText("No justifica");
        rbnojustiitem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem27ActionPerformed(evt);
            }
        });

        txtitem27.setColumns(20);
        txtitem27.setRows(5);
        txtitem27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem27KeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(txtitem27);

        btnadjnoitem27.setText("Adjuntar Doc");
        btnadjnoitem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem27ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel12.setText("1. Evidenciar los soportes que demuestren que la custodia de las historias clínicas este a cargo de una institución prestadora de servicios ");

        rbsi271.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi271.setText("Cumple");
        rbsi271.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi271ActionPerformed(evt);
            }
        });

        rbno271.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno271.setText("No cumple");
        rbno271.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno271ActionPerformed(evt);
            }
        });

        btnmv271.setText("Adjuntar Doc");
        btnmv271.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv271ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel26.setText("en Seguridad y Salud en el Trabajo o del médico que practica los exámenes laborales en la empresa.");

        jButton17.setText("Criterio");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblnocum27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcum27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jButton17)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noaplicaitem27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbjustiitem27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rbsi271)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno271)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv271))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rbnojustiitem27)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadjnoitem27, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum27)
                            .addComponent(lblcum27)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem27)
                        .addComponent(rbnojustiitem27)
                        .addComponent(noaplicaitem27))
                    .addComponent(btnadjnoitem27)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi271)
                        .addComponent(rbno271)
                        .addComponent(btnmv271))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 6:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel52.setText("Modo de Verificación ");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel56.setText("Restricciones y recomendaciones medico/laborales (1%)");

        lblnocum28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem28.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem28.setText("No Aplica");
        noaplicaitem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem28ActionPerformed(evt);
            }
        });

        rbjustiitem28.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem28.setText("Justifica");
        rbjustiitem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem28ActionPerformed(evt);
            }
        });

        rbnojustiitem28.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem28.setText("No justifica");
        rbnojustiitem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem28ActionPerformed(evt);
            }
        });

        txtitem28.setColumns(20);
        txtitem28.setRows(5);
        txtitem28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem28KeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(txtitem28);

        btnadjnoitem28.setText("Adjuntar Doc");
        btnadjnoitem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem28ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel57.setText("1. Solicitar documento de recomendaciones y restricciones a trabajadores y revisar  que la empresa ja acatado todas las recomendaciones ");

        rbsi281.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi281.setText("Cumple");
        rbsi281.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi281ActionPerformed(evt);
            }
        });

        rbno281.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno281.setText("No cumple");
        rbno281.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno281ActionPerformed(evt);
            }
        });

        btnmv281.setText("Adjuntar Doc");
        btnmv281.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv281ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel59.setText("y restricciones medico laborales prescritas a todos los trabajadores y ha realizado todas las acciones que se requieran en materia de");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel60.setText("2. Solicitar documento de soporte de recibido por parte de quienes califican en primera oportunidad y/o a las Juntas de Calificación de invalidez.");

        rbsi282.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi282.setText("Cumple");
        rbsi282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi282ActionPerformed(evt);
            }
        });

        rbno282.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno282.setText("No cumple");
        rbno282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno282ActionPerformed(evt);
            }
        });

        btnmv282.setText("Adjuntar Doc");
        btnmv282.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv282ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel61.setText("de reubicación o readaptación. ");

        jButton18.setText("Criterio");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(842, 842, 842)
                .addComponent(jLabel58)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jButton18)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem28)
                .addGap(544, 544, 544))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(rbsi282)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno282)
                        .addGap(84, 84, 84)
                        .addComponent(btnmv282))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(rbsi281)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno281))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadjnoitem28, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmv281))))
                .addGap(109, 109, 109))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblnocum28)
                                            .addComponent(lblcum28))
                                        .addGap(34, 34, 34))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jLabel56)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton18)
                                        .addGap(18, 18, 18)))
                                .addComponent(jLabel52))
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbjustiitem28)
                                .addComponent(rbnojustiitem28)
                                .addComponent(noaplicaitem28)))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel59)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel61)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel60))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(btnadjnoitem28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbsi281)
                                    .addComponent(rbno281)
                                    .addComponent(btnmv281)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi282)
                            .addComponent(rbno282)
                            .addComponent(btnmv282))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel58))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 7:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setText("Modo de Verificación ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setText("Estilo de vida y entornos saludables (controles tabaquismo, alcoholismo fármaco");

        lblnocum29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem29.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem29.setText("No Aplica");
        noaplicaitem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem29ActionPerformed(evt);
            }
        });

        rbjustiitem29.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem29.setText("Justifica");
        rbjustiitem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem29ActionPerformed(evt);
            }
        });

        rbnojustiitem29.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem29.setText("No justifica");
        rbnojustiitem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem29ActionPerformed(evt);
            }
        });

        txtitem29.setColumns(20);
        txtitem29.setRows(5);
        txtitem29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem29KeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(txtitem29);

        btnadjnoitem29.setText("Adjuntar Doc");
        btnadjnoitem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem29ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("1. Solicitar el programa respectivo y los documentos y registros que evidencien el cumplimiento del mismo. ");

        rbsi291.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi291.setText("Cumple");
        rbsi291.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi291ActionPerformed(evt);
            }
        });

        rbno291.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno291.setText("No cumple");
        rbno291.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno291ActionPerformed(evt);
            }
        });

        btnmv291.setText("Adjuntar Doc");
        btnmv291.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv291ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel18.setText("dependencia y otros) (1%)");

        jButton19.setText("Criterio");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(206, 206, 206)
                        .addComponent(rbsi291)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno291)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv291)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jButton19))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem29)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem29, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum29)
                            .addComponent(lblcum29)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(jButton19))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem29)
                        .addComponent(rbnojustiitem29)
                        .addComponent(noaplicaitem29))
                    .addComponent(btnadjnoitem29)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi291)
                        .addComponent(rbno291)
                        .addComponent(btnmv291))
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 8:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel19.setText("Modo de Verificación ");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel20.setText("Agua potable, servicios sanitarios y disposición de basuras (1%)");

        lblnocum30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem30.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem30.setText("No Aplica");
        noaplicaitem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem30ActionPerformed(evt);
            }
        });

        rbjustiitem30.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem30.setText("Justifica");
        rbjustiitem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem30ActionPerformed(evt);
            }
        });

        rbnojustiitem30.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem30.setText("No justifica");
        rbnojustiitem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem30ActionPerformed(evt);
            }
        });

        txtitem30.setColumns(20);
        txtitem30.setRows(5);
        txtitem30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem30KeyPressed(evt);
            }
        });
        jScrollPane12.setViewportView(txtitem30);

        btnadjnoitem30.setText("Adjuntar Doc");
        btnadjnoitem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem30ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel21.setText("1. Mediante observación directa, verificar si se cumple lo que se exige en el criterio. Dejando prueba fotográfica o fílmica al respecto.");

        rbsi301.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi301.setText("Cumple");
        rbsi301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi301ActionPerformed(evt);
            }
        });

        rbno301.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno301.setText("No cumple");
        rbno301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno301ActionPerformed(evt);
            }
        });

        btnmv301.setText("Adjuntar Doc");
        btnmv301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv301ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jButton20.setText("Criterio");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(38, 38, 38)
                                .addComponent(rbsi301)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno301)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmv301)))
                        .addContainerGap(237, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblnocum30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcum30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jButton20)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noaplicaitem30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbjustiitem30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnojustiitem30)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadjnoitem30, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum30)
                            .addComponent(lblcum30)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem30)
                        .addComponent(rbnojustiitem30)
                        .addComponent(noaplicaitem30))
                    .addComponent(btnadjnoitem30)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(rbsi301)
                    .addComponent(rbno301)
                    .addComponent(btnmv301))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel22))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 9:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel23.setText("Modo de Verificación ");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel24.setText("Eliminación adecuada de residuos sólidos, líquidos y gaseosos (1%)");

        lblnocum31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem31.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem31.setText("No Aplica");
        noaplicaitem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem31ActionPerformed(evt);
            }
        });

        rbjustiitem31.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem31.setText("Justifica");
        rbjustiitem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem31ActionPerformed(evt);
            }
        });

        rbnojustiitem31.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem31.setText("No justifica");
        rbnojustiitem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem31ActionPerformed(evt);
            }
        });

        txtitem31.setColumns(20);
        txtitem31.setRows(5);
        txtitem31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem31KeyPressed(evt);
            }
        });
        jScrollPane13.setViewportView(txtitem31);

        btnadjnoitem31.setText("Adjuntar Doc");
        btnadjnoitem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem31ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel30.setText("1. Mediante observación directa, constatar las evidencias donde se dé cuenta de los procesos de eliminación de residuos conforme ");

        rbsi311.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi311.setText("Cumple");
        rbsi311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi311ActionPerformed(evt);
            }
        });

        rbno311.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno311.setText("No cumple");
        rbno311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno311ActionPerformed(evt);
            }
        });

        btnmv311.setText("Adjuntar Doc");
        btnmv311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv311ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel32.setText("al criterio y solicitar contrato de empresas que elimina y dispone de los residuos peligrosos.");

        jButton21.setText("Criterio");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(38, 38, 38)
                                .addComponent(rbsi311)
                                .addGap(18, 18, 18)
                                .addComponent(rbno311)
                                .addGap(55, 55, 55)
                                .addComponent(btnmv311)))
                        .addContainerGap(190, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblnocum31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcum31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jButton21)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noaplicaitem31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbjustiitem31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnojustiitem31)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnadjnoitem31, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum31)
                                    .addComponent(lblcum31))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton21)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel23))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem31)
                        .addComponent(rbnojustiitem31)
                        .addComponent(noaplicaitem31))
                    .addComponent(btnadjnoitem31)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(rbsi311)
                    .addComponent(rbno311)
                    .addComponent(btnmv311))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel31))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E3.2Registro, reporte e investigación de las enfermedades laborales, incidentes y accidentes del trabajo (5%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel17.setToolTipText("");

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel62.setText("Modo de Verificación ");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel63.setText("Reporte de los Accidentes de Trabajo y Enfermedad Laboral a la ARL, EPS y");

        lblnocum32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem32.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem32.setText("No Aplica");
        noaplicaitem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem32ActionPerformed(evt);
            }
        });

        rbjustiitem32.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem32.setText("Justifica");
        rbjustiitem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem32ActionPerformed(evt);
            }
        });

        rbnojustiitem32.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem32.setText("No justifica");
        rbnojustiitem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem32ActionPerformed(evt);
            }
        });

        txtitem32.setColumns(20);
        txtitem32.setRows(5);
        txtitem32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem32KeyPressed(evt);
            }
        });
        jScrollPane14.setViewportView(txtitem32);

        btnadjnoitem32.setText("Adjuntar Doc");
        btnadjnoitem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem32ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel64.setText("1. Indagar con los trabajadores, si se han presentado accidentes de trabajo o enfermedades laborales o (en caso afirmativo, tomar los");

        rbsi321.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi321.setText("Cumple");
        rbsi321.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi321ActionPerformed(evt);
            }
        });

        rbno321.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno321.setText("No cumple");
        rbno321.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno321ActionPerformed(evt);
            }
        });

        btnmv321.setText("Adjuntar Doc");
        btnmv321.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv321ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel66.setText("datos de nombre y número de cedula u solicitar el reporte). Igualmente realizar un muestreo del reporte de registro de Accidentes ");

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel67.setText("de Trabajo (FURAT) y el registro de enfermedades laborales (FUREL) respectivo, verificando si el reporte a las Administraciones");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel68.setText("y Dirección Territorial del Ministerio del Trabajo (2%)");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel69.setText("de Riesgos Laborales, Empresas promotoras de Salud y Dirección Territorial se hizo dentro de los dos (2) días hábiles siguientes al ");

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel71.setText("evento o recibo del diagnóstico de la enfermedad.");

        jButton22.setText("Criterio");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbsi321)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbno321)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmv321)
                .addGap(109, 109, 109))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem32)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem32, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(842, 842, 842)
                        .addComponent(jLabel65))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum32)
                            .addComponent(lblcum32)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel68)
                                    .addComponent(jButton22))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel62))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem32)
                        .addComponent(rbnojustiitem32)
                        .addComponent(noaplicaitem32))
                    .addComponent(btnadjnoitem32)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi321)
                        .addComponent(rbno321)
                        .addComponent(btnmv321))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel69)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel72.setText("Modo de Verificación ");

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel73.setText("Investigación de accidentes, incidentes y Enfermedad Laboral (2%)");

        lblnocum33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem33.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem33.setText("No Aplica");
        noaplicaitem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem33ActionPerformed(evt);
            }
        });

        rbjustiitem33.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem33.setText("Justifica");
        rbjustiitem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem33ActionPerformed(evt);
            }
        });

        rbnojustiitem33.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem33.setText("No justifica");
        rbnojustiitem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem33ActionPerformed(evt);
            }
        });

        txtitem33.setColumns(20);
        txtitem33.setRows(5);
        txtitem33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem33KeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(txtitem33);

        btnadjnoitem33.setText("Adjuntar Doc");
        btnadjnoitem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem33ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel74.setText("1. Verificar por medio de un muestreo si se investigan los accidentes e incidentes  de trabajo y las enfermedades laborales y si se definieron");

        rbsi331.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi331.setText("Cumple");
        rbsi331.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi331ActionPerformed(evt);
            }
        });

        rbno331.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno331.setText("No cumple");
        rbno331.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno331ActionPerformed(evt);
            }
        });

        btnmv331.setText("Adjuntar Doc");
        btnmv331.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv331ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel76.setText("acciones para otros trabajadores potencialmente expuestos.");

        rbsi333.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi333.setText("Cumple");
        rbsi333.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi333ActionPerformed(evt);
            }
        });

        rbno333.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno333.setText("No cumple");
        rbno333.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno333ActionPerformed(evt);
            }
        });

        btnmv333.setText("Adjuntar Doc");
        btnmv333.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv333ActionPerformed(evt);
            }
        });

        rbsi332.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi332.setText("Cumple");
        rbsi332.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi332ActionPerformed(evt);
            }
        });

        rbno332.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno332.setText("No cumple");
        rbno332.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno332ActionPerformed(evt);
            }
        });

        btnmv332.setText("Adjuntar Doc");
        btnmv332.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv332ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel77.setText("2. Constatar que la investigación se haya realizado dentro de los quince (15) días siguientes a su ocurrencia a través del equipo investigador");

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel78.setText("y evitar que se hayan remitido los informes de las investigaciones de accidente de trabajo grave o moral o una enfermedad laboral mortal.");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel79.setText("3. En caso de haber accidente grave o se produzca la muerte verificar la participación de un profesional con licencia Salud Ocupacional ");

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel80.setText("o en Seguridad y Salud en el Trabajo en la investigación (propio o contratado), así como del Comité Paritario o Vigía de Seguridad y ");

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel81.setText("salud en el trabajo.");

        jButton23.setText("Criterio");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addComponent(jButton23)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem33)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem33, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel75)
                        .addGap(372, 372, 372))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                        .addGap(482, 482, 482))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addComponent(rbsi332)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno332)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmv332))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(rbsi331)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno331)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmv331))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(rbsi333)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno333)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmv333)))
                        .addGap(143, 143, 143))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum33)
                            .addComponent(lblcum33)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel72))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem33)
                        .addComponent(rbnojustiitem33)
                        .addComponent(noaplicaitem33))
                    .addComponent(btnadjnoitem33)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel77)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel78)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel81)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi331)
                            .addComponent(rbno331)
                            .addComponent(btnmv331))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi332)
                            .addComponent(rbno332)
                            .addComponent(btnmv332))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi333)
                            .addComponent(rbno333)
                            .addComponent(btnmv333))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel75)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel70.setText("Modo de Verificación ");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel82.setText("Registro y análisis estadístico de Incidentes, Accidentes de Trabajo ");

        lblnocum34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem34.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem34.setText("No Aplica");
        noaplicaitem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem34ActionPerformed(evt);
            }
        });

        rbjustiitem34.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem34.setText("Justifica");
        rbjustiitem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem34ActionPerformed(evt);
            }
        });

        rbnojustiitem34.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem34.setText("No justifica");
        rbnojustiitem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem34ActionPerformed(evt);
            }
        });

        txtitem34.setColumns(20);
        txtitem34.setRows(5);
        txtitem34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem34KeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(txtitem34);

        btnadjnoitem34.setText("Adjuntar Doc");
        btnadjnoitem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem34ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel83.setText("1. Solicitar el registro estadístico actualizando de lo corrido del año y el año inmediatamente anterior al de la visita, asi como la evidencia ");

        rbsi341.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi341.setText("Cumple");
        rbsi341.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi341ActionPerformed(evt);
            }
        });

        rbno341.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno341.setText("No cumple");
        rbno341.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno341ActionPerformed(evt);
            }
        });

        btnmv341.setText("Adjuntar Doc");
        btnmv341.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv341ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel85.setText("que contiene el análisis y las conclusiones derivadas del estudio que son usadas para el mejoramiento del SG-SST.  ");

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel87.setText("y Enfermedad Laboral (1%)");

        jButton24.setText("Criterio");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbsi341)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbno341)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmv341)
                .addGap(109, 109, 109))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel87)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24))))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem34)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem34, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(842, 842, 842)
                        .addComponent(jLabel84))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum34)
                            .addComponent(lblcum34)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel87)
                                    .addComponent(jButton24))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel70))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem34)
                        .addComponent(rbnojustiitem34)
                        .addComponent(noaplicaitem34))
                    .addComponent(btnadjnoitem34)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi341)
                            .addComponent(rbno341)
                            .addComponent(btnmv341)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel84)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E3.3: Mecanismos de vigilancia de las condiciones de salud en los trabajadores (6%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel23.setToolTipText("");

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel114.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel114.setText("Modo de Verificación ");

        jLabel115.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel115.setText("Medición de la severidad de los Accidentes de Trabajo y Enfermedad Laboral (1%)");

        lblnocum35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem35.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem35.setText("No Aplica");
        noaplicaitem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem35ActionPerformed(evt);
            }
        });

        rbjustiitem35.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem35.setText("Justifica");
        rbjustiitem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem35ActionPerformed(evt);
            }
        });

        rbnojustiitem35.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem35.setText("No justifica");
        rbnojustiitem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem35ActionPerformed(evt);
            }
        });

        txtitem35.setColumns(20);
        txtitem35.setRows(5);
        txtitem35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem35KeyPressed(evt);
            }
        });
        jScrollPane20.setViewportView(txtitem35);

        btnadjnoitem35.setText("Adjuntar Doc");
        btnadjnoitem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem35ActionPerformed(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel116.setText("1. Solicitar los resultados de la medición para lo ocurrido y/o el año inmediatamente anterior y constatar el comportamiento de la");

        rbsi351.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi351.setText("Cumple");
        rbsi351.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi351ActionPerformed(evt);
            }
        });

        rbno351.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno351.setText("No cumple");
        rbno351.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno351ActionPerformed(evt);
            }
        });

        btnmv351.setText("Adjuntar Doc");
        btnmv351.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv351ActionPerformed(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel118.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel118.setText("severidad y la relación del evento con los peligros/riesgos.");

        jButton25.setText("Criterio");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115)
                            .addComponent(jButton25)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem35)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem35, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi351)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno351)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv351)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(822, 822, 822)
                                .addComponent(jLabel117))
                            .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum35)
                                    .addComponent(lblcum35))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton25)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel114))
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem35)
                        .addComponent(rbnojustiitem35)
                        .addComponent(noaplicaitem35))
                    .addComponent(btnadjnoitem35)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi351)
                            .addComponent(rbno351)
                            .addComponent(btnmv351)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel118)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel117)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel120.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel120.setText("Modo de Verificación ");

        jLabel121.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel121.setText("Medición de la frecuencia de los Accidentes de Trabajo y Enfermedad Laboral (1%). ");

        lblnocum36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem36.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem36.setText("No Aplica");
        noaplicaitem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem36ActionPerformed(evt);
            }
        });

        rbjustiitem36.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem36.setText("Justifica");
        rbjustiitem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem36ActionPerformed(evt);
            }
        });

        rbnojustiitem36.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem36.setText("No justifica");
        rbnojustiitem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem36ActionPerformed(evt);
            }
        });

        txtitem36.setColumns(20);
        txtitem36.setRows(5);
        txtitem36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem36KeyPressed(evt);
            }
        });
        jScrollPane21.setViewportView(txtitem36);

        btnadjnoitem36.setText("Adjuntar Doc");
        btnadjnoitem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem36ActionPerformed(evt);
            }
        });

        jLabel122.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel122.setText("1. Solicitar los resultados de la medición para lo corrido del año in mediatamente anterior y constatar el comportamiento de la frecuencia");

        rbsi361.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi361.setText("Cumple");
        rbsi361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi361ActionPerformed(evt);
            }
        });

        rbno361.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno361.setText("No cumple");
        rbno361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno361ActionPerformed(evt);
            }
        });

        btnmv361.setText("Adjuntar Doc");
        btnmv361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv361ActionPerformed(evt);
            }
        });

        jLabel123.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel124.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel124.setText("de los accidentes y la relación del evento con los peligros/riesgos.");

        jButton26.setText("Criterio");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel121)
                            .addComponent(jButton26)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(noaplicaitem36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem36)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem36, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi361)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno361)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv361)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(819, 819, 819)
                                .addComponent(jLabel123))
                            .addComponent(jLabel122))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum36)
                            .addComponent(lblcum36)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel121)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton26)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel120))
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem36)
                        .addComponent(rbnojustiitem36)
                        .addComponent(noaplicaitem36))
                    .addComponent(btnadjnoitem36)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi361)
                            .addComponent(rbno361)
                            .addComponent(btnmv361)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel124)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel123)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel126.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel126.setText("Modo de Verificación ");

        jLabel127.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel127.setText("Medición de la Mortalidad de Accidentes de Trabajo y  Enfermedad Laboral (1%)");

        lblnocum37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem37.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem37.setText("No Aplica");
        noaplicaitem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem37ActionPerformed(evt);
            }
        });

        rbjustiitem37.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem37.setText("Justifica");
        rbjustiitem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem37ActionPerformed(evt);
            }
        });

        rbnojustiitem37.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem37.setText("No justifica");
        rbnojustiitem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem37ActionPerformed(evt);
            }
        });

        txtitem37.setColumns(20);
        txtitem37.setRows(5);
        txtitem37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem37KeyPressed(evt);
            }
        });
        jScrollPane22.setViewportView(txtitem37);

        btnadjnoitem37.setText("Adjuntar Doc");
        btnadjnoitem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem37ActionPerformed(evt);
            }
        });

        jLabel128.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel128.setText("1. Solicitar los resultados de la medición para lo corrido del año y/o el año inmediatamente anterior y constatar el comportamiento de la");

        rbsi371.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi371.setText("Cumple");
        rbsi371.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi371ActionPerformed(evt);
            }
        });

        rbno371.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno371.setText("No cumple");
        rbno371.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno371ActionPerformed(evt);
            }
        });

        btnmv371.setText("Adjuntar Doc");
        btnmv371.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv371ActionPerformed(evt);
            }
        });

        jLabel129.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel130.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel130.setText("mortalidad y la relación del evento con los peligros/riesgos.");

        jButton27.setText("Criterio");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel127)
                            .addComponent(jButton27)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(noaplicaitem37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem37)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem37, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi371)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno371)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv371)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel130)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGap(822, 822, 822)
                                .addComponent(jLabel129)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum37)
                            .addComponent(lblcum37)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel127)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton27)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel126))
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem37)
                        .addComponent(rbnojustiitem37)
                        .addComponent(noaplicaitem37))
                    .addComponent(btnadjnoitem37)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi371)
                            .addComponent(rbno371)
                            .addComponent(btnmv371)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel130)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel129)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 4:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel132.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel132.setText("Modo de Verificación ");

        jLabel133.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel133.setText("Medición de la Prevalencia de Incidentes, Accidentes de Trabajo y Enfermedad ");

        lblnocum38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem38.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem38.setText("No Aplica");
        noaplicaitem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem38ActionPerformed(evt);
            }
        });

        rbjustiitem38.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem38.setText("Justifica");
        rbjustiitem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem38ActionPerformed(evt);
            }
        });

        rbnojustiitem38.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem38.setText("No justifica");
        rbnojustiitem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem38ActionPerformed(evt);
            }
        });

        txtitem38.setColumns(20);
        txtitem38.setRows(5);
        txtitem38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem38KeyPressed(evt);
            }
        });
        jScrollPane23.setViewportView(txtitem38);

        btnadjnoitem38.setText("Adjuntar Doc");
        btnadjnoitem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem38ActionPerformed(evt);
            }
        });

        jLabel134.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel134.setText("1. Solicitar los resultados de la medición para lo corrido del año y/o el año inmediatamente anterior y constatar el comportamiento de la  ");

        rbsi381.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi381.setText("Cumple");
        rbsi381.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi381ActionPerformed(evt);
            }
        });

        rbno381.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno381.setText("No cumple");
        rbno381.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno381ActionPerformed(evt);
            }
        });

        btnmv381.setText("Adjuntar Doc");
        btnmv381.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv381ActionPerformed(evt);
            }
        });

        jLabel135.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel136.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel136.setText("prevalencia de las enfermedades laborales y la relación del evento con los peligros/riesgos.");

        jLabel137.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel137.setText("Laboral (1%)");

        jButton28.setText("Criterio");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel133)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel137)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton28))))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem38)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem38, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi381)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno381)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv381)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(821, 821, 821)
                                .addComponent(jLabel135))
                            .addComponent(jLabel134))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum38)
                            .addComponent(lblcum38)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel133)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel137)
                                    .addComponent(jButton28))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel132))
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem38)
                        .addComponent(rbnojustiitem38)
                        .addComponent(noaplicaitem38))
                    .addComponent(btnadjnoitem38)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi381)
                            .addComponent(rbno381)
                            .addComponent(btnmv381)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel134)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel136)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel135)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 5:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel138.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel138.setText("Modo de Verificación ");

        jLabel139.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel139.setText("Medición de la incidencia de incidentes, Accidentes de Trabajo y Enfermedad ");

        lblnocum39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem39.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem39.setText("No Aplica");
        noaplicaitem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem39ActionPerformed(evt);
            }
        });

        rbjustiitem39.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem39.setText("Justifica");
        rbjustiitem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem39ActionPerformed(evt);
            }
        });

        rbnojustiitem39.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem39.setText("No justifica");
        rbnojustiitem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem39ActionPerformed(evt);
            }
        });

        txtitem39.setColumns(20);
        txtitem39.setRows(5);
        txtitem39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem39KeyPressed(evt);
            }
        });
        jScrollPane24.setViewportView(txtitem39);

        btnadjnoitem39.setText("Adjuntar Doc");
        btnadjnoitem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem39ActionPerformed(evt);
            }
        });

        jLabel140.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel140.setText("1. Solicitar los resultados de la medición para lo ocurrido del año y/o el año inmediatamente anterior y constatar el comportamiento de la incidencia ");

        rbsi391.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi391.setText("Cumple");
        rbsi391.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi391ActionPerformed(evt);
            }
        });

        rbno391.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno391.setText("No cumple");
        rbno391.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno391ActionPerformed(evt);
            }
        });

        btnmv391.setText("Adjuntar Doc");
        btnmv391.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv391ActionPerformed(evt);
            }
        });

        jLabel141.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel142.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel142.setText("de las enfermedades laborales y la relación del evento con los peligros/riesgos.");

        jLabel143.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel143.setText("Laboral (1%)");

        jButton29.setText("Criterio");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblnocum39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcum39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel139)
                                    .addGroup(jPanel30Layout.createSequentialGroup()
                                        .addComponent(jLabel143)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton29))))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101)
                        .addComponent(noaplicaitem39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbjustiitem39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnojustiitem39)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadjnoitem39, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(jLabel142)
                                .addGap(365, 365, 365)
                                .addComponent(jLabel141))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(jLabel140)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbsi391)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno391)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmv391)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum39)
                            .addComponent(lblcum39)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(jLabel139)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel143)
                                    .addComponent(jButton29))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel138))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem39)
                        .addComponent(rbnojustiitem39)
                        .addComponent(noaplicaitem39))
                    .addComponent(btnadjnoitem39)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel141)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbsi391)
                                .addComponent(rbno391)
                                .addComponent(btnmv391))
                            .addComponent(jLabel140))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jLabel142)
                        .addGap(18, 24, Short.MAX_VALUE))))
        );

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 6:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel144.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel144.setText("Modo de Verificación ");

        jLabel145.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel145.setText("Medición del ausentismo por incidentes, Accidentes de Trabajo y Enfermedad ");

        lblnocum40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem40.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem40.setText("No Aplica");
        noaplicaitem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem40ActionPerformed(evt);
            }
        });

        rbjustiitem40.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem40.setText("Justifica");
        rbjustiitem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem40ActionPerformed(evt);
            }
        });

        rbnojustiitem40.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem40.setText("No justifica");
        rbnojustiitem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem40ActionPerformed(evt);
            }
        });

        txtitem40.setColumns(20);
        txtitem40.setRows(5);
        txtitem40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem40KeyPressed(evt);
            }
        });
        jScrollPane25.setViewportView(txtitem40);

        btnadjnoitem40.setText("Adjuntar Doc");
        btnadjnoitem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem40ActionPerformed(evt);
            }
        });

        jLabel146.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel146.setText("1. Solicitar los resultados de la medición para lo ocurrido del año y/o el año anteriormente anterior y constatar el comportamiento  del ausentismo ");

        rbsi401.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi401.setText("Cumple");
        rbsi401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi401ActionPerformed(evt);
            }
        });

        rbno401.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno401.setText("No cumple");
        rbno401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno401ActionPerformed(evt);
            }
        });

        btnmv401.setText("Adjuntar Doc");
        btnmv401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv401ActionPerformed(evt);
            }
        });

        jLabel147.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel148.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel148.setText("y la relación del evento con los peligros/riesgos.");

        jLabel149.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel149.setText("Laboral (1%)");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save(1).png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setText("<<< Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton30.setText("Criterio");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbsi401)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbno401)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmv401)
                .addGap(109, 109, 109))
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(544, 544, 544)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel147))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblnocum40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcum40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel145)
                                    .addGroup(jPanel31Layout.createSequentialGroup()
                                        .addComponent(jLabel149)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton30))))
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105)
                        .addComponent(noaplicaitem40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbjustiitem40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnojustiitem40)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadjnoitem40, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel148)
                            .addComponent(jLabel146))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum40)
                            .addComponent(lblcum40)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(jLabel145)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel149)
                                    .addComponent(jButton30))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel144))
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem40)
                        .addComponent(rbnojustiitem40)
                        .addComponent(noaplicaitem40))
                    .addComponent(btnadjnoitem40)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi401)
                            .addComponent(rbno401)
                            .addComponent(btnmv401)))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel146)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel148)))
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel147)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1371, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1371, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noaplicaitem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem23ActionPerformed
      if(noaplicaitem23.isSelected()){
        rbsi231.setEnabled(false);
        rbno231.setEnabled(false);
        btnmv231.setEnabled(false);
        txtitem23.setEnabled(false);
        btnadjnoitem23.setEnabled(false);
         rbjustiitem23.setEnabled(true);
          rbnojustiitem23.setEnabled(true);
          
          tr.setI231("");
        
        }else{
          rbsi231.setEnabled(true);
        rbno231.setEnabled(true);
        btnmv231.setEnabled(false);
        txtitem23.setEnabled(false);
        btnadjnoitem23.setEnabled(false);
         rbjustiitem23.setEnabled(false);
          rbnojustiitem23.setEnabled(false);
            
            
        }  
    }//GEN-LAST:event_noaplicaitem23ActionPerformed

    private void rbjustiitem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem23ActionPerformed
        
        txtitem23.setEnabled(true);
        tr.setI231("");
        
    }//GEN-LAST:event_rbjustiitem23ActionPerformed

    private void rbnojustiitem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem23ActionPerformed
       btnadjnoitem23.setEnabled(false);
        txtitem23.setEnabled(false);
        lblcum23.setEnabled(false);
        lblnocum23.setEnabled(true);
         tr.setI231("");
        tr.setI231("No");
        tr.setA231("");
        tr.setA231("Si");
        tr.setV231("");
        tr.setV231("No");
        tr.setJ231("");
    }//GEN-LAST:event_rbnojustiitem23ActionPerformed

    private void txtitem23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem23KeyPressed
     if(txtitem23.getText().length()>2){        
        lblcum23.setEnabled(true);
       btnadjnoitem23.setEnabled(true);
     // inserta datos que cumple  
       tr.setI231("");
       tr.setI231("Si");
       tr.setA231("");
       tr.setA231("No");
       tr.setV231("");
       tr.setV231("no aplica");
       tr.setJ231("");
       tr.setJ231(txtitem23.getText());
       
       
   }else{
        tr.setJ231("");
        tr.setI231("");
            
        
            lblcum23.setEnabled(false);
            lblnocum23.setEnabled(false);
            btnadjnoitem23.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem23KeyPressed

    private void btnadjnoitem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem23ActionPerformed
        // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(23);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem23ActionPerformed

    private void rbsi231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi231ActionPerformed
      tr.setV231("");
 tr.setV231("Si");
 btnmv231.setEnabled(true);
        
        if(rbsi231.isSelected()){
            lblcum23.setEnabled(true);
            lblnocum23.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi231ActionPerformed

    private void rbno231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno231ActionPerformed
            tr.setV231("");
 tr.setV231("No");
 btnmv231.setEnabled(false);
        
        if(rbno231.isSelected()){
            lblcum23.setEnabled(false);
            lblnocum23.setEnabled(true);
        }
    }//GEN-LAST:event_rbno231ActionPerformed

    private void btnmv231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv231ActionPerformed
       // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(36);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv231ActionPerformed

    private void noaplicaitem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem24ActionPerformed
   if (noaplicaitem24.isSelected()) {
            rbsi241.setEnabled(false);
            rbno241.setEnabled(false);
            rbsi242.setEnabled(false);
            rbno242.setEnabled(false);
            btnmv241.setEnabled(false);
            btnmv242.setEnabled(false);
            txtitem24.setEnabled(false);
            btnadjnoitem24.setEnabled(false);
           rbjustiitem24.setEnabled(true);
            rbnojustiitem24.setEnabled(true);
            tr.setI241("");

        } else {
            rbsi241.setEnabled(true);
            rbno241.setEnabled(true);
            rbsi242.setEnabled(true);
            rbno242.setEnabled(true);
            btnmv241.setEnabled(false);
            btnmv242.setEnabled(false);
            txtitem24.setEnabled(false);
            btnadjnoitem24.setEnabled(false);
            rbjustiitem24.setEnabled(false);
            rbnojustiitem24.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem24ActionPerformed

    private void rbjustiitem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem24ActionPerformed
   txtitem24.setEnabled(true);
   tr.setI241("");

    }//GEN-LAST:event_rbjustiitem24ActionPerformed

    private void rbnojustiitem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem24ActionPerformed
     btnadjnoitem24.setEnabled(false);
        txtitem24.setEnabled(false);
        lblcum24.setEnabled(false);
        lblnocum24.setEnabled(true);
        tr.setI241("");
        tr.setI241("No");
        tr.setA241("");
        tr.setA241("Si");
        tr.setV241("");
        tr.setV241("No");
        tr.setV242("");
        tr.setV242("No");
        tr.setJ241("");
    }//GEN-LAST:event_rbnojustiitem24ActionPerformed

    private void txtitem24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem24KeyPressed
    
   if (txtitem24.getText().length() > 2) {

            lblcum24.setEnabled(true);
            btnadjnoitem24.setEnabled(true);
            // inserta datos que cumple  

            tr.setI241("");
            tr.setI241("Si");
            tr.setA241("");
            tr.setA241("No");
            tr.setV241("");
            tr.setV241("no aplica");
            tr.setV242("");
            tr.setV242("no aplica");
            tr.setJ241("");
            tr.setJ241(txtitem24.getText());

        } else {
            tr.setJ241("");
            tr.setI241("");
            

            lblcum24.setEnabled(false);
            lblnocum24.setEnabled(false);
            btnadjnoitem24.setEnabled(false);
        }
    }//GEN-LAST:event_txtitem24KeyPressed

    private void btnadjnoitem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem24ActionPerformed
        // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(24);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem24ActionPerformed

    private void rbsi241ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi241ActionPerformed
     tr.setV241("");
        tr.setV241("Si");
        btnmv241.setEnabled(true);
        
        if(rbsi241.isSelected() && rbsi242.isSelected()){
            lblcum24.setEnabled(true);
            lblnocum24.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi241ActionPerformed

    private void rbno241ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno241ActionPerformed
     tr.setV241("");
        tr.setV241("No");
        btnmv241.setEnabled(false);
        
        if(rbno241.isSelected() || rbno242.isSelected() ){
            lblcum24.setEnabled(false);
            lblnocum24.setEnabled(true);
        }
    }//GEN-LAST:event_rbno241ActionPerformed

    private void btnmv241ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv241ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(37);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv241ActionPerformed

    private void rbsi242ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi242ActionPerformed
      tr.setV242("");
        tr.setV242("Si");
        btnmv242.setEnabled(true);
        
        if(rbsi241.isSelected() && rbsi242.isSelected()){
            lblcum24.setEnabled(true);
            lblnocum24.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi242ActionPerformed

    private void rbno242ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno242ActionPerformed
     tr.setV242("");
        tr.setV242("No");
        btnmv242.setEnabled(false);
        
        if(rbno241.isSelected() || rbno242.isSelected() ){
            lblcum24.setEnabled(false);
            lblnocum24.setEnabled(true);
        }
    }//GEN-LAST:event_rbno242ActionPerformed

    private void btnmv242ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv242ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(38);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv242ActionPerformed

    private void noaplicaitem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem25ActionPerformed
      if(noaplicaitem25.isSelected()){
        rbsi251.setEnabled(false);
        rbno251.setEnabled(false);
        btnmv251.setEnabled(false);
        txtitem25.setEnabled(false);
        btnadjnoitem25.setEnabled(false);
          rbjustiitem25.setEnabled(true);
          rbnojustiitem25.setEnabled(true);
          
          tr.setI251("");
        
        }else{
          rbsi251.setEnabled(true);
        rbno251.setEnabled(true);
        btnmv251.setEnabled(false);
        txtitem25.setEnabled(false);
        btnadjnoitem25.setEnabled(false);
        rbjustiitem25.setEnabled(false);
          rbnojustiitem25.setEnabled(false);
            
            
        }      
    }//GEN-LAST:event_noaplicaitem25ActionPerformed

    private void rbjustiitem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem25ActionPerformed
       txtitem25.setEnabled(true);
       tr.setI251("");
    }//GEN-LAST:event_rbjustiitem25ActionPerformed

    private void rbnojustiitem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem25ActionPerformed
      btnadjnoitem25.setEnabled(false);
        txtitem25.setEnabled(false);
        lblcum25.setEnabled(false);
        lblnocum25.setEnabled(true);
         tr.setI251("");
        tr.setI251("No");
        tr.setA251("");
        tr.setA251("Si");
        tr.setV251("");
        tr.setV251("No");
        tr.setJ251("");
    }//GEN-LAST:event_rbnojustiitem25ActionPerformed

    private void txtitem25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem25KeyPressed
      if(txtitem25.getText().length()>2){        
        lblcum25.setEnabled(true);
       btnadjnoitem25.setEnabled(true);
     // inserta datos que cumple  
       tr.setI251("");
       tr.setI251("Si");
       tr.setA251("");
       tr.setA251("No");
       tr.setV251("");
       tr.setV251("no aplica");
       tr.setJ251("");
       tr.setJ251(txtitem25.getText());
       
       
   }else{
        tr.setJ251("");
        tr.setI251("");
       
        
        
            lblcum25.setEnabled(false);
            lblnocum25.setEnabled(false);
            btnadjnoitem25.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem25KeyPressed

    private void btnadjnoitem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem25ActionPerformed
       // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(25);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem25ActionPerformed

    private void rbsi251ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi251ActionPerformed
   tr.setV251("");
 tr.setV251("Si");
 btnmv251.setEnabled(true);
        
        if(rbsi251.isSelected()){
            lblcum25.setEnabled(true);
            lblnocum25.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi251ActionPerformed

    private void rbno251ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno251ActionPerformed
 tr.setV251("");
        tr.setV251("No");
        btnmv251.setEnabled(false);
        
        if(rbno251.isSelected()){
            lblcum25.setEnabled(false);
            lblnocum25.setEnabled(true);
        }

    }//GEN-LAST:event_rbno251ActionPerformed

    private void btnmv251ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv251ActionPerformed
       // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(39);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv251ActionPerformed

    private void noaplicaitem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem26ActionPerformed
    if(noaplicaitem26.isSelected()){
        rbsi261.setEnabled(false);
        rbno261.setEnabled(false);
         rbsi262.setEnabled(false);
        rbno262.setEnabled(false);
         rbsi263.setEnabled(false);
        rbno263.setEnabled(false);
        btnmv261.setEnabled(false);
        btnmv262.setEnabled(false);
        btnmv263.setEnabled(false);
        txtitem26.setEnabled(false);
          btnadjnoitem26.setEnabled(false);
          rbjustiitem26.setEnabled(true);
          rbnojustiitem26.setEnabled(true);
           tr.setI261("");
        
        }else{
          rbsi261.setEnabled(true);
        rbno261.setEnabled(true);
         rbsi262.setEnabled(true);
        rbno262.setEnabled(true);
         rbsi263.setEnabled(true);
        rbno263.setEnabled(true);
        btnmv261.setEnabled(false);
        btnmv262.setEnabled(false);
        btnmv263.setEnabled(false);
         txtitem26.setEnabled(false);
          btnadjnoitem26.setEnabled(false);
         rbjustiitem26.setEnabled(false);
          rbnojustiitem26.setEnabled(false);  
            
            
        }
    }//GEN-LAST:event_noaplicaitem26ActionPerformed

    private void rbjustiitem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem26ActionPerformed
     
         txtitem26.setEnabled(true);
          tr.setI261("");

        
    }//GEN-LAST:event_rbjustiitem26ActionPerformed

    private void rbnojustiitem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem26ActionPerformed

         btnadjnoitem26.setEnabled(false);
        txtitem26.setEnabled(false);
        lblcum26.setEnabled(false);
        lblnocum26.setEnabled(true);
         tr.setI261("");
        tr.setI261("No");
        tr.setA261("");
        tr.setA261("Si");
        tr.setV261("");
        tr.setV261("No");
        tr.setV262("");
        tr.setV262("No");
        tr.setV263("");
        tr.setV263("No");
        tr.setJ261("");
        
    }//GEN-LAST:event_rbnojustiitem26ActionPerformed

    private void txtitem26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem26KeyPressed
 
          if(txtitem26.getText().length()>2){
       
       lblcum26.setEnabled(true);
       btnadjnoitem26.setEnabled(true);
     // inserta datos que cumple  
     
    
       tr.setI261("");
       tr.setI261("Si");
       tr.setA261("");
       tr.setA261("No");
       tr.setV261("");
       tr.setV261("no aplica");
       tr.setV262("");
       tr.setV262("no aplica");
       tr.setV263("");
       tr.setV263("no aplica");
       tr.setJ261("");
       tr.setJ261(txtitem26.getText());
       
       
   }else{
        tr.setJ261("");
            tr.setI261("");
                 
            lblcum26.setEnabled(false);
            lblnocum26.setEnabled(false);
            btnadjnoitem26.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem26KeyPressed

    private void btnadjnoitem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem26ActionPerformed
       // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(26);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem26ActionPerformed

    private void rbsi261ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi261ActionPerformed
       tr.setV261("");
        tr.setV261("Si");
        btnmv261.setEnabled(true);
        
        if(rbsi261.isSelected() && rbsi262.isSelected() && rbsi263.isSelected()){
            lblcum26.setEnabled(true);
            lblnocum26.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi261ActionPerformed

    private void rbno261ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno261ActionPerformed
        tr.setV261("");
        tr.setV261("No");
        btnmv261.setEnabled(false);
        
        if(rbno261.isSelected() || rbno262.isSelected() || rbno263.isSelected()){
            lblcum26.setEnabled(false);
            lblnocum26.setEnabled(true);
        }

        
    }//GEN-LAST:event_rbno261ActionPerformed

    private void btnmv261ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv261ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(40);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv261ActionPerformed

    private void rbsi262ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi262ActionPerformed
        tr.setV262("");
        tr.setV262("Si");
        btnmv262.setEnabled(true);
        
        if(rbsi261.isSelected() && rbsi262.isSelected() && rbsi263.isSelected()){
            lblcum26.setEnabled(true);
            lblnocum26.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi262ActionPerformed

    private void rbno262ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno262ActionPerformed
     tr.setV262("");
        tr.setV262("No");
        btnmv262.setEnabled(false);
        
        if(rbno261.isSelected() || rbno262.isSelected() || rbno263.isSelected()){
            lblcum26.setEnabled(false);
            lblnocum26.setEnabled(true);
        }

    }//GEN-LAST:event_rbno262ActionPerformed

    private void btnmv262ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv262ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(41);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv262ActionPerformed

    private void rbsi263ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi263ActionPerformed
      tr.setV263("");
        tr.setV263("Si");
        btnmv263.setEnabled(true);
        
        if(rbsi261.isSelected() && rbsi262.isSelected() && rbsi263.isSelected()){
            lblcum26.setEnabled(true);
            lblnocum26.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi263ActionPerformed

    private void rbno263ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno263ActionPerformed
      tr.setV263("");
        tr.setV263("No");
        btnmv263.setEnabled(false);
        
        if(rbno261.isSelected() || rbno262.isSelected() || rbno263.isSelected()){
            lblcum26.setEnabled(false);
            lblnocum26.setEnabled(true);
        }

    }//GEN-LAST:event_rbno263ActionPerformed

    private void btnmv263ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv263ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(42);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv263ActionPerformed

    private void noaplicaitem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem27ActionPerformed
        if(noaplicaitem27.isSelected()){
        rbsi271.setEnabled(false);
        rbno271.setEnabled(false);
        btnmv271.setEnabled(false);
       txtitem27.setEnabled(false);
        btnadjnoitem27.setEnabled(false);
         rbjustiitem27.setEnabled(true);
          rbnojustiitem27.setEnabled(true);
         tr.setI271("");
        }else{
          rbsi271.setEnabled(true);
        rbno271.setEnabled(true);
        btnmv271.setEnabled(false);
        txtitem27.setEnabled(false);
        btnadjnoitem27.setEnabled(false);
         rbjustiitem27.setEnabled(false);
          rbnojustiitem27.setEnabled(false);
            
            
        }   
    }//GEN-LAST:event_noaplicaitem27ActionPerformed

    private void rbjustiitem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem27ActionPerformed
    txtitem27.setEnabled(true);
     tr.setI271("");
    }//GEN-LAST:event_rbjustiitem27ActionPerformed

    private void rbnojustiitem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem27ActionPerformed
     btnadjnoitem27.setEnabled(false);
        txtitem27.setEnabled(false);
        lblcum27.setEnabled(false);
        lblnocum27.setEnabled(true);
         tr.setI271("");
        tr.setI271("No");
        tr.setA271("");
        tr.setA271("Si");
        tr.setV271("");
        tr.setV271("No");
        tr.setJ271("");
        
    }//GEN-LAST:event_rbnojustiitem27ActionPerformed

    private void txtitem27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem27KeyPressed
      if(txtitem27.getText().length()>2){        
        lblcum27.setEnabled(true);
       btnadjnoitem27.setEnabled(true);
     // inserta datos que cumple  
       tr.setI271("");
       tr.setI271("Si");
       tr.setA271("");
       tr.setA271("No");
       tr.setV271("");
       tr.setV271("no aplica");
       tr.setJ271("");
       tr.setJ271(txtitem27.getText());
       
       
   }else{
        tr.setJ271("");
        tr.setI271("");
       
        
        
            lblcum27.setEnabled(false);
            lblnocum27.setEnabled(false);
            btnadjnoitem27.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem27KeyPressed

    private void btnadjnoitem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem27ActionPerformed
         // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(27);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem27ActionPerformed

    private void rbsi271ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi271ActionPerformed
    tr.setV271("");
 tr.setV271("Si");
 btnmv271.setEnabled(true);
        
        if(rbsi271.isSelected()){
            lblcum27.setEnabled(true);
            lblnocum27.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi271ActionPerformed

    private void rbno271ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno271ActionPerformed
    tr.setV271("");
        tr.setV271("No");
        btnmv271.setEnabled(false);
        
        if(rbno271.isSelected()){
            lblcum27.setEnabled(false);
            lblnocum27.setEnabled(true);
        }

    }//GEN-LAST:event_rbno271ActionPerformed

    private void btnmv271ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv271ActionPerformed
       // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(43);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv271ActionPerformed

    private void noaplicaitem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem28ActionPerformed
      if (noaplicaitem28.isSelected()) {
            rbsi281.setEnabled(false);
            rbno281.setEnabled(false);
            rbsi282.setEnabled(false);
            rbno282.setEnabled(false);
            btnmv281.setEnabled(false);
            btnmv282.setEnabled(false);
            txtitem28.setEnabled(false);
            btnadjnoitem28.setEnabled(false);
            rbjustiitem28.setEnabled(true);
            rbnojustiitem28.setEnabled(true);
            tr.setI281("");

        } else {
            rbsi281.setEnabled(true);
            rbno281.setEnabled(true);
            rbsi282.setEnabled(true);
            rbno282.setEnabled(true);
            btnmv281.setEnabled(false);
            btnmv282.setEnabled(false);
            txtitem28.setEnabled(false);
            btnadjnoitem28.setEnabled(false);
            rbjustiitem28.setEnabled(false);
            rbnojustiitem28.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem28ActionPerformed

    private void rbjustiitem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem28ActionPerformed
    txtitem28.setEnabled(true);
    tr.setI281("");
    }//GEN-LAST:event_rbjustiitem28ActionPerformed

    private void rbnojustiitem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem28ActionPerformed
        btnadjnoitem28.setEnabled(false);
        txtitem28.setEnabled(false);
        lblcum28.setEnabled(false);
        lblnocum28.setEnabled(true);
        tr.setI281("");
        tr.setI281("No");
        tr.setA281("");
        tr.setA281("Si");
        tr.setV281("");
        tr.setV281("No");
        tr.setV282("");
        tr.setV282("No");
        tr.setJ281("");
    }//GEN-LAST:event_rbnojustiitem28ActionPerformed

    private void txtitem28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem28KeyPressed
    if (txtitem28.getText().length() > 2) {

            lblcum28.setEnabled(true);
            btnadjnoitem28.setEnabled(true);
            // inserta datos que cumple  

            tr.setI281("");
            tr.setI281("Si");
            tr.setA281("");
            tr.setA281("No");
            tr.setV281("");
            tr.setV281("no aplica");
            tr.setV282("");
            tr.setV282("no aplica");
            tr.setJ281("");
            tr.setJ281(txtitem28.getText());

        } else {
            tr.setJ281("");
            tr.setI281("");
            
            lblcum28.setEnabled(false);
            lblnocum28.setEnabled(false);
            btnadjnoitem28.setEnabled(false);
        }

    }//GEN-LAST:event_txtitem28KeyPressed

    private void btnadjnoitem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem28ActionPerformed
       // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(28);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem28ActionPerformed

    private void rbsi281ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi281ActionPerformed
       tr.setV281("");
        tr.setV281("Si");
        btnmv281.setEnabled(true);
        
        if(rbsi281.isSelected() && rbsi282.isSelected()){
            lblcum28.setEnabled(true);
            lblnocum28.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi281ActionPerformed

    private void rbno281ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno281ActionPerformed
   tr.setV281("");
        tr.setV281("No");
        btnmv281.setEnabled(false);
        
        if(rbno281.isSelected() || rbno282.isSelected() ){
            lblcum28.setEnabled(false);
            lblnocum28.setEnabled(true);
        }

    }//GEN-LAST:event_rbno281ActionPerformed

    private void btnmv281ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv281ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(44);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv281ActionPerformed

    private void rbsi282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi282ActionPerformed
       tr.setV282("");
        tr.setV282("Si");
        btnmv282.setEnabled(true);
        
        if(rbsi281.isSelected() && rbsi282.isSelected()){
            lblcum28.setEnabled(true);
            lblnocum28.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi282ActionPerformed

    private void rbno282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno282ActionPerformed
       tr.setV282("");
        tr.setV282("No");
        btnmv282.setEnabled(false);
        
        if(rbno281.isSelected() || rbno282.isSelected() ){
            lblcum28.setEnabled(false);
            lblnocum28.setEnabled(true);
        }

    }//GEN-LAST:event_rbno282ActionPerformed

    private void btnmv282ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv282ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(45);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv282ActionPerformed

    private void noaplicaitem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem29ActionPerformed
     if(noaplicaitem29.isSelected()){
        rbsi291.setEnabled(false);
        rbno291.setEnabled(false);
        btnmv291.setEnabled(false);
        txtitem29.setEnabled(false);
        btnadjnoitem29.setEnabled(false);
         rbjustiitem29.setEnabled(true);
          rbnojustiitem29.setEnabled(true);
          tr.setI291("");
        
        }else{
          rbsi291.setEnabled(true);
        rbno291.setEnabled(true);
        btnmv291.setEnabled(false);
        txtitem29.setEnabled(false);
        btnadjnoitem29.setEnabled(false);
         rbjustiitem29.setEnabled(false);
          rbnojustiitem29.setEnabled(false);
            
            
        }       
    }//GEN-LAST:event_noaplicaitem29ActionPerformed

    private void rbjustiitem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem29ActionPerformed
      
tr.setI291("");        
 txtitem29.setEnabled(true);
    }//GEN-LAST:event_rbjustiitem29ActionPerformed

    private void rbnojustiitem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem29ActionPerformed
   btnadjnoitem29.setEnabled(false);
        txtitem29.setEnabled(false);
        lblcum29.setEnabled(false);
        lblnocum29.setEnabled(true);
         tr.setI291("");
        tr.setI291("No");
        tr.setA291("");
        tr.setA291("Si");
        tr.setV291("");
        tr.setV291("No");
        tr.setJ291("");
    }//GEN-LAST:event_rbnojustiitem29ActionPerformed

    private void txtitem29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem29KeyPressed
       if(txtitem29.getText().length()>2){        
        lblcum29.setEnabled(true);
       btnadjnoitem29.setEnabled(true);
     // inserta datos que cumple  
       tr.setI291("");
       tr.setI291("Si");
       tr.setA291("");
       tr.setA291("No");
       tr.setV291("");
       tr.setV291("no aplica");
       tr.setJ291("");
       tr.setJ291(txtitem29.getText());
       
       
   }else{
        tr.setJ291("");
        tr.setI291("");
       
        
        
            lblcum29.setEnabled(false);
            lblnocum29.setEnabled(false);
            btnadjnoitem29.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem29KeyPressed

    private void btnadjnoitem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem29ActionPerformed
       // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(29);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem29ActionPerformed

    private void rbsi291ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi291ActionPerformed
    tr.setV291("");
 tr.setV291("Si");
 btnmv291.setEnabled(true);
        
        if(rbsi291.isSelected()){
            lblcum29.setEnabled(true);
            lblnocum29.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi291ActionPerformed

    private void rbno291ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno291ActionPerformed
      tr.setV291("");
        tr.setV291("No");
        btnmv291.setEnabled(false);
        
        if(rbno291.isSelected()){
            lblcum29.setEnabled(false);
            lblnocum29.setEnabled(true);
        }

    }//GEN-LAST:event_rbno291ActionPerformed

    private void btnmv291ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv291ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(46);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv291ActionPerformed

    private void noaplicaitem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem30ActionPerformed
    if(noaplicaitem30.isSelected()){
        rbsi301.setEnabled(false);
        rbno301.setEnabled(false);
        btnmv301.setEnabled(false);
       txtitem30.setEnabled(false);
        btnadjnoitem30.setEnabled(false);
        rbjustiitem30.setEnabled(true);
          rbnojustiitem30.setEnabled(true);
           tr.setI301("");
        
        }else{
          rbsi301.setEnabled(true);
        rbno301.setEnabled(true);
        btnmv301.setEnabled(false);
        txtitem30.setEnabled(false);
        btnadjnoitem30.setEnabled(false);
         rbjustiitem30.setEnabled(false);
          rbnojustiitem30.setEnabled(false);
            
            
        }       
    }//GEN-LAST:event_noaplicaitem30ActionPerformed

    private void rbjustiitem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem30ActionPerformed
       txtitem30.setEnabled(true);
        tr.setI301("");

    }//GEN-LAST:event_rbjustiitem30ActionPerformed

    private void rbnojustiitem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem30ActionPerformed
        btnadjnoitem30.setEnabled(false);
        txtitem30.setEnabled(false);
        lblcum30.setEnabled(false);
        lblnocum30.setEnabled(true);
         tr.setI301("");
        tr.setI301("No");
        tr.setA301("");
        tr.setA301("Si");
        tr.setV301("");
        tr.setV301("No");
        tr.setJ301("");
    }//GEN-LAST:event_rbnojustiitem30ActionPerformed

    private void txtitem30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem30KeyPressed
      if(txtitem30.getText().length()>2){        
        lblcum30.setEnabled(true);
       btnadjnoitem30.setEnabled(true);
     // inserta datos que cumple  
       tr.setI301("");
       tr.setI301("Si");
       tr.setA301("");
       tr.setA301("No");
       tr.setV301("");
       tr.setV301("no aplica");
       tr.setJ301("");
       tr.setJ301(txtitem30.getText());
       
       
   }else{
        tr.setJ301("");
        tr.setI301("");
                
            lblcum30.setEnabled(false);
            lblnocum30.setEnabled(false);
            btnadjnoitem30.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem30KeyPressed

    private void btnadjnoitem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem30ActionPerformed
      // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(30);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem30ActionPerformed

    private void rbsi301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi301ActionPerformed
       tr.setV301("");
 tr.setV301("Si");
 btnmv301.setEnabled(true);
        
        if(rbsi301.isSelected()){
            lblcum30.setEnabled(true);
            lblnocum30.setEnabled(false);
        }

    }//GEN-LAST:event_rbsi301ActionPerformed

    private void rbno301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno301ActionPerformed
       tr.setV301("");
        tr.setV301("No");
        btnmv301.setEnabled(false);
        
        if(rbno301.isSelected()){
            lblcum30.setEnabled(false);
            lblnocum30.setEnabled(true);
        }

    }//GEN-LAST:event_rbno301ActionPerformed

    private void btnmv301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv301ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(47);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv301ActionPerformed

    private void noaplicaitem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem31ActionPerformed
     if(noaplicaitem31.isSelected()){
        rbsi311.setEnabled(false);
        rbno311.setEnabled(false);
        btnmv311.setEnabled(false);
        txtitem31.setEnabled(false);
        btnadjnoitem31.setEnabled(false);
         rbjustiitem31.setEnabled(true);
          rbnojustiitem31.setEnabled(true);
          tr.setI311("");

        
        }else{
          rbsi311.setEnabled(true);
        rbno311.setEnabled(true);
        btnmv311.setEnabled(false);
        txtitem31.setEnabled(false);
        btnadjnoitem31.setEnabled(false);
         rbjustiitem31.setEnabled(false);
          rbnojustiitem31.setEnabled(false);
            
            
        }  
    }//GEN-LAST:event_noaplicaitem31ActionPerformed

    private void rbjustiitem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem31ActionPerformed
    txtitem31.setEnabled(true);
    tr.setI311("");

    }//GEN-LAST:event_rbjustiitem31ActionPerformed

    private void rbnojustiitem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem31ActionPerformed
     btnadjnoitem31.setEnabled(false);
        txtitem31.setEnabled(false);
        lblcum31.setEnabled(false);
        lblnocum31.setEnabled(true);
         tr.setI311("");
        tr.setI311("No");
        tr.setA311("");
        tr.setA311("Si");
        tr.setV311("");
        tr.setV311("No");
        tr.setJ311("");
        
    }//GEN-LAST:event_rbnojustiitem31ActionPerformed

    private void txtitem31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem31KeyPressed
     if(txtitem31.getText().length()>2){        
        lblcum31.setEnabled(true);
       btnadjnoitem31.setEnabled(true);
     // inserta datos que cumple  
       tr.setI311("");
       tr.setI311("Si");
       tr.setA311("");
       tr.setA311("No");
       tr.setV311("");
       tr.setV311("no aplica");
       tr.setJ311("");
       tr.setJ311(txtitem31.getText());
       
       
   }else{
        tr.setJ311("");
        tr.setI311("");
           
        
            lblcum31.setEnabled(false);
            lblnocum31.setEnabled(false);
            btnadjnoitem31.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem31KeyPressed

    private void btnadjnoitem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem31ActionPerformed
       // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(31);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem31ActionPerformed

    private void rbsi311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi311ActionPerformed
     tr.setV311("");
 tr.setV311("Si");
 btnmv311.setEnabled(true);
        
        if(rbsi311.isSelected()){
            lblcum31.setEnabled(true);
            lblnocum31.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi311ActionPerformed

    private void rbno311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno311ActionPerformed
       tr.setV311("");
        tr.setV311("No");
        btnmv311.setEnabled(false);
        
        if(rbno311.isSelected()){
            lblcum31.setEnabled(false);
            lblnocum31.setEnabled(true);
        }
    }//GEN-LAST:event_rbno311ActionPerformed

    private void btnmv311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv311ActionPerformed
       // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(48);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv311ActionPerformed

    private void noaplicaitem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem32ActionPerformed
   if(noaplicaitem32.isSelected()){
        rbsi321.setEnabled(false);
        rbno321.setEnabled(false);
        btnmv321.setEnabled(false);
        txtitem32.setEnabled(false);
        btnadjnoitem32.setEnabled(false);
         rbjustiitem32.setEnabled(true);
          rbnojustiitem32.setEnabled(true);
          tr.setI321("");
        
        }else{
          rbsi321.setEnabled(true);
        rbno321.setEnabled(true);
        btnmv321.setEnabled(false);
        txtitem32.setEnabled(false);
        btnadjnoitem32.setEnabled(false);
        rbjustiitem32.setEnabled(false);
          rbnojustiitem32.setEnabled(false);
            
            
        }       
    }//GEN-LAST:event_noaplicaitem32ActionPerformed

    private void rbjustiitem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem32ActionPerformed
        txtitem32.setEnabled(true);
        tr.setI321("");
    }//GEN-LAST:event_rbjustiitem32ActionPerformed

    private void rbnojustiitem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem32ActionPerformed
        btnadjnoitem32.setEnabled(false);
        txtitem32.setEnabled(false);
        lblcum32.setEnabled(false);
        lblnocum32.setEnabled(true);
         tr.setI321("");
        tr.setI321("No");
        tr.setA321("");
        tr.setA321("Si");
        tr.setV321("");
        tr.setV321("No");
        tr.setJ321("");
    }//GEN-LAST:event_rbnojustiitem32ActionPerformed

    private void txtitem32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem32KeyPressed
     if(txtitem32.getText().length()>2){        
        lblcum32.setEnabled(true);
       btnadjnoitem32.setEnabled(true);
     // inserta datos que cumple  
       tr.setI321("");
       tr.setI321("Si");
       tr.setA321("");
       tr.setA321("No");
       tr.setV321("");
       tr.setV321("no aplica");
       tr.setJ321("");
       tr.setJ321(txtitem32.getText());
       
       
   }else{
        tr.setJ321("");
        tr.setI321("");
        
            lblcum32.setEnabled(false);
            lblnocum32.setEnabled(false);
            btnadjnoitem32.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem32KeyPressed

    private void btnadjnoitem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem32ActionPerformed
       // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(32);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem32ActionPerformed

    private void rbsi321ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi321ActionPerformed
      tr.setV321("");
 tr.setV321("Si");
 btnmv321.setEnabled(true);
        
        if(rbsi321.isSelected()){
            lblcum32.setEnabled(true);
            lblnocum32.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi321ActionPerformed

    private void rbno321ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno321ActionPerformed
        tr.setV321("");
        tr.setV321("No");
        btnmv321.setEnabled(false);
        
        if(rbno321.isSelected()){
            lblcum32.setEnabled(false);
            lblnocum32.setEnabled(true);
        }
    }//GEN-LAST:event_rbno321ActionPerformed

    private void btnmv321ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv321ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(49);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv321ActionPerformed

    private void noaplicaitem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem33ActionPerformed
       if(noaplicaitem33.isSelected()){
        rbsi331.setEnabled(false);
        rbno331.setEnabled(false);
         rbsi332.setEnabled(false);
        rbno332.setEnabled(false);
         rbsi333.setEnabled(false);
        rbno333.setEnabled(false);
        btnmv331.setEnabled(false);
        btnmv332.setEnabled(false);
        btnmv333.setEnabled(false);
        txtitem33.setEnabled(false);
          btnadjnoitem33.setEnabled(false);
          rbjustiitem33.setEnabled(true);
          rbnojustiitem33.setEnabled(true);
          tr.setI331("");
        
        }else{
          rbsi331.setEnabled(true);
        rbno331.setEnabled(true);
         rbsi332.setEnabled(true);
        rbno332.setEnabled(true);
         rbsi333.setEnabled(true);
        rbno333.setEnabled(true);
        btnmv331.setEnabled(false);
        btnmv332.setEnabled(false);
        btnmv333.setEnabled(false);
        txtitem33.setEnabled(false);
          btnadjnoitem33.setEnabled(false);
         rbjustiitem33.setEnabled(false);
          rbnojustiitem33.setEnabled(false);  
            
            
        }
    }//GEN-LAST:event_noaplicaitem33ActionPerformed

    private void rbjustiitem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem33ActionPerformed
        txtitem33.setEnabled(true);
        tr.setI331("");
    }//GEN-LAST:event_rbjustiitem33ActionPerformed

    private void rbnojustiitem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem33ActionPerformed
       btnadjnoitem33.setEnabled(false);
        txtitem33.setEnabled(false);
        lblcum33.setEnabled(false);
        lblnocum33.setEnabled(true);
         tr.setI331("");
        tr.setI331("No");
        tr.setA331("");
        tr.setA331("Si");
        tr.setV331("");
        tr.setV331("No");
        tr.setV332("");
        tr.setV332("No");
        tr.setV333("");
        tr.setV333("No");
        tr.setJ331("");
    }//GEN-LAST:event_rbnojustiitem33ActionPerformed

    private void txtitem33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem33KeyPressed
      if(txtitem33.getText().length()>2){
       
       lblcum33.setEnabled(true);
       btnadjnoitem33.setEnabled(true);
     // inserta datos que cumple  
     
    
       tr.setI331("");
       tr.setI331("Si");
       tr.setA331("");
       tr.setA331("No");
       tr.setV331("");
       tr.setV331("no aplica");
       tr.setV332("");
       tr.setV332("no aplica");
       tr.setV333("");
       tr.setV333("no aplica");
       tr.setJ331("");
       tr.setJ331(txtitem33.getText());
       
       
   }else{
        tr.setJ331("");
            tr.setI331("");
                  
            lblcum33.setEnabled(false);
            lblnocum33.setEnabled(false);
            btnadjnoitem33.setEnabled(false);
   }
        
    }//GEN-LAST:event_txtitem33KeyPressed

    private void btnadjnoitem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem33ActionPerformed
         // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(33);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem33ActionPerformed

    private void rbsi331ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi331ActionPerformed
      tr.setV331("");
        tr.setV331("Si");
        btnmv331.setEnabled(true);
        
        if(rbsi331.isSelected() && rbsi332.isSelected() && rbsi333.isSelected()){
            lblcum33.setEnabled(true);
            lblnocum33.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi331ActionPerformed

    private void rbno331ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno331ActionPerformed
        tr.setV331("");
        tr.setV331("No");
        btnmv331.setEnabled(false);
        
        if(rbno331.isSelected() || rbno332.isSelected() || rbno333.isSelected()){
            lblcum33.setEnabled(false);
            lblnocum33.setEnabled(true);
        }
    }//GEN-LAST:event_rbno331ActionPerformed

    private void btnmv331ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv331ActionPerformed
       // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(50);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv331ActionPerformed

    private void rbsi333ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi333ActionPerformed
       tr.setV333("");
        tr.setV333("Si");
        btnmv333.setEnabled(true);
        
        if(rbsi331.isSelected() && rbsi332.isSelected() && rbsi333.isSelected()){
            lblcum33.setEnabled(true);
            lblnocum33.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi333ActionPerformed

    private void rbno333ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno333ActionPerformed
        tr.setV333("");
        tr.setV333("No");
        btnmv333.setEnabled(false);
        
        if(rbno331.isSelected() || rbno332.isSelected() || rbno333.isSelected()){
            lblcum33.setEnabled(false);
            lblnocum33.setEnabled(true);
        }
    }//GEN-LAST:event_rbno333ActionPerformed

    private void btnmv333ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv333ActionPerformed
       // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(52);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv333ActionPerformed

    private void rbsi332ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi332ActionPerformed
          tr.setV332("");
        tr.setV332("Si");
        btnmv332.setEnabled(true);
        
        if(rbsi331.isSelected() && rbsi332.isSelected() && rbsi333.isSelected()){
            lblcum33.setEnabled(true);
            lblnocum33.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi332ActionPerformed

    private void rbno332ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno332ActionPerformed
      tr.setV332("");
        tr.setV332("No");
        btnmv332.setEnabled(false);
        
        if(rbno331.isSelected() || rbno332.isSelected() || rbno333.isSelected()){
            lblcum33.setEnabled(false);
            lblnocum33.setEnabled(true);
        }
    }//GEN-LAST:event_rbno332ActionPerformed

    private void btnmv332ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv332ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(51);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv332ActionPerformed

    private void noaplicaitem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem34ActionPerformed
      if(noaplicaitem34.isSelected()){
        rbsi341.setEnabled(false);
        rbno341.setEnabled(false);
        btnmv341.setEnabled(false);
        txtitem34.setEnabled(false);
        btnadjnoitem34.setEnabled(false);
         rbjustiitem34.setEnabled(true);
          rbnojustiitem34.setEnabled(true);
           tr.setI341("");
        
        }else{
          rbsi341.setEnabled(true);
        rbno341.setEnabled(true);
        btnmv341.setEnabled(false);
        txtitem34.setEnabled(false);
        btnadjnoitem34.setEnabled(false);
         rbjustiitem34.setEnabled(false);
          rbnojustiitem34.setEnabled(false);
            
            
        }  
    }//GEN-LAST:event_noaplicaitem34ActionPerformed

    private void rbjustiitem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem34ActionPerformed
     txtitem34.setEnabled(true);
      tr.setI341("");
    }//GEN-LAST:event_rbjustiitem34ActionPerformed

    private void rbnojustiitem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem34ActionPerformed
     btnadjnoitem34.setEnabled(false);
        txtitem34.setEnabled(false);
        lblcum34.setEnabled(false);
        lblnocum34.setEnabled(true);
         tr.setI341("");
        tr.setI341("No");
        tr.setA341("");
        tr.setA341("Si");
        tr.setV341("");
        tr.setV341("No");
        tr.setJ341("");

    }//GEN-LAST:event_rbnojustiitem34ActionPerformed

    private void txtitem34KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem34KeyPressed
     if(txtitem34.getText().length()>2){        
        lblcum34.setEnabled(true);
       btnadjnoitem34.setEnabled(true);
     // inserta datos que cumple  
       tr.setI341("");
       tr.setI341("Si");
       tr.setA341("");
       tr.setA341("No");
       tr.setV341("");
       tr.setV341("no aplica");
       tr.setJ341("");
       tr.setJ341(txtitem34.getText());
       
       
   }else{
        tr.setJ341("");
        tr.setI341("");
       
            lblcum34.setEnabled(false);
            lblnocum34.setEnabled(false);
            btnadjnoitem34.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem34KeyPressed

    private void btnadjnoitem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem34ActionPerformed
        // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(34);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem34ActionPerformed

    private void rbsi341ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi341ActionPerformed
        tr.setV341("");
 tr.setV341("Si");
 btnmv341.setEnabled(true);
        
        if(rbsi341.isSelected()){
            lblcum34.setEnabled(true);
            lblnocum34.setEnabled(false);
        }

    }//GEN-LAST:event_rbsi341ActionPerformed

    private void rbno341ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno341ActionPerformed
     tr.setV341("");
        tr.setV341("No");
        btnmv341.setEnabled(false);
        
        if(rbno341.isSelected()){
            lblcum34.setEnabled(false);
            lblnocum34.setEnabled(true);
        }
        
    }//GEN-LAST:event_rbno341ActionPerformed

    private void btnmv341ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv341ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(53);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv341ActionPerformed

    private void noaplicaitem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem35ActionPerformed
       if(noaplicaitem35.isSelected()){
        rbsi351.setEnabled(false);
        rbno351.setEnabled(false);
        btnmv351.setEnabled(false);
        txtitem35.setEnabled(false);
        btnadjnoitem35.setEnabled(false);
         rbjustiitem35.setEnabled(true);
          rbnojustiitem35.setEnabled(true);
          
          tr.setI351("");
          
        
        }else{
          rbsi351.setEnabled(true);
        rbno351.setEnabled(true);
        btnmv351.setEnabled(false);
        txtitem35.setEnabled(false);
        btnadjnoitem35.setEnabled(false);
         rbjustiitem35.setEnabled(false);
          rbnojustiitem35.setEnabled(false);
            
            
        }   
    }//GEN-LAST:event_noaplicaitem35ActionPerformed

    private void rbjustiitem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem35ActionPerformed
      txtitem35.setEnabled(true);
      tr.setI351("");
    }//GEN-LAST:event_rbjustiitem35ActionPerformed

    private void rbnojustiitem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem35ActionPerformed
      btnadjnoitem35.setEnabled(false);
        txtitem35.setEnabled(false);
        lblcum35.setEnabled(false);
        lblnocum35.setEnabled(true);
         tr.setI351("");
        tr.setI351("No");
        tr.setA351("");
        tr.setA351("Si");
        tr.setV351("");
        tr.setV351("No");
        tr.setJ351("");
    }//GEN-LAST:event_rbnojustiitem35ActionPerformed

    private void txtitem35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem35KeyPressed
       
if(txtitem35.getText().length()>2){        
        lblcum35.setEnabled(true);
       btnadjnoitem35.setEnabled(true);
     // inserta datos que cumple  
       tr.setI351("");
       tr.setI351("Si");
       tr.setA351("");
       tr.setA351("No");
       tr.setV351("");
       tr.setV351("no aplica");
       tr.setJ351("");
       tr.setJ351(txtitem35.getText());
       
       
   }else{
        tr.setJ351("");
        tr.setI351("");
               
            lblcum35.setEnabled(false);
            lblnocum35.setEnabled(false);
            btnadjnoitem35.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem35KeyPressed

    private void btnadjnoitem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem35ActionPerformed
        // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(35);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem35ActionPerformed

    private void rbsi351ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi351ActionPerformed
     tr.setV351("");
 tr.setV351("Si");
 btnmv351.setEnabled(true);
        
        if(rbsi351.isSelected()){
            lblcum35.setEnabled(true);
            lblnocum35.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi351ActionPerformed

    private void rbno351ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno351ActionPerformed
  tr.setV351("");
        tr.setV351("No");
        btnmv351.setEnabled(false);
        
        if(rbno351.isSelected()){
            lblcum35.setEnabled(false);
            lblnocum35.setEnabled(true);
        }
    }//GEN-LAST:event_rbno351ActionPerformed

    private void btnmv351ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv351ActionPerformed
         // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(54);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv351ActionPerformed

    private void noaplicaitem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem36ActionPerformed
       if(noaplicaitem36.isSelected()){
        rbsi361.setEnabled(false);
        rbno361.setEnabled(false);
        btnmv361.setEnabled(false);
        txtitem36.setEnabled(false);
        btnadjnoitem36.setEnabled(false);
         rbjustiitem36.setEnabled(true);
          rbnojustiitem36.setEnabled(true);
        tr.setI361("");
        }else{
          rbsi361.setEnabled(true);
        rbno361.setEnabled(true);
        btnmv361.setEnabled(false);
        txtitem36.setEnabled(false);
        btnadjnoitem36.setEnabled(false);
        rbjustiitem36.setEnabled(false);
          rbnojustiitem36.setEnabled(false);
            
            
        }    
    }//GEN-LAST:event_noaplicaitem36ActionPerformed

    private void rbjustiitem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem36ActionPerformed
      txtitem36.setEnabled(true);
      tr.setI361("");
    }//GEN-LAST:event_rbjustiitem36ActionPerformed

    private void rbnojustiitem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem36ActionPerformed
       btnadjnoitem36.setEnabled(false);
        txtitem36.setEnabled(false);
        lblcum36.setEnabled(false);
        lblnocum36.setEnabled(true);
         tr.setI361("");
        tr.setI361("No");
        tr.setA361("");
        tr.setA361("Si");
        tr.setV361("");
        tr.setV361("No");
        tr.setJ361("");
    }//GEN-LAST:event_rbnojustiitem36ActionPerformed

    private void txtitem36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem36KeyPressed
       if(txtitem36.getText().length()>2){        
        lblcum36.setEnabled(true);
       btnadjnoitem36.setEnabled(true);
     // inserta datos que cumple  
       tr.setI361("");
       tr.setI361("Si");
       tr.setA361("");
       tr.setA361("No");
       tr.setV361("");
       tr.setV361("no aplica");
       tr.setJ361("");
       tr.setJ361(txtitem36.getText());
       
       
   }else{
        tr.setJ361("");
        tr.setI361("");
                
        
            lblcum36.setEnabled(false);
            lblnocum36.setEnabled(false);
            btnadjnoitem36.setEnabled(false);
   }

    }//GEN-LAST:event_txtitem36KeyPressed

    private void btnadjnoitem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem36ActionPerformed
        // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(36);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem36ActionPerformed

    private void rbsi361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi361ActionPerformed
     tr.setV361("");
 tr.setV361("Si");
 btnmv361.setEnabled(true);
        
        if(rbsi361.isSelected()){
            lblcum36.setEnabled(true);
            lblnocum36.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi361ActionPerformed

    private void rbno361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno361ActionPerformed
      tr.setV361("");
        tr.setV361("No");
        btnmv361.setEnabled(false);
        
        if(rbno361.isSelected()){
            lblcum36.setEnabled(false);
            lblnocum36.setEnabled(true);
        }

    }//GEN-LAST:event_rbno361ActionPerformed

    private void btnmv361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv361ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(55);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv361ActionPerformed

    private void noaplicaitem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem37ActionPerformed
     if(noaplicaitem37.isSelected()){
        rbsi371.setEnabled(false);
        rbno371.setEnabled(false);
        btnmv371.setEnabled(false);
        txtitem37.setEnabled(false);
        btnadjnoitem37.setEnabled(false);
          rbjustiitem37.setEnabled(true);
          rbnojustiitem37.setEnabled(true);
           tr.setI371("");
        
        }else{
          rbsi371.setEnabled(true);
        rbno371.setEnabled(true);
        btnmv371.setEnabled(false);
        txtitem37.setEnabled(false);
        btnadjnoitem37.setEnabled(false);
          rbjustiitem37.setEnabled(false);
          rbnojustiitem37.setEnabled(false);
            
            
        }       
        
    }//GEN-LAST:event_noaplicaitem37ActionPerformed

    private void rbjustiitem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem37ActionPerformed
       txtitem37.setEnabled(true);
        tr.setI371("");
    }//GEN-LAST:event_rbjustiitem37ActionPerformed

    private void rbnojustiitem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem37ActionPerformed
       btnadjnoitem37.setEnabled(false);
        txtitem37.setEnabled(false);
        lblcum37.setEnabled(false);
        lblnocum37.setEnabled(true);
         tr.setI371("");
        tr.setI371("No");
        tr.setA371("");
        tr.setA371("Si");
        tr.setV371("");
        tr.setV371("No");
        tr.setJ371("");
    }//GEN-LAST:event_rbnojustiitem37ActionPerformed

    private void txtitem37KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem37KeyPressed
     if(txtitem37.getText().length()>2){        
        lblcum37.setEnabled(true);
       btnadjnoitem37.setEnabled(true);
     // inserta datos que cumple  
       tr.setI371("");
       tr.setI371("Si");
       tr.setA371("");
       tr.setA371("No");
       tr.setV371("");
       tr.setV371("no aplica");
       tr.setJ371("");
       tr.setJ371(txtitem37.getText());
       
       
   }else{
        tr.setJ371("");
        tr.setI371("");
                
            lblcum37.setEnabled(false);
            lblnocum37.setEnabled(false);
            btnadjnoitem37.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem37KeyPressed

    private void btnadjnoitem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem37ActionPerformed
      // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(37);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem37ActionPerformed

    private void rbsi371ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi371ActionPerformed
       tr.setV371("");
 tr.setV371("Si");
 btnmv371.setEnabled(true);
        
        if(rbsi371.isSelected()){
            lblcum37.setEnabled(true);
            lblnocum37.setEnabled(false);
        }

    }//GEN-LAST:event_rbsi371ActionPerformed

    private void rbno371ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno371ActionPerformed
     tr.setV371("");
        tr.setV371("No");
        btnmv371.setEnabled(false);
        
        if(rbno371.isSelected()){
            lblcum37.setEnabled(false);
            lblnocum37.setEnabled(true);
        }
    }//GEN-LAST:event_rbno371ActionPerformed

    private void btnmv371ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv371ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(56);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv371ActionPerformed

    private void noaplicaitem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem38ActionPerformed
      if(noaplicaitem38.isSelected()){
        rbsi381.setEnabled(false);
        rbno381.setEnabled(false);
        btnmv381.setEnabled(false);
        txtitem38.setEnabled(false);
        btnadjnoitem38.setEnabled(false);
          rbjustiitem38.setEnabled(true);
          rbnojustiitem38.setEnabled(true);
          tr.setI381("");
        
        }else{
          rbsi381.setEnabled(true);
        rbno381.setEnabled(true);
        btnmv381.setEnabled(false);
        txtitem38.setEnabled(false);
        btnadjnoitem38.setEnabled(false);
         rbjustiitem38.setEnabled(false);
          rbnojustiitem38.setEnabled(false);
            
            
        }       
    }//GEN-LAST:event_noaplicaitem38ActionPerformed

    private void rbjustiitem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem38ActionPerformed
       txtitem38.setEnabled(true);
       tr.setI381("");
    }//GEN-LAST:event_rbjustiitem38ActionPerformed

    private void rbnojustiitem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem38ActionPerformed
       
    btnadjnoitem38.setEnabled(false);
        txtitem38.setEnabled(false);
        lblcum38.setEnabled(false);
        lblnocum38.setEnabled(true);
         tr.setI381("");
        tr.setI381("No");
        tr.setA381("");
        tr.setA381("Si");
        tr.setV381("");
        tr.setV381("No");
        tr.setJ381("");
    }//GEN-LAST:event_rbnojustiitem38ActionPerformed

    private void txtitem38KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem38KeyPressed
   if(txtitem38.getText().length()>2){        
        lblcum38.setEnabled(true);
       btnadjnoitem38.setEnabled(true);
     // inserta datos que cumple  
       tr.setI381("");
       tr.setI381("Si");
       tr.setA381("");
       tr.setA381("No");
       tr.setV381("");
       tr.setV381("no aplica");
       tr.setJ381("");
       tr.setJ381(txtitem38.getText());
       
       
   }else{
        tr.setJ381("");
        tr.setI381("");
              
            lblcum38.setEnabled(false);
            lblnocum38.setEnabled(false);
            btnadjnoitem38.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem38KeyPressed

    private void btnadjnoitem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem38ActionPerformed
        // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(38);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem38ActionPerformed

    private void rbsi381ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi381ActionPerformed
     tr.setV381("");
 tr.setV381("Si");
 btnmv381.setEnabled(true);
        
        if(rbsi381.isSelected()){
            lblcum38.setEnabled(true);
            lblnocum38.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi381ActionPerformed

    private void rbno381ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno381ActionPerformed
       tr.setV381("");
        tr.setV381("No");
        btnmv381.setEnabled(false);
        
        if(rbno381.isSelected()){
            lblcum38.setEnabled(false);
            lblnocum38.setEnabled(true);
        }
    }//GEN-LAST:event_rbno381ActionPerformed

    private void btnmv381ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv381ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(57);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv381ActionPerformed

    private void noaplicaitem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem39ActionPerformed
     if(noaplicaitem39.isSelected()){
        rbsi391.setEnabled(false);
        rbno391.setEnabled(false);
        btnmv391.setEnabled(false);
        txtitem39.setEnabled(false);
        btnadjnoitem39.setEnabled(false);
         rbjustiitem39.setEnabled(true);
          rbnojustiitem39.setEnabled(true);
          tr.setI391("");
        
        }else{
          rbsi391.setEnabled(true);
        rbno391.setEnabled(true);
        btnmv391.setEnabled(false);
        txtitem39.setEnabled(false);
        btnadjnoitem39.setEnabled(false);
          rbjustiitem39.setEnabled(false);
          rbnojustiitem39.setEnabled(false);
            
            
        }     
    }//GEN-LAST:event_noaplicaitem39ActionPerformed

    private void rbjustiitem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem39ActionPerformed
       txtitem39.setEnabled(true);
       tr.setI391("");
    }//GEN-LAST:event_rbjustiitem39ActionPerformed

    private void rbnojustiitem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem39ActionPerformed
        btnadjnoitem39.setEnabled(false);
        txtitem39.setEnabled(false);
        lblcum39.setEnabled(false);
        lblnocum39.setEnabled(true);
         tr.setI391("");
        tr.setI391("No");
        tr.setA391("");
        tr.setA391("Si");
        tr.setV391("");
        tr.setV391("No");
        tr.setJ391("");
    }//GEN-LAST:event_rbnojustiitem39ActionPerformed

    private void txtitem39KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem39KeyPressed
     if(txtitem39.getText().length()>2){        
        lblcum39.setEnabled(true);
       btnadjnoitem39.setEnabled(true);
     // inserta datos que cumple  
       tr.setI391("");
       tr.setI391("Si");
       tr.setA391("");
       tr.setA391("No");
       tr.setV391("");
       tr.setV391("no aplica");
       tr.setJ391("");
       tr.setJ391(txtitem39.getText());
       
       
   }else{
        tr.setJ391("");
        tr.setI391("");
              
            lblcum39.setEnabled(false);
            lblnocum39.setEnabled(false);
            btnadjnoitem39.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem39KeyPressed

    private void btnadjnoitem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem39ActionPerformed
        // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(39);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem39ActionPerformed

    private void rbsi391ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi391ActionPerformed
        tr.setV391("");
 tr.setV391("Si");
 btnmv391.setEnabled(true);
        
        if(rbsi391.isSelected()){
            lblcum39.setEnabled(true);
            lblnocum39.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi391ActionPerformed

    private void rbno391ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno391ActionPerformed
       tr.setV391("");
        tr.setV391("No");
        btnmv391.setEnabled(false);
        
        if(rbno391.isSelected()){
            lblcum39.setEnabled(false);
            lblnocum39.setEnabled(true);
        }
    }//GEN-LAST:event_rbno391ActionPerformed

    private void btnmv391ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv391ActionPerformed
       // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(58);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv391ActionPerformed

    private void noaplicaitem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem40ActionPerformed
   if(noaplicaitem40.isSelected()){
        rbsi401.setEnabled(false);
        rbno401.setEnabled(false);
        btnmv401.setEnabled(false);
        txtitem40.setEnabled(false);
        btnadjnoitem40.setEnabled(false);
         rbjustiitem40.setEnabled(true);
          rbnojustiitem40.setEnabled(true);
          tr.setI401("");
        
        }else{
          rbsi401.setEnabled(true);
        rbno401.setEnabled(true);
        btnmv401.setEnabled(false);
       txtitem40.setEnabled(false);
        btnadjnoitem40.setEnabled(false);
         rbjustiitem40.setEnabled(false);
          rbnojustiitem40.setEnabled(false);
            
            
        }   
    }//GEN-LAST:event_noaplicaitem40ActionPerformed

    private void rbjustiitem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem40ActionPerformed
     txtitem40.setEnabled(true);
     tr.setI401("");
    }//GEN-LAST:event_rbjustiitem40ActionPerformed

    private void rbnojustiitem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem40ActionPerformed
        btnadjnoitem40.setEnabled(false);
        txtitem40.setEnabled(false);
        lblcum40.setEnabled(false);
        lblnocum40.setEnabled(true);
         tr.setI401("");
        tr.setI401("No");
        tr.setA401("");
        tr.setA401("Si");
        tr.setV401("");
        tr.setV401("No");
        tr.setJ401("");

    }//GEN-LAST:event_rbnojustiitem40ActionPerformed

    private void txtitem40KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem40KeyPressed
     
        if(txtitem40.getText().length()>2){        
        lblcum40.setEnabled(true);
       btnadjnoitem40.setEnabled(true);
     // inserta datos que cumple  
       tr.setI401("");
       tr.setI401("Si");
       tr.setA401("");
       tr.setA401("No");
       tr.setV401("");
       tr.setV401("no aplica");
       tr.setJ401("");
       tr.setJ401(txtitem40.getText());
       
       
   }else{
        tr.setJ401("");
        tr.setI401("");
               
            lblcum40.setEnabled(false);
            lblnocum40.setEnabled(false);
            btnadjnoitem40.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem40KeyPressed

    private void btnadjnoitem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem40ActionPerformed
        // Objeto para guardar las variables  
        Mrecursos tr= new Mrecursos();
       // objeto llamar el metodo (MVC)
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(40);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem40ActionPerformed

    private void rbsi401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi401ActionPerformed
      tr.setV401("");
 tr.setV401("Si");
 btnmv401.setEnabled(true);
        
        if(rbsi401.isSelected()){
            lblcum40.setEnabled(true);
            lblnocum40.setEnabled(false);
        }

    }//GEN-LAST:event_rbsi401ActionPerformed

    private void rbno401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno401ActionPerformed
      tr.setV401("");
        tr.setV401("No");
        btnmv401.setEnabled(false);
        
        if(rbno401.isSelected()){
            lblcum40.setEnabled(false);
            lblnocum40.setEnabled(true);
        }
    }//GEN-LAST:event_rbno401ActionPerformed

    private void btnmv401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv401ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
            Mrecursos tr= new Mrecursos();  
          // objeto para llamar los metodos 
        Crecursos func= new Crecursos();
        // ventanilla de carga
        JFileChooser se = new JFileChooser();
        //para que solo acepte archivos
       se.setFileSelectionMode(JFileChooser.FILES_ONLY);
       // cuadro dialogo abrir
       int estado= se.showOpenDialog(null);
       
       // Si aprueba el archivo
       
       if(estado == JFileChooser.APPROVE_OPTION){
          
           try {
               
               // mando los datos a las variables
               
               tr.setFi1111( new FileInputStream(se.getSelectedFile()));
               tr.setLongitud((int)se.getSelectedFile().length());
               tr.setId(59);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv401ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


        // Item 23
     if(rbsi231.isSelected()){
            tr.setI231("");
            tr.setI231("Si");
            tr.setA231("");
            tr.setA231("Si");

        }

        if(rbno231.isSelected()){
            tr.setI231("");
            tr.setI231("No");
            tr.setA231("");
            tr.setA231("Si");
        }

        
        // Item 24

        if(rbsi241.isSelected() && rbsi242.isSelected()){
             
            tr.setI241("");
            tr.setI241("si");
            tr.setA241("");
            tr.setA241("si");

        }

        if(rbno241.isSelected() || rbno242.isSelected()){
         if((!rbno241.isSelected() && !rbsi241.isSelected()) || (!rbno242.isSelected() && !rbsi242.isSelected())){   
                
        }else{    
            
            tr.setI241("");
            tr.setI241("no");
            tr.setA241("");
            tr.setA241("si");   }

        }

        // Item 25
        if(rbsi251.isSelected()){
            tr.setI251("");
            tr.setI251("si");
            tr.setA251("");
            tr.setA251("si");

        }

        if(rbno251.isSelected()){
            tr.setI251("");
            tr.setI251("no");
            tr.setA251("");
            tr.setA251("si");

        }

        // Item 26

       if(rbsi261.isSelected() && rbsi262.isSelected() && rbsi263.isSelected()){
            tr.setI261("");
            tr.setI261("si");
            tr.setA261("");
            tr.setA261("si");

        }
        if(rbno261.isSelected() || rbno262.isSelected() || rbno263.isSelected()){
         if((!rbno261.isSelected() && !rbsi261.isSelected()) || (!rbno262.isSelected() && !rbsi262.isSelected()) || (!rbno263.isSelected() && !rbsi263.isSelected()) 
       ){   
                
        }else{   
            
            tr.setI261("");
            tr.setI261("no");
            tr.setA261("");
            tr.setA261("si");  }

        }

        // Item 27

        if(rbsi271.isSelected()){
            tr.setI271("");
            tr.setI271("si");
            tr.setA271("");
            tr.setA271("si");

        }

        if(rbno271.isSelected()){
            tr.setI271("");
            tr.setI271("no");
            tr.setA271("");
            tr.setA271("si");

        }

        // Item 28
       if(rbsi281.isSelected() && rbsi282.isSelected()){
            tr.setI281("");
            tr.setI281("si");
            tr.setA281("");
            tr.setA281("si");

        }

        if(rbno281.isSelected() || rbno282.isSelected()){
            
         if((!rbno281.isSelected() && !rbsi281.isSelected()) || (!rbno282.isSelected() && !rbsi282.isSelected())){   
                
        }else{       
            tr.setI281("");
            tr.setI281("no");
            tr.setA281("");
            tr.setA281("si");  }

        }

        // Item 29
        if(rbsi291.isSelected()){
            tr.setI291("");
            tr.setI291("si");
            tr.setA291("");
            tr.setA291("si");

        }

        if(rbno291.isSelected()){
            tr.setI291("");
            tr.setI291("no");
            tr.setA291("");
            tr.setA291("si");

        }

        // Item 30
       if(rbsi301.isSelected()){
            tr.setI301("");
            tr.setI301("si");
            tr.setA301("");
            tr.setA301("si");

        }

        if(rbno301.isSelected()){
            tr.setI301("");
            tr.setI301("no");
            tr.setA301("");
            tr.setA301("si");

        }

        // Item 31

       if(rbsi311.isSelected()){
            tr.setI311("");
            tr.setI311("si");
            tr.setA311("");
            tr.setA311("si");

        }

        if(rbno311.isSelected()){
            tr.setI311("");
            tr.setI311("no");
            tr.setA311("");
            tr.setA311("si");

        }

        // Item 32
        if(rbsi321.isSelected()){
            tr.setI321("");
            tr.setI321("si");
            tr.setA321("");
            tr.setA321("si");

        }

        if(rbno321.isSelected()){
            tr.setI321("");
            tr.setI321("no");
            tr.setA321("");
            tr.setA321("si");

        }

        // Item 33
       if(rbsi331.isSelected() && rbsi332.isSelected() && rbsi333.isSelected()){
            tr.setI331("");
            tr.setI331("si");
            tr.setA331("");
            tr.setA331("si");

        }
        if(rbno331.isSelected() || rbno332.isSelected() || rbno333.isSelected()){
            
              if((!rbno331.isSelected() && !rbsi331.isSelected()) || (!rbno332.isSelected() && !rbsi332.isSelected()) || (!rbno333.isSelected() && !rbsi333.isSelected()) 
       ){   
                
        }else{ 
            tr.setI331("");
            tr.setI331("no");
            tr.setA331("");
            tr.setA331("si");   }

        }
         // Item 34
         if(rbsi341.isSelected()){
            tr.setI341("");
            tr.setI341("si");
            tr.setA341("");
            tr.setA341("si");

        }

        if(rbno341.isSelected()){
            tr.setI341("");
            tr.setI341("no");
            tr.setA341("");
            tr.setA341("si");

        }

        // Item 35

          if(rbsi351.isSelected()){
            tr.setI351("");
            tr.setI351("si");
            tr.setA351("");
            tr.setA351("si");

        }

        if(rbno351.isSelected()){
            tr.setI351("");
            tr.setI351("no");
            tr.setA351("");
            tr.setA351("si");

        }
        // Item 36
           if(rbsi361.isSelected()){
            tr.setI361("");
            tr.setI361("si");
            tr.setA361("");
            tr.setA361("si");

        }

        if(rbno361.isSelected()){
            tr.setI361("");
            tr.setI361("no");
            tr.setA361("");
            tr.setA361("si");

        }

        // Item 37
          if(rbsi371.isSelected()){
            tr.setI371("");
            tr.setI371("si");
            tr.setA371("");
            tr.setA371("si");

        }

        if(rbno371.isSelected()){
            tr.setI371("");
            tr.setI371("no");
            tr.setA371("");
            tr.setA371("si");

        }
        
         // Item 38
          if(rbsi381.isSelected()){
            tr.setI381("");
            tr.setI381("si");
            tr.setA381("");
            tr.setA381("si");

        }

        if(rbno381.isSelected()){
            tr.setI381("");
            tr.setI381("no");
            tr.setA381("");
            tr.setA381("si");

        }
         // Item 39
           if(rbsi391.isSelected()){
            tr.setI391("");
            tr.setI391("si");
            tr.setA391("");
            tr.setA391("si");

        }

        if(rbno391.isSelected()){
            tr.setI391("");
            tr.setI391("no");
            tr.setA391("");
            tr.setA391("si");

        }
        
         // Item 40
           if(rbsi401.isSelected()){
            tr.setI401("");
            tr.setI401("si");
            tr.setA401("");
            tr.setA401("si");

        }

        if(rbno401.isSelected()){
            tr.setI401("");
            tr.setI401("no");
            tr.setA401("");
            tr.setA401("si");

        }
        
        Validar();

       

      


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
gh.setVisible(true);
gh.toFront();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        }catch(Exception e){
            
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_salud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadjnoitem23;
    private javax.swing.JButton btnadjnoitem24;
    private javax.swing.JButton btnadjnoitem25;
    private javax.swing.JButton btnadjnoitem26;
    private javax.swing.JButton btnadjnoitem27;
    private javax.swing.JButton btnadjnoitem28;
    private javax.swing.JButton btnadjnoitem29;
    private javax.swing.JButton btnadjnoitem30;
    private javax.swing.JButton btnadjnoitem31;
    private javax.swing.JButton btnadjnoitem32;
    private javax.swing.JButton btnadjnoitem33;
    private javax.swing.JButton btnadjnoitem34;
    private javax.swing.JButton btnadjnoitem35;
    private javax.swing.JButton btnadjnoitem36;
    private javax.swing.JButton btnadjnoitem37;
    private javax.swing.JButton btnadjnoitem38;
    private javax.swing.JButton btnadjnoitem39;
    private javax.swing.JButton btnadjnoitem40;
    private javax.swing.JButton btnmv231;
    private javax.swing.JButton btnmv241;
    private javax.swing.JButton btnmv242;
    private javax.swing.JButton btnmv251;
    private javax.swing.JButton btnmv261;
    private javax.swing.JButton btnmv262;
    private javax.swing.JButton btnmv263;
    private javax.swing.JButton btnmv271;
    private javax.swing.JButton btnmv281;
    private javax.swing.JButton btnmv282;
    private javax.swing.JButton btnmv291;
    private javax.swing.JButton btnmv301;
    private javax.swing.JButton btnmv311;
    private javax.swing.JButton btnmv321;
    private javax.swing.JButton btnmv331;
    private javax.swing.JButton btnmv332;
    private javax.swing.JButton btnmv333;
    private javax.swing.JButton btnmv341;
    private javax.swing.JButton btnmv351;
    private javax.swing.JButton btnmv361;
    private javax.swing.JButton btnmv371;
    private javax.swing.JButton btnmv381;
    private javax.swing.JButton btnmv391;
    private javax.swing.JButton btnmv401;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblcum23;
    private javax.swing.JLabel lblcum24;
    private javax.swing.JLabel lblcum25;
    private javax.swing.JLabel lblcum26;
    private javax.swing.JLabel lblcum27;
    private javax.swing.JLabel lblcum28;
    private javax.swing.JLabel lblcum29;
    private javax.swing.JLabel lblcum30;
    private javax.swing.JLabel lblcum31;
    private javax.swing.JLabel lblcum32;
    private javax.swing.JLabel lblcum33;
    private javax.swing.JLabel lblcum34;
    private javax.swing.JLabel lblcum35;
    private javax.swing.JLabel lblcum36;
    private javax.swing.JLabel lblcum37;
    private javax.swing.JLabel lblcum38;
    private javax.swing.JLabel lblcum39;
    private javax.swing.JLabel lblcum40;
    private javax.swing.JLabel lblnocum23;
    private javax.swing.JLabel lblnocum24;
    private javax.swing.JLabel lblnocum25;
    private javax.swing.JLabel lblnocum26;
    private javax.swing.JLabel lblnocum27;
    private javax.swing.JLabel lblnocum28;
    private javax.swing.JLabel lblnocum29;
    private javax.swing.JLabel lblnocum30;
    private javax.swing.JLabel lblnocum31;
    private javax.swing.JLabel lblnocum32;
    private javax.swing.JLabel lblnocum33;
    private javax.swing.JLabel lblnocum34;
    private javax.swing.JLabel lblnocum35;
    private javax.swing.JLabel lblnocum36;
    private javax.swing.JLabel lblnocum37;
    private javax.swing.JLabel lblnocum38;
    private javax.swing.JLabel lblnocum39;
    private javax.swing.JLabel lblnocum40;
    private javax.swing.JCheckBox noaplicaitem23;
    private javax.swing.JCheckBox noaplicaitem24;
    private javax.swing.JCheckBox noaplicaitem25;
    private javax.swing.JCheckBox noaplicaitem26;
    private javax.swing.JCheckBox noaplicaitem27;
    private javax.swing.JCheckBox noaplicaitem28;
    private javax.swing.JCheckBox noaplicaitem29;
    private javax.swing.JCheckBox noaplicaitem30;
    private javax.swing.JCheckBox noaplicaitem31;
    private javax.swing.JCheckBox noaplicaitem32;
    private javax.swing.JCheckBox noaplicaitem33;
    private javax.swing.JCheckBox noaplicaitem34;
    private javax.swing.JCheckBox noaplicaitem35;
    private javax.swing.JCheckBox noaplicaitem36;
    private javax.swing.JCheckBox noaplicaitem37;
    private javax.swing.JCheckBox noaplicaitem38;
    private javax.swing.JCheckBox noaplicaitem39;
    private javax.swing.JCheckBox noaplicaitem40;
    private javax.swing.JRadioButton rbjustiitem23;
    private javax.swing.JRadioButton rbjustiitem24;
    private javax.swing.JRadioButton rbjustiitem25;
    private javax.swing.JRadioButton rbjustiitem26;
    private javax.swing.JRadioButton rbjustiitem27;
    private javax.swing.JRadioButton rbjustiitem28;
    private javax.swing.JRadioButton rbjustiitem29;
    private javax.swing.JRadioButton rbjustiitem30;
    private javax.swing.JRadioButton rbjustiitem31;
    private javax.swing.JRadioButton rbjustiitem32;
    private javax.swing.JRadioButton rbjustiitem33;
    private javax.swing.JRadioButton rbjustiitem34;
    private javax.swing.JRadioButton rbjustiitem35;
    private javax.swing.JRadioButton rbjustiitem36;
    private javax.swing.JRadioButton rbjustiitem37;
    private javax.swing.JRadioButton rbjustiitem38;
    private javax.swing.JRadioButton rbjustiitem39;
    private javax.swing.JRadioButton rbjustiitem40;
    private javax.swing.JRadioButton rbno231;
    private javax.swing.JRadioButton rbno241;
    private javax.swing.JRadioButton rbno242;
    private javax.swing.JRadioButton rbno251;
    private javax.swing.JRadioButton rbno261;
    private javax.swing.JRadioButton rbno262;
    private javax.swing.JRadioButton rbno263;
    private javax.swing.JRadioButton rbno271;
    private javax.swing.JRadioButton rbno281;
    private javax.swing.JRadioButton rbno282;
    private javax.swing.JRadioButton rbno291;
    private javax.swing.JRadioButton rbno301;
    private javax.swing.JRadioButton rbno311;
    private javax.swing.JRadioButton rbno321;
    private javax.swing.JRadioButton rbno331;
    private javax.swing.JRadioButton rbno332;
    private javax.swing.JRadioButton rbno333;
    private javax.swing.JRadioButton rbno341;
    private javax.swing.JRadioButton rbno351;
    private javax.swing.JRadioButton rbno361;
    private javax.swing.JRadioButton rbno371;
    private javax.swing.JRadioButton rbno381;
    private javax.swing.JRadioButton rbno391;
    private javax.swing.JRadioButton rbno401;
    private javax.swing.JRadioButton rbnojustiitem23;
    private javax.swing.JRadioButton rbnojustiitem24;
    private javax.swing.JRadioButton rbnojustiitem25;
    private javax.swing.JRadioButton rbnojustiitem26;
    private javax.swing.JRadioButton rbnojustiitem27;
    private javax.swing.JRadioButton rbnojustiitem28;
    private javax.swing.JRadioButton rbnojustiitem29;
    private javax.swing.JRadioButton rbnojustiitem30;
    private javax.swing.JRadioButton rbnojustiitem31;
    private javax.swing.JRadioButton rbnojustiitem32;
    private javax.swing.JRadioButton rbnojustiitem33;
    private javax.swing.JRadioButton rbnojustiitem34;
    private javax.swing.JRadioButton rbnojustiitem35;
    private javax.swing.JRadioButton rbnojustiitem36;
    private javax.swing.JRadioButton rbnojustiitem37;
    private javax.swing.JRadioButton rbnojustiitem38;
    private javax.swing.JRadioButton rbnojustiitem39;
    private javax.swing.JRadioButton rbnojustiitem40;
    private javax.swing.JRadioButton rbsi231;
    private javax.swing.JRadioButton rbsi241;
    private javax.swing.JRadioButton rbsi242;
    private javax.swing.JRadioButton rbsi251;
    private javax.swing.JRadioButton rbsi261;
    private javax.swing.JRadioButton rbsi262;
    private javax.swing.JRadioButton rbsi263;
    private javax.swing.JRadioButton rbsi271;
    private javax.swing.JRadioButton rbsi281;
    private javax.swing.JRadioButton rbsi282;
    private javax.swing.JRadioButton rbsi291;
    private javax.swing.JRadioButton rbsi301;
    private javax.swing.JRadioButton rbsi311;
    private javax.swing.JRadioButton rbsi321;
    private javax.swing.JRadioButton rbsi331;
    private javax.swing.JRadioButton rbsi332;
    private javax.swing.JRadioButton rbsi333;
    private javax.swing.JRadioButton rbsi341;
    private javax.swing.JRadioButton rbsi351;
    private javax.swing.JRadioButton rbsi361;
    private javax.swing.JRadioButton rbsi371;
    private javax.swing.JRadioButton rbsi381;
    private javax.swing.JRadioButton rbsi391;
    private javax.swing.JRadioButton rbsi401;
    private javax.swing.JTextArea txtitem23;
    private javax.swing.JTextArea txtitem24;
    private javax.swing.JTextArea txtitem25;
    private javax.swing.JTextArea txtitem26;
    private javax.swing.JTextArea txtitem27;
    private javax.swing.JTextArea txtitem28;
    private javax.swing.JTextArea txtitem29;
    private javax.swing.JTextArea txtitem30;
    private javax.swing.JTextArea txtitem31;
    private javax.swing.JTextArea txtitem32;
    private javax.swing.JTextArea txtitem33;
    private javax.swing.JTextArea txtitem34;
    private javax.swing.JTextArea txtitem35;
    private javax.swing.JTextArea txtitem36;
    private javax.swing.JTextArea txtitem37;
    private javax.swing.JTextArea txtitem38;
    private javax.swing.JTextArea txtitem39;
    private javax.swing.JTextArea txtitem40;
    // End of variables declaration//GEN-END:variables
}
