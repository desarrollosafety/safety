/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Cevaluacion;
import Controlador.Cgestion_integral;
import Controlador.Crecursos;
import Modelo.Mevaluacion;
import Modelo.Mgestion_integral;
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
public class Gestion_integral extends javax.swing.JFrame {

      
    /**
     * Creates new form Gestion
     */
    public Gestion_integral() {

        initComponents();
         // inhabilitar botones minimizar, cerrar y maximizar
         getRootPane().setWindowDecorationStyle(JRootPane.NONE);
         this.setLocationRelativeTo(null);        
        
        /* Agrupacion de botones*/
        ButtonGroup rbnitem1 = new ButtonGroup();
        rbnitem1.add(rbjustiitem12);
        rbnitem1.add(rbnojustiitem12);

        ButtonGroup rbnitem2 = new ButtonGroup();
        rbnitem2.add(rbjustiitem13);
        rbnitem2.add(rbnojustiitem13);

        ButtonGroup rbnitem3 = new ButtonGroup();
        rbnitem3.add(rbjustiitem14);
        rbnitem3.add(rbnojustiitem14);

        ButtonGroup rbnitem4 = new ButtonGroup();
        rbnitem4.add(rbjustiitem15);
        rbnitem4.add(rbnojustiitem15);

        ButtonGroup rbnitem5 = new ButtonGroup();
        rbnitem5.add(rbjustiitem16);
        rbnitem5.add(rbnojustiitem16);

        ButtonGroup rbnitem6 = new ButtonGroup();
        rbnitem6.add(rbjustiitem17);
        rbnitem6.add(rbnojustiitem17);

        ButtonGroup rbnitem7 = new ButtonGroup();
        rbnitem7.add(rbjustiitem18);
        rbnitem7.add(rbnojustiitem18);

        ButtonGroup rbnitem8 = new ButtonGroup();
        rbnitem8.add(rbjustiitem19);
        rbnitem8.add(rbnojustiitem19);

        ButtonGroup rbnitem9 = new ButtonGroup();
        rbnitem9.add(rbjustiitem20);
        rbnitem9.add(rbnojustiitem20);

        ButtonGroup rbnitem10 = new ButtonGroup();
        rbnitem10.add(rbjustiitem21);
        rbnitem10.add(rbnojustiitem21);

        ButtonGroup rbnitem11 = new ButtonGroup();
        rbnitem11.add(rbjustiitem22);
        rbnitem11.add(rbnojustiitem22);

        ButtonGroup mv111 = new ButtonGroup();
        mv111.add(rbsi121);
        mv111.add(rbno121);

        ButtonGroup mv112 = new ButtonGroup();
        mv112.add(rbsi122);
        mv112.add(rbno122);

        ButtonGroup mv113 = new ButtonGroup();
        mv113.add(rbsi123);
        mv113.add(rbno123);

        ButtonGroup mv114 = new ButtonGroup();
        mv114.add(rbsi13);
        mv114.add(rbno131);

        ButtonGroup mv121 = new ButtonGroup();
        mv121.add(rbsi141);
        mv121.add(rbno141);

        ButtonGroup mv131 = new ButtonGroup();
        mv131.add(rbsi151);
        mv131.add(rbno151);

        ButtonGroup mv141 = new ButtonGroup();
        mv141.add(rbsi161);
        mv141.add(rbno161);

        ButtonGroup mv142 = new ButtonGroup();
        mv142.add(rbsi162);
        mv142.add(rbno162);

        ButtonGroup mv151 = new ButtonGroup();
        mv151.add(rbsi171);
        mv151.add(rbno171);

        ButtonGroup mv161 = new ButtonGroup();
        mv161.add(rbsi172);
        mv161.add(rbno172);

        ButtonGroup mv162 = new ButtonGroup();
        mv162.add(rbsi173);
        mv162.add(rbno173);

        ButtonGroup mv171 = new ButtonGroup();
        mv171.add(rbsi181);
        mv171.add(rbno181);

        ButtonGroup mv181 = new ButtonGroup();
        mv181.add(rbsi191);
        mv181.add(rbno191);

        ButtonGroup mv182 = new ButtonGroup();
        mv182.add(rbsi201);
        mv182.add(rbno201);

        ButtonGroup mv191 = new ButtonGroup();
        mv191.add(rbsi202);
        mv191.add(rbno202);

        ButtonGroup mv192 = new ButtonGroup();
        mv192.add(rbsi211);
        mv192.add(rbno211);

        ButtonGroup mv1101 = new ButtonGroup();
        mv1101.add(rbsi221);
        mv1101.add(rbno221);

        /* Metodo para inhanilitar botones y labeles*/
        noVisibles();
    }
    Mevaluacion ps = new Mevaluacion();
    Evaluacion_Ini gh= new Evaluacion_Ini();

    public void noVisibles() {
        rbjustiitem12.setEnabled(false);
        rbjustiitem13.setEnabled(false);
        rbjustiitem14.setEnabled(false);
        rbjustiitem15.setEnabled(false);
        rbjustiitem16.setEnabled(false);
        rbjustiitem17.setEnabled(false);
        rbjustiitem18.setEnabled(false);
        rbjustiitem19.setEnabled(false);
        rbjustiitem20.setEnabled(false);
        rbjustiitem21.setEnabled(false);
        rbjustiitem22.setEnabled(false);

        rbnojustiitem12.setEnabled(false);
        rbnojustiitem13.setEnabled(false);
        rbnojustiitem14.setEnabled(false);
        rbnojustiitem15.setEnabled(false);
        rbnojustiitem16.setEnabled(false);
        rbnojustiitem17.setEnabled(false);
        rbnojustiitem18.setEnabled(false);
        rbnojustiitem19.setEnabled(false);
        rbnojustiitem20.setEnabled(false);
        rbnojustiitem21.setEnabled(false);
        rbnojustiitem22.setEnabled(false);

        txtitem12.setEnabled(false);
        txtitem13.setEnabled(false);
        txtitem14.setEnabled(false);
        txtitem15.setEnabled(false);
        txtitem16.setEnabled(false);
        txtitem17.setEnabled(false);
        txtitem18.setEnabled(false);
        txtitem19.setEnabled(false);
        txtitem20.setEnabled(false);
        txtitem21.setEnabled(false);
        txtitem22.setEnabled(false);

        btnadjnoitem12.setEnabled(false);
        btnadjnoitem13.setEnabled(false);
        btnadjnoitem14.setEnabled(false);
        btnadjnoitem15.setEnabled(false);
        btnadjnoitem16.setEnabled(false);
        btnadjnoitem17.setEnabled(false);
        btnadjnoitem18.setEnabled(false);
        btnadjnoitem19.setEnabled(false);
        btnadjnoitem20.setEnabled(false);
        btnadjnoitem21.setEnabled(false);
        btnadjnoitem22.setEnabled(false);

        btnmv121.setEnabled(false);
        btnmv122.setEnabled(false);
        btnmv123.setEnabled(false);
        btnmv131.setEnabled(false);
        btnmv141.setEnabled(false);
        btnmv151.setEnabled(false);
        btnmv161.setEnabled(false);
        btnmv162.setEnabled(false);
        btnmv171.setEnabled(false);
        btnmv172.setEnabled(false);
        btnmv173.setEnabled(false);
        btnmv181.setEnabled(false);
        btnmv191.setEnabled(false);
        btnmv201.setEnabled(false);
        btnmv202.setEnabled(false);
        btnmv211.setEnabled(false);
        btnmv221.setEnabled(false);

        lblcum12.setEnabled(false);
        lblcum13.setEnabled(false);
        lblcum14.setEnabled(false);
        lblcum15.setEnabled(false);
        lblcum16.setEnabled(false);
        lblcum17.setEnabled(false);
        lblcum18.setEnabled(false);
        lblcum19.setEnabled(false);
        lblcum20.setEnabled(false);
        lblcum21.setEnabled(false);
        lblcum22.setEnabled(false);
        lblnocum12.setEnabled(false);
        lblnocum13.setEnabled(false);
        lblnocum14.setEnabled(false);
        lblnocum15.setEnabled(false);
        lblnocum16.setEnabled(false);
        lblnocum17.setEnabled(false);
        lblnocum18.setEnabled(false);
        lblnocum19.setEnabled(false);
        lblnocum20.setEnabled(false);
        lblnocum21.setEnabled(false);
        lblnocum22.setEnabled(false);

    }

    Mgestion_integral tr = new Mgestion_integral();
    Cevaluacion cm= new Cevaluacion();
      public void Validar (){
           Cgestion_integral func = new Cgestion_integral();
           
           
        
           
       
    if(tr.getI121().equals("")){
        
        JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI131().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.2 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI141().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.3 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI151().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.4 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI161().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.5 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI171().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.6 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI181().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.7 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI191().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.8 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI201().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.9 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI211().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.10 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI221().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E2.11 no se ha diligenciado correctamente ");
        
    }
    
    if(!tr.getI121().equals("") && !tr.getI131().equals("") && !tr.getI141().equals("") && !tr.getI151().equals("") && !tr.getI161().equals("") && !tr.getI171().equals("") 
            && !tr.getI181().equals("") && !tr.getI191().equals("") && !tr.getI201().equals("") && !tr.getI211().equals("") && !tr.getI221().equals("")){
     
        
    int dialogButton =JOptionPane.showConfirmDialog(null, "Esta seguro que desea guardar las respuesta diligenciadas en la evaluacion inicial,"
                                                        + " recuerde que si acepta no podra volver a diligenciar este formulario hasta que comience una nueva E. inicial ");
           if(dialogButton == JOptionPane.YES_OPTION){     
        
   func.insertarItem12(tr);
        func.insertarItem13(tr);
        func.insertarItem14(tr);
        func.insertarItem15(tr);
        func.insertarItem16(tr);
        func.insertarItem17(tr);
        func.insertarItem18(tr);
        func.insertarItem19(tr);
        func.insertarItem20(tr);
        func.insertarItem21(tr);

        if (func.insertarItem22(tr)) {
            JOptionPane.showMessageDialog(rootPane, "Se han registrado los items satisfactoriamente");

        } 
    
    // configurar botones y llenar el progress bar dinamicamente
       ps.setE2(1);
       cm.Puntaje();
      gh.punt= ps.getPunt();
       
       gh.config();
       int valo=15;
       ps.setBarra(ps.getBarra()+valo);
       this.dispose();
       gh.val=ps.getBarra();
        gh.empezar();
        
       cm.est_gestIntegral(ps);
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
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblnocum12 = new javax.swing.JLabel();
        lblcum12 = new javax.swing.JLabel();
        noaplicaitem12 = new javax.swing.JCheckBox();
        rbjustiitem12 = new javax.swing.JRadioButton();
        rbnojustiitem12 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtitem12 = new javax.swing.JTextArea();
        btnadjnoitem12 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        rbsi121 = new javax.swing.JRadioButton();
        rbno121 = new javax.swing.JRadioButton();
        btnmv121 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rbsi122 = new javax.swing.JRadioButton();
        rbno122 = new javax.swing.JRadioButton();
        btnmv122 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        rbsi123 = new javax.swing.JRadioButton();
        rbno123 = new javax.swing.JRadioButton();
        btnmv123 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblnocum13 = new javax.swing.JLabel();
        lblcum13 = new javax.swing.JLabel();
        noaplicaitem13 = new javax.swing.JCheckBox();
        rbjustiitem13 = new javax.swing.JRadioButton();
        rbnojustiitem13 = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtitem13 = new javax.swing.JTextArea();
        btnadjnoitem13 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rbsi13 = new javax.swing.JRadioButton();
        rbno131 = new javax.swing.JRadioButton();
        btnmv131 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblnocum14 = new javax.swing.JLabel();
        lblcum14 = new javax.swing.JLabel();
        noaplicaitem14 = new javax.swing.JCheckBox();
        rbjustiitem14 = new javax.swing.JRadioButton();
        rbnojustiitem14 = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtitem14 = new javax.swing.JTextArea();
        btnadjnoitem14 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        rbsi141 = new javax.swing.JRadioButton();
        rbno141 = new javax.swing.JRadioButton();
        btnmv141 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblnocum15 = new javax.swing.JLabel();
        lblcum15 = new javax.swing.JLabel();
        noaplicaitem15 = new javax.swing.JCheckBox();
        rbjustiitem15 = new javax.swing.JRadioButton();
        rbnojustiitem15 = new javax.swing.JRadioButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtitem15 = new javax.swing.JTextArea();
        btnadjnoitem15 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        rbsi151 = new javax.swing.JRadioButton();
        rbno151 = new javax.swing.JRadioButton();
        btnmv151 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lblnocum16 = new javax.swing.JLabel();
        lblcum16 = new javax.swing.JLabel();
        noaplicaitem16 = new javax.swing.JCheckBox();
        rbjustiitem16 = new javax.swing.JRadioButton();
        rbnojustiitem16 = new javax.swing.JRadioButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtitem16 = new javax.swing.JTextArea();
        btnadjnoitem16 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        rbsi161 = new javax.swing.JRadioButton();
        rbno161 = new javax.swing.JRadioButton();
        btnmv161 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        rbsi162 = new javax.swing.JRadioButton();
        rbno162 = new javax.swing.JRadioButton();
        btnmv162 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblnocum17 = new javax.swing.JLabel();
        lblcum17 = new javax.swing.JLabel();
        noaplicaitem17 = new javax.swing.JCheckBox();
        rbjustiitem17 = new javax.swing.JRadioButton();
        rbnojustiitem17 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtitem17 = new javax.swing.JTextArea();
        btnadjnoitem17 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rbsi171 = new javax.swing.JRadioButton();
        rbno171 = new javax.swing.JRadioButton();
        btnmv171 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        rbsi173 = new javax.swing.JRadioButton();
        rbno173 = new javax.swing.JRadioButton();
        btnmv173 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        rbsi172 = new javax.swing.JRadioButton();
        rbno172 = new javax.swing.JRadioButton();
        btnmv172 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        lblnocum18 = new javax.swing.JLabel();
        lblcum18 = new javax.swing.JLabel();
        noaplicaitem18 = new javax.swing.JCheckBox();
        rbjustiitem18 = new javax.swing.JRadioButton();
        rbnojustiitem18 = new javax.swing.JRadioButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtitem18 = new javax.swing.JTextArea();
        btnadjnoitem18 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        rbsi181 = new javax.swing.JRadioButton();
        rbno181 = new javax.swing.JRadioButton();
        btnmv181 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        lblnocum19 = new javax.swing.JLabel();
        lblcum19 = new javax.swing.JLabel();
        noaplicaitem19 = new javax.swing.JCheckBox();
        rbjustiitem19 = new javax.swing.JRadioButton();
        rbnojustiitem19 = new javax.swing.JRadioButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtitem19 = new javax.swing.JTextArea();
        btnadjnoitem19 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        rbsi191 = new javax.swing.JRadioButton();
        rbno191 = new javax.swing.JRadioButton();
        btnmv191 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        lblnocum20 = new javax.swing.JLabel();
        lblcum20 = new javax.swing.JLabel();
        noaplicaitem20 = new javax.swing.JCheckBox();
        rbjustiitem20 = new javax.swing.JRadioButton();
        rbnojustiitem20 = new javax.swing.JRadioButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtitem20 = new javax.swing.JTextArea();
        btnadjnoitem20 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        rbsi201 = new javax.swing.JRadioButton();
        rbno201 = new javax.swing.JRadioButton();
        btnmv201 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        rbsi202 = new javax.swing.JRadioButton();
        rbno202 = new javax.swing.JRadioButton();
        btnmv202 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        lblnocum21 = new javax.swing.JLabel();
        lblcum21 = new javax.swing.JLabel();
        noaplicaitem21 = new javax.swing.JCheckBox();
        rbjustiitem21 = new javax.swing.JRadioButton();
        rbnojustiitem21 = new javax.swing.JRadioButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtitem21 = new javax.swing.JTextArea();
        btnadjnoitem21 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        rbsi211 = new javax.swing.JRadioButton();
        rbno211 = new javax.swing.JRadioButton();
        btnmv211 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        lblnocum22 = new javax.swing.JLabel();
        lblcum22 = new javax.swing.JLabel();
        noaplicaitem22 = new javax.swing.JCheckBox();
        rbjustiitem22 = new javax.swing.JRadioButton();
        rbnojustiitem22 = new javax.swing.JRadioButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtitem22 = new javax.swing.JTextArea();
        btnadjnoitem22 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        rbsi221 = new javax.swing.JRadioButton();
        rbno221 = new javax.swing.JRadioButton();
        btnmv221 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.1\tPolítica de Seguridad y Salud en el Trabajo (1%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel4.setToolTipText("");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel13.setText("Modo de Verificación ");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel14.setText("Responsables del Sistema de Gestión de Seguridad y Salud en el trabajo");

        lblnocum12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem12.setText("No Aplica");
        noaplicaitem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem12ActionPerformed(evt);
            }
        });

        rbjustiitem12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem12.setText("Justifica");
        rbjustiitem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem12ActionPerformed(evt);
            }
        });

        rbnojustiitem12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem12.setText("No justifica");
        rbnojustiitem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem12ActionPerformed(evt);
            }
        });

        txtitem12.setColumns(20);
        txtitem12.setRows(5);
        txtitem12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem12KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtitem12);

        btnadjnoitem12.setText("Adjuntar Doc");
        btnadjnoitem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem12ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("1. Solicitar la política del Sistema de Gestión y Seguridad y Salud en el Trabajo (SG-SST),  de la empresa y confirmar  y solicitar que ");

        rbsi121.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi121.setText("Cumple");
        rbsi121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi121ActionPerformed(evt);
            }
        });

        rbno121.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno121.setText("No cumple");
        rbno121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno121ActionPerformed(evt);
            }
        });

        btnmv121.setText("Adjuntar Doc");
        btnmv121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv121ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("2. Validar para la revisión anual de la política como mínimo: Fecha de emisión firmada por el representante legal actual, ");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel17.setText(", que estén incluidos los requisitos normativos actuales o directrices de la empresa.");

        rbsi122.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi122.setText("Cumple");
        rbsi122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi122ActionPerformed(evt);
            }
        });

        rbno122.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno122.setText("No cumple");
        rbno122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno122ActionPerformed(evt);
            }
        });

        btnmv122.setText("Adjuntar Doc");
        btnmv122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv122ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel18.setText("3. Entrevistar a los miembros del Comité Paritario de Seguridad y Salud en el Trabajo o Vigía de Seguridad y Salud en el trabajo ");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel19.setText("para indagar el entendimiento de la política en Seguridad y Salud en el Trabajo como referencia preguntar:");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel20.setText("- Si conocen los peligros, evaluación y valoración de los riesgos y se establece los respectivos controles.");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel21.setText("- Si se realizan actividades de Promoción y Prevención.   ");

        rbsi123.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi123.setText("Cumple");
        rbsi123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi123ActionPerformed(evt);
            }
        });

        rbno123.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno123.setText("No cumple");
        rbno123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno123ActionPerformed(evt);
            }
        });

        btnmv123.setText("Adjuntar Doc");
        btnmv123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv123ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel22.setText("firmada, fechada y comunicada al COPASST/Vigía. (1%)");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel23.setText("que cumpla con los aspectos contenidos en el criterio.");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel24.setText("- Si la empresa aplica la normativa legal vigente en materia de riesgos laborales.");

        jButton13.setText("Criterio");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel20)
                            .addComponent(jLabel16)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel17))
                                    .addComponent(jLabel23)))
                            .addComponent(jLabel18))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(rbsi123)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno123)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(rbsi121)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbno121))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(rbsi122)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbno122)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24)))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(7, 7, 7)
                                .addComponent(jButton13)))
                        .addGap(18, 18, 18)
                        .addComponent(noaplicaitem12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbjustiitem12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnojustiitem12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmv121)
                    .addComponent(btnadjnoitem12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmv122)
                    .addComponent(btnmv123))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem12)
                        .addComponent(rbnojustiitem12)
                        .addComponent(noaplicaitem12))
                    .addComponent(btnadjnoitem12)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22)
                                        .addComponent(jButton13)))
                                .addComponent(lblnocum12)
                                .addComponent(lblcum12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(rbsi121)
                    .addComponent(rbno121)
                    .addComponent(btnmv121))
                .addGap(3, 3, 3)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsi122)
                    .addComponent(rbno122)
                    .addComponent(btnmv122)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsi123)
                    .addComponent(rbno123)
                    .addComponent(btnmv123)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(6, 6, 6)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.2\tObjetivos del Sistema de Gestión de Seguridad y Salud en el Trabajo SG-SST (1%) ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel6.setToolTipText("");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Modo de Verificación ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Objetivos definidos, claros, medibles, cuantificables, con metas documentados,");

        lblnocum13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem13.setText("No Aplica");
        noaplicaitem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem13ActionPerformed(evt);
            }
        });

        rbjustiitem13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem13.setText("Justifica");
        rbjustiitem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem13ActionPerformed(evt);
            }
        });

        rbnojustiitem13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem13.setText("No justifica");
        rbnojustiitem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem13ActionPerformed(evt);
            }
        });

        txtitem13.setColumns(20);
        txtitem13.setRows(5);
        txtitem13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem13KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(txtitem13);

        btnadjnoitem13.setText("Adjuntar Doc");
        btnadjnoitem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem13ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("1. Revisar si los objetivos se encuentran definidos, cumplen con las condiciones mencionadas en el criterio y existen evidencias del proceso ");

        rbsi13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi13.setText("Cumple");
        rbsi13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi13ActionPerformed(evt);
            }
        });

        rbno131.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno131.setText("No cumple");
        rbno131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno131ActionPerformed(evt);
            }
        });

        btnmv131.setText("Adjuntar Doc");
        btnmv131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv131ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setText("revisados del SG-SST. (1%)");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel25.setText("de difusión.");

        jButton14.setText("Criterio");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(rbsi13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbno131)
                        .addGap(192, 192, 192))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(7, 7, 7)
                                .addComponent(jButton14)))
                        .addGap(18, 18, 18)
                        .addComponent(noaplicaitem13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbjustiitem13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnojustiitem13))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmv131)
                    .addComponent(btnadjnoitem13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbjustiitem13)
                                .addComponent(rbnojustiitem13)
                                .addComponent(noaplicaitem13))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel12)
                                                .addComponent(jButton14)))
                                        .addComponent(lblnocum13)
                                        .addComponent(lblcum13))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnadjnoitem13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi13)
                            .addComponent(rbno131)
                            .addComponent(btnmv131))
                        .addGap(14, 14, 14)))
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.3Evaluación del Sistema de Gestión de Seguridad y Salud en el Trabajo (1%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel8.setToolTipText("");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Modo de Verificación ");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel27.setText("Evaluación e identificación de prioridad (1%)");

        lblnocum14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem14.setText("No Aplica");
        noaplicaitem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem14ActionPerformed(evt);
            }
        });

        rbjustiitem14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem14.setText("Justifica");
        rbjustiitem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem14ActionPerformed(evt);
            }
        });

        rbnojustiitem14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem14.setText("No justifica");
        rbnojustiitem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem14ActionPerformed(evt);
            }
        });

        txtitem14.setColumns(20);
        txtitem14.setRows(5);
        txtitem14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem14KeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(txtitem14);

        btnadjnoitem14.setText("Adjuntar Doc");
        btnadjnoitem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem14ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel28.setText("1. Solicitar la evaluación inicial del Sistema de Gestión de Salud y Salud en el Trabajo. Mediante la matriz de peligros, identificación de ");

        rbsi141.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi141.setText("Cumple");
        rbsi141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi141ActionPerformed(evt);
            }
        });

        rbno141.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno141.setText("No cumple");
        rbno141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno141ActionPerformed(evt);
            }
        });

        btnmv141.setText("Adjuntar Doc");
        btnmv141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv141ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel30.setText("amenazas, verificación de controles, reporte de peligros, lista de asistencia a capacitaciones,  análisis de puestos de trabajo, exámenes");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel31.setText("médicos iniciales y periódicos y seguimiento de indicadores entre otros.");

        jButton15.setText("Criterio");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(rbsi141)))
                .addGap(2, 2, 2)
                .addComponent(rbno141)
                .addGap(18, 18, 18)
                .addComponent(btnmv141)
                .addGap(83, 83, 83))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(18, 18, 18))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jButton15)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum14)
                                    .addComponent(lblcum14))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton15)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel9))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem14)
                        .addComponent(rbnojustiitem14)
                        .addComponent(noaplicaitem14))
                    .addComponent(btnadjnoitem14)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel30))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi141)
                        .addComponent(rbno141)
                        .addComponent(btnmv141)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.4Plan Anual de Trabajo (2%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel10.setToolTipText("");

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel33.setText("Modo de Verificación ");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel34.setText("Plan que identifica objetivos metas, responsabilidades, recursos con ");

        lblnocum15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem15.setText("No Aplica");
        noaplicaitem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem15ActionPerformed(evt);
            }
        });

        rbjustiitem15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem15.setText("Justifica");
        rbjustiitem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem15ActionPerformed(evt);
            }
        });

        rbnojustiitem15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem15.setText("No justifica");
        rbnojustiitem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem15ActionPerformed(evt);
            }
        });

        txtitem15.setColumns(20);
        txtitem15.setRows(5);
        txtitem15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem15KeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(txtitem15);

        btnadjnoitem15.setText("Adjuntar Doc");
        btnadjnoitem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem15ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel35.setText("1. Solicitar el plan de trabajo anual para alcanzar los objetivos propuestos en el Sistema de Gestión de Seguridad y Salud en el Trabajo,");

        rbsi151.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi151.setText("Cumple");
        rbsi151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi151ActionPerformed(evt);
            }
        });

        rbno151.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno151.setText("No cumple");
        rbno151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno151ActionPerformed(evt);
            }
        });

        btnmv151.setText("Adjuntar Doc");
        btnmv151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv151ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel37.setText("el cual identifica metas, responsabilidades, recursos, cronograma de actividades, firmado por el empleador y el responsable del siste- ");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel38.setText("ma Sistema de Gestión de Seguridad y Salud en el Trabajo. Verificar el cumplimiento del mismo. En caso de desviaciones en el ");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel39.setText("cronograma firmado (2%)");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel40.setText("cumplimiento, solicitar los planes de mejora para el logro del plan inicial.");

        jButton16.setText("Criterio");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(rbsi151)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbno151)
                .addGap(18, 18, 18)
                .addComponent(btnmv151, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addGap(18, 18, 18))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton16))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum15)
                            .addComponent(lblcum15)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(jButton16))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem15)
                        .addComponent(rbnojustiitem15)
                        .addComponent(noaplicaitem15))
                    .addComponent(btnadjnoitem15)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel37))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi151)
                        .addComponent(rbno151)
                        .addComponent(btnmv151)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel36)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel38)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addContainerGap(35, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.5Conservación de la documentación (2%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel12.setToolTipText("");

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel41.setText("Modo de Verificación ");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel42.setText("Archivo o retención documental del Sistema de Gestión de Seguridad y Salud ");

        lblnocum16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem16.setText("No Aplica");
        noaplicaitem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem16ActionPerformed(evt);
            }
        });

        rbjustiitem16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem16.setText("Justifica");
        rbjustiitem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem16ActionPerformed(evt);
            }
        });

        rbnojustiitem16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem16.setText("No justifica");
        rbnojustiitem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem16ActionPerformed(evt);
            }
        });

        txtitem16.setColumns(20);
        txtitem16.setRows(5);
        txtitem16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem16KeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(txtitem16);

        btnadjnoitem16.setText("Adjuntar Doc");
        btnadjnoitem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem16ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel43.setText("1. Constatar la existencia de un sistema de archivo o retención documental, para los registros y documentos que soportan el Sistema ");

        rbsi161.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi161.setText("Cumple");
        rbsi161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi161ActionPerformed(evt);
            }
        });

        rbno161.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno161.setText("No cumple");
        rbno161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno161ActionPerformed(evt);
            }
        });

        btnmv161.setText("Adjuntar Doc");
        btnmv161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv161ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel45.setText("de Gestión de Seguridad y Salud en el Trabajo.");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel46.setText("2. Verificar mediante muestreo que los registros y documentos sean legibles (Entendible para el lector objeto), fácilmente identificables");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel47.setText("Salud en el Trabajo SG-SST (2%)");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel48.setText("y accesibles (Para todos los que estén vinculados con cada documento en particular), protegidos contra daño de perdida.  ");

        rbsi162.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi162.setText("Cumple");
        rbsi162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi162ActionPerformed(evt);
            }
        });

        rbno162.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno162.setText("No cumple");
        rbno162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno162ActionPerformed(evt);
            }
        });

        btnmv162.setText("Adjuntar Doc");
        btnmv162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv162ActionPerformed(evt);
            }
        });

        jButton17.setText("Criterio");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(rbsi161)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbno161)
                .addGap(18, 18, 18)
                .addComponent(btnmv161)
                .addGap(97, 97, 97))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addGap(18, 18, 18))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem16)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem16, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbsi162)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbno162)
                .addGap(18, 18, 18)
                .addComponent(btnmv162)
                .addGap(97, 97, 97))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum16)
                            .addComponent(lblcum16)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel47)
                                    .addComponent(jButton17))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem16)
                        .addComponent(rbnojustiitem16)
                        .addComponent(noaplicaitem16))
                    .addComponent(btnadjnoitem16)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel45))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi161)
                        .addComponent(rbno161)
                        .addComponent(btnmv161)))
                .addGap(25, 25, 25)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(rbsi162)
                    .addComponent(rbno162)
                    .addComponent(btnmv162))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48)
                        .addContainerGap(36, Short.MAX_VALUE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.6Rendición de cuentas (1%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel2.setToolTipText("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Modo de Verificación ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Rendición sobre el desempeño (1%)");

        lblnocum17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem17.setText("No Aplica");
        noaplicaitem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem17ActionPerformed(evt);
            }
        });

        rbjustiitem17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem17.setText("Justifica");
        rbjustiitem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem17ActionPerformed(evt);
            }
        });

        rbnojustiitem17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem17.setText("No justifica");
        rbnojustiitem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem17ActionPerformed(evt);
            }
        });

        txtitem17.setColumns(20);
        txtitem17.setRows(5);
        txtitem17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem17KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtitem17);

        btnadjnoitem17.setText("Adjuntar Doc");
        btnadjnoitem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem17ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("1. Solicitar los registros documentales que evidencien la rendición de cuentas anual, al interior de la empresa. ");

        rbsi171.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi171.setText("Cumple");
        rbsi171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi171ActionPerformed(evt);
            }
        });

        rbno171.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno171.setText("No cumple");
        rbno171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno171ActionPerformed(evt);
            }
        });

        btnmv171.setText("Adjuntar Doc");
        btnmv171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv171ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("2. Solicitar a la empresa los mecanismos de rendición de cuentas que haya definido y verificar que se haga y se cumplan con");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel26.setText("3. La rendición de cuentas debe incluir todos los niveles de la empresa ya que en cada uno de ellos hay responsabilidades ");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel32.setText("sobre la Seguridad y Salud en el Trabajo.");

        rbsi173.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi173.setText("Cumple");
        rbsi173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi173ActionPerformed(evt);
            }
        });

        rbno173.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno173.setText("No cumple");
        rbno173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno173ActionPerformed(evt);
            }
        });

        btnmv173.setText("Adjuntar Doc");
        btnmv173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv173ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel49.setText("los criterios del requisito.");

        rbsi172.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi172.setText("Cumple");
        rbsi172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi172ActionPerformed(evt);
            }
        });

        rbno172.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno172.setText("No cumple");
        rbno172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno172ActionPerformed(evt);
            }
        });

        btnmv172.setText("Adjuntar Doc");
        btnmv172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv172ActionPerformed(evt);
            }
        });

        jButton18.setText("Criterio");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButton18)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem17)
                .addGap(4, 4, 4)
                .addComponent(rbjustiitem17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbnojustiitem17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(852, 852, 852)
                                .addComponent(jLabel4))
                            .addComponent(jLabel49)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbsi173)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno173)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(btnmv173))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbsi172)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno172)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnmv172))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi171)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno171)
                        .addGap(37, 37, 37)
                        .addComponent(btnmv171)))
                .addGap(78, 78, 78))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum17)
                            .addComponent(lblcum17)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(btnadjnoitem17)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem17)
                        .addComponent(rbnojustiitem17)
                        .addComponent(noaplicaitem17)))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsi171)
                    .addComponent(rbno171)
                    .addComponent(btnmv171)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbsi172)
                                .addComponent(rbno172)
                                .addComponent(btnmv172)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbsi173)
                                .addComponent(rbno173)
                                .addComponent(btnmv173)
                                .addComponent(jLabel32)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.7Normatividad nacional vigente y aplicable en materia de Seguridad y Salud en el Trabajo (2%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel18.setToolTipText("");

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel63.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel63.setText("Modo de Verificación ");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel64.setText("Matriz Legal (1%)");

        lblnocum18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem18.setText("No Aplica");
        noaplicaitem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem18ActionPerformed(evt);
            }
        });

        rbjustiitem18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem18.setText("Justifica");
        rbjustiitem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem18ActionPerformed(evt);
            }
        });

        rbnojustiitem18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem18.setText("No justifica");
        rbnojustiitem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem18ActionPerformed(evt);
            }
        });

        txtitem18.setColumns(20);
        txtitem18.setRows(5);
        txtitem18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem18KeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(txtitem18);

        btnadjnoitem18.setText("Adjuntar Doc");
        btnadjnoitem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem18ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel65.setText("1. Solicitar la matriz legal en la cual se contemple la legislación nacional vigente en materia de riesgos laborales.");

        rbsi181.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi181.setText("Cumple");
        rbsi181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi181ActionPerformed(evt);
            }
        });

        rbno181.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno181.setText("No cumple");
        rbno181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno181ActionPerformed(evt);
            }
        });

        btnmv181.setText("Adjuntar Doc");
        btnmv181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv181ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel67.setText("- Normas vigentes en riesgos laborales aplicables a la empresa.");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel68.setText("- Normas vigentes de diferentes entidades que le aplique.");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel69.setText("- Normas técnicas de cumplimiento de acuerdo con los peligros / riesgos identificados en la empresa.");

        jButton19.setText("Criterio");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(rbsi181)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbno181)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmv181)
                .addGap(109, 109, 109))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jButton19)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem18)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem18, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addGap(245, 245, 245)
                        .addComponent(jLabel66))
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum18)
                            .addComponent(lblcum18)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton19)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel63))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem18)
                        .addComponent(rbnojustiitem18)
                        .addComponent(noaplicaitem18))
                    .addComponent(btnadjnoitem18)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi181)
                        .addComponent(rbno181)
                        .addComponent(btnmv181)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel67)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel66)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.8Mecanismos De Comunicación (1%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel20.setToolTipText("");

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel70.setText("Modo de Verificación ");

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel71.setText("Mecanismos de Comunicación, auto reporte en Sistema de Gestión de Seguridad ");

        lblnocum19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem19.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem19.setText("No Aplica");
        noaplicaitem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem19ActionPerformed(evt);
            }
        });

        rbjustiitem19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem19.setText("Justifica");
        rbjustiitem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem19ActionPerformed(evt);
            }
        });

        rbnojustiitem19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem19.setText("No justifica");
        rbnojustiitem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem19ActionPerformed(evt);
            }
        });

        txtitem19.setColumns(20);
        txtitem19.setRows(5);
        txtitem19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem19KeyPressed(evt);
            }
        });
        jScrollPane12.setViewportView(txtitem19);

        btnadjnoitem19.setText("Adjuntar Doc");
        btnadjnoitem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem19ActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel72.setText("1. Consultar la existencia de mecanismos de comunicación interna y externa que tiene la empresa en materia de Salud y Seguridad ");

        rbsi191.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi191.setText("Cumple");
        rbsi191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi191ActionPerformed(evt);
            }
        });

        rbno191.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno191.setText("No cumple");
        rbno191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno191ActionPerformed(evt);
            }
        });

        btnmv191.setText("Adjuntar Doc");
        btnmv191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv191ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel74.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel74.setText("en el Trabajo y comprobar que las acciones que se desarrollaron para dar respuesta a las comunicaciones recibidas son eficaces.");

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel75.setText("y Salud en el Trabajo SG-SST (1%)");

        jButton20.setText("Criterio");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbsi191)
                .addGap(18, 18, 18)
                .addComponent(rbno191)
                .addGap(27, 27, 27)
                .addComponent(btnmv191)
                .addGap(55, 55, 55))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20))))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(noaplicaitem19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem19)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem19, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(852, 852, 852)
                .addComponent(jLabel73)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum19)
                            .addComponent(lblcum19)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel75)
                                    .addComponent(jButton20))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel70))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem19)
                        .addComponent(rbnojustiitem19)
                        .addComponent(noaplicaitem19))
                    .addComponent(btnadjnoitem19)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi191)
                        .addComponent(rbno191)
                        .addComponent(btnmv191)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74)
                .addGap(31, 31, 31)
                .addComponent(jLabel73)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.9Adquisiciones (1%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel22.setToolTipText("");

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel76.setText("Modo de Verificación ");

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel77.setText("Identificación, evaluación para adquisición de productos y servicios en Sistema de ");

        lblnocum20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem20.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem20.setText("No Aplica");
        noaplicaitem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem20ActionPerformed(evt);
            }
        });

        rbjustiitem20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem20.setText("Justifica");
        rbjustiitem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem20ActionPerformed(evt);
            }
        });

        rbnojustiitem20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem20.setText("No justifica");
        rbnojustiitem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem20ActionPerformed(evt);
            }
        });

        txtitem20.setColumns(20);
        txtitem20.setRows(5);
        txtitem20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem20KeyPressed(evt);
            }
        });
        jScrollPane13.setViewportView(txtitem20);

        btnadjnoitem20.setText("Adjuntar Doc");
        btnadjnoitem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem20ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel78.setText("1. Verificar el cumplimiento del procedimiento para la identificación y evaluación de las especificaciones en Seguridad y Salud ");

        rbsi201.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi201.setText("Cumple");
        rbsi201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi201ActionPerformed(evt);
            }
        });

        rbno201.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno201.setText("No cumple");
        rbno201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno201ActionPerformed(evt);
            }
        });

        btnmv201.setText("Adjuntar Doc");
        btnmv201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv201ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel80.setText("en el Trabajo de las compras o adquisición de productos, y servicios como por ejemplo los elementos de protección personal. ");

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel81.setText("Gestión y Salud en el Trabajo SG-SST.");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel82.setText("2. Verificar la existencia de la matriz de elementos de protección personal.");

        rbsi202.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi202.setText("Cumple");
        rbsi202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi202ActionPerformed(evt);
            }
        });

        rbno202.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno202.setText("No cumple");
        rbno202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno202ActionPerformed(evt);
            }
        });

        btnmv202.setText("Adjuntar Doc");
        btnmv202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv202ActionPerformed(evt);
            }
        });

        jButton21.setText("Criterio");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton21))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(noaplicaitem20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem20)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem20, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(394, 394, 394)
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi202)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno202)
                        .addGap(28, 28, 28)
                        .addComponent(btnmv202))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi201)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno201)
                        .addGap(36, 36, 36)
                        .addComponent(btnmv201)))
                .addGap(79, 79, 79))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum20)
                            .addComponent(lblcum20)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel81)
                                    .addComponent(jButton21))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel76))
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem20)
                        .addComponent(rbnojustiitem20)
                        .addComponent(noaplicaitem20))
                    .addComponent(btnadjnoitem20)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi201)
                        .addComponent(rbno201)
                        .addComponent(btnmv201)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel79)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbsi202)
                                .addComponent(rbno202)
                                .addComponent(btnmv202))
                            .addComponent(jLabel82))
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.10Contratación (2%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel24.setToolTipText("");

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel83.setText("Modo de Verificación ");

        jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel84.setText("Evaluación y selección de proveedores y contratistas.");

        lblnocum21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem21.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem21.setText("No Aplica");
        noaplicaitem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem21ActionPerformed(evt);
            }
        });

        rbjustiitem21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem21.setText("Justifica");
        rbjustiitem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem21ActionPerformed(evt);
            }
        });

        rbnojustiitem21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem21.setText("No justifica");
        rbnojustiitem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem21ActionPerformed(evt);
            }
        });

        txtitem21.setColumns(20);
        txtitem21.setRows(5);
        txtitem21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem21KeyPressed(evt);
            }
        });
        jScrollPane14.setViewportView(txtitem21);

        btnadjnoitem21.setText("Adjuntar Doc");
        btnadjnoitem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem21ActionPerformed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel85.setText("1. Constatar que para la selección y evaluación  de proveedores y/o contratistas, se valida que dichos proveedores o contratistas tienen");

        rbsi211.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi211.setText("Cumple");
        rbsi211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi211ActionPerformed(evt);
            }
        });

        rbno211.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno211.setText("No cumple");
        rbno211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno211ActionPerformed(evt);
            }
        });

        btnmv211.setText("Adjuntar Doc");
        btnmv211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv211ActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel87.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel87.setText("documentado e implementado el Sistema de Gestión de Seguridad y Salud en el Trabajo y que conocen los peligros/riesgos y la forma");

        jLabel88.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel88.setText("de controlarlos a la hora de ejecutar a realizar el servicio en la empresa donde prestan el servicio.");

        jButton22.setText("Criterio");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(rbsi211)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbno211)
                .addGap(39, 39, 39)
                .addComponent(btnmv211)
                .addGap(76, 76, 76))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jButton22)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem21)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem21, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(852, 852, 852)
                        .addComponent(jLabel86))
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum21)
                                    .addComponent(lblcum21))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton22)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel83))
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem21)
                        .addComponent(rbnojustiitem21)
                        .addComponent(noaplicaitem21))
                    .addComponent(btnadjnoitem21)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi211)
                        .addComponent(rbno211)
                        .addComponent(btnmv211)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel88)
                .addGap(14, 14, 14)
                .addComponent(jLabel86)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E2.11Gestión del cambio (1%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel26.setToolTipText("");

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel89.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel89.setText("Modo de Verificación ");

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel90.setText("Evaluación del impacto de cambios internos y externos en el Sistema de Gestión y ");

        lblnocum22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem22.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem22.setText("No Aplica");
        noaplicaitem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem22ActionPerformed(evt);
            }
        });

        rbjustiitem22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem22.setText("Justifica");
        rbjustiitem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem22ActionPerformed(evt);
            }
        });

        rbnojustiitem22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem22.setText("No justifica");
        rbnojustiitem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem22ActionPerformed(evt);
            }
        });

        txtitem22.setColumns(20);
        txtitem22.setRows(5);
        txtitem22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem22KeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(txtitem22);

        btnadjnoitem22.setText("Adjuntar Doc");
        btnadjnoitem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem22ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel91.setText("1. Solicitar el documento para evaluar el impacto sobre la Seguridad y Salud en el Trabajo  en cambios internos y externos que se presenten ");

        rbsi221.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi221.setText("Cumple");
        rbsi221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi221ActionPerformed(evt);
            }
        });

        rbno221.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno221.setText("No cumple");
        rbno221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno221ActionPerformed(evt);
            }
        });

        btnmv221.setText("Adjuntar Doc");
        btnmv221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv221ActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel93.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel93.setText("en la entidad.");

        jLabel94.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel94.setText("Seguridad y Salud en el Trabajo SG-SST.");

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

        jButton23.setText("Criterio");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbsi221)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbno221)
                .addGap(36, 36, 36)
                .addComponent(btnmv221)
                .addGap(79, 79, 79))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23))))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(noaplicaitem22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem22)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem22, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(852, 852, 852)
                        .addComponent(jLabel92))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addGap(530, 530, 530))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum22)
                            .addComponent(lblcum22)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel90)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel94)
                                    .addComponent(jButton23))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel89))
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem22)
                        .addComponent(rbnojustiitem22)
                        .addComponent(noaplicaitem22))
                    .addComponent(btnadjnoitem22)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi221)
                        .addComponent(rbno221)
                        .addComponent(btnmv221)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel92)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noaplicaitem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem12ActionPerformed

        if (noaplicaitem12.isSelected()) {
            rbsi121.setEnabled(false);
            rbno121.setEnabled(false);
            rbsi122.setEnabled(false);
            rbno122.setEnabled(false);
            rbsi123.setEnabled(false);
            rbno123.setEnabled(false);
            btnmv121.setEnabled(false);
            btnmv122.setEnabled(false);
            btnmv123.setEnabled(false);
            txtitem12.setEnabled(false);
            btnadjnoitem12.setEnabled(false);
            rbjustiitem12.setEnabled(true);
            rbnojustiitem12.setEnabled(true);
            tr.setI121("");

        } else {
            rbsi121.setEnabled(true);
            rbno121.setEnabled(true);
            rbsi122.setEnabled(true);
            rbno122.setEnabled(true);
            rbsi123.setEnabled(true);
            rbno123.setEnabled(true);
            btnmv121.setEnabled(false);
            btnmv122.setEnabled(false);
            btnmv123.setEnabled(false);
            txtitem12.setEnabled(false);
            btnadjnoitem12.setEnabled(false);
            rbjustiitem12.setEnabled(false);
            rbnojustiitem12.setEnabled(false);

        }


    }//GEN-LAST:event_noaplicaitem12ActionPerformed

    private void rbjustiitem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem12ActionPerformed

        txtitem12.setEnabled(true);
        tr.setI121("");

    }//GEN-LAST:event_rbjustiitem12ActionPerformed

    private void rbnojustiitem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem12ActionPerformed

        btnadjnoitem12.setEnabled(false);
        txtitem12.setEnabled(false);
        lblcum12.setEnabled(false);
        lblnocum12.setEnabled(true);
        tr.setI121("");
        tr.setI121("No");
        tr.setA121("");
        tr.setA121("Si");
        tr.setV121("");
        tr.setV121("No");
        tr.setV122("");
        tr.setV122("No");
        tr.setV123("");
        tr.setV123("No");
        tr.setJ121("");

    }//GEN-LAST:event_rbnojustiitem12ActionPerformed

    private void txtitem12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem12KeyPressed
        if (txtitem12.getText().length() > 2) {

            lblcum12.setEnabled(true);
            btnadjnoitem12.setEnabled(true);
            // inserta datos que cumple  

            tr.setI121("");
            tr.setI121("Si");
            tr.setA121("");
            tr.setA121("No");
            tr.setV121("no aplica");
            tr.setV122("no aplica");
            tr.setV123("no aplica");
            tr.setJ121("");
            tr.setJ121(txtitem12.getText());

        } else {
            tr.setJ121("");
            tr.setI121("");
            

            lblcum12.setEnabled(false);
            lblnocum12.setEnabled(false);
            btnadjnoitem12.setEnabled(false);
        }


    }//GEN-LAST:event_txtitem12KeyPressed

    private void btnadjnoitem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem12ActionPerformed
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
               tr.setId(12);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem12ActionPerformed

    private void rbsi121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi121ActionPerformed
        tr.setV121("");
        tr.setV121("Si");
        btnmv121.setEnabled(true);

        if (rbsi121.isSelected() && rbsi122.isSelected() && rbsi123.isSelected()) {
            lblcum12.setEnabled(true);
            lblnocum12.setEnabled(false);
        }


    }//GEN-LAST:event_rbsi121ActionPerformed

    private void rbno121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno121ActionPerformed
        tr.setV121("");
        tr.setV121("No");
        btnmv121.setEnabled(false);

        if (rbno121.isSelected() || rbno122.isSelected() || rbno123.isSelected()) {
            lblcum12.setEnabled(false);
            lblnocum12.setEnabled(true);
        }
    }//GEN-LAST:event_rbno121ActionPerformed

    private void btnmv121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv121ActionPerformed
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
               tr.setId(19);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv121ActionPerformed

    private void rbsi122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi122ActionPerformed
        tr.setV122("");
        tr.setV122("Si");
        btnmv122.setEnabled(true);

        if (rbsi121.isSelected() && rbsi122.isSelected() && rbsi123.isSelected()) {
            lblcum12.setEnabled(true);
            lblnocum12.setEnabled(false);
        }


    }//GEN-LAST:event_rbsi122ActionPerformed

    private void rbno122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno122ActionPerformed
        tr.setV122("");
        tr.setV122("No");
        btnmv122.setEnabled(false);

        if (rbno121.isSelected() || rbno122.isSelected() || rbno123.isSelected()) {
            lblcum12.setEnabled(false);
            lblnocum12.setEnabled(true);
        }
    }//GEN-LAST:event_rbno122ActionPerformed

    private void btnmv122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv122ActionPerformed
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
               tr.setId(20);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv122ActionPerformed

    private void rbsi123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi123ActionPerformed
        tr.setV123("");
        tr.setV123("Si");
        btnmv123.setEnabled(true);

        if (rbsi121.isSelected() && rbsi122.isSelected() && rbsi123.isSelected()) {
            lblcum12.setEnabled(true);
            lblnocum12.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi123ActionPerformed

    private void rbno123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno123ActionPerformed
        tr.setV123("");
        tr.setV123("No");
        btnmv123.setEnabled(false);

        if (rbno121.isSelected() || rbno122.isSelected() || rbno123.isSelected()) {
            lblcum12.setEnabled(false);
            lblnocum12.setEnabled(true);
        }

    }//GEN-LAST:event_rbno123ActionPerformed

    private void btnmv123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv123ActionPerformed
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
               tr.setId(21);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv123ActionPerformed

    private void noaplicaitem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem13ActionPerformed
        if (noaplicaitem13.isSelected()) {
            rbsi13.setEnabled(false);
            rbno131.setEnabled(false);
            btnmv131.setEnabled(false);
            txtitem13.setEnabled(false);
            btnadjnoitem13.setEnabled(false);
            rbjustiitem13.setEnabled(true);
            rbnojustiitem13.setEnabled(true);
             tr.setI131("");

        } else {
            rbsi13.setEnabled(true);
            rbno131.setEnabled(true);
            btnmv131.setEnabled(false);
            txtitem13.setEnabled(false);
            btnadjnoitem13.setEnabled(false);
            rbjustiitem13.setEnabled(false);
            rbnojustiitem13.setEnabled(false);

        }


    }//GEN-LAST:event_noaplicaitem13ActionPerformed

    private void rbjustiitem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem13ActionPerformed
        txtitem13.setEnabled(true);
         tr.setI131("");
    }//GEN-LAST:event_rbjustiitem13ActionPerformed

    private void rbnojustiitem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem13ActionPerformed

        btnadjnoitem13.setEnabled(false);
        txtitem13.setEnabled(false);
        lblcum13.setEnabled(false);
        lblnocum13.setEnabled(true);
        tr.setI131("");
        tr.setI131("No");
        tr.setA131("");
        tr.setA131("Si");
        tr.setV131("");
        tr.setV131("No");
        tr.setJ131("");


    }//GEN-LAST:event_rbnojustiitem13ActionPerformed

    private void txtitem13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem13KeyPressed
        if (txtitem13.getText().length() > 2) {
            lblcum13.setEnabled(true);
            btnadjnoitem13.setEnabled(true);
            // inserta datos que cumple  
            tr.setI131("");
            tr.setI131("Si");
            tr.setA131("");
            tr.setA131("No");
            tr.setV131("");
            tr.setV131("no aplica");
            tr.setA131("No");
            tr.setJ131("");
            tr.setJ131(txtitem13.getText());

        } else {
            tr.setJ131("");
            tr.setI131("");
            
            lblcum13.setEnabled(false);
            lblnocum13.setEnabled(false);
            btnadjnoitem13.setEnabled(false);
        }


    }//GEN-LAST:event_txtitem13KeyPressed

    private void btnadjnoitem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem13ActionPerformed
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
               tr.setId(13);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem13ActionPerformed

    private void rbsi13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi13ActionPerformed
        tr.setV131("");
        tr.setV131("Si");
        btnmv131.setEnabled(true);

        if (rbsi13.isSelected()) {
            lblcum13.setEnabled(true);
            lblnocum13.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi13ActionPerformed

    private void rbno131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno131ActionPerformed
        tr.setV131("");
        tr.setV131("No");
        btnmv131.setEnabled(false);

        if (rbno131.isSelected()) {
            lblcum13.setEnabled(false);
            lblnocum13.setEnabled(true);
        }

    }//GEN-LAST:event_rbno131ActionPerformed

    private void btnmv131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv131ActionPerformed
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
               tr.setId(22);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }

    }//GEN-LAST:event_btnmv131ActionPerformed

    private void noaplicaitem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem14ActionPerformed

        if (noaplicaitem14.isSelected()) {
            rbsi141.setEnabled(false);
            rbno141.setEnabled(false);
            btnmv141.setEnabled(false);
            txtitem14.setEnabled(false);
            btnadjnoitem14.setEnabled(false);
            rbjustiitem14.setEnabled(true);
            rbnojustiitem14.setEnabled(true);
             tr.setI141("");

        } else {
            rbsi141.setEnabled(true);
            rbno141.setEnabled(true);
            btnmv141.setEnabled(false);
            txtitem14.setEnabled(false);
            btnadjnoitem14.setEnabled(false);
            rbjustiitem14.setEnabled(false);
            rbnojustiitem14.setEnabled(false);

        }

    }//GEN-LAST:event_noaplicaitem14ActionPerformed

    private void rbjustiitem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem14ActionPerformed
        txtitem14.setEnabled(true);
         tr.setI141("");
    }//GEN-LAST:event_rbjustiitem14ActionPerformed

    private void rbnojustiitem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem14ActionPerformed

        btnadjnoitem14.setEnabled(false);
        txtitem14.setEnabled(false);
        lblcum14.setEnabled(false);
        lblnocum14.setEnabled(true);
        tr.setI141("");
        tr.setI141("No");
        tr.setA141("");
        tr.setA141("Si");
        tr.setV141("");
        tr.setV141("No");
        tr.setJ141("");

    }//GEN-LAST:event_rbnojustiitem14ActionPerformed

    private void txtitem14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem14KeyPressed

        if (txtitem14.getText().length() > 2) {
            lblcum14.setEnabled(true);
            btnadjnoitem14.setEnabled(true);
            // inserta datos que cumple  
            tr.setI141("");
            tr.setI141("Si");
            tr.setA141("");
            tr.setA141("No");
            tr.setV141("");
            tr.setV141("no aplica");
            tr.setA141("No");
            tr.setJ141("");
            tr.setJ141(txtitem14.getText());

        } else {
            tr.setJ141("");
            tr.setI141("");
            
            lblcum14.setEnabled(false);
            lblnocum14.setEnabled(false);
            btnadjnoitem14.setEnabled(false);
        }

    }//GEN-LAST:event_txtitem14KeyPressed

    private void btnadjnoitem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem14ActionPerformed
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
               tr.setId(14);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem14ActionPerformed

    private void rbsi141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi141ActionPerformed
        tr.setV141("");
        tr.setV141("Si");
        btnmv141.setEnabled(true);

        if (rbsi141.isSelected()) {
            lblcum14.setEnabled(true);
            lblnocum14.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi141ActionPerformed

    private void rbno141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno141ActionPerformed

        tr.setV141("");
        tr.setV141("No");
        btnmv141.setEnabled(false);

        if (rbno141.isSelected()) {
            lblcum14.setEnabled(false);
            lblnocum14.setEnabled(true);
        }
    }//GEN-LAST:event_rbno141ActionPerformed

    private void btnmv141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv141ActionPerformed
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
               tr.setId(23);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv141ActionPerformed

    private void noaplicaitem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem15ActionPerformed
        if (noaplicaitem15.isSelected()) {
            rbsi151.setEnabled(false);
            rbno151.setEnabled(false);
            btnmv151.setEnabled(false);
            txtitem15.setEnabled(false);
            btnadjnoitem15.setEnabled(false);
            rbjustiitem15.setEnabled(true);
            rbnojustiitem15.setEnabled(true);
            tr.setI151("");

        } else {
            rbsi151.setEnabled(true);
            rbno151.setEnabled(true);
            btnmv151.setEnabled(false);
            txtitem15.setEnabled(false);
            btnadjnoitem15.setEnabled(false);
            rbjustiitem15.setEnabled(false);
            rbnojustiitem15.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem15ActionPerformed

    private void rbjustiitem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem15ActionPerformed
        txtitem15.setEnabled(true);
        tr.setI151("");
    }//GEN-LAST:event_rbjustiitem15ActionPerformed

    private void rbnojustiitem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem15ActionPerformed
        btnadjnoitem15.setEnabled(false);
        txtitem15.setEnabled(false);
        lblcum15.setEnabled(false);
        lblnocum15.setEnabled(true);
        tr.setI151("");
        tr.setI151("No");
        tr.setA151("");
        tr.setA151("Si");
        tr.setV151("");
        tr.setV151("No");
        tr.setJ151("");

    }//GEN-LAST:event_rbnojustiitem15ActionPerformed

    private void txtitem15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem15KeyPressed
        if (txtitem15.getText().length() > 2) {
            lblcum15.setEnabled(true);
            btnadjnoitem15.setEnabled(true);
            // inserta datos que cumple  
            tr.setI151("");
            tr.setI151("Si");
            tr.setA151("");
            tr.setA151("No");
            tr.setV151("");
            tr.setV151("no aplica");
            tr.setA151("No");
            tr.setJ151("");
            tr.setJ151(txtitem15.getText());

        } else {
            tr.setJ151("");
            tr.setI151("");
            
            lblcum15.setEnabled(false);
            lblnocum15.setEnabled(false);
            btnadjnoitem15.setEnabled(false);
        }
    }//GEN-LAST:event_txtitem15KeyPressed

    private void btnadjnoitem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem15ActionPerformed
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
               tr.setId(15);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem15ActionPerformed

    private void rbsi151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi151ActionPerformed
        tr.setV151("");
        tr.setV151("Si");
        btnmv151.setEnabled(true);

        if (rbsi151.isSelected()) {
            lblcum15.setEnabled(true);
            lblnocum15.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi151ActionPerformed

    private void rbno151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno151ActionPerformed
        tr.setV151("");
        tr.setV151("No");
        btnmv151.setEnabled(false);

        if (rbno151.isSelected()) {
            lblcum15.setEnabled(false);
            lblnocum15.setEnabled(true);
        }
    }//GEN-LAST:event_rbno151ActionPerformed

    private void btnmv151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv151ActionPerformed
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
               tr.setId(24);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv151ActionPerformed

    private void noaplicaitem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem16ActionPerformed
        if (noaplicaitem16.isSelected()) {
            rbsi161.setEnabled(false);
            rbno161.setEnabled(false);
            rbsi162.setEnabled(false);
            rbno162.setEnabled(false);
            btnmv161.setEnabled(false);
            btnmv162.setEnabled(false);
            txtitem16.setEnabled(false);
            btnadjnoitem16.setEnabled(false);
            rbjustiitem16.setEnabled(true);
            rbnojustiitem16.setEnabled(true);
            tr.setI161("");

        } else {
            rbsi161.setEnabled(true);
            rbno161.setEnabled(true);
            rbsi162.setEnabled(true);
            rbno162.setEnabled(true);
            btnmv161.setEnabled(false);
            btnmv162.setEnabled(false);
            txtitem16.setEnabled(false);
            btnadjnoitem16.setEnabled(false);
            rbjustiitem16.setEnabled(false);
            rbnojustiitem16.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem16ActionPerformed

    private void rbjustiitem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem16ActionPerformed
        txtitem16.setEnabled(true);
        tr.setI161("");
    }//GEN-LAST:event_rbjustiitem16ActionPerformed

    private void rbnojustiitem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem16ActionPerformed
        btnadjnoitem16.setEnabled(false);
        txtitem16.setEnabled(false);
        lblcum16.setEnabled(false);
        lblnocum16.setEnabled(true);
        tr.setI161("");
        tr.setI161("No");
        tr.setA161("");
        tr.setA161("Si");
        tr.setV161("");
        tr.setV161("No");
        tr.setV162("");
        tr.setV162("No");
        tr.setJ161("");
    }//GEN-LAST:event_rbnojustiitem16ActionPerformed

    private void txtitem16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem16KeyPressed
        if (txtitem16.getText().length() > 2) {

            lblcum16.setEnabled(true);
            btnadjnoitem16.setEnabled(true);
            // inserta datos que cumple  

            tr.setI161("");
            tr.setI161("Si");
            tr.setA161("");
            tr.setA161("No");
            tr.setV161("");
            tr.setV161("no aplica");
            tr.setV162("");
            tr.setV162("no aplica");
            tr.setJ161("");
            tr.setJ161(txtitem16.getText());

        } else {
            tr.setJ161("");
            tr.setI161("");
           
            lblcum16.setEnabled(false);
            lblnocum16.setEnabled(false);
            btnadjnoitem16.setEnabled(false);
        }


    }//GEN-LAST:event_txtitem16KeyPressed

    private void btnadjnoitem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem16ActionPerformed
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
               tr.setId(16);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem16ActionPerformed

    private void rbsi161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi161ActionPerformed
     tr.setV161("");
        tr.setV161("Si");
        btnmv161.setEnabled(true);
        
        if(rbsi161.isSelected() && rbsi162.isSelected()){
            lblcum16.setEnabled(true);
            lblnocum16.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi161ActionPerformed

    private void rbno161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno161ActionPerformed
         tr.setV161("");
        tr.setV161("No");
        btnmv161.setEnabled(false);
        
        if(rbno161.isSelected() || rbno162.isSelected() ){
            lblcum16.setEnabled(false);
            lblnocum16.setEnabled(true);
        }
    }//GEN-LAST:event_rbno161ActionPerformed

    private void btnmv161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv161ActionPerformed
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
               tr.setId(25);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv161ActionPerformed

    private void rbsi162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi162ActionPerformed
    tr.setV162("");
        tr.setV162("Si");
        btnmv162.setEnabled(true);
        
        if(rbsi161.isSelected() && rbsi162.isSelected()){
            lblcum16.setEnabled(true);
            lblnocum16.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi162ActionPerformed

    private void rbno162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno162ActionPerformed
    tr.setV162("");
        tr.setV162("No");
        btnmv161.setEnabled(false);
        
        if(rbno161.isSelected() || rbno162.isSelected() ){
            lblcum16.setEnabled(false);
            lblnocum16.setEnabled(true);
        }
    }//GEN-LAST:event_rbno162ActionPerformed

    private void btnmv162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv162ActionPerformed
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
               tr.setId(26);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv162ActionPerformed

    private void noaplicaitem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem17ActionPerformed

       if(noaplicaitem17.isSelected()){
        rbsi171.setEnabled(false);
        rbno171.setEnabled(false);
         rbsi172.setEnabled(false);
        rbno172.setEnabled(false);
         rbsi173.setEnabled(false);
        rbno173.setEnabled(false);
        btnmv171.setEnabled(false);
        btnmv172.setEnabled(false);
        btnmv173.setEnabled(false);
        txtitem17.setEnabled(false);
          btnadjnoitem17.setEnabled(false);
          rbjustiitem17.setEnabled(true);
          rbnojustiitem17.setEnabled(true);
          
          tr.setI171("");
        
        }else{
          rbsi171.setEnabled(true);
        rbno171.setEnabled(true);
         rbsi172.setEnabled(true);
        rbno172.setEnabled(true);
         rbsi173.setEnabled(true);
        rbno173.setEnabled(true);
        btnmv171.setEnabled(false);
        btnmv172.setEnabled(false);
        btnmv173.setEnabled(false);
        txtitem17.setEnabled(false);
          btnadjnoitem17.setEnabled(false);
          rbjustiitem17.setEnabled(false);
          rbnojustiitem17.setEnabled(false);  
            
            
        }

        
    }//GEN-LAST:event_noaplicaitem17ActionPerformed

    private void rbjustiitem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem17ActionPerformed

        tr.setI171("");
       txtitem17.setEnabled(true);
    }//GEN-LAST:event_rbjustiitem17ActionPerformed

    private void rbnojustiitem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem17ActionPerformed
    
 btnadjnoitem17.setEnabled(false);
        txtitem17.setEnabled(false);
        lblcum17.setEnabled(false);
        lblnocum17.setEnabled(true);
         tr.setI171("");
        tr.setI171("No");
        tr.setA171("");
        tr.setA171("Si");
        tr.setV171("");
        tr.setV171("No");
        tr.setV172("");
        tr.setV172("No");
        tr.setV173("");
        tr.setV173("No");
        tr.setJ171("");
    }//GEN-LAST:event_rbnojustiitem17ActionPerformed

    private void txtitem17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem17KeyPressed

      if(txtitem17.getText().length()>2){
       
       lblcum17.setEnabled(true);
       btnadjnoitem17.setEnabled(true);
     // inserta datos que cumple  
     
    
       tr.setI171("");
       tr.setI171("Si");
       tr.setA171("");
       tr.setA171("No");
       tr.setV171("");
       tr.setV171("no aplica");
       tr.setV172("");
       tr.setV172("no aplica");
       tr.setV173("");
       tr.setV173("no aplica");
       tr.setJ171("");
       tr.setJ171(txtitem17.getText());
       
       
   }else{
        tr.setJ171("");
            tr.setI171("");
               
            lblcum17.setEnabled(false);
            lblnocum17.setEnabled(false);
            btnadjnoitem17.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem17KeyPressed

    private void btnadjnoitem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem17ActionPerformed
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
               tr.setId(17);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }


    }//GEN-LAST:event_btnadjnoitem17ActionPerformed

    private void rbsi171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi171ActionPerformed
       tr.setV171("");
        tr.setV171("Si");
        btnmv171.setEnabled(true);
        
        if(rbsi171.isSelected() && rbsi172.isSelected() && rbsi173.isSelected()){
            lblcum17.setEnabled(true);
            lblnocum17.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi171ActionPerformed

    private void rbno171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno171ActionPerformed
     tr.setV171("");
        tr.setV171("No");
        btnmv171.setEnabled(false);
        
        if(rbno171.isSelected() || rbno172.isSelected() || rbno173.isSelected()){
            lblcum17.setEnabled(false);
            lblnocum17.setEnabled(true);
        }
    }//GEN-LAST:event_rbno171ActionPerformed

    private void btnmv171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv171ActionPerformed
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
               tr.setId(27);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv171ActionPerformed

    private void rbsi173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi173ActionPerformed
     tr.setV173("");
        tr.setV173("Si");
        btnmv173.setEnabled(true);
        
        if(rbsi171.isSelected() && rbsi172.isSelected() && rbsi173.isSelected()){
            lblcum17.setEnabled(true);
            lblnocum17.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi173ActionPerformed

    private void rbno173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno173ActionPerformed
       tr.setV173("");
        tr.setV173("No");
        btnmv172.setEnabled(false);
        
        if(rbno171.isSelected() || rbno172.isSelected() || rbno173.isSelected()){
            lblcum17.setEnabled(false);
            lblnocum17.setEnabled(true);
        }
    }//GEN-LAST:event_rbno173ActionPerformed

    private void btnmv173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv173ActionPerformed
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
               tr.setId(29);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv173ActionPerformed

    private void rbsi172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi172ActionPerformed
        tr.setV172("");
        tr.setV172("Si");
        btnmv172.setEnabled(true);
        
        if(rbsi171.isSelected() && rbsi172.isSelected() && rbsi173.isSelected()){
            lblcum17.setEnabled(true);
            lblnocum17.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi172ActionPerformed

    private void rbno172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno172ActionPerformed
      tr.setV172("");
        tr.setV172("No");
        btnmv172.setEnabled(false);
        
        if(rbno171.isSelected() || rbno172.isSelected() || rbno173.isSelected()){
            lblcum17.setEnabled(false);
            lblnocum17.setEnabled(true);
        }
        
    }//GEN-LAST:event_rbno172ActionPerformed

    private void btnmv172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv172ActionPerformed
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
               tr.setId(28);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv172ActionPerformed

    private void noaplicaitem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem18ActionPerformed
      if(noaplicaitem18.isSelected()){
        rbsi181.setEnabled(false);
        rbno181.setEnabled(false);
        btnmv181.setEnabled(false);
        txtitem18.setEnabled(false);
        btnadjnoitem18.setEnabled(false);
         rbjustiitem18.setEnabled(true);
          rbnojustiitem18.setEnabled(true);
          tr.setI181("");
        
        }else{
          rbsi181.setEnabled(true);
        rbno181.setEnabled(true);
        btnmv181.setEnabled(false);
        txtitem18.setEnabled(false);
        btnadjnoitem18.setEnabled(false);
          rbjustiitem18.setEnabled(false);
          rbnojustiitem18.setEnabled(false);
            
            
        }  
    }//GEN-LAST:event_noaplicaitem18ActionPerformed

    private void rbjustiitem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem18ActionPerformed
       tr.setI181("");
        txtitem18.setEnabled(true);
        
        
    }//GEN-LAST:event_rbjustiitem18ActionPerformed

    private void rbnojustiitem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem18ActionPerformed
        btnadjnoitem18.setEnabled(false);
        txtitem18.setEnabled(false);
        lblcum18.setEnabled(false);
        lblnocum18.setEnabled(true);
         tr.setI181("");
        tr.setI181("No");
        tr.setA181("");
        tr.setA181("Si");
        tr.setV181("");
        tr.setV181("No");
        tr.setJ181("");

    }//GEN-LAST:event_rbnojustiitem18ActionPerformed

    private void txtitem18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem18KeyPressed
      if(txtitem18.getText().length()>2){        
        lblcum18.setEnabled(true);
       btnadjnoitem18.setEnabled(true);
     // inserta datos que cumple  
       tr.setI181("");
       tr.setI181("Si");
       tr.setA181("");
       tr.setA181("No");
       tr.setV181("");
       tr.setV181("no aplica");
       tr.setA181("No");
       tr.setJ181("");
       tr.setJ181(txtitem18.getText());
       
       
   }else{
        tr.setJ181("");
        tr.setI181("");
               
        
            lblcum18.setEnabled(false);
            lblnocum18.setEnabled(false);
            btnadjnoitem18.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem18KeyPressed

    private void btnadjnoitem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem18ActionPerformed
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
               tr.setId(18);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
        
        
        
        
    }//GEN-LAST:event_btnadjnoitem18ActionPerformed

    private void rbsi181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi181ActionPerformed
      tr.setV181("");
 tr.setV181("Si");
 btnmv181.setEnabled(true);
        
        if(rbsi181.isSelected()){
            lblcum18.setEnabled(true);
            lblnocum18.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi181ActionPerformed

    private void rbno181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno181ActionPerformed
    tr.setV181("");
        tr.setV181("No");
        btnmv181.setEnabled(false);
        
        if(rbno181.isSelected()){
            lblcum18.setEnabled(false);
            lblnocum18.setEnabled(true);
        }
    }//GEN-LAST:event_rbno181ActionPerformed

    private void btnmv181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv181ActionPerformed
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
               tr.setId(30);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv181ActionPerformed

    private void noaplicaitem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem19ActionPerformed
 if(noaplicaitem19.isSelected()){
        rbsi191.setEnabled(false);
        rbno191.setEnabled(false);
        btnmv191.setEnabled(false);
       txtitem19.setEnabled(false);
        btnadjnoitem19.setEnabled(false);
         rbjustiitem19.setEnabled(true);
          rbnojustiitem19.setEnabled(true);
           tr.setI191("");
        
        }else{
          rbsi191.setEnabled(true);
        rbno191.setEnabled(true);
        btnmv191.setEnabled(false);
        txtitem19.setEnabled(false);
        btnadjnoitem19.setEnabled(false);
         rbjustiitem19.setEnabled(false);
          rbnojustiitem19.setEnabled(false);
            
            
        }       
        
    }//GEN-LAST:event_noaplicaitem19ActionPerformed

    private void rbjustiitem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem19ActionPerformed
      txtitem19.setEnabled(true);
       tr.setI191("");
    }//GEN-LAST:event_rbjustiitem19ActionPerformed

    private void rbnojustiitem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem19ActionPerformed
       btnadjnoitem19.setEnabled(false);
        txtitem19.setEnabled(false);
        lblcum19.setEnabled(false);
        lblnocum19.setEnabled(true);
         tr.setI191("");
        tr.setI191("No");
        tr.setA191("");
        tr.setA191("Si");
        tr.setV191("");
        tr.setV191("No");
        tr.setJ191("");
    }//GEN-LAST:event_rbnojustiitem19ActionPerformed

    private void txtitem19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem19KeyPressed
      if(txtitem19.getText().length()>2){        
        lblcum19.setEnabled(true);
       btnadjnoitem19.setEnabled(true);
     // inserta datos que cumple  
       tr.setI191("");
       tr.setI191("Si");
       tr.setA191("");
       tr.setA191("No");
       tr.setV191("");
       tr.setV191("no aplica");
       tr.setA191("No");
       tr.setJ191("");
       tr.setJ191(txtitem19.getText());
       
       
   }else{
        tr.setJ191("");
        tr.setI191("");
              
        
            lblcum19.setEnabled(false);
            lblnocum19.setEnabled(false);
            btnadjnoitem19.setEnabled(false);
   }
        
        
    }//GEN-LAST:event_txtitem19KeyPressed

    private void btnadjnoitem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem19ActionPerformed
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
               tr.setId(19);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem19ActionPerformed

    private void rbsi191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi191ActionPerformed
     tr.setV191("");
 tr.setV191("Si");
 btnmv191.setEnabled(true);
        
        if(rbsi191.isSelected()){
            lblcum19.setEnabled(true);
            lblnocum19.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi191ActionPerformed

    private void rbno191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno191ActionPerformed
      tr.setV191("");
        tr.setV191("No");
        btnmv191.setEnabled(false);
        
        if(rbno191.isSelected()){
            lblcum19.setEnabled(false);
            lblnocum19.setEnabled(true);
        }
    }//GEN-LAST:event_rbno191ActionPerformed

    private void btnmv191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv191ActionPerformed
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
               tr.setId(31);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv191ActionPerformed

    private void noaplicaitem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem20ActionPerformed
     if (noaplicaitem20.isSelected()) {
            rbsi201.setEnabled(false);
            rbno201.setEnabled(false);
            rbsi202.setEnabled(false);
            rbno202.setEnabled(false);
            btnmv201.setEnabled(false);
            btnmv202.setEnabled(false);
            txtitem20.setEnabled(false);
            btnadjnoitem20.setEnabled(false);
            rbjustiitem20.setEnabled(true);
            rbnojustiitem20.setEnabled(true);
            tr.setI201("");

        } else {
            rbsi201.setEnabled(true);
            rbno201.setEnabled(true);
            rbsi202.setEnabled(true);
            rbno202.setEnabled(true);
            btnmv201.setEnabled(false);
            btnmv202.setEnabled(false);
            txtitem20.setEnabled(false);
            btnadjnoitem20.setEnabled(false);
            rbjustiitem20.setEnabled(false);
            rbnojustiitem20.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem20ActionPerformed

    private void rbjustiitem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem20ActionPerformed
        txtitem20.setEnabled(true);
        tr.setI201("");
    }//GEN-LAST:event_rbjustiitem20ActionPerformed

    private void rbnojustiitem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem20ActionPerformed
     btnadjnoitem20.setEnabled(false);
        txtitem20.setEnabled(false);
        lblcum20.setEnabled(false);
        lblnocum20.setEnabled(true);
        tr.setI201("");
        tr.setI201("No");
        tr.setA201("");
        tr.setA201("Si");
        tr.setV201("");
        tr.setV201("No");
        tr.setV202("");
        tr.setV202("No");
        tr.setJ201("");
    }//GEN-LAST:event_rbnojustiitem20ActionPerformed

    private void txtitem20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem20KeyPressed
      if (txtitem20.getText().length() > 2) {

            lblcum20.setEnabled(true);
            btnadjnoitem20.setEnabled(true);
            // inserta datos que cumple  

            tr.setI201("");
            tr.setI201("Si");
            tr.setA201("");
            tr.setA201("No");
            tr.setV201("");
            tr.setV201("no aplica");
            tr.setV202("");
            tr.setV202("no aplica");
            tr.setJ201("");
            tr.setJ201(txtitem20.getText());

        } else {
            tr.setJ201("");
            tr.setI201("");
           
            lblcum20.setEnabled(false);
            lblnocum20.setEnabled(false);
            btnadjnoitem20.setEnabled(false);
        }
    }//GEN-LAST:event_txtitem20KeyPressed

    private void btnadjnoitem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem20ActionPerformed
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
               tr.setId(20);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
        
    }//GEN-LAST:event_btnadjnoitem20ActionPerformed

    private void rbsi201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi201ActionPerformed
      tr.setV201("");
        tr.setV201("Si");
        btnmv201.setEnabled(true);
        
        if(rbsi201.isSelected() && rbsi202.isSelected()){
            lblcum20.setEnabled(true);
            lblnocum20.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi201ActionPerformed

    private void rbno201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno201ActionPerformed
      tr.setV201("");
        tr.setV201("No");
        btnmv201.setEnabled(false);
        
        if(rbno201.isSelected() || rbno202.isSelected() ){
            lblcum20.setEnabled(false);
            lblnocum20.setEnabled(true);
        }
    }//GEN-LAST:event_rbno201ActionPerformed

    private void btnmv201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv201ActionPerformed
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
               tr.setId(32);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv201ActionPerformed

    private void rbsi202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi202ActionPerformed
     tr.setV202("");
        tr.setV202("Si");
        btnmv202.setEnabled(true);
        
        if(rbsi201.isSelected() && rbsi202.isSelected()){
            lblcum20.setEnabled(true);
            lblnocum20.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi202ActionPerformed

    private void rbno202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno202ActionPerformed
    tr.setV202("");
        tr.setV202("No");
        btnmv202.setEnabled(false);
        
        if(rbno201.isSelected() || rbno202.isSelected() ){
            lblcum20.setEnabled(false);
            lblnocum20.setEnabled(true);
        }
    }//GEN-LAST:event_rbno202ActionPerformed

    private void btnmv202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv202ActionPerformed
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
               tr.setId(33);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv202ActionPerformed

    private void noaplicaitem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem21ActionPerformed
    if(noaplicaitem21.isSelected()){
        rbsi211.setEnabled(false);
        rbno211.setEnabled(false);
        btnmv211.setEnabled(false);
        txtitem21.setEnabled(false);
        btnadjnoitem21.setEnabled(false);
         rbjustiitem21.setEnabled(true);
          rbnojustiitem21.setEnabled(true);
          tr.setI211("");
        
        }else{
          rbsi211.setEnabled(true);
        rbno211.setEnabled(true);
        btnmv211.setEnabled(false);
        txtitem21.setEnabled(false);
        btnadjnoitem21.setEnabled(false);
         rbjustiitem21.setEnabled(false);
          rbnojustiitem21.setEnabled(false);
            
            
        } 
    }//GEN-LAST:event_noaplicaitem21ActionPerformed

    private void rbjustiitem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem21ActionPerformed
       txtitem21.setEnabled(true);
       tr.setI211("");
    }//GEN-LAST:event_rbjustiitem21ActionPerformed

    private void rbnojustiitem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem21ActionPerformed
       btnadjnoitem21.setEnabled(false);
        txtitem21.setEnabled(false);
        lblcum21.setEnabled(false);
        lblnocum21.setEnabled(true);
         tr.setI211("");
        tr.setI211("No");
        tr.setA211("");
        tr.setA211("Si");
        tr.setV211("");
        tr.setV211("No");
        tr.setJ211("");
    }//GEN-LAST:event_rbnojustiitem21ActionPerformed

    private void txtitem21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem21KeyPressed
     if(txtitem21.getText().length()>2){        
        lblcum21.setEnabled(true);
       btnadjnoitem21.setEnabled(true);
     // inserta datos que cumple  
       tr.setI211("");
       tr.setI211("Si");
       tr.setA211("");
       tr.setA211("No");
       tr.setV211("");
        tr.setV211("no aplica");
       tr.setA211("No");
       tr.setJ211("");
       tr.setJ211(txtitem21.getText());
       
       
   }else{
        tr.setJ211("");
        tr.setI211("");
               
        
            lblcum21.setEnabled(false);
            lblnocum21.setEnabled(false);
            btnadjnoitem21.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem21KeyPressed

    private void btnadjnoitem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem21ActionPerformed
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
               tr.setId(21);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem21ActionPerformed

    private void rbsi211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi211ActionPerformed
       tr.setV211("");
 tr.setV211("Si");
 btnmv211.setEnabled(true);
        
        if(rbsi211.isSelected()){
            lblcum21.setEnabled(true);
            lblnocum21.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi211ActionPerformed

    private void rbno211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno211ActionPerformed
    tr.setV211("");
        tr.setV211("No");
        btnmv211.setEnabled(false);
        
        if(rbno211.isSelected()){
            lblcum21.setEnabled(false);
            lblnocum21.setEnabled(true);
        }
    }//GEN-LAST:event_rbno211ActionPerformed

    private void btnmv211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv211ActionPerformed
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
               tr.setId(34);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv211ActionPerformed

    private void noaplicaitem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem22ActionPerformed
      if(noaplicaitem22.isSelected()){
        rbsi221.setEnabled(false);
        rbno221.setEnabled(false);
        btnmv221.setEnabled(false);
        txtitem22.setEnabled(false);
        btnadjnoitem22.setEnabled(false);
        rbjustiitem22.setEnabled(true);
          rbnojustiitem22.setEnabled(true);
           tr.setI221("");
        
        }else{
          rbsi221.setEnabled(true);
        rbno221.setEnabled(true);
        btnmv221.setEnabled(false);
        txtitem22.setEnabled(false);
        btnadjnoitem22.setEnabled(false);
         rbjustiitem22.setEnabled(false);
          rbnojustiitem22.setEnabled(false);
            
            
        }       
    }//GEN-LAST:event_noaplicaitem22ActionPerformed

    private void rbjustiitem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem22ActionPerformed
      txtitem22.setEnabled(true);
       tr.setI221("");
    }//GEN-LAST:event_rbjustiitem22ActionPerformed

    private void rbnojustiitem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem22ActionPerformed
       btnadjnoitem22.setEnabled(false);
        txtitem22.setEnabled(false);
        lblcum22.setEnabled(false);
        lblnocum22.setEnabled(true);
         tr.setI221("");
        tr.setI221("No");
        tr.setA221("");
        tr.setA221("Si");
        tr.setV221("");
        tr.setV221("No");
        tr.setJ221("");

    }//GEN-LAST:event_rbnojustiitem22ActionPerformed

    private void txtitem22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem22KeyPressed
  if(txtitem22.getText().length()>2){        
        lblcum22.setEnabled(true);
       btnadjnoitem22.setEnabled(true);
     // inserta datos que cumple  
       tr.setI221("");
       tr.setI221("Si");
       tr.setA221("");
       tr.setA221("No");
       tr.setV221("");
       tr.setV221("no aplica");
       tr.setA221("No");
       tr.setJ221("");
       tr.setJ221(txtitem22.getText());
       
       
   }else{
        tr.setJ221("");
        tr.setI221("");
            
        
            lblcum22.setEnabled(false);
            lblnocum22.setEnabled(false);
            btnadjnoitem22.setEnabled(false);
   }

    }//GEN-LAST:event_txtitem22KeyPressed

    private void btnadjnoitem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem22ActionPerformed
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
               tr.setId(22);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem22ActionPerformed

    private void rbsi221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi221ActionPerformed
     tr.setV221("");
 tr.setV221("Si");
 btnmv221.setEnabled(true);
        
        if(rbsi221.isSelected()){
            lblcum22.setEnabled(true);
            lblnocum22.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi221ActionPerformed

    private void rbno221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno221ActionPerformed
        tr.setV221("");
        tr.setV221("No");
        btnmv221.setEnabled(false);
        
        if(rbno221.isSelected()){
            lblcum22.setEnabled(false);
            lblnocum22.setEnabled(true);
        }
    }//GEN-LAST:event_rbno221ActionPerformed

    private void btnmv221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv221ActionPerformed
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
               tr.setId(35);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv221ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Item 12
        if (rbsi121.isSelected() && rbsi122.isSelected() && rbsi123.isSelected()) {
            tr.setI121("");
            tr.setI121("Si");
            tr.setA121("");
            tr.setA121("Si");

        }
        if (rbno121.isSelected() || rbno122.isSelected() || rbno123.isSelected()) {
            
            if((!rbno121.isSelected() && !rbsi121.isSelected()) || (!rbno122.isSelected() && !rbsi122.isSelected()) || (!rbno123.isSelected() && !rbsi123.isSelected()) 
       ){   
                
        }else{
            tr.setI121("");
            tr.setI121("no");
            tr.setA121("");
            tr.setA121("si");}

        }
        // Item 13

        if (rbsi13.isSelected()) {
            tr.setI131("");
            tr.setI131("si");
            tr.setA131("");
            tr.setA131("si");

        }

        if (rbno131.isSelected()) {
            tr.setI131("");
            tr.setI131("no");
            tr.setA131("");
            tr.setA131("si");

        }

        // Item 14
     if (rbsi141.isSelected()) {
            tr.setI141("");
            tr.setI141("si");
            tr.setA141("");
            tr.setA141("si");

        }

        if (rbno141.isSelected()) {
            tr.setI141("");
            tr.setI141("no");
            tr.setA141("");
            tr.setA141("si");

        }

        // Item 15
     if (rbsi151.isSelected()) {
            tr.setI151("");
            tr.setI151("si");
            tr.setA151("");
            tr.setA151("si");

        }

        if (rbno151.isSelected()) {
            tr.setI151("");
            tr.setI151("no");
            tr.setA151("");
            tr.setA151("si");

        }

        // Item 16
      if (rbsi161.isSelected() && rbsi162.isSelected() ) {
            tr.setI161("");
            tr.setI161("Si");
            tr.setA161("");
            tr.setA161("Si");

        }
        if (rbno161.isSelected() || rbno162.isSelected()) {
            
       if((!rbno161.isSelected() && !rbsi161.isSelected()) || (!rbno162.isSelected() && !rbsi162.isSelected())){   
                
        }else{       
            
            tr.setI161("");
            tr.setI161("no");
            tr.setA161("");
            tr.setA161("si");}

        }

        // Item 17
       if (rbsi171.isSelected() && rbsi172.isSelected() && rbsi173.isSelected()) {
            tr.setI171("");
            tr.setI171("Si");
            tr.setA171("");
            tr.setA171("Si");

        }
        if (rbno171.isSelected() || rbno172.isSelected() || rbno173.isSelected()) {
           
             if((!rbno171.isSelected() && !rbsi171.isSelected()) || (!rbno172.isSelected() && !rbsi172.isSelected()) || (!rbno173.isSelected() && !rbsi173.isSelected()) 
       ){   
                
        }else{
            
            tr.setI171("");
            tr.setI171("no");
            tr.setA171("");
            tr.setA171("si");}

        }

        // Item 18
       if (rbsi181.isSelected()) {
            tr.setI181("");
            tr.setI181("Si");
            tr.setA181("");
            tr.setA181("Si");

        }

        if (rbno181.isSelected()) {
            tr.setI181("");
            tr.setI181("No");
            tr.setA181("");
            tr.setA181("No");

        }

        // Item 19
        if (rbsi191.isSelected()) {
            tr.setI191("");
            tr.setI191("si");
            tr.setA191("");
            tr.setA191("si");

        }

        if (rbno191.isSelected()) {
            tr.setI191("");
            tr.setI191("no");
            tr.setA191("");
            tr.setA191("si");

        }

        // Item 20
       if (rbsi201.isSelected() && rbsi202.isSelected() ) {
            tr.setI201("");
            tr.setI201("Si");
            tr.setA201("");
            tr.setA201("Si");

        }
        if (rbno201.isSelected() || rbno202.isSelected()) {
         
        if((!rbno201.isSelected() && !rbsi201.isSelected()) || (!rbno202.isSelected() && !rbsi202.isSelected())){   
                
        }else{        
            
            tr.setI201("");
            tr.setI201("So");
            tr.setA201("");
            tr.setA201("Si");  }

        }

        // Item 21
      if (rbsi211.isSelected()) {
            tr.setI211("");
            tr.setI211("si");
            tr.setA211("");
            tr.setA211("si");

        }

        if (rbno211.isSelected()) {
            tr.setI211("");
            tr.setI211("no");
            tr.setA211("");
            tr.setA211("si");

        }

        // Item 22
       if (rbsi221.isSelected()) {
            tr.setI221("");
            tr.setI221("si");
            tr.setA221("");
            tr.setA221("si");

        }

        if (rbno221.isSelected()) {
            tr.setI221("");
            tr.setI221("no");
            tr.setA221("");
            tr.setA221("si");

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
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (Exception e) {

        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_integral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadjnoitem12;
    private javax.swing.JButton btnadjnoitem13;
    private javax.swing.JButton btnadjnoitem14;
    private javax.swing.JButton btnadjnoitem15;
    private javax.swing.JButton btnadjnoitem16;
    private javax.swing.JButton btnadjnoitem17;
    private javax.swing.JButton btnadjnoitem18;
    private javax.swing.JButton btnadjnoitem19;
    private javax.swing.JButton btnadjnoitem20;
    private javax.swing.JButton btnadjnoitem21;
    private javax.swing.JButton btnadjnoitem22;
    private javax.swing.JButton btnmv121;
    private javax.swing.JButton btnmv122;
    private javax.swing.JButton btnmv123;
    private javax.swing.JButton btnmv131;
    private javax.swing.JButton btnmv141;
    private javax.swing.JButton btnmv151;
    private javax.swing.JButton btnmv161;
    private javax.swing.JButton btnmv162;
    private javax.swing.JButton btnmv171;
    private javax.swing.JButton btnmv172;
    private javax.swing.JButton btnmv173;
    private javax.swing.JButton btnmv181;
    private javax.swing.JButton btnmv191;
    private javax.swing.JButton btnmv201;
    private javax.swing.JButton btnmv202;
    private javax.swing.JButton btnmv211;
    private javax.swing.JButton btnmv221;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
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
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblcum12;
    private javax.swing.JLabel lblcum13;
    private javax.swing.JLabel lblcum14;
    private javax.swing.JLabel lblcum15;
    private javax.swing.JLabel lblcum16;
    private javax.swing.JLabel lblcum17;
    private javax.swing.JLabel lblcum18;
    private javax.swing.JLabel lblcum19;
    private javax.swing.JLabel lblcum20;
    private javax.swing.JLabel lblcum21;
    private javax.swing.JLabel lblcum22;
    private javax.swing.JLabel lblnocum12;
    private javax.swing.JLabel lblnocum13;
    private javax.swing.JLabel lblnocum14;
    private javax.swing.JLabel lblnocum15;
    private javax.swing.JLabel lblnocum16;
    private javax.swing.JLabel lblnocum17;
    private javax.swing.JLabel lblnocum18;
    private javax.swing.JLabel lblnocum19;
    private javax.swing.JLabel lblnocum20;
    private javax.swing.JLabel lblnocum21;
    private javax.swing.JLabel lblnocum22;
    private javax.swing.JCheckBox noaplicaitem12;
    private javax.swing.JCheckBox noaplicaitem13;
    private javax.swing.JCheckBox noaplicaitem14;
    private javax.swing.JCheckBox noaplicaitem15;
    private javax.swing.JCheckBox noaplicaitem16;
    private javax.swing.JCheckBox noaplicaitem17;
    private javax.swing.JCheckBox noaplicaitem18;
    private javax.swing.JCheckBox noaplicaitem19;
    private javax.swing.JCheckBox noaplicaitem20;
    private javax.swing.JCheckBox noaplicaitem21;
    private javax.swing.JCheckBox noaplicaitem22;
    private javax.swing.JRadioButton rbjustiitem12;
    private javax.swing.JRadioButton rbjustiitem13;
    private javax.swing.JRadioButton rbjustiitem14;
    private javax.swing.JRadioButton rbjustiitem15;
    private javax.swing.JRadioButton rbjustiitem16;
    private javax.swing.JRadioButton rbjustiitem17;
    private javax.swing.JRadioButton rbjustiitem18;
    private javax.swing.JRadioButton rbjustiitem19;
    private javax.swing.JRadioButton rbjustiitem20;
    private javax.swing.JRadioButton rbjustiitem21;
    private javax.swing.JRadioButton rbjustiitem22;
    private javax.swing.JRadioButton rbno121;
    private javax.swing.JRadioButton rbno122;
    private javax.swing.JRadioButton rbno123;
    private javax.swing.JRadioButton rbno131;
    private javax.swing.JRadioButton rbno141;
    private javax.swing.JRadioButton rbno151;
    private javax.swing.JRadioButton rbno161;
    private javax.swing.JRadioButton rbno162;
    private javax.swing.JRadioButton rbno171;
    private javax.swing.JRadioButton rbno172;
    private javax.swing.JRadioButton rbno173;
    private javax.swing.JRadioButton rbno181;
    private javax.swing.JRadioButton rbno191;
    private javax.swing.JRadioButton rbno201;
    private javax.swing.JRadioButton rbno202;
    private javax.swing.JRadioButton rbno211;
    private javax.swing.JRadioButton rbno221;
    private javax.swing.JRadioButton rbnojustiitem12;
    private javax.swing.JRadioButton rbnojustiitem13;
    private javax.swing.JRadioButton rbnojustiitem14;
    private javax.swing.JRadioButton rbnojustiitem15;
    private javax.swing.JRadioButton rbnojustiitem16;
    private javax.swing.JRadioButton rbnojustiitem17;
    private javax.swing.JRadioButton rbnojustiitem18;
    private javax.swing.JRadioButton rbnojustiitem19;
    private javax.swing.JRadioButton rbnojustiitem20;
    private javax.swing.JRadioButton rbnojustiitem21;
    private javax.swing.JRadioButton rbnojustiitem22;
    private javax.swing.JRadioButton rbsi121;
    private javax.swing.JRadioButton rbsi122;
    private javax.swing.JRadioButton rbsi123;
    private javax.swing.JRadioButton rbsi13;
    private javax.swing.JRadioButton rbsi141;
    private javax.swing.JRadioButton rbsi151;
    private javax.swing.JRadioButton rbsi161;
    private javax.swing.JRadioButton rbsi162;
    private javax.swing.JRadioButton rbsi171;
    private javax.swing.JRadioButton rbsi172;
    private javax.swing.JRadioButton rbsi173;
    private javax.swing.JRadioButton rbsi181;
    private javax.swing.JRadioButton rbsi191;
    private javax.swing.JRadioButton rbsi201;
    private javax.swing.JRadioButton rbsi202;
    private javax.swing.JRadioButton rbsi211;
    private javax.swing.JRadioButton rbsi221;
    private javax.swing.JTextArea txtitem12;
    private javax.swing.JTextArea txtitem13;
    private javax.swing.JTextArea txtitem14;
    private javax.swing.JTextArea txtitem15;
    private javax.swing.JTextArea txtitem16;
    private javax.swing.JTextArea txtitem17;
    private javax.swing.JTextArea txtitem18;
    private javax.swing.JTextArea txtitem19;
    private javax.swing.JTextArea txtitem20;
    private javax.swing.JTextArea txtitem21;
    private javax.swing.JTextArea txtitem22;
    // End of variables declaration//GEN-END:variables
}
