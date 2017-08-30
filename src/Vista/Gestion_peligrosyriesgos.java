/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Cevaluacion;
import Controlador.Cgestion_peligro;
import Controlador.Crecursos;
import Modelo.Mevaluacion;
import Modelo.Mgestion_peligro;
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
public class Gestion_peligrosyriesgos extends javax.swing.JFrame {

    /**
     * Creates new form Gestion_peligrosyriesgos
     */
    public Gestion_peligrosyriesgos() {
        initComponents();
        // inhabilitar botones minimizar, cerrar y maximizar
         getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        this.setLocationRelativeTo(null);
         /* Agrupacion de botones*/
        ButtonGroup rbnitem1 = new ButtonGroup();
        rbnitem1.add(rbjustiitem41);
        rbnitem1.add(rbnojustiitem41);

        ButtonGroup rbnitem2 = new ButtonGroup();
        rbnitem2.add(rbjustiitem42);
        rbnitem2.add(rbnojustiitem42);

        ButtonGroup rbnitem3 = new ButtonGroup();
        rbnitem3.add(rbjustiitem43);
        rbnitem3.add(rbnojustiitem43);

        ButtonGroup rbnitem4 = new ButtonGroup();
        rbnitem4.add(rbjustiitem44);
        rbnitem4.add(rbnojustiitem44);

        ButtonGroup rbnitem5 = new ButtonGroup();
        rbnitem5.add(rbjustiitem45);
        rbnitem5.add(rbnojustiitem45);

        ButtonGroup rbnitem6 = new ButtonGroup();
        rbnitem6.add(rbjustiitem46);
        rbnitem6.add(rbnojustiitem46);

        ButtonGroup rbnitem7 = new ButtonGroup();
        rbnitem7.add(rbjustiitem47);
        rbnitem7.add(rbnojustiitem47);

        ButtonGroup rbnitem8 = new ButtonGroup();
        rbnitem8.add(rbjustiitem48);
        rbnitem8.add(rbnojustiitem48);

        ButtonGroup rbnitem9 = new ButtonGroup();
        rbnitem9.add(rbjustiitem49);
        rbnitem9.add(rbnojustiitem49);

        ButtonGroup rbnitem10 = new ButtonGroup();
        rbnitem10.add(rbjustiitem50);
        rbnitem10.add(rbnojustiitem50);

        ButtonGroup rbnitem11 = new ButtonGroup();
        rbnitem11.add(rbsi411);
        rbnitem11.add(rbno411);

        ButtonGroup mv111 = new ButtonGroup();
        mv111.add(rbsi412);
        mv111.add(rbno412);

        ButtonGroup mv112 = new ButtonGroup();
        mv112.add(rbsi421);
        mv112.add(rbno421);

        ButtonGroup mv113 = new ButtonGroup();
        mv113.add(rbsi422);
        mv113.add(rbno422);

        ButtonGroup mv114 = new ButtonGroup();
        mv114.add(rbsi431);
        mv114.add(rbno431);

        ButtonGroup mv121 = new ButtonGroup();
        mv121.add(rbsi432);
        mv121.add(rbno432);

        ButtonGroup mv131 = new ButtonGroup();
        mv131.add(rbsi433);
        mv131.add(rbno433);

        ButtonGroup mv141 = new ButtonGroup();
        mv141.add(rbsi441);
        mv141.add(rbno441);

        ButtonGroup mv142 = new ButtonGroup();
        mv142.add(rbsi451);
        mv142.add(rbno451);

        ButtonGroup mv151 = new ButtonGroup();
        mv151.add(rbsi452);
        mv151.add(rbno452);

        ButtonGroup mv161 = new ButtonGroup();
        mv161.add(rbsi453);
        mv161.add(rbno453);

        ButtonGroup mv162 = new ButtonGroup();
        mv162.add(rbsi461);
        mv162.add(rbno461);

        ButtonGroup mv171 = new ButtonGroup();
        mv171.add(rbsi462);
        mv171.add(rbno462);

        ButtonGroup mv181 = new ButtonGroup();
        mv181.add(rbsi471);
        mv181.add(rbno471);

        ButtonGroup mv182 = new ButtonGroup();
        mv182.add(rbsi481);
        mv182.add(rbno481);

        ButtonGroup mv191 = new ButtonGroup();
        mv191.add(rbsi491);
        mv191.add(rbno491);

        ButtonGroup mv192 = new ButtonGroup();
        mv192.add(rbsi501);
        mv192.add(rbno501);

        ButtonGroup mv1101 = new ButtonGroup();
        mv1101.add(rbsi502);
        mv1101.add(rbno502);
        
        ButtonGroup mv195 = new ButtonGroup();
        mv195.add(rbsi503);
        mv195.add(rbno503);

        ButtonGroup mv1 = new ButtonGroup();
        mv1.add(rbsi504);
        mv1.add(rbno504);

        /* Metodo para inhanilitar botones y labeles*/
       noVisibles();
    }
    Mevaluacion ps= new Mevaluacion();
    Evaluacion_Ini gh= new Evaluacion_Ini();
      public void noVisibles() {
        rbjustiitem41.setEnabled(false);
        rbjustiitem42.setEnabled(false);
        rbjustiitem43.setEnabled(false);
        rbjustiitem44.setEnabled(false);
        rbjustiitem45.setEnabled(false);
        rbjustiitem46.setEnabled(false);
        rbjustiitem47.setEnabled(false);
        rbjustiitem48.setEnabled(false);
        rbjustiitem49.setEnabled(false);
        rbjustiitem50.setEnabled(false);
        

        rbnojustiitem41.setEnabled(false);
        rbnojustiitem42.setEnabled(false);
        rbnojustiitem43.setEnabled(false);
        rbnojustiitem44.setEnabled(false);
        rbnojustiitem45.setEnabled(false);
        rbnojustiitem46.setEnabled(false);
        rbnojustiitem47.setEnabled(false);
        rbnojustiitem48.setEnabled(false);
        rbnojustiitem49.setEnabled(false);
        rbnojustiitem50.setEnabled(false);
       

        txtitem41.setEnabled(false);
        txtitem42.setEnabled(false);
        txtitem43.setEnabled(false);
        txtitem44.setEnabled(false);
        txtitem45.setEnabled(false);
        txtitem46.setEnabled(false);
        txtitem47.setEnabled(false);
        txtitem48.setEnabled(false);
        txtitem49.setEnabled(false);
        txtitem50.setEnabled(false);
       

        btnadjnoitem41.setEnabled(false);
        btnadjnoitem42.setEnabled(false);
        btnadjnoitem43.setEnabled(false);
        btnadjnoitem44.setEnabled(false);
        btnadjnoitem45.setEnabled(false);
        btnadjnoitem46.setEnabled(false);
        btnadjnoitem47.setEnabled(false);
        btnadjnoitem48.setEnabled(false);
        btnadjnoitem49.setEnabled(false);
        btnadjnoitem50.setEnabled(false);
       


        btnmv411.setEnabled(false);
        btnmv412.setEnabled(false);
        btnmv421.setEnabled(false);
        btnmv422.setEnabled(false);
        btnmv431.setEnabled(false);
        btnmv432.setEnabled(false);
        btnmv433.setEnabled(false);
        btnmv441.setEnabled(false);
        btnmv451.setEnabled(false);
        btnmv452.setEnabled(false);
        btnmv453.setEnabled(false);
        btnmv461.setEnabled(false);
        btnmv462.setEnabled(false);
        btnmv471.setEnabled(false);
        btnmv481.setEnabled(false);
        btnmv491.setEnabled(false);
        btnmv501.setEnabled(false);
        btnmv502.setEnabled(false);
        btnmv503.setEnabled(false);
        btnmv504.setEnabled(false);  

        lblcum41.setEnabled(false);
        lblcum42.setEnabled(false);
        lblcum43.setEnabled(false);
        lblcum44.setEnabled(false);
        lblcum45.setEnabled(false);
        lblcum46.setEnabled(false);
        lblcum47.setEnabled(false);
        lblcum48.setEnabled(false);
        lblcum49.setEnabled(false);
        lblcum50.setEnabled(false);
        lblnocum41.setEnabled(false);
        lblnocum42.setEnabled(false);
        lblnocum43.setEnabled(false);
        lblnocum44.setEnabled(false);
        lblnocum45.setEnabled(false);
        lblnocum46.setEnabled(false);
        lblnocum47.setEnabled(false);
        lblnocum48.setEnabled(false);
        lblnocum49.setEnabled(false);
        lblnocum50.setEnabled(false);
        

    }
      
      Cevaluacion cm = new Cevaluacion();
      
        public void Validar (){
         Cgestion_peligro func = new Cgestion_peligro();
           
           
        
           
       
    if(tr.getI411().equals("")){
        
        JOptionPane.showMessageDialog(null,"El item 1 del estandar E4.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI421().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 2 del estandar E4.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI431().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 3 del estandar E4.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI441().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 4 del estandar E4.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI451().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E4.2 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI461().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 2 del estandar E4.2 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI471().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 3 del estandar E4.2 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI481().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 4 del estandar E4.2 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI491().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 5 del estandar E4.2 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI501().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 6 del estandar E4.2 no se ha diligenciado correctamente ");
        
    }
        
    if(!tr.getI411().equals("") && !tr.getI421().equals("") && !tr.getI431().equals("") && !tr.getI441().equals("") && !tr.getI451().equals("") && !tr.getI461().equals("") 
            && !tr.getI471().equals("") && !tr.getI481().equals("") && !tr.getI491().equals("") && !tr.getI501().equals("")){
     
        
    int dialogButton =JOptionPane.showConfirmDialog(null, "Esta seguro que desea guardar las respuesta diligenciadas en la evaluacion inicial,"
                                                        + " recuerde que si acepta no podra volver a diligenciar este formulario hasta que comience una nueva E. inicial ");
           if(dialogButton == JOptionPane.YES_OPTION){     
          func.insertarItem41(tr);
        func.insertarItem42(tr);
        func.insertarItem43(tr);
        func.insertarItem44(tr);
        func.insertarItem45(tr);
        func.insertarItem46(tr);
        func.insertarItem47(tr);
        func.insertarItem48(tr);
        func.insertarItem49(tr);
       
        if(func.insertarItem50(tr)){
            JOptionPane.showMessageDialog(rootPane, "Se han registrado los items satisfactoriamente");

        }  

       ps.setE4(1);
       cm.Puntaje();
      gh.punt= ps.getPunt();
       gh.config();
       int valo=30;
       ps.setBarra(ps.getBarra()+valo);
       this.dispose();
       gh.val=ps.getBarra();
        gh.empezar();
        
        
        cm.est_gestPeligros(ps);
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
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lblnocum41 = new javax.swing.JLabel();
        lblcum41 = new javax.swing.JLabel();
        noaplicaitem41 = new javax.swing.JCheckBox();
        rbjustiitem41 = new javax.swing.JRadioButton();
        rbnojustiitem41 = new javax.swing.JRadioButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtitem41 = new javax.swing.JTextArea();
        btnadjnoitem41 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        rbsi411 = new javax.swing.JRadioButton();
        rbno411 = new javax.swing.JRadioButton();
        btnmv411 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        rbsi412 = new javax.swing.JRadioButton();
        rbno412 = new javax.swing.JRadioButton();
        btnmv412 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        lblnocum43 = new javax.swing.JLabel();
        lblcum43 = new javax.swing.JLabel();
        noaplicaitem43 = new javax.swing.JCheckBox();
        rbjustiitem43 = new javax.swing.JRadioButton();
        rbnojustiitem43 = new javax.swing.JRadioButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtitem43 = new javax.swing.JTextArea();
        btnadjnoitem43 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        rbsi431 = new javax.swing.JRadioButton();
        rbno431 = new javax.swing.JRadioButton();
        btnmv431 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        rbsi433 = new javax.swing.JRadioButton();
        rbno433 = new javax.swing.JRadioButton();
        btnmv433 = new javax.swing.JButton();
        rbsi432 = new javax.swing.JRadioButton();
        rbno432 = new javax.swing.JRadioButton();
        btnmv432 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        lblnocum44 = new javax.swing.JLabel();
        lblcum44 = new javax.swing.JLabel();
        noaplicaitem44 = new javax.swing.JCheckBox();
        rbjustiitem44 = new javax.swing.JRadioButton();
        rbnojustiitem44 = new javax.swing.JRadioButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtitem44 = new javax.swing.JTextArea();
        btnadjnoitem44 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        rbsi441 = new javax.swing.JRadioButton();
        rbno441 = new javax.swing.JRadioButton();
        btnmv441 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        lblnocum42 = new javax.swing.JLabel();
        lblcum42 = new javax.swing.JLabel();
        noaplicaitem42 = new javax.swing.JCheckBox();
        rbjustiitem42 = new javax.swing.JRadioButton();
        rbnojustiitem42 = new javax.swing.JRadioButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtitem42 = new javax.swing.JTextArea();
        btnadjnoitem42 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        rbsi421 = new javax.swing.JRadioButton();
        rbno421 = new javax.swing.JRadioButton();
        btnmv421 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        rbsi422 = new javax.swing.JRadioButton();
        rbno422 = new javax.swing.JRadioButton();
        btnmv422 = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        lblnocum45 = new javax.swing.JLabel();
        lblcum45 = new javax.swing.JLabel();
        noaplicaitem45 = new javax.swing.JCheckBox();
        rbjustiitem45 = new javax.swing.JRadioButton();
        rbnojustiitem45 = new javax.swing.JRadioButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtitem45 = new javax.swing.JTextArea();
        btnadjnoitem45 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        rbsi451 = new javax.swing.JRadioButton();
        rbno451 = new javax.swing.JRadioButton();
        btnmv451 = new javax.swing.JButton();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        rbsi452 = new javax.swing.JRadioButton();
        rbno452 = new javax.swing.JRadioButton();
        btnmv452 = new javax.swing.JButton();
        rbsi453 = new javax.swing.JRadioButton();
        rbno453 = new javax.swing.JRadioButton();
        btnmv453 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        lblnocum46 = new javax.swing.JLabel();
        lblcum46 = new javax.swing.JLabel();
        noaplicaitem46 = new javax.swing.JCheckBox();
        rbjustiitem46 = new javax.swing.JRadioButton();
        rbnojustiitem46 = new javax.swing.JRadioButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtitem46 = new javax.swing.JTextArea();
        btnadjnoitem46 = new javax.swing.JButton();
        jLabel113 = new javax.swing.JLabel();
        rbsi461 = new javax.swing.JRadioButton();
        rbno461 = new javax.swing.JRadioButton();
        btnmv461 = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        rbsi462 = new javax.swing.JRadioButton();
        rbno462 = new javax.swing.JRadioButton();
        btnmv462 = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        lblnocum47 = new javax.swing.JLabel();
        lblcum47 = new javax.swing.JLabel();
        noaplicaitem47 = new javax.swing.JCheckBox();
        rbjustiitem47 = new javax.swing.JRadioButton();
        rbnojustiitem47 = new javax.swing.JRadioButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        txtitem47 = new javax.swing.JTextArea();
        btnadjnoitem47 = new javax.swing.JButton();
        jLabel123 = new javax.swing.JLabel();
        rbsi471 = new javax.swing.JRadioButton();
        rbno471 = new javax.swing.JRadioButton();
        btnmv471 = new javax.swing.JButton();
        jLabel124 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        lblnocum48 = new javax.swing.JLabel();
        lblcum48 = new javax.swing.JLabel();
        noaplicaitem48 = new javax.swing.JCheckBox();
        rbjustiitem48 = new javax.swing.JRadioButton();
        rbnojustiitem48 = new javax.swing.JRadioButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        txtitem48 = new javax.swing.JTextArea();
        btnadjnoitem48 = new javax.swing.JButton();
        jLabel129 = new javax.swing.JLabel();
        rbsi481 = new javax.swing.JRadioButton();
        rbno481 = new javax.swing.JRadioButton();
        btnmv481 = new javax.swing.JButton();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        lblnocum49 = new javax.swing.JLabel();
        lblcum49 = new javax.swing.JLabel();
        noaplicaitem49 = new javax.swing.JCheckBox();
        rbjustiitem49 = new javax.swing.JRadioButton();
        rbnojustiitem49 = new javax.swing.JRadioButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtitem49 = new javax.swing.JTextArea();
        btnadjnoitem49 = new javax.swing.JButton();
        jLabel134 = new javax.swing.JLabel();
        rbsi491 = new javax.swing.JRadioButton();
        rbno491 = new javax.swing.JRadioButton();
        btnmv491 = new javax.swing.JButton();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        lblnocum50 = new javax.swing.JLabel();
        lblcum50 = new javax.swing.JLabel();
        noaplicaitem50 = new javax.swing.JCheckBox();
        rbjustiitem50 = new javax.swing.JRadioButton();
        rbnojustiitem50 = new javax.swing.JRadioButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        txtitem50 = new javax.swing.JTextArea();
        btnadjnoitem50 = new javax.swing.JButton();
        jLabel139 = new javax.swing.JLabel();
        rbsi501 = new javax.swing.JRadioButton();
        rbno501 = new javax.swing.JRadioButton();
        btnmv501 = new javax.swing.JButton();
        jLabel140 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        rbsi502 = new javax.swing.JRadioButton();
        rbno502 = new javax.swing.JRadioButton();
        btnmv502 = new javax.swing.JButton();
        jLabel144 = new javax.swing.JLabel();
        rbsi503 = new javax.swing.JRadioButton();
        rbno503 = new javax.swing.JRadioButton();
        btnmv503 = new javax.swing.JButton();
        jLabel145 = new javax.swing.JLabel();
        rbsi504 = new javax.swing.JRadioButton();
        rbno504 = new javax.swing.JRadioButton();
        btnmv504 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E4.1Identificación de peligros, evaluación y valoración de los riesgos (15%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel17.setToolTipText("");

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel62.setText("Modo de Verificación ");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel63.setText("Metodología para la identificación, evaluación y elaboración de peligros (4%)");

        lblnocum41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem41.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem41.setText("No Aplica");
        noaplicaitem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem41ActionPerformed(evt);
            }
        });

        rbjustiitem41.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem41.setText("Justifica");
        rbjustiitem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem41ActionPerformed(evt);
            }
        });

        rbnojustiitem41.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem41.setText("No justifica");
        rbnojustiitem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem41ActionPerformed(evt);
            }
        });

        txtitem41.setColumns(20);
        txtitem41.setRows(5);
        txtitem41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem41KeyPressed(evt);
            }
        });
        jScrollPane14.setViewportView(txtitem41);

        btnadjnoitem41.setText("Adjuntar Doc");
        btnadjnoitem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem41ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel64.setText("1. Verificar que se realiza la identificación de peligros, evaluación y valoración de los riesgos conforme a la metodología definida ");

        rbsi411.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi411.setText("Cumple");
        rbsi411.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi411ActionPerformed(evt);
            }
        });

        rbno411.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno411.setText("No cumple");
        rbno411.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno411ActionPerformed(evt);
            }
        });

        btnmv411.setText("Adjuntar Doc");
        btnmv411.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv411ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel66.setText("de acuerdo con el criterio y con la participación de los trabajadores, seleccionando de manera aleatoria algunas de las actividades ");

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel67.setText("identificadas.");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel69.setText("2. Confrontar mediante observación directa durante el recorrido da las instalaciones de la empresa la identificación de peligros.");

        rbsi412.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi412.setText("Cumple");
        rbsi412.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi412ActionPerformed(evt);
            }
        });

        rbno412.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno412.setText("No cumple");
        rbno412.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno412ActionPerformed(evt);
            }
        });

        btnmv412.setText("Adjuntar Doc");
        btnmv412.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv412ActionPerformed(evt);
            }
        });

        jButton13.setText("Criterio");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(jButton13)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(noaplicaitem41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem41)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem41, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi411)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno411)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv411)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi412)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno412)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv412)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum41)
                            .addComponent(lblcum41)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel62))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem41)
                        .addComponent(rbnojustiitem41)
                        .addComponent(noaplicaitem41))
                    .addComponent(btnadjnoitem41)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi411)
                            .addComponent(rbno411)
                            .addComponent(btnmv411)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel67)))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi412)
                        .addComponent(rbno412)
                        .addComponent(btnmv412))
                    .addComponent(jLabel69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel65))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel72.setText("Modo de Verificación ");

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel73.setText("Identificación y priorización de la naturaleza de los peligros (Metodología ");

        lblnocum43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem43.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem43.setText("No Aplica");
        noaplicaitem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem43ActionPerformed(evt);
            }
        });

        rbjustiitem43.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem43.setText("Justifica");
        rbjustiitem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem43ActionPerformed(evt);
            }
        });

        rbnojustiitem43.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem43.setText("No justifica");
        rbnojustiitem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem43ActionPerformed(evt);
            }
        });

        txtitem43.setColumns(20);
        txtitem43.setRows(5);
        txtitem43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem43KeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(txtitem43);

        btnadjnoitem43.setText("Adjuntar Doc");
        btnadjnoitem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem43ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel74.setText("1. Revisar la lista de materias primas e insumos, productos intermedios o finales, subproductos y desechos y verificar si estas son o están");

        rbsi431.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi431.setText("Cumple");
        rbsi431.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi431ActionPerformed(evt);
            }
        });

        rbno431.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno431.setText("No cumple");
        rbno431.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno431ActionPerformed(evt);
            }
        });

        btnmv431.setText("Adjuntar Doc");
        btnmv431.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv431ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel76.setText("compuestas por agentes o sustancias catalogadas como carcinógenas en el grupo 1 de la clasificación de la Agencia internacional de la");

        rbsi433.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi433.setText("Cumple");
        rbsi433.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi433ActionPerformed(evt);
            }
        });

        rbno433.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno433.setText("No cumple");
        rbno433.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno433ActionPerformed(evt);
            }
        });

        btnmv433.setText("Adjuntar Doc");
        btnmv433.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv433ActionPerformed(evt);
            }
        });

        rbsi432.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi432.setText("Cumple");
        rbsi432.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi432ActionPerformed(evt);
            }
        });

        rbno432.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno432.setText("No cumple");
        rbno432.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno432ActionPerformed(evt);
            }
        });

        btnmv432.setText("Adjuntar Doc");
        btnmv432.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv432ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel77.setText("investigación sobre el Cáncer (International Agency for Research on Cáncer, IARC) o con toxicidad aguda según los criterios del");

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel78.setText("Sistema Globalmente Armonizado (Categorías I y II).");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel79.setText("2. Se debe verificar que los riesgos asociados a estas sustancias o agentes carcinógenos o con toxicidad sin priorizados y se realizan ");

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel80.setText("acciones de prevención e intervención.");

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel81.setText("catalogadas como carcinógenas o con toxicidad aguda.");

        jLabel90.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel90.setText("3. Así mismo se debe verificar la existencia de áreas destinadas para el almacenamiento de las materas primas e insumos y sustancias ");

        jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel93.setText("adicional – cancerígenos y otros (3%)");

        jButton15.setText("Criterio");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(noaplicaitem43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem43)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem43, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                        .addComponent(rbsi432)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbno432)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnmv432)
                                        .addGap(95, 95, 95))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(rbsi433)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbno433)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnmv433)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jLabel75))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(rbsi431)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno431)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmv431)))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum43)
                            .addComponent(lblcum43)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel93)
                                    .addComponent(jButton15))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel72))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem43)
                        .addComponent(rbnojustiitem43)
                        .addComponent(noaplicaitem43))
                    .addComponent(btnadjnoitem43)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel78)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel80)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel81)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi431)
                            .addComponent(rbno431)
                            .addComponent(btnmv431))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbsi432)
                                    .addComponent(rbno432)
                                    .addComponent(btnmv432))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbsi433)
                                    .addComponent(rbno433)
                                    .addComponent(btnmv433))))))
                .addGap(36, 36, 36))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 4:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel70.setText("Modo de Verificación ");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel82.setText("Realizaciones mediciones ambientales químicos, físicos y biológicos (4%)");

        lblnocum44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem44.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem44.setText("No Aplica");
        noaplicaitem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem44ActionPerformed(evt);
            }
        });

        rbjustiitem44.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem44.setText("Justifica");
        rbjustiitem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem44ActionPerformed(evt);
            }
        });

        rbnojustiitem44.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem44.setText("No justifica");
        rbnojustiitem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem44ActionPerformed(evt);
            }
        });

        txtitem44.setColumns(20);
        txtitem44.setRows(5);
        txtitem44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem44KeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(txtitem44);

        btnadjnoitem44.setText("Adjuntar Doc");
        btnadjnoitem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem44ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel83.setText("1. Verificar los soportes documentales de las mediciones ambientales realizadas u emisión de estos resultados al comité  Paritario en Seguridad ");

        rbsi441.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi441.setText("Cumple");
        rbsi441.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi441ActionPerformed(evt);
            }
        });

        rbno441.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno441.setText("No cumple");
        rbno441.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno441ActionPerformed(evt);
            }
        });

        btnmv441.setText("Adjuntar Doc");
        btnmv441.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv441ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel85.setText("y Salud en el Trabajo o al Vigía de Seguridad y Salud en el Trabajo.");

        jButton16.setText("Criterio");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jButton16)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem44)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem44, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(rbsi441)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno441)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv441)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(822, 822, 822)
                                .addComponent(jLabel84))
                            .addComponent(jLabel83))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum44)
                            .addComponent(lblcum44)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel70))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem44)
                        .addComponent(rbnojustiitem44)
                        .addComponent(noaplicaitem44))
                    .addComponent(btnadjnoitem44)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi441)
                            .addComponent(rbno441)
                            .addComponent(btnmv441)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel84)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel68.setText("Modo de Verificación ");

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel71.setText("Identificación de peligros con participación de todos los niveles de la empresa (4%).");

        lblnocum42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem42.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem42.setText("No Aplica");
        noaplicaitem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem42ActionPerformed(evt);
            }
        });

        rbjustiitem42.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem42.setText("Justifica");
        rbjustiitem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem42ActionPerformed(evt);
            }
        });

        rbnojustiitem42.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem42.setText("No justifica");
        rbnojustiitem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem42ActionPerformed(evt);
            }
        });

        txtitem42.setColumns(20);
        txtitem42.setRows(5);
        txtitem42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem42KeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(txtitem42);

        btnadjnoitem42.setText("Adjuntar Doc");
        btnadjnoitem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem42ActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel86.setText("1. Verificar que estén identificados los peligros, evaluados y valorados los riesgos, con la participación de los trabajadores Solicitar ");

        rbsi421.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi421.setText("Cumple");
        rbsi421.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi421ActionPerformed(evt);
            }
        });

        rbno421.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno421.setText("No cumple");
        rbno421.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno421ActionPerformed(evt);
            }
        });

        btnmv421.setText("Adjuntar Doc");
        btnmv421.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv421ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel89.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel89.setText("si hay eventos mortales o catastróficos y validar que el peligro asociado al evento este identificado, evaluado y valorado.");

        jLabel91.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel91.setText("2. En caso que se encuentren valoraciones no toreables, verificar la implementación de las acciones de intervención y control, de ");

        rbsi422.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi422.setText("Cumple");
        rbsi422.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi422ActionPerformed(evt);
            }
        });

        rbno422.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno422.setText("No cumple");
        rbno422.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno422ActionPerformed(evt);
            }
        });

        btnmv422.setText("Adjuntar Doc");
        btnmv422.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv422ActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel92.setText("forma inmediata para continuar con la tarea.  ");

        jButton14.setText("Criterio");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jButton14)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(noaplicaitem42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem42)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem42, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel88)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi421)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno421)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv421)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi422)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno422)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv422)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86)
                            .addComponent(jLabel92))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum42)
                                    .addComponent(lblcum42))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton14)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel68))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem42)
                        .addComponent(rbnojustiitem42)
                        .addComponent(noaplicaitem42))
                    .addComponent(btnadjnoitem42)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi421)
                            .addComponent(rbno421)
                            .addComponent(btnmv421)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel89)))
                .addGap(43, 43, 43)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(rbsi422)
                    .addComponent(rbno422)
                    .addComponent(btnmv422))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel88))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E4.2Medidas de prevención y control para intervenir los peligros/riesgos (15%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel24.setToolTipText("");

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel102.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel102.setText("Modo de Verificación ");

        jLabel103.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel103.setText("Se implementan medidas  de prevención y control / peligros (2,5%)");

        lblnocum45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem45.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem45.setText("No Aplica");
        noaplicaitem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem45ActionPerformed(evt);
            }
        });

        rbjustiitem45.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem45.setText("Justifica");
        rbjustiitem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem45ActionPerformed(evt);
            }
        });

        rbnojustiitem45.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem45.setText("No justifica");
        rbnojustiitem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem45ActionPerformed(evt);
            }
        });

        txtitem45.setColumns(20);
        txtitem45.setRows(5);
        txtitem45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem45KeyPressed(evt);
            }
        });
        jScrollPane19.setViewportView(txtitem45);

        btnadjnoitem45.setText("Adjuntar Doc");
        btnadjnoitem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem45ActionPerformed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel104.setText("1. Verificar la implementación de las medidas de prevención  y control de acuerdo al esquema de jerarquización y de conformidad con la ");

        rbsi451.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi451.setText("Cumple");
        rbsi451.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi451ActionPerformed(evt);
            }
        });

        rbno451.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno451.setText("No cumple");
        rbno451.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno451ActionPerformed(evt);
            }
        });

        btnmv451.setText("Adjuntar Doc");
        btnmv451.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv451ActionPerformed(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel106.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel106.setText("de los peligros, de la evaluación y valoración de los riesgos (físicos, ergonómicos, bilógicos, químicos, de seguridad, públicos, psicosociales, ");

        jLabel107.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel107.setText("entre otros), realizada.");

        jLabel109.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel109.setText("2. Verificar que estas medidas se encuentran programadas en el plan anual de trabajo.");

        jLabel110.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel110.setText("3. Constatar que se dio preponderancia a las medidas de prevención y control, respecto de los peligros/riesgos prioritariamente. ");

        rbsi452.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi452.setText("Cumple");
        rbsi452.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi452ActionPerformed(evt);
            }
        });

        rbno452.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno452.setText("No cumple");
        rbno452.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno452ActionPerformed(evt);
            }
        });

        btnmv452.setText("Adjuntar Doc");
        btnmv452.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv452ActionPerformed(evt);
            }
        });

        rbsi453.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi453.setText("Cumple");
        rbsi453.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi453ActionPerformed(evt);
            }
        });

        rbno453.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno453.setText("No cumple");
        rbno453.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno453ActionPerformed(evt);
            }
        });

        btnmv453.setText("Adjuntar Doc");
        btnmv453.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv453ActionPerformed(evt);
            }
        });

        jButton17.setText("Criterio");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103)
                            .addComponent(jButton17)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem45)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem45, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel106)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(842, 842, 842)
                .addComponent(jLabel105)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(rbsi452)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno452)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmv452))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(rbsi453)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno453)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmv453))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi451)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno451)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv451)))
                .addGap(109, 109, 109))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum45)
                            .addComponent(lblcum45)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel102))
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem45)
                        .addComponent(rbnojustiitem45)
                        .addComponent(noaplicaitem45))
                    .addComponent(btnadjnoitem45)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi451)
                        .addComponent(rbno451)
                        .addComponent(btnmv451))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel106)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(rbsi452)
                            .addComponent(rbno452)
                            .addComponent(btnmv452))))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel110)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi453)
                        .addComponent(rbno453)
                        .addComponent(btnmv453)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel105)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel111.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel111.setText("Modo de Verificación ");

        jLabel112.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel112.setText("Se verifica aplicación de las medidas prevención y control (2.5%)");

        lblnocum46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem46.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem46.setText("No Aplica");
        noaplicaitem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem46ActionPerformed(evt);
            }
        });

        rbjustiitem46.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem46.setText("Justifica");
        rbjustiitem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem46ActionPerformed(evt);
            }
        });

        rbnojustiitem46.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem46.setText("No justifica");
        rbnojustiitem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem46ActionPerformed(evt);
            }
        });

        txtitem46.setColumns(20);
        txtitem46.setRows(5);
        txtitem46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem46KeyPressed(evt);
            }
        });
        jScrollPane20.setViewportView(txtitem46);

        btnadjnoitem46.setText("Adjuntar Doc");
        btnadjnoitem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem46ActionPerformed(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel113.setText("1. Solicitar los reportes documentales implementados por la empresa donde se verifica el cumplimiento de las responsabilidades de ");

        rbsi461.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi461.setText("Cumple");
        rbsi461.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi461ActionPerformed(evt);
            }
        });

        rbno461.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno461.setText("No cumple");
        rbno461.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno461ActionPerformed(evt);
            }
        });

        btnmv461.setText("Adjuntar Doc");
        btnmv461.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv461ActionPerformed(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel115.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel115.setText("los trabajadores frente a la aplicación de las medidas de prevención y control de los peligros/riesgos (físicos, ergonómicos, bilógicos, ");

        rbsi462.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi462.setText("Cumple");
        rbsi462.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi462ActionPerformed(evt);
            }
        });

        rbno462.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno462.setText("No cumple");
        rbno462.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno462ActionPerformed(evt);
            }
        });

        btnmv462.setText("Adjuntar Doc");
        btnmv462.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv462ActionPerformed(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel116.setText("químicos, de seguridad, públicos, psicosociales, entre otros).");

        jLabel117.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel117.setText("2. Realizar visita a las instalaciones para verificar el cumplimiento de las medidas de prevención y control por parte de los trabajadores ");

        jLabel118.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel118.setText("de acuerdo con lo enunciado en los planes de prevención y control descritos.");

        jButton18.setText("Criterio");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel112)
                            .addComponent(jButton18)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem46)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem46, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel114)
                        .addGap(372, 372, 372))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel117)
                            .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(rbsi462)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno462)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv462)
                        .addGap(143, 143, 143))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel113)
                            .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi461)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno461)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv461)
                        .addGap(143, 143, 143))))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum46)
                            .addComponent(lblcum46)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel111))
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem46)
                        .addComponent(rbnojustiitem46)
                        .addComponent(noaplicaitem46))
                    .addComponent(btnadjnoitem46)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbsi461)
                                .addComponent(rbno461)
                                .addComponent(btnmv461))
                            .addComponent(jLabel113))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel116)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbsi462)
                                    .addComponent(rbno462)
                                    .addComponent(btnmv462)))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel117)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel118)))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel114)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel121.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel121.setText("Modo de Verificación ");

        jLabel122.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel122.setText("Hay procedimientos, instructivos, actos, protocolos (2.5%)");

        lblnocum47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem47.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem47.setText("No Aplica");
        noaplicaitem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem47ActionPerformed(evt);
            }
        });

        rbjustiitem47.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem47.setText("Justifica");
        rbjustiitem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem47ActionPerformed(evt);
            }
        });

        rbnojustiitem47.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem47.setText("No justifica");
        rbnojustiitem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem47ActionPerformed(evt);
            }
        });

        txtitem47.setColumns(20);
        txtitem47.setRows(5);
        txtitem47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem47KeyPressed(evt);
            }
        });
        jScrollPane21.setViewportView(txtitem47);

        btnadjnoitem47.setText("Adjuntar Doc");
        btnadjnoitem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem47ActionPerformed(evt);
            }
        });

        jLabel123.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel123.setText("1. Solicitar los procedimientos instructivos, fichas técnicas cuando aplique y protocolos de Seguridad y Salud en el Trabajo.");

        rbsi471.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi471.setText("Cumple");
        rbsi471.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi471ActionPerformed(evt);
            }
        });

        rbno471.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno471.setText("No cumple");
        rbno471.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno471ActionPerformed(evt);
            }
        });

        btnmv471.setText("Adjuntar Doc");
        btnmv471.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv471ActionPerformed(evt);
            }
        });

        jLabel124.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jButton19.setText("Criterio");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel122)
                            .addComponent(jButton19)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem47)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem47, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(rbsi471)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno471)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv471)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(822, 822, 822)
                        .addComponent(jLabel124)
                        .addGap(18, 18, 18))))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum47)
                            .addComponent(lblcum47)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel122)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton19)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel121))
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem47)
                        .addComponent(rbnojustiitem47)
                        .addComponent(noaplicaitem47))
                    .addComponent(btnadjnoitem47)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi471)
                            .addComponent(rbno471)
                            .addComponent(btnmv471)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel123)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel124)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 4:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel127.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel127.setText("Modo de Verificación ");

        jLabel128.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel128.setText("Inspección con el COPASST o Vigía  (2.5%)");

        lblnocum48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem48.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem48.setText("No Aplica");
        noaplicaitem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem48ActionPerformed(evt);
            }
        });

        rbjustiitem48.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem48.setText("Justifica");
        rbjustiitem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem48ActionPerformed(evt);
            }
        });

        rbnojustiitem48.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem48.setText("No justifica");
        rbnojustiitem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem48ActionPerformed(evt);
            }
        });

        txtitem48.setColumns(20);
        txtitem48.setRows(5);
        txtitem48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem48KeyPressed(evt);
            }
        });
        jScrollPane22.setViewportView(txtitem48);

        btnadjnoitem48.setText("Adjuntar Doc");
        btnadjnoitem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem48ActionPerformed(evt);
            }
        });

        jLabel129.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel129.setText("1. Solicitar la evidencia  de las inspecciones realizadas a las instalaciones, maquinaria y equipos, incluidos los relacionados con la prevención ");

        rbsi481.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi481.setText("Cumple");
        rbsi481.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi481ActionPerformed(evt);
            }
        });

        rbno481.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno481.setText("No cumple");
        rbno481.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno481ActionPerformed(evt);
            }
        });

        btnmv481.setText("Adjuntar Doc");
        btnmv481.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv481ActionPerformed(evt);
            }
        });

        jLabel130.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel131.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel131.setText("y atención de emergencia y verificar la participación del comité  Paritario o Vigía de Seguridad y Salud en el Trabajo.");

        jButton20.setText("Criterio");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel128)
                            .addComponent(jButton20)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem48)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem48, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(822, 822, 822)
                        .addComponent(jLabel130)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel129)
                            .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(rbsi481)
                        .addGap(18, 18, 18)
                        .addComponent(rbno481)
                        .addGap(18, 18, 18)
                        .addComponent(btnmv481)
                        .addContainerGap(65, Short.MAX_VALUE))))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum48)
                                    .addComponent(lblcum48))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel128)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton20)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel127))
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem48)
                        .addComponent(rbnojustiitem48)
                        .addComponent(noaplicaitem48))
                    .addComponent(btnadjnoitem48)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi481)
                            .addComponent(rbno481)
                            .addComponent(btnmv481)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel131)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel130)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 5:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel132.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel132.setText("Modo de Verificación ");

        jLabel133.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel133.setText("Mantenimiento periódico de instalaciones, equipos, maquinas, herramientas (2.5%)");

        lblnocum49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem49.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem49.setText("No Aplica");
        noaplicaitem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem49ActionPerformed(evt);
            }
        });

        rbjustiitem49.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem49.setText("Justifica");
        rbjustiitem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem49ActionPerformed(evt);
            }
        });

        rbnojustiitem49.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem49.setText("No justifica");
        rbnojustiitem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem49ActionPerformed(evt);
            }
        });

        txtitem49.setColumns(20);
        txtitem49.setRows(5);
        txtitem49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem49KeyPressed(evt);
            }
        });
        jScrollPane23.setViewportView(txtitem49);

        btnadjnoitem49.setText("Adjuntar Doc");
        btnadjnoitem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem49ActionPerformed(evt);
            }
        });

        jLabel134.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel134.setText("1. Solicitar la evidencia del mantenimiento preventivo y/o correctivo en las instalaciones, equipos y herramientas de acuerdo con los manuales de");

        rbsi491.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi491.setText("Cumple");
        rbsi491.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi491ActionPerformed(evt);
            }
        });

        rbno491.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno491.setText("No cumple");
        rbno491.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno491ActionPerformed(evt);
            }
        });

        btnmv491.setText("Adjuntar Doc");
        btnmv491.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv491ActionPerformed(evt);
            }
        });

        jLabel135.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel136.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel136.setText("uso de estos y los informes de las inspecciones o reportes condiciones inseguras.");

        jButton21.setText("Criterio");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(822, 822, 822)
                        .addComponent(jLabel135))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel134)
                            .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(rbsi491)
                        .addGap(18, 18, 18)
                        .addComponent(rbno491)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel133)
                            .addComponent(jButton21)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(noaplicaitem49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem49)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmv491)
                    .addComponent(btnadjnoitem49, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum49)
                            .addComponent(lblcum49)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel133)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton21)))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel132))
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem49)
                        .addComponent(rbnojustiitem49)
                        .addComponent(noaplicaitem49))
                    .addComponent(btnadjnoitem49)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi491)
                            .addComponent(rbno491)
                            .addComponent(btnmv491)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel134)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel136)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel135)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 6:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel137.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel137.setText("Modo de Verificación ");

        jLabel138.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel138.setText("Entrega de elementos de Protección Personal EPP, se verifica con contratistas y ");

        lblnocum50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem50.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem50.setText("No Aplica");
        noaplicaitem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem50ActionPerformed(evt);
            }
        });

        rbjustiitem50.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem50.setText("Justifica");
        rbjustiitem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem50ActionPerformed(evt);
            }
        });

        rbnojustiitem50.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem50.setText("No justifica");
        rbnojustiitem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem50ActionPerformed(evt);
            }
        });

        txtitem50.setColumns(20);
        txtitem50.setRows(5);
        txtitem50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem50KeyPressed(evt);
            }
        });
        jScrollPane24.setViewportView(txtitem50);

        btnadjnoitem50.setText("Adjuntar Doc");
        btnadjnoitem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem50ActionPerformed(evt);
            }
        });

        jLabel139.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel139.setText("1. Solicitar los soportes que evidencien la entrega y reposición de los Elementos de Protección Personal a los trabajadores.  ");

        rbsi501.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi501.setText("Cumple");
        rbsi501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi501ActionPerformed(evt);
            }
        });

        rbno501.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno501.setText("No cumple");
        rbno501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno501ActionPerformed(evt);
            }
        });

        btnmv501.setText("Adjuntar Doc");
        btnmv501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv501ActionPerformed(evt);
            }
        });

        jLabel140.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel142.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel142.setText("subcontratistas (2.5%)");

        jLabel143.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel143.setText("2. Así mismo verificar los soportes que den cuenta del cumplimiento del criterio por parte de los contratistas y subcontratistas.");

        rbsi502.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi502.setText("Cumple");
        rbsi502.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi502ActionPerformed(evt);
            }
        });

        rbno502.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno502.setText("No cumple");
        rbno502.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno502ActionPerformed(evt);
            }
        });

        btnmv502.setText("Adjuntar Doc");
        btnmv502.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv502ActionPerformed(evt);
            }
        });

        jLabel144.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel144.setText("3. Verificar los soportes que evidencien la realización de la capacitación en el uso de Elementos de Protección Personal.");

        rbsi503.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi503.setText("Cumple");
        rbsi503.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi503ActionPerformed(evt);
            }
        });

        rbno503.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno503.setText("No cumple");
        rbno503.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno503ActionPerformed(evt);
            }
        });

        btnmv503.setText("Adjuntar Doc");
        btnmv503.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv503ActionPerformed(evt);
            }
        });

        jLabel145.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel145.setText("4. Establecer si hay documentos escritos o pruebas de la entrega de los elementos de protección personal a los trabajadores.");

        rbsi504.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi504.setText("Cumple");
        rbsi504.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi504ActionPerformed(evt);
            }
        });

        rbno504.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno504.setText("No cumple");
        rbno504.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno504ActionPerformed(evt);
            }
        });

        btnmv504.setText("Adjuntar Doc");
        btnmv504.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv504ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setText("<<< Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save(1).png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton22.setText("Criterio");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel138)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(jLabel142)
                                .addGap(18, 18, 18)
                                .addComponent(jButton22))))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(noaplicaitem50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem50)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem50, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel140))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel144)
                            .addComponent(jLabel145)
                            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel30Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(39, 39, 39)
                                    .addComponent(jButton2))
                                .addComponent(jLabel143))
                            .addComponent(jLabel139))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(rbsi501)
                                .addGap(18, 18, 18)
                                .addComponent(rbno501)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnmv501))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                                .addComponent(rbsi502)
                                .addGap(18, 18, 18)
                                .addComponent(rbno502)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnmv502))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                                .addComponent(rbsi504)
                                .addGap(18, 18, 18)
                                .addComponent(rbno504)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnmv504))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel30Layout.createSequentialGroup()
                                .addComponent(rbsi503)
                                .addGap(18, 18, 18)
                                .addComponent(rbno503)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnmv503)))
                        .addGap(34, 34, 34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum50)
                            .addComponent(lblcum50)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(jLabel138)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel142)
                                    .addComponent(jButton22))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel137))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem50)
                        .addComponent(rbnojustiitem50)
                        .addComponent(noaplicaitem50))
                    .addComponent(btnadjnoitem50)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsi501)
                    .addComponent(rbno501)
                    .addComponent(btnmv501)
                    .addComponent(jLabel139))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsi502)
                    .addComponent(rbno502)
                    .addComponent(btnmv502)
                    .addComponent(jLabel143))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsi503)
                    .addComponent(rbno503)
                    .addComponent(btnmv503)
                    .addComponent(jLabel144))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsi504)
                    .addComponent(rbno504)
                    .addComponent(btnmv504)
                    .addComponent(jLabel145))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel140)
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Mgestion_peligro tr = new Mgestion_peligro();
    
    private void noaplicaitem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem41ActionPerformed
       if (noaplicaitem41.isSelected()) {
            rbsi411.setEnabled(false);
            rbno411.setEnabled(false);
            rbsi412.setEnabled(false);
            rbno412.setEnabled(false);
            btnmv411.setEnabled(false);
            btnmv412.setEnabled(false);
            txtitem41.setEnabled(false);
            btnadjnoitem41.setEnabled(false);
            rbjustiitem41.setEnabled(true);
            rbnojustiitem41.setEnabled(true);
            tr.setI411("");

        } else {
            rbsi411.setEnabled(true);
            rbno411.setEnabled(true);
            rbsi412.setEnabled(true);
            rbno412.setEnabled(true);
            btnmv411.setEnabled(false);
            btnmv412.setEnabled(false);
            txtitem41.setEnabled(false);
            btnadjnoitem41.setEnabled(false);
            rbjustiitem41.setEnabled(false);
            rbnojustiitem41.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem41ActionPerformed

    private void rbjustiitem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem41ActionPerformed
       txtitem41.setEnabled(true);
       tr.setI411("");
    }//GEN-LAST:event_rbjustiitem41ActionPerformed

    private void rbnojustiitem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem41ActionPerformed
        btnadjnoitem41.setEnabled(false);
        txtitem41.setEnabled(false);
        lblcum41.setEnabled(false);
        lblnocum41.setEnabled(true);
        tr.setI411("");
        tr.setI411("No");
        tr.setA411("");
        tr.setA411("Si");
        tr.setV411("");
        tr.setV411("No");
        tr.setV412("");
        tr.setV412("No");
        tr.setJ411("");
    }//GEN-LAST:event_rbnojustiitem41ActionPerformed

    private void txtitem41KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem41KeyPressed
     if (txtitem41.getText().length() > 2) {

            lblcum41.setEnabled(true);
            btnadjnoitem41.setEnabled(true);
            // inserta datos que cumple  

            tr.setI411("");
            tr.setI411("Si");
            tr.setA411("");
            tr.setA411("No");
            tr.setV411("");
            tr.setV411("no aplica");
            tr.setV412("");
            tr.setV412("no aplica");
            tr.setJ411("");
            tr.setJ411(txtitem41.getText());

        } else {
            tr.setJ411("");
            tr.setI411("");
            
            lblcum41.setEnabled(false);
            lblnocum41.setEnabled(false);
            btnadjnoitem41.setEnabled(false);
        }
    }//GEN-LAST:event_txtitem41KeyPressed

    private void btnadjnoitem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem41ActionPerformed
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
               tr.setId(41);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem41ActionPerformed

    private void rbsi411ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi411ActionPerformed
      tr.setV411("");
        tr.setV411("Si");
        btnmv411.setEnabled(true);
        
        if(rbsi411.isSelected() && rbsi412.isSelected()){
            lblcum41.setEnabled(true);
            lblnocum41.setEnabled(false);
        }

    }//GEN-LAST:event_rbsi411ActionPerformed

    private void rbno411ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno411ActionPerformed
    tr.setV411("");
        tr.setV411("No");
        btnmv411.setEnabled(false);
        
        if(rbno411.isSelected() || rbno412.isSelected() ){
            lblcum41.setEnabled(false);
            lblnocum41.setEnabled(true);
        }
    }//GEN-LAST:event_rbno411ActionPerformed

    private void btnmv411ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv411ActionPerformed
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
               tr.setId(60);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv411ActionPerformed

    private void noaplicaitem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem43ActionPerformed
      if(noaplicaitem43.isSelected()){
        rbsi431.setEnabled(false);
        rbno431.setEnabled(false);
         rbsi432.setEnabled(false);
        rbno432.setEnabled(false);
         rbsi433.setEnabled(false);
        rbno433.setEnabled(false);
        btnmv431.setEnabled(false);
        btnmv432.setEnabled(false);
        btnmv433.setEnabled(false);
        txtitem43.setEnabled(false);
          btnadjnoitem43.setEnabled(false);
         rbjustiitem43.setEnabled(true);
          rbnojustiitem43.setEnabled(true);
           tr.setI431("");
        
        }else{
          rbsi431.setEnabled(true);
        rbno431.setEnabled(true);
         rbsi432.setEnabled(true);
        rbno432.setEnabled(true);
         rbsi433.setEnabled(true);
        rbno433.setEnabled(true);
        btnmv431.setEnabled(false);
        btnmv432.setEnabled(false);
        btnmv433.setEnabled(false);
        txtitem43.setEnabled(false);
          btnadjnoitem43.setEnabled(false);
         rbjustiitem43.setEnabled(false);
          rbnojustiitem43.setEnabled(false);  
            
            
        }

    }//GEN-LAST:event_noaplicaitem43ActionPerformed

    private void rbjustiitem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem43ActionPerformed
       txtitem43.setEnabled(true);
        tr.setI431("");
    }//GEN-LAST:event_rbjustiitem43ActionPerformed

    private void rbnojustiitem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem43ActionPerformed
       btnadjnoitem43.setEnabled(false);
        txtitem43.setEnabled(false);
        lblcum43.setEnabled(false);
        lblnocum43.setEnabled(true);
         tr.setI431("");
        tr.setI431("No");
        tr.setA431("");
        tr.setA431("Si");
        tr.setV431("");
        tr.setV431("No");
        tr.setV432("");
        tr.setV432("No");
        tr.setV433("");
        tr.setV433("No");
        tr.setJ431("");
    }//GEN-LAST:event_rbnojustiitem43ActionPerformed

    private void txtitem43KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem43KeyPressed
    
    if(txtitem43.getText().length()>2){
       
       lblcum43.setEnabled(true);
       btnadjnoitem43.setEnabled(true);
     // inserta datos que cumple  
     
    
       tr.setI431("");
       tr.setI431("Si");
       tr.setA431("");
       tr.setA431("No");
       tr.setV431("");
       tr.setV431("no aplica");
       tr.setV432("");
       tr.setV432("no aplica");
       tr.setV433("");
       tr.setV433("no aplica");
       tr.setJ431("");
       tr.setJ431(txtitem43.getText());
       
       
   }else{
        tr.setJ431("");
            tr.setI431("");
                  
            lblcum43.setEnabled(false);
            lblnocum43.setEnabled(false);
            btnadjnoitem43.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem43KeyPressed

    private void btnadjnoitem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadjnoitem43ActionPerformed

    private void rbsi431ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi431ActionPerformed
        tr.setV431("");
        tr.setV431("Si");
        btnmv431.setEnabled(true);
        
        if(rbsi431.isSelected() && rbsi432.isSelected() && rbsi433.isSelected()){
            lblcum43.setEnabled(true);
            lblnocum43.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi431ActionPerformed

    private void rbno431ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno431ActionPerformed
         tr.setV431("");
        tr.setV431("No");
        btnmv431.setEnabled(false);
        
        if(rbno431.isSelected() || rbno432.isSelected() || rbno433.isSelected()){
            lblcum43.setEnabled(false);
            lblnocum43.setEnabled(true);
        }

    }//GEN-LAST:event_rbno431ActionPerformed

    private void btnmv431ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv431ActionPerformed
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
               tr.setId(64);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv431ActionPerformed

    private void rbsi433ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi433ActionPerformed
       tr.setV433("");
        tr.setV433("Si");
        btnmv433.setEnabled(true);
        
        if(rbsi431.isSelected() && rbsi432.isSelected() && rbsi433.isSelected()){
            lblcum43.setEnabled(true);
            lblnocum43.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi433ActionPerformed

    private void rbno433ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno433ActionPerformed
          tr.setV433("");
        tr.setV433("No");
        btnmv433.setEnabled(false);
        
        if(rbno431.isSelected() || rbno432.isSelected() || rbno433.isSelected()){
            lblcum43.setEnabled(false);
            lblnocum43.setEnabled(true);
        }

    }//GEN-LAST:event_rbno433ActionPerformed

    private void btnmv433ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv433ActionPerformed
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
               tr.setId(66);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv433ActionPerformed

    private void rbsi432ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi432ActionPerformed
       tr.setV432("");
        tr.setV432("Si");
        btnmv432.setEnabled(true);
        
        if(rbsi431.isSelected() && rbsi432.isSelected() && rbsi433.isSelected()){
            lblcum43.setEnabled(true);
            lblnocum43.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi432ActionPerformed

    private void rbno432ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno432ActionPerformed
         tr.setV432("");
        tr.setV432("No");
        btnmv432.setEnabled(false);
        
        if(rbno431.isSelected() || rbno432.isSelected() || rbno433.isSelected()){
            lblcum43.setEnabled(false);
            lblnocum43.setEnabled(true);
        }

    }//GEN-LAST:event_rbno432ActionPerformed

    private void btnmv432ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv432ActionPerformed
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
               tr.setId(65);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv432ActionPerformed

    private void noaplicaitem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem44ActionPerformed
    if(noaplicaitem44.isSelected()){
        rbsi441.setEnabled(false);
        rbno441.setEnabled(false);
        btnmv441.setEnabled(false);
        txtitem44.setEnabled(false);
        btnadjnoitem44.setEnabled(false);
         rbjustiitem44.setEnabled(true);
          rbnojustiitem44.setEnabled(true);
          tr.setI441("");

        
        }else{
          rbsi441.setEnabled(true);
        rbno441.setEnabled(true);
        btnmv441.setEnabled(false);
        txtitem44.setEnabled(false);
        btnadjnoitem44.setEnabled(false);
         rbjustiitem44.setEnabled(false);
          rbnojustiitem44.setEnabled(false);
            
            
        }     
    }//GEN-LAST:event_noaplicaitem44ActionPerformed

    private void rbjustiitem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem44ActionPerformed
      txtitem44.setEnabled(true);
      tr.setI441("");

    }//GEN-LAST:event_rbjustiitem44ActionPerformed

    private void rbnojustiitem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem44ActionPerformed
         btnadjnoitem44.setEnabled(false);
        txtitem44.setEnabled(false);
        lblcum44.setEnabled(false);
        lblnocum44.setEnabled(true);
         tr.setI441("");
        tr.setI441("No");
        tr.setA441("");
        tr.setA441("Si");
        tr.setV441("");
        tr.setV441("No");
        tr.setJ441("");
    }//GEN-LAST:event_rbnojustiitem44ActionPerformed

    private void txtitem44KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem44KeyPressed
        if(txtitem44.getText().length()>2){        
        lblcum44.setEnabled(true);
       btnadjnoitem44.setEnabled(true);
     // inserta datos que cumple  
       tr.setI441("");
       tr.setI441("Si");
       tr.setA441("");
       tr.setA441("No");
       tr.setV441("");
       tr.setV441("no aplica");
       tr.setJ441("");
       tr.setJ441(txtitem44.getText());
       
       
   }else{
        tr.setJ441("");
        tr.setI441("");
          
        
            lblcum44.setEnabled(false);
            lblnocum44.setEnabled(false);
            btnadjnoitem44.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem44KeyPressed

    private void btnadjnoitem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem44ActionPerformed
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
               tr.setId(44);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem44ActionPerformed

    private void rbsi441ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi441ActionPerformed
       tr.setV441("");
 tr.setV441("Si");
 btnmv441.setEnabled(true);
        
        if(rbsi441.isSelected()){
            lblcum44.setEnabled(true);
            lblnocum44.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi441ActionPerformed

    private void rbno441ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno441ActionPerformed
       tr.setV441("");
        tr.setV441("No");
        btnmv441.setEnabled(false);
        
        if(rbno441.isSelected()){
            lblcum44.setEnabled(false);
            lblnocum44.setEnabled(true);
        }
    }//GEN-LAST:event_rbno441ActionPerformed

    private void btnmv441ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv441ActionPerformed
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
               tr.setId(67);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv441ActionPerformed

    private void rbsi412ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi412ActionPerformed
      tr.setV412("");
        tr.setV412("Si");
        btnmv412.setEnabled(true);
        
        if(rbsi411.isSelected() && rbsi412.isSelected()){
            lblcum41.setEnabled(true);
            lblnocum41.setEnabled(false);
        }

    }//GEN-LAST:event_rbsi412ActionPerformed

    private void rbno412ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno412ActionPerformed
      tr.setV412("");
        tr.setV412("No");
        btnmv412.setEnabled(false);
        
        if(rbno411.isSelected() || rbno412.isSelected() ){
            lblcum41.setEnabled(false);
            lblnocum41.setEnabled(true);
        }
    }//GEN-LAST:event_rbno412ActionPerformed

    private void btnmv412ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv412ActionPerformed
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
               tr.setId(61);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv412ActionPerformed

    private void noaplicaitem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem42ActionPerformed
   if (noaplicaitem42.isSelected()) {
            rbsi421.setEnabled(false);
            rbno421.setEnabled(false);
            rbsi422.setEnabled(false);
            rbno422.setEnabled(false);
            btnmv421.setEnabled(false);
            btnmv422.setEnabled(false);
            txtitem42.setEnabled(false);
            btnadjnoitem42.setEnabled(false);
            rbjustiitem42.setEnabled(true);
            rbnojustiitem42.setEnabled(true);
            tr.setI421("");

        } else {
            rbsi421.setEnabled(true);
            rbno421.setEnabled(true);
            rbsi422.setEnabled(true);
            rbno422.setEnabled(true);
            btnmv421.setEnabled(false);
            btnmv422.setEnabled(false);
            txtitem42.setEnabled(false);
            btnadjnoitem42.setEnabled(false);
             rbjustiitem42.setEnabled(false);
            rbnojustiitem42.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem42ActionPerformed

    private void rbjustiitem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem42ActionPerformed
      txtitem42.setEnabled(true);
      tr.setI421("");

    }//GEN-LAST:event_rbjustiitem42ActionPerformed

    private void rbnojustiitem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem42ActionPerformed
      btnadjnoitem42.setEnabled(false);
        txtitem42.setEnabled(false);
        lblcum42.setEnabled(false);
        lblnocum42.setEnabled(true);
        tr.setI421("");
        tr.setI421("No");
        tr.setA421("");
        tr.setA421("Si");
        tr.setV421("");
        tr.setV421("No");
        tr.setV422("");
        tr.setV422("No");
        tr.setJ421("");
        
    }//GEN-LAST:event_rbnojustiitem42ActionPerformed

    private void txtitem42KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem42KeyPressed
      
   if (txtitem42.getText().length() > 2) {

            lblcum42.setEnabled(true);
            btnadjnoitem42.setEnabled(true);
            // inserta datos que cumple  

            tr.setI421("");
            tr.setI421("Si");
            tr.setA421("");
            tr.setA421("No");
            tr.setV421("");
            tr.setV421("no aplica");
            tr.setV422("");
            tr.setV422("no aplica");
            tr.setJ421("");
            tr.setJ421(txtitem42.getText());

        } else {
            tr.setJ421("");
            tr.setI421("");
           
            lblcum42.setEnabled(false);
            lblnocum42.setEnabled(false);
            btnadjnoitem42.setEnabled(false);
        }
    }//GEN-LAST:event_txtitem42KeyPressed

    private void btnadjnoitem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem42ActionPerformed
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
               tr.setId(42);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem42ActionPerformed

    private void rbsi421ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi421ActionPerformed
      tr.setV421("");
        tr.setV421("Si");
        btnmv421.setEnabled(true);
        
        if(rbsi421.isSelected() && rbsi422.isSelected()){
            lblcum42.setEnabled(true);
            lblnocum42.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi421ActionPerformed

    private void rbno421ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno421ActionPerformed
         tr.setV421("");
        tr.setV421("No");
        btnmv421.setEnabled(false);
        
        if(rbno421.isSelected() || rbno422.isSelected() ){
            lblcum42.setEnabled(false);
            lblnocum42.setEnabled(true);
        }

    }//GEN-LAST:event_rbno421ActionPerformed

    private void btnmv421ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv421ActionPerformed
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
               tr.setId(62);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv421ActionPerformed

    private void rbsi422ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi422ActionPerformed
        tr.setV422("");
        tr.setV422("Si");
        btnmv422.setEnabled(true);
        
        if(rbsi421.isSelected() && rbsi422.isSelected()){
            lblcum42.setEnabled(true);
            lblnocum42.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi422ActionPerformed

    private void rbno422ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno422ActionPerformed
          tr.setV422("");
        tr.setV422("No");
        btnmv422.setEnabled(false);
        
        if(rbno421.isSelected() || rbno422.isSelected() ){
            lblcum42.setEnabled(false);
            lblnocum42.setEnabled(true);
        }

    }//GEN-LAST:event_rbno422ActionPerformed

    private void btnmv422ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv422ActionPerformed
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
               tr.setId(63);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv422ActionPerformed

    private void noaplicaitem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem45ActionPerformed
        if(noaplicaitem45.isSelected()){
        rbsi451.setEnabled(false);
        rbno451.setEnabled(false);
         rbsi452.setEnabled(false);
        rbno452.setEnabled(false);
         rbsi453.setEnabled(false);
        rbno453.setEnabled(false);
        btnmv451.setEnabled(false);
        btnmv452.setEnabled(false);
        btnmv453.setEnabled(false);
        txtitem45.setEnabled(false);
          btnadjnoitem45.setEnabled(false);
          rbjustiitem45.setEnabled(true);
          rbnojustiitem45.setEnabled(true);
          
           tr.setI451("");
        
        }else{
          rbsi451.setEnabled(true);
        rbno451.setEnabled(true);
         rbsi452.setEnabled(true);
        rbno452.setEnabled(true);
         rbsi453.setEnabled(true);
        rbno453.setEnabled(true);
        btnmv451.setEnabled(false);
        btnmv452.setEnabled(false);
        btnmv453.setEnabled(false);
        txtitem45.setEnabled(false);
          btnadjnoitem45.setEnabled(false);
          rbjustiitem45.setEnabled(false);
          rbnojustiitem45.setEnabled(false);  
            
            
        }
    }//GEN-LAST:event_noaplicaitem45ActionPerformed

    private void rbjustiitem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem45ActionPerformed
       txtitem45.setEnabled(true);
        tr.setI451("");
    }//GEN-LAST:event_rbjustiitem45ActionPerformed

    private void rbnojustiitem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem45ActionPerformed
        btnadjnoitem45.setEnabled(false);
        txtitem45.setEnabled(false);
        lblcum45.setEnabled(false);
        lblnocum45.setEnabled(true);
         tr.setI451("");
        tr.setI451("No");
        tr.setA451("");
        tr.setA451("Si");
        tr.setV451("");
        tr.setV451("No");
        tr.setV452("");
        tr.setV452("No");
        tr.setV453("");
        tr.setV453("No");
        tr.setJ451("");
    }//GEN-LAST:event_rbnojustiitem45ActionPerformed

    private void txtitem45KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem45KeyPressed
       if(txtitem45.getText().length()>2){
       
       lblcum45.setEnabled(true);
       btnadjnoitem45.setEnabled(true);
     // inserta datos que cumple  
     
    
       tr.setI451("");
       tr.setI451("Si");
       tr.setA451("");
       tr.setA451("No");
       tr.setV451("");
       tr.setV452("");
       tr.setV453("");
       tr.setV451("no aplica");
       tr.setV452("no aplica");
       tr.setV453("no aplica");
       tr.setJ451("");
       tr.setJ451(txtitem45.getText());
       
       
   }else{
        tr.setJ451("");
            tr.setI451("");
                
            lblcum45.setEnabled(false);
            lblnocum45.setEnabled(false);
            btnadjnoitem45.setEnabled(false);
   }
        
    }//GEN-LAST:event_txtitem45KeyPressed

    private void btnadjnoitem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem45ActionPerformed
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
               tr.setId(45);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem45ActionPerformed

    private void rbsi451ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi451ActionPerformed
          tr.setV451("");
        tr.setV451("Si");
        btnmv451.setEnabled(true);
        
        if(rbsi451.isSelected() && rbsi452.isSelected() && rbsi453.isSelected()){
            lblcum45.setEnabled(true);
            lblnocum45.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi451ActionPerformed

    private void rbno451ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno451ActionPerformed
       tr.setV451("");
        tr.setV451("No");
        btnmv451.setEnabled(false);
        
        if(rbno451.isSelected() || rbno452.isSelected() || rbno453.isSelected()){
            lblcum45.setEnabled(false);
            lblnocum45.setEnabled(true);
        }
    }//GEN-LAST:event_rbno451ActionPerformed

    private void btnmv451ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv451ActionPerformed
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
               tr.setId(68);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv451ActionPerformed

    private void noaplicaitem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem46ActionPerformed
      if (noaplicaitem46.isSelected()) {
            rbsi461.setEnabled(false);
            rbno461.setEnabled(false);
            rbsi462.setEnabled(false);
            rbno462.setEnabled(false);
            btnmv461.setEnabled(false);
            btnmv462.setEnabled(false);
            txtitem46.setEnabled(false);
            btnadjnoitem46.setEnabled(false);
             rbjustiitem46.setEnabled(true);
            rbnojustiitem46.setEnabled(true);
            
            tr.setI461("");

        } else {
            rbsi461.setEnabled(true);
            rbno461.setEnabled(true);
            rbsi462.setEnabled(true);
            rbno462.setEnabled(true);
            btnmv461.setEnabled(false);
            btnmv462.setEnabled(false);
            txtitem46.setEnabled(false);
            btnadjnoitem46.setEnabled(false);
            rbjustiitem46.setEnabled(false);
            rbnojustiitem46.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem46ActionPerformed

    private void rbjustiitem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem46ActionPerformed
      txtitem46.setEnabled(true);
      tr.setI461("");
    }//GEN-LAST:event_rbjustiitem46ActionPerformed

    private void rbnojustiitem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem46ActionPerformed
        btnadjnoitem46.setEnabled(false);
        txtitem46.setEnabled(false);
        lblcum46.setEnabled(false);
        lblnocum46.setEnabled(true);
        tr.setI461("");
        tr.setI461("No");
        tr.setA461("");
        tr.setA461("Si");
        tr.setV461("");
        tr.setV461("No");
        tr.setV462("");
        tr.setV462("No");
        tr.setJ461("");

    }//GEN-LAST:event_rbnojustiitem46ActionPerformed

    private void txtitem46KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem46KeyPressed
     if (txtitem46.getText().length() > 2) {

            lblcum46.setEnabled(true);
            btnadjnoitem46.setEnabled(true);
            // inserta datos que cumple  

            tr.setI461("");
            tr.setI461("Si");
            tr.setA461("");
            tr.setA461("No");
            tr.setV461("");
            tr.setV462("");
            tr.setV461("no aplica");
            tr.setV462("no aplica");
            tr.setJ461("");
            tr.setJ461(txtitem46.getText());

        } else {
            tr.setJ461("");
            tr.setI461("");
            tr.setI461("No");
            tr.setA461("");
            tr.setA461("No");
            tr.setV461("");
            tr.setV461("No");
            tr.setV462("");
            tr.setV462("No");

            lblcum46.setEnabled(false);
            lblnocum46.setEnabled(false);
            btnadjnoitem46.setEnabled(false);
        }
    }//GEN-LAST:event_txtitem46KeyPressed

    private void btnadjnoitem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem46ActionPerformed
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
               tr.setId(46);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem46ActionPerformed

    private void rbsi461ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi461ActionPerformed
        tr.setV461("");
        tr.setV461("Si");
        btnmv461.setEnabled(true);
        
        if(rbsi461.isSelected() && rbsi462.isSelected()){
            lblcum46.setEnabled(true);
            lblnocum46.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi461ActionPerformed

    private void rbno461ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno461ActionPerformed
         tr.setV461("");
        tr.setV461("No");
        btnmv461.setEnabled(false);
        
        if(rbno461.isSelected() || rbno462.isSelected() ){
            lblcum46.setEnabled(false);
            lblnocum46.setEnabled(true);
        }
    }//GEN-LAST:event_rbno461ActionPerformed

    private void btnmv461ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv461ActionPerformed
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
               tr.setId(71);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv461ActionPerformed

    private void rbsi462ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi462ActionPerformed
        tr.setV462("");
        tr.setV462("Si");
        btnmv462.setEnabled(true);
        
        if(rbsi461.isSelected() && rbsi462.isSelected()){
            lblcum46.setEnabled(true);
            lblnocum46.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi462ActionPerformed

    private void rbno462ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno462ActionPerformed
        tr.setV462("");
        tr.setV462("No");
        btnmv462.setEnabled(false);
        
        if(rbno461.isSelected() || rbno462.isSelected() ){
            lblcum46.setEnabled(false);
            lblnocum46.setEnabled(true);
        }
    }//GEN-LAST:event_rbno462ActionPerformed

    private void btnmv462ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv462ActionPerformed
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
               tr.setId(72);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv462ActionPerformed

    private void noaplicaitem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem47ActionPerformed
      if(noaplicaitem47.isSelected()){
        rbsi471.setEnabled(false);
        rbno471.setEnabled(false);
        btnmv471.setEnabled(false);
        txtitem47.setEnabled(false);
        btnadjnoitem47.setEnabled(false);
         rbjustiitem47.setEnabled(true);
          rbnojustiitem47.setEnabled(true);
           tr.setI471("");
        
        }else{
          rbsi471.setEnabled(true);
        rbno471.setEnabled(true);
        btnmv471.setEnabled(false);
        txtitem47.setEnabled(false);
        btnadjnoitem47.setEnabled(false);
         rbjustiitem47.setEnabled(false);
          rbnojustiitem47.setEnabled(false);
            
            
        } 
    }//GEN-LAST:event_noaplicaitem47ActionPerformed

    private void rbjustiitem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem47ActionPerformed
        txtitem47.setEnabled(true);
         tr.setI471("");
    }//GEN-LAST:event_rbjustiitem47ActionPerformed

    private void rbnojustiitem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem47ActionPerformed
        btnadjnoitem47.setEnabled(false);
        txtitem47.setEnabled(false);
        lblcum47.setEnabled(false);
        lblnocum47.setEnabled(true);
         tr.setI471("");
        tr.setI471("No");
        tr.setA471("");
        tr.setA471("Si");
        tr.setV471("");
        tr.setV471("No");
        tr.setJ471("");
    }//GEN-LAST:event_rbnojustiitem47ActionPerformed

    private void txtitem47KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem47KeyPressed
        if(txtitem47.getText().length()>2){        
        lblcum47.setEnabled(true);
       btnadjnoitem47.setEnabled(true);
     // inserta datos que cumple  
       tr.setI471("");
       tr.setI471("Si");
       tr.setA471("");
       tr.setA471("No");
       tr.setV471("");
       tr.setV471("no aplica");
       tr.setJ471("");
       tr.setJ471(txtitem47.getText());
       
       
   }else{
        tr.setJ471("");
        tr.setI471("");
         
        
            lblcum47.setEnabled(false);
            lblnocum47.setEnabled(false);
            btnadjnoitem47.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem47KeyPressed

    private void btnadjnoitem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem47ActionPerformed
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
               tr.setId(47);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem47ActionPerformed

    private void rbsi471ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi471ActionPerformed
       tr.setV471("");
 tr.setV471("Si");
 btnmv471.setEnabled(true);
        
        if(rbsi471.isSelected()){
            lblcum47.setEnabled(true);
            lblnocum47.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi471ActionPerformed

    private void rbno471ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno471ActionPerformed
       tr.setV471("");
        tr.setV471("No");
        btnmv471.setEnabled(false);
        
        if(rbno471.isSelected()){
            lblcum47.setEnabled(false);
            lblnocum47.setEnabled(true);
        }
    }//GEN-LAST:event_rbno471ActionPerformed

    private void btnmv471ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv471ActionPerformed
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
               tr.setId(73);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv471ActionPerformed

    private void rbsi452ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi452ActionPerformed
        tr.setV452("");
        tr.setV452("Si");
        btnmv452.setEnabled(true);
        
        if(rbsi451.isSelected() && rbsi452.isSelected() && rbsi453.isSelected()){
            lblcum45.setEnabled(true);
            lblnocum45.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi452ActionPerformed

    private void rbno452ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno452ActionPerformed
       tr.setV452("");
        tr.setV452("No");
        btnmv452.setEnabled(false);
        
        if(rbno451.isSelected() || rbno452.isSelected() || rbno453.isSelected()){
            lblcum45.setEnabled(false);
            lblnocum45.setEnabled(true);
        }
    }//GEN-LAST:event_rbno452ActionPerformed

    private void btnmv452ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv452ActionPerformed
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
               tr.setId(69);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv452ActionPerformed

    private void rbsi453ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi453ActionPerformed
        tr.setV453("");
        tr.setV453("Si");
        btnmv453.setEnabled(true);
        
        if(rbsi451.isSelected() && rbsi452.isSelected() && rbsi453.isSelected()){
            lblcum45.setEnabled(true);
            lblnocum45.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi453ActionPerformed

    private void rbno453ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno453ActionPerformed
      tr.setV453("");
        tr.setV453("No");
        btnmv453.setEnabled(false);
        
        if(rbno451.isSelected() || rbno452.isSelected() || rbno453.isSelected()){
            lblcum45.setEnabled(false);
            lblnocum45.setEnabled(true);
        }
    }//GEN-LAST:event_rbno453ActionPerformed

    private void btnmv453ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv453ActionPerformed
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
               tr.setId(70);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv453ActionPerformed

    private void noaplicaitem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem48ActionPerformed
       if(noaplicaitem48.isSelected()){
        rbsi481.setEnabled(false);
        rbno481.setEnabled(false);
        btnmv481.setEnabled(false);
        txtitem48.setEnabled(false);
        btnadjnoitem48.setEnabled(false);
          rbjustiitem48.setEnabled(true);
          rbnojustiitem48.setEnabled(true);
           tr.setI481("");

        
        }else{
          rbsi481.setEnabled(true);
        rbno481.setEnabled(true);
        btnmv481.setEnabled(false);
         txtitem48.setEnabled(false);
        btnadjnoitem48.setEnabled(false);
           rbjustiitem48.setEnabled(false);
          rbnojustiitem48.setEnabled(false);
            
            
        }      
    }//GEN-LAST:event_noaplicaitem48ActionPerformed

    private void rbjustiitem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem48ActionPerformed
       txtitem48.setEnabled(true);
        tr.setI481("");

    }//GEN-LAST:event_rbjustiitem48ActionPerformed

    private void rbnojustiitem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem48ActionPerformed
        btnadjnoitem48.setEnabled(false);
        txtitem48.setEnabled(false);
        lblcum48.setEnabled(false);
        lblnocum48.setEnabled(true);
         tr.setI481("");
        tr.setI481("No");
        tr.setA481("");
        tr.setA481("Si");
        tr.setV481("");
        tr.setV481("No");
        tr.setJ481("");
    }//GEN-LAST:event_rbnojustiitem48ActionPerformed

    private void txtitem48KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem48KeyPressed
       if(txtitem48.getText().length()>2){        
        lblcum48.setEnabled(true);
       btnadjnoitem48.setEnabled(true);
     // inserta datos que cumple  
       tr.setI481("");
       tr.setI481("Si");
       tr.setA481("");
       tr.setA481("No");
       tr.setV481("");
       tr.setV481("no aplica");
       tr.setJ481("");
       tr.setJ481(txtitem48.getText());
       
       
   }else{
        tr.setJ481("");
        tr.setI481("");
             
        
            lblcum48.setEnabled(false);
            lblnocum48.setEnabled(false);
            btnadjnoitem48.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem48KeyPressed

    private void btnadjnoitem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem48ActionPerformed
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
               tr.setId(48);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem48ActionPerformed

    private void rbsi481ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi481ActionPerformed
       tr.setV481("");
 tr.setV481("Si");
 btnmv481.setEnabled(true);
        
        if(rbsi481.isSelected()){
            lblcum48.setEnabled(true);
            lblnocum48.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi481ActionPerformed

    private void rbno481ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno481ActionPerformed
        tr.setV481("");
        tr.setV481("No");
        btnmv481.setEnabled(false);
        
        if(rbno481.isSelected()){
            lblcum48.setEnabled(false);
            lblnocum48.setEnabled(true);
        }
    }//GEN-LAST:event_rbno481ActionPerformed

    private void btnmv481ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv481ActionPerformed
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
               tr.setId(74);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv481ActionPerformed

    private void noaplicaitem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem49ActionPerformed
      if(noaplicaitem49.isSelected()){
        rbsi491.setEnabled(false);
        rbno491.setEnabled(false);
        btnmv491.setEnabled(false);
        txtitem49.setEnabled(false);
        btnadjnoitem49.setEnabled(false);
         rbjustiitem49.setEnabled(true);
          rbnojustiitem49.setEnabled(true);
          
          tr.setI491("");
        
        }else{
          rbsi491.setEnabled(true);
        rbno491.setEnabled(true);
        btnmv491.setEnabled(false);
        txtitem49.setEnabled(false);
        btnadjnoitem49.setEnabled(false);
          rbjustiitem49.setEnabled(false);
          rbnojustiitem49.setEnabled(false);
            
            
        }  
    }//GEN-LAST:event_noaplicaitem49ActionPerformed

    private void rbjustiitem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem49ActionPerformed
        txtitem49.setEnabled(true);
        tr.setI491("");
    }//GEN-LAST:event_rbjustiitem49ActionPerformed

    private void rbnojustiitem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem49ActionPerformed
      btnadjnoitem49.setEnabled(false);
        txtitem49.setEnabled(false);
        lblcum49.setEnabled(false);
        lblnocum49.setEnabled(true);
         tr.setI491("");
        tr.setI491("No");
        tr.setA491("");
        tr.setA491("Si");
        tr.setV491("");
        tr.setV491("No");
        tr.setJ491("");
    }//GEN-LAST:event_rbnojustiitem49ActionPerformed

    private void txtitem49KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem49KeyPressed
      if(txtitem49.getText().length()>2){        
        lblcum49.setEnabled(true);
       btnadjnoitem49.setEnabled(true);
     // inserta datos que cumple  
       tr.setI491("");
       tr.setI491("Si");
       tr.setA491("");
       tr.setA491("No");
       tr.setV491("");
       tr.setV491("no aplica");
       tr.setJ491("");
       tr.setJ491(txtitem49.getText());
       
       
   }else{
        tr.setJ491("");
        tr.setI491("");
        
            lblcum49.setEnabled(false);
            lblnocum49.setEnabled(false);
            btnadjnoitem49.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem49KeyPressed

    private void btnadjnoitem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem49ActionPerformed
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
               tr.setId(49);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem49ActionPerformed

    private void rbsi491ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi491ActionPerformed
        tr.setV491("");
 tr.setV491("Si");
 btnmv491.setEnabled(true);
        
        if(rbsi491.isSelected()){
            lblcum49.setEnabled(true);
            lblnocum49.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi491ActionPerformed

    private void rbno491ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno491ActionPerformed
      tr.setV491("");
        tr.setV491("No");
        btnmv491.setEnabled(false);
        
        if(rbno491.isSelected()){
            lblcum49.setEnabled(false);
            lblnocum49.setEnabled(true);
        }
    }//GEN-LAST:event_rbno491ActionPerformed

    private void btnmv491ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv491ActionPerformed
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
               tr.setId(75);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv491ActionPerformed

    private void noaplicaitem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem50ActionPerformed
      if(noaplicaitem50.isSelected()){
        rbsi501.setEnabled(false);
        rbno501.setEnabled(false);
         rbsi502.setEnabled(false);
        rbno502.setEnabled(false);
         rbsi503.setEnabled(false);
        rbno503.setEnabled(false);
        rbsi504.setEnabled(false);
        rbno504.setEnabled(false);
        btnmv501.setEnabled(false);
        btnmv502.setEnabled(false);
        btnmv503.setEnabled(false);
        btnmv504.setEnabled(false);
        txtitem50.setEnabled(false);
          btnadjnoitem50.setEnabled(false);
          rbjustiitem50.setEnabled(true);
          rbnojustiitem50.setEnabled(true);
          tr.setI501("");
        
        }else{
          rbsi501.setEnabled(true);
        rbno501.setEnabled(true);
         rbsi502.setEnabled(true);
        rbno502.setEnabled(true);
         rbsi503.setEnabled(true);
        rbno503.setEnabled(true);
        rbsi504.setEnabled(true);
        rbno504.setEnabled(false);
        btnmv501.setEnabled(false);
        btnmv502.setEnabled(false);
        btnmv503.setEnabled(false);
        btnmv504.setEnabled(false);
         txtitem50.setEnabled(false);
          btnadjnoitem50.setEnabled(false);
          rbjustiitem50.setEnabled(false);
          rbnojustiitem50.setEnabled(false);  
            
            
        }
    }//GEN-LAST:event_noaplicaitem50ActionPerformed

    private void rbjustiitem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem50ActionPerformed
       txtitem50.setEnabled(true);
       tr.setI501("");
    }//GEN-LAST:event_rbjustiitem50ActionPerformed

    private void rbnojustiitem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem50ActionPerformed
       btnadjnoitem50.setEnabled(false);
        txtitem50.setEnabled(false);
        lblcum50.setEnabled(false);
        lblnocum50.setEnabled(true);
         tr.setI501("");
        tr.setI501("No");
        tr.setA501("");
        tr.setA501("Si");
        tr.setV501("");
        tr.setV501("No");
        tr.setV502("");
        tr.setV502("No");
        tr.setV503("");
        tr.setV503("No");
        tr.setV504("");
        tr.setV504("No");
        tr.setJ501("");
    }//GEN-LAST:event_rbnojustiitem50ActionPerformed

    private void txtitem50KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem50KeyPressed
        if(txtitem50.getText().length()>2){
       
       lblcum50.setEnabled(true);
       btnadjnoitem50.setEnabled(true);
     // inserta datos que cumple  
     
    
       tr.setI501("");
       tr.setI501("Si");
       tr.setA501("");
       tr.setA501("No");
       tr.setV501("");
       tr.setV502("");
       tr.setV503("");
       tr.setV504("");
       tr.setV501("no aplica");
       tr.setV502("no aplica");
       tr.setV503("no aplica");
       tr.setV504("no aplica");
       tr.setJ501("");
       tr.setJ501(txtitem50.getText());
       
       
   }else{
        tr.setJ501("");
        tr.setI501("");
                  
            lblcum50.setEnabled(false);
            lblnocum50.setEnabled(false);
            btnadjnoitem50.setEnabled(false);
   }
        
    }//GEN-LAST:event_txtitem50KeyPressed

    private void btnadjnoitem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem50ActionPerformed
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
               tr.setId(50);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem50ActionPerformed

    private void rbsi501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi501ActionPerformed
       
     tr.setV501("");
        tr.setV501("Si");
        btnmv501.setEnabled(true);
        
        if(rbsi501.isSelected() && rbsi502.isSelected() && rbsi503.isSelected() && rbsi504.isSelected()){
            lblcum50.setEnabled(true);
            lblnocum50.setEnabled(false);
        }

    }//GEN-LAST:event_rbsi501ActionPerformed

    private void rbno501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno501ActionPerformed
        tr.setV501("");
        tr.setV501("No");
        btnmv501.setEnabled(false);
        
        if(rbno501.isSelected() || rbno502.isSelected() || rbno503.isSelected() || rbno504.isSelected()){
            lblcum50.setEnabled(false);
            lblnocum50.setEnabled(true);
        }

    }//GEN-LAST:event_rbno501ActionPerformed

    private void btnmv501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv501ActionPerformed
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
               tr.setId(76);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv501ActionPerformed

    private void rbsi502ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi502ActionPerformed
        tr.setV502("");
        tr.setV502("Si");
        btnmv502.setEnabled(true);
        
        if(rbsi501.isSelected() && rbsi502.isSelected() && rbsi503.isSelected() && rbsi504.isSelected()){
            lblcum50.setEnabled(true);
            lblnocum50.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi502ActionPerformed

    private void rbno502ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno502ActionPerformed
        tr.setV502("");
        tr.setV502("No");
        btnmv502.setEnabled(false);
        
        if(rbno501.isSelected() || rbno502.isSelected() || rbno503.isSelected() || rbno504.isSelected()){
            lblcum50.setEnabled(false);
            lblnocum50.setEnabled(true);
        }
    }//GEN-LAST:event_rbno502ActionPerformed

    private void btnmv502ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv502ActionPerformed
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
               tr.setId(77);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv502ActionPerformed

    private void rbsi503ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi503ActionPerformed
       tr.setV503("");
        tr.setV503("Si");
        btnmv503.setEnabled(true);
        
        if(rbsi501.isSelected() && rbsi502.isSelected() && rbsi503.isSelected() && rbsi504.isSelected()){
            lblcum50.setEnabled(true);
            lblnocum50.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi503ActionPerformed

    private void rbno503ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno503ActionPerformed
         tr.setV503("");
        tr.setV503("No");
        btnmv503.setEnabled(false);
        
        if(rbno501.isSelected() || rbno502.isSelected() || rbno503.isSelected() || rbno504.isSelected()){
            lblcum50.setEnabled(false);
            lblnocum50.setEnabled(true);
        }
    }//GEN-LAST:event_rbno503ActionPerformed

    private void btnmv503ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv503ActionPerformed
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
               tr.setId(78);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv503ActionPerformed

    private void rbsi504ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi504ActionPerformed
        tr.setV504("");
        tr.setV504("Si");
        btnmv504.setEnabled(true);
        
        if(rbsi501.isSelected() && rbsi502.isSelected() && rbsi503.isSelected() && rbsi504.isSelected()){
            lblcum50.setEnabled(true);
            lblnocum50.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi504ActionPerformed

    private void rbno504ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno504ActionPerformed
        tr.setV504("");
        tr.setV504("No");
        btnmv504.setEnabled(false);
        
        if(rbno501.isSelected() || rbno502.isSelected() || rbno503.isSelected() || rbno504.isSelected()){
            lblcum50.setEnabled(false);
            lblnocum50.setEnabled(true);
        }
    }//GEN-LAST:event_rbno504ActionPerformed

    private void btnmv504ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv504ActionPerformed
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
               tr.setId(79);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv504ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();
gh.setVisible(true);
gh.toFront();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


        // Item 41
        if(rbsi411.isSelected() && rbsi412.isSelected() ){
            tr.setI411("");
            tr.setI411("si");
            tr.setA411("");
            tr.setA411("si");

        }
        if(rbno411.isSelected() || rbno412.isSelected() ){
           
           if((!rbno411.isSelected() && !rbsi411.isSelected()) || (!rbno412.isSelected() && !rbsi412.isSelected())){   
                
        }else{    
            
            tr.setI411("");
            tr.setI411("no");
            tr.setA411("");
            tr.setA411("si");}

        }
        // Item 42

         if(rbsi421.isSelected() && rbsi422.isSelected() ){
            tr.setI421("");
            tr.setI421("si");
            tr.setA421("");
            tr.setA421("si");

        }
        if(rbno421.isSelected() || rbno422.isSelected() ){
            
         if((!rbno421.isSelected() && !rbsi421.isSelected()) || (!rbno422.isSelected() && !rbsi422.isSelected())){   
                
        }else{      
            tr.setI421("");
            tr.setI421("no");
            tr.setA421("");
            tr.setA421("si");   }

        }

        // Item 43
       if(rbsi431.isSelected() && rbsi432.isSelected() && rbsi433.isSelected() ){
            tr.setI431("");
            tr.setI431("si");
            tr.setA431("");
            tr.setA431("si");

        }
        if(rbno431.isSelected() || rbno432.isSelected() || rbno433.isSelected() ){
          
              if((!rbno431.isSelected() && !rbsi431.isSelected()) || (!rbno432.isSelected() && !rbsi432.isSelected()) || (!rbno433.isSelected() && !rbsi433.isSelected()) 
       ){   
                
        }else{ 
            
            tr.setI431("");
            tr.setI431("no");
            tr.setA431("");
            tr.setA431("si"); }

        }


        // Item 44

        if (rbsi441.isSelected()) {
            tr.setI441("");
            tr.setI441("si");
            tr.setA441("");
            tr.setA441("si");

        }

        if (rbno441.isSelected()) {
            tr.setI441("");
            tr.setI441("no");
            tr.setA441("");
            tr.setA441("si");

        }

        // Item 45

         if(rbsi451.isSelected() && rbsi452.isSelected() && rbsi453.isSelected() ){
            tr.setI451("");
            tr.setI451("si");
            tr.setA451("");
            tr.setA451("si");

        }
        if(rbno451.isSelected() || rbno452.isSelected() || rbno453.isSelected() ){
            
           if((!rbno451.isSelected() && !rbsi451.isSelected()) || (!rbno452.isSelected() && !rbsi452.isSelected()) || (!rbno453.isSelected() && !rbsi453.isSelected()) 
       ){   
                
        }else{    
            
            tr.setI451("");
            tr.setI451("no");
            tr.setA451("");
            tr.setA451("si");  }

        }

        // Item 46
        if(rbsi461.isSelected() && rbsi462.isSelected()){
            tr.setI461("");
            tr.setI461("si");
            tr.setA461("");
            tr.setA461("si");

        }

        if(rbno461.isSelected() || rbno462.isSelected()){
            
       if((!rbno461.isSelected() && !rbsi461.isSelected()) || (!rbno462.isSelected() && !rbsi462.isSelected())){   
                
        }else{       
            
            tr.setI461("");
            tr.setI461("no");
            tr.setA461("");
            tr.setA461("si");  }

        }

        // Item 47
        if(rbsi471.isSelected()){
            tr.setI471("");
            tr.setI471("si");
            tr.setA471("");
            tr.setA471("si");

        }

        if(rbno471.isSelected()){
            tr.setI471("");
            tr.setI471("no");
            tr.setA471("");
            tr.setA471("si");

        }

        // Item 48
       if(rbsi481.isSelected()){
            tr.setI481("");
            tr.setI481("si");
            tr.setA481("");
            tr.setA481("si");

        }

        if(rbno481.isSelected()){
            tr.setI481("");
            tr.setI481("no");
            tr.setA481("");
            tr.setA481("si");

        }
        // Item 49

        if(rbsi491.isSelected()){
            tr.setI491("");
            tr.setI491("si");
            tr.setA491("");
            tr.setA491("si");

        }

        if(rbno491.isSelected()){
            tr.setI491("");
            tr.setI491("no");
            tr.setA491("");
            tr.setA491("si");

        }

        // Item 50
         if(rbsi501.isSelected() && rbsi502.isSelected() && rbsi503.isSelected() && rbsi504.isSelected() ){
            tr.setI501("");
            tr.setI501("si");
            tr.setA501("");
            tr.setA501("si");

        }
        if(rbno501.isSelected() || rbno502.isSelected() || rbno503.isSelected() || rbno504.isSelected() ){
          if((!rbno501.isSelected() && !rbsi501.isSelected()) || (!rbno502.isSelected() && !rbsi502.isSelected()) || (!rbno503.isSelected() && !rbsi503.isSelected()) 
         || (!rbno504.isSelected() && !rbsi504.isSelected())){   
                
        }else{  
            
            tr.setI501("");
            tr.setI501("no");
            tr.setA501("");
            tr.setA501("si");  }

        }

      
      Validar();
        

      


    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_peligrosyriesgos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadjnoitem41;
    private javax.swing.JButton btnadjnoitem42;
    private javax.swing.JButton btnadjnoitem43;
    private javax.swing.JButton btnadjnoitem44;
    private javax.swing.JButton btnadjnoitem45;
    private javax.swing.JButton btnadjnoitem46;
    private javax.swing.JButton btnadjnoitem47;
    private javax.swing.JButton btnadjnoitem48;
    private javax.swing.JButton btnadjnoitem49;
    private javax.swing.JButton btnadjnoitem50;
    private javax.swing.JButton btnmv411;
    private javax.swing.JButton btnmv412;
    private javax.swing.JButton btnmv421;
    private javax.swing.JButton btnmv422;
    private javax.swing.JButton btnmv431;
    private javax.swing.JButton btnmv432;
    private javax.swing.JButton btnmv433;
    private javax.swing.JButton btnmv441;
    private javax.swing.JButton btnmv451;
    private javax.swing.JButton btnmv452;
    private javax.swing.JButton btnmv453;
    private javax.swing.JButton btnmv461;
    private javax.swing.JButton btnmv462;
    private javax.swing.JButton btnmv471;
    private javax.swing.JButton btnmv481;
    private javax.swing.JButton btnmv491;
    private javax.swing.JButton btnmv501;
    private javax.swing.JButton btnmv502;
    private javax.swing.JButton btnmv503;
    private javax.swing.JButton btnmv504;
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
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
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
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JLabel lblcum41;
    private javax.swing.JLabel lblcum42;
    private javax.swing.JLabel lblcum43;
    private javax.swing.JLabel lblcum44;
    private javax.swing.JLabel lblcum45;
    private javax.swing.JLabel lblcum46;
    private javax.swing.JLabel lblcum47;
    private javax.swing.JLabel lblcum48;
    private javax.swing.JLabel lblcum49;
    private javax.swing.JLabel lblcum50;
    private javax.swing.JLabel lblnocum41;
    private javax.swing.JLabel lblnocum42;
    private javax.swing.JLabel lblnocum43;
    private javax.swing.JLabel lblnocum44;
    private javax.swing.JLabel lblnocum45;
    private javax.swing.JLabel lblnocum46;
    private javax.swing.JLabel lblnocum47;
    private javax.swing.JLabel lblnocum48;
    private javax.swing.JLabel lblnocum49;
    private javax.swing.JLabel lblnocum50;
    private javax.swing.JCheckBox noaplicaitem41;
    private javax.swing.JCheckBox noaplicaitem42;
    private javax.swing.JCheckBox noaplicaitem43;
    private javax.swing.JCheckBox noaplicaitem44;
    private javax.swing.JCheckBox noaplicaitem45;
    private javax.swing.JCheckBox noaplicaitem46;
    private javax.swing.JCheckBox noaplicaitem47;
    private javax.swing.JCheckBox noaplicaitem48;
    private javax.swing.JCheckBox noaplicaitem49;
    private javax.swing.JCheckBox noaplicaitem50;
    private javax.swing.JRadioButton rbjustiitem41;
    private javax.swing.JRadioButton rbjustiitem42;
    private javax.swing.JRadioButton rbjustiitem43;
    private javax.swing.JRadioButton rbjustiitem44;
    private javax.swing.JRadioButton rbjustiitem45;
    private javax.swing.JRadioButton rbjustiitem46;
    private javax.swing.JRadioButton rbjustiitem47;
    private javax.swing.JRadioButton rbjustiitem48;
    private javax.swing.JRadioButton rbjustiitem49;
    private javax.swing.JRadioButton rbjustiitem50;
    private javax.swing.JRadioButton rbno411;
    private javax.swing.JRadioButton rbno412;
    private javax.swing.JRadioButton rbno421;
    private javax.swing.JRadioButton rbno422;
    private javax.swing.JRadioButton rbno431;
    private javax.swing.JRadioButton rbno432;
    private javax.swing.JRadioButton rbno433;
    private javax.swing.JRadioButton rbno441;
    private javax.swing.JRadioButton rbno451;
    private javax.swing.JRadioButton rbno452;
    private javax.swing.JRadioButton rbno453;
    private javax.swing.JRadioButton rbno461;
    private javax.swing.JRadioButton rbno462;
    private javax.swing.JRadioButton rbno471;
    private javax.swing.JRadioButton rbno481;
    private javax.swing.JRadioButton rbno491;
    private javax.swing.JRadioButton rbno501;
    private javax.swing.JRadioButton rbno502;
    private javax.swing.JRadioButton rbno503;
    private javax.swing.JRadioButton rbno504;
    private javax.swing.JRadioButton rbnojustiitem41;
    private javax.swing.JRadioButton rbnojustiitem42;
    private javax.swing.JRadioButton rbnojustiitem43;
    private javax.swing.JRadioButton rbnojustiitem44;
    private javax.swing.JRadioButton rbnojustiitem45;
    private javax.swing.JRadioButton rbnojustiitem46;
    private javax.swing.JRadioButton rbnojustiitem47;
    private javax.swing.JRadioButton rbnojustiitem48;
    private javax.swing.JRadioButton rbnojustiitem49;
    private javax.swing.JRadioButton rbnojustiitem50;
    private javax.swing.JRadioButton rbsi411;
    private javax.swing.JRadioButton rbsi412;
    private javax.swing.JRadioButton rbsi421;
    private javax.swing.JRadioButton rbsi422;
    private javax.swing.JRadioButton rbsi431;
    private javax.swing.JRadioButton rbsi432;
    private javax.swing.JRadioButton rbsi433;
    private javax.swing.JRadioButton rbsi441;
    private javax.swing.JRadioButton rbsi451;
    private javax.swing.JRadioButton rbsi452;
    private javax.swing.JRadioButton rbsi453;
    private javax.swing.JRadioButton rbsi461;
    private javax.swing.JRadioButton rbsi462;
    private javax.swing.JRadioButton rbsi471;
    private javax.swing.JRadioButton rbsi481;
    private javax.swing.JRadioButton rbsi491;
    private javax.swing.JRadioButton rbsi501;
    private javax.swing.JRadioButton rbsi502;
    private javax.swing.JRadioButton rbsi503;
    private javax.swing.JRadioButton rbsi504;
    private javax.swing.JTextArea txtitem41;
    private javax.swing.JTextArea txtitem42;
    private javax.swing.JTextArea txtitem43;
    private javax.swing.JTextArea txtitem44;
    private javax.swing.JTextArea txtitem45;
    private javax.swing.JTextArea txtitem46;
    private javax.swing.JTextArea txtitem47;
    private javax.swing.JTextArea txtitem48;
    private javax.swing.JTextArea txtitem49;
    private javax.swing.JTextArea txtitem50;
    // End of variables declaration//GEN-END:variables
}
