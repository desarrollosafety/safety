/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Cacciones_preven;
import Controlador.Cevaluacion;
import Controlador.Cgestion_resul;
import Controlador.Crecursos;
import Modelo.Macciones_preven;
import Modelo.Mevaluacion;
import Modelo.Mrecursos;
import java.io.FileInputStream;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.UIManager;

/**
 *
 * @author LENOVO
 */
public class Acciones_preventivas extends javax.swing.JFrame {

    /**
     * Creates new form Acciones_preventivas
     */
    public Acciones_preventivas() {
        initComponents();
        // inhabilitar botones minimizar, cerrar y maximizar
         getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        setLocationRelativeTo(null);
         
             ButtonGroup rbnitem1 = new ButtonGroup();
        rbnitem1.add(rbjustiitem57);
        rbnitem1.add(rbnojustiitem57);

        ButtonGroup rbnitem2 = new ButtonGroup();
        rbnitem2.add(rbjustiitem58);
        rbnitem2.add(rbnojustiitem58);

        ButtonGroup rbnitem3 = new ButtonGroup();
        rbnitem3.add(rbjustiitem59);
        rbnitem3.add(rbnojustiitem59);

        ButtonGroup rbnitem4 = new ButtonGroup();
        rbnitem4.add(rbjustiitem60);
        rbnitem4.add(rbnojustiitem60);
        
         ButtonGroup mv111 = new ButtonGroup();
        mv111.add(rbsi571);
        mv111.add(rbno571);

        ButtonGroup mv112 = new ButtonGroup();
        mv112.add(rbsi581);
        mv112.add(rbno581);

        ButtonGroup mv113 = new ButtonGroup();
        mv113.add(rbsi591);
        mv113.add(rbno591);

        ButtonGroup mv114 = new ButtonGroup();
        mv114.add(rbsi601);
        mv114.add(rbno601);
        
        noVisisbles();
    }
    Mevaluacion ps= new Mevaluacion();
    Evaluacion_Ini gh= new Evaluacion_Ini();
    
    
    private void noVisisbles(){
        
        rbjustiitem57.setEnabled(false);
        rbjustiitem58.setEnabled(false);
        rbjustiitem59.setEnabled(false);
        rbjustiitem60.setEnabled(false);
       
        rbnojustiitem57.setEnabled(false);
        rbnojustiitem58.setEnabled(false);
        rbnojustiitem59.setEnabled(false);
        rbnojustiitem60.setEnabled(false);
        
        txtitem57.setEnabled(false);
        txtitem58.setEnabled(false);
        txtitem59.setEnabled(false);
        txtitem60.setEnabled(false);
        
        btnadjnoitem57.setEnabled(false);
        btnadjnoitem58.setEnabled(false);
        btnadjnoitem59.setEnabled(false);
        btnadjnoitem60.setEnabled(false);
       
        btnmv571.setEnabled(false);
        btnmv581.setEnabled(false);
        btnmv591.setEnabled(false);
        btnmv601.setEnabled(false);
        
        lblcum57.setEnabled(false);
        lblcum58.setEnabled(false);
        lblcum59.setEnabled(false);
        lblcum60.setEnabled(false);
       
        lblnocum57.setEnabled(false);
        lblnocum58.setEnabled(false);
        lblnocum59.setEnabled(false);
        lblnocum60.setEnabled(false);
        
        
        
    }
    
     Cevaluacion cm = new Cevaluacion();
    
   public void Validar(){
       
       
           
       
         if(tr.getI571().equals("")){
        
        JOptionPane.showMessageDialog(null,"El item 1 del estandar E7.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI581().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 2 del estandar E7.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI591().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 3 del estandar E7.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI601().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 4 del estandar E7.1 no se ha diligenciado correctamente ");
        
    }
    
        if(!tr.getI571().equals("") && !tr.getI581().equals("") && !tr.getI591().equals("") && !tr.getI601().equals("")){
     
        
    int dialogButton =JOptionPane.showConfirmDialog(null, "Esta seguro que desea guardar las respuesta diligenciadas en la evaluacion inicial,"
                                                        + " recuerde que si acepta no podra volver a diligenciar este formulario hasta que comience una nueva E. inicial ");
           if(dialogButton == JOptionPane.YES_OPTION){     
          
            
         // Donde se llama al controlador para que guarde los items
        Cacciones_preven func = new Cacciones_preven();

        func.insertarItem57(tr);
        func.insertarItem58(tr);
        func.insertarItem59(tr);
        
        if(func.insertarItem60(tr)){
            JOptionPane.showMessageDialog(rootPane, "Se han registrado los items satisfactoriamente");

        }  
   
   
       ps.setE7(1);
       gh.config();
       int valo=10;
       ps.setBarra(ps.getBarra()+valo);
       this.dispose();
       gh.val=ps.getBarra();
        gh.empezar();
        
        cm.est_accionPreven(ps);
        gh.setVisible(true);
       gh.toFront();
       
      
   
       
           }
       
     }
        
        
    }
    
            
    Macciones_preven tr= new Macciones_preven();
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
        lblnocum57 = new javax.swing.JLabel();
        lblcum57 = new javax.swing.JLabel();
        noaplicaitem57 = new javax.swing.JCheckBox();
        rbjustiitem57 = new javax.swing.JRadioButton();
        rbnojustiitem57 = new javax.swing.JRadioButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtitem57 = new javax.swing.JTextArea();
        btnadjnoitem57 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        rbsi571 = new javax.swing.JRadioButton();
        rbno571 = new javax.swing.JRadioButton();
        btnmv571 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        lblnocum58 = new javax.swing.JLabel();
        lblcum58 = new javax.swing.JLabel();
        noaplicaitem58 = new javax.swing.JCheckBox();
        rbjustiitem58 = new javax.swing.JRadioButton();
        rbnojustiitem58 = new javax.swing.JRadioButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtitem58 = new javax.swing.JTextArea();
        btnadjnoitem58 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        rbsi581 = new javax.swing.JRadioButton();
        rbno581 = new javax.swing.JRadioButton();
        btnmv581 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        lblnocum59 = new javax.swing.JLabel();
        lblcum59 = new javax.swing.JLabel();
        noaplicaitem59 = new javax.swing.JCheckBox();
        rbjustiitem59 = new javax.swing.JRadioButton();
        rbnojustiitem59 = new javax.swing.JRadioButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtitem59 = new javax.swing.JTextArea();
        btnadjnoitem59 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        rbsi591 = new javax.swing.JRadioButton();
        rbno591 = new javax.swing.JRadioButton();
        btnmv591 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        lblnocum60 = new javax.swing.JLabel();
        lblcum60 = new javax.swing.JLabel();
        noaplicaitem60 = new javax.swing.JCheckBox();
        rbjustiitem60 = new javax.swing.JRadioButton();
        rbnojustiitem60 = new javax.swing.JRadioButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtitem60 = new javax.swing.JTextArea();
        btnadjnoitem60 = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        rbsi601 = new javax.swing.JRadioButton();
        rbno601 = new javax.swing.JRadioButton();
        btnmv601 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("frame"); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E7.1Acciones preventivas y correctivas con base a los resultados del sistema de gestión de seguridad y salud en el trabajo (10%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel17.setToolTipText("");

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel62.setText("Modo de Verificación ");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel63.setText("Definir acciones de promoción y prevención con base a resultados del Sistema de ");

        lblnocum57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem57.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem57.setText("No Aplica");
        noaplicaitem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem57ActionPerformed(evt);
            }
        });

        rbjustiitem57.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem57.setText("Justifica");
        rbjustiitem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem57ActionPerformed(evt);
            }
        });

        rbnojustiitem57.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem57.setText("No justifica");
        rbnojustiitem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem57ActionPerformed(evt);
            }
        });

        txtitem57.setColumns(20);
        txtitem57.setRows(5);
        txtitem57.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem57KeyPressed(evt);
            }
        });
        jScrollPane14.setViewportView(txtitem57);

        btnadjnoitem57.setText("Adjuntar Doc");
        btnadjnoitem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem57ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel64.setText("1. Solicitar la evidencia documental  de la implementación de las acciones preventivas y/o correctivas provenientes de los resultados y/o ");

        rbsi571.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi571.setText("Cumple");
        rbsi571.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi571ActionPerformed(evt);
            }
        });

        rbno571.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno571.setText("No cumple");
        rbno571.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno571ActionPerformed(evt);
            }
        });

        btnmv571.setText("Adjuntar Doc");
        btnmv571.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv571ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel66.setText("recomendaciones de conformidad con el criterio.");

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel67.setText("Gestión y Salud en el Trabajo (2.5%)");

        jButton13.setText("Criterio");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbsi571)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbno571)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmv571)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(842, 842, 842)
                        .addComponent(jLabel65))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblnocum57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcum57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jLabel67)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton13))))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(noaplicaitem57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbjustiitem57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnojustiitem57)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadjnoitem57, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum57)
                            .addComponent(lblcum57)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel67)
                                    .addComponent(jButton13))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel62))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem57)
                        .addComponent(rbnojustiitem57)
                        .addComponent(noaplicaitem57))
                    .addComponent(btnadjnoitem57)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(rbsi571)
                    .addComponent(rbno571)
                    .addComponent(btnmv571))
                .addGap(1, 1, 1)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel70.setText("Modo de Verificación ");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel82.setText("Toma de medidas correctivas, preventivas y de mejora (2.5%)");

        lblnocum58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem58.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem58.setText("No Aplica");
        noaplicaitem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem58ActionPerformed(evt);
            }
        });

        rbjustiitem58.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem58.setText("Justifica");
        rbjustiitem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem58ActionPerformed(evt);
            }
        });

        rbnojustiitem58.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem58.setText("No justifica");
        rbnojustiitem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem58ActionPerformed(evt);
            }
        });

        txtitem58.setColumns(20);
        txtitem58.setRows(5);
        txtitem58.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem58KeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(txtitem58);

        btnadjnoitem58.setText("Adjuntar Doc");
        btnadjnoitem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem58ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel83.setText("1. Solicitar la evidencia documental de las acciones correctivas, preventivas y/o de mejora que se implementaron según lo detectado en ");

        rbsi581.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi581.setText("Cumple");
        rbsi581.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi581ActionPerformed(evt);
            }
        });

        rbno581.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno581.setText("No cumple");
        rbno581.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno581ActionPerformed(evt);
            }
        });

        btnmv581.setText("Adjuntar Doc");
        btnmv581.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv581ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel85.setText("en la revisión por la alta dirección del Sistema de Gestión de Seguridad y Salud en el Trabajo.");

        jButton14.setText("Criterio");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jButton14)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem58)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem58, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(rbsi581)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno581)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv581)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(858, 858, 858)
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
                            .addComponent(lblnocum58)
                            .addComponent(lblcum58)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel70))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem58)
                        .addComponent(rbnojustiitem58)
                        .addComponent(noaplicaitem58))
                    .addComponent(btnadjnoitem58)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi581)
                            .addComponent(rbno581)
                            .addComponent(btnmv581))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel84)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel71.setText("Modo de Verificación ");

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel87.setText("Ejecución de acciones preventivas, correctivas y de mejora de la investigación de ");

        lblnocum59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem59.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem59.setText("No Aplica");
        noaplicaitem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem59ActionPerformed(evt);
            }
        });

        rbjustiitem59.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem59.setText("Justifica");
        rbjustiitem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem59ActionPerformed(evt);
            }
        });

        rbnojustiitem59.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem59.setText("No justifica");
        rbnojustiitem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem59ActionPerformed(evt);
            }
        });

        txtitem59.setColumns(20);
        txtitem59.setRows(5);
        txtitem59.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem59KeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(txtitem59);

        btnadjnoitem59.setText("Adjuntar Doc");
        btnadjnoitem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem59ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel88.setText("1. Solicitar la evidencia documental de las acciones preventivas, correctivas y/o de mejora planteadas como resultado de las ");

        rbsi591.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi591.setText("Cumple");
        rbsi591.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi591ActionPerformed(evt);
            }
        });

        rbno591.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno591.setText("No cumple");
        rbno591.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno591ActionPerformed(evt);
            }
        });

        btnmv591.setText("Adjuntar Doc");
        btnmv591.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv591ActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel90.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel90.setText("investigaciones y verificar si han sido efectivas.");

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel91.setText("incidentes, Accidentes de trabajo y enfermedad laboral (2.5%)");

        jButton15.setText("Criterio");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton15))))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem59)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem59, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(rbsi591)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno591)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv591)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(858, 858, 858)
                                .addComponent(jLabel89))
                            .addComponent(jLabel88))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum59)
                            .addComponent(lblcum59)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel87)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel91)
                                    .addComponent(jButton15))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel71))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem59)
                        .addComponent(rbnojustiitem59)
                        .addComponent(noaplicaitem59))
                    .addComponent(btnadjnoitem59)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi591)
                            .addComponent(rbno591)
                            .addComponent(btnmv591))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel89)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel90)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 4:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel72.setText("Modo de Verificación ");

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel92.setText("Implementar medidas y acciones correctivas de autoridades y ARL (2.5%)");

        lblnocum60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem60.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem60.setText("No Aplica");
        noaplicaitem60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem60ActionPerformed(evt);
            }
        });

        rbjustiitem60.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem60.setText("Justifica");
        rbjustiitem60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem60ActionPerformed(evt);
            }
        });

        rbnojustiitem60.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem60.setText("No justifica");
        rbnojustiitem60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem60ActionPerformed(evt);
            }
        });

        txtitem60.setColumns(20);
        txtitem60.setRows(5);
        txtitem60.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem60KeyPressed(evt);
            }
        });
        jScrollPane18.setViewportView(txtitem60);

        btnadjnoitem60.setText("Adjuntar Doc");
        btnadjnoitem60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem60ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel93.setText("1. Solicitar la evidencia documental de las acciones correctivas realizadas en respuesta a los requerimientos o recomendaciones ");

        rbsi601.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi601.setText("Cumple");
        rbsi601.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi601ActionPerformed(evt);
            }
        });

        rbno601.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno601.setText("No cumple");
        rbno601.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno601ActionPerformed(evt);
            }
        });

        btnmv601.setText("Adjuntar Doc");
        btnmv601.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv601ActionPerformed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel95.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel95.setText("de las autoridades administrativas así como de las administradoras de riesgos laborales.");

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

        jButton16.setText("Criterio");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel92)
                            .addComponent(jButton16)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem60)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem60, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(rbsi601)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno601)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmv601)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(494, 494, 494)
                                .addComponent(jButton1)
                                .addGap(39, 39, 39)
                                .addComponent(jButton2)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel94))
                            .addComponent(jLabel93))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum60)
                                    .addComponent(lblcum60))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton16)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel72))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem60)
                        .addComponent(rbnojustiitem60)
                        .addComponent(noaplicaitem60))
                    .addComponent(btnadjnoitem60)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi601)
                            .addComponent(rbno601)
                            .addComponent(btnmv601))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel94)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel95)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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

    private void noaplicaitem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem57ActionPerformed
     if(noaplicaitem57.isSelected()){
        rbsi571.setEnabled(false);
        rbno571.setEnabled(false);
        btnmv571.setEnabled(false);
         txtitem57.setEnabled(false);
        btnadjnoitem57.setEnabled(false);
          rbjustiitem57.setEnabled(true);
          rbnojustiitem57.setEnabled(true);
          
          tr.setI571("");
        
        }else{
          rbsi571.setEnabled(true);
        rbno571.setEnabled(true);
        btnmv571.setEnabled(false);
        txtitem57.setEnabled(false);
        btnadjnoitem57.setEnabled(false);
          rbjustiitem57.setEnabled(false);
          rbnojustiitem57.setEnabled(false);
            
            
        } 
    }//GEN-LAST:event_noaplicaitem57ActionPerformed

    private void rbjustiitem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem57ActionPerformed
      txtitem57.setEnabled(true);
       tr.setI571("");
    }//GEN-LAST:event_rbjustiitem57ActionPerformed

    private void rbnojustiitem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem57ActionPerformed
      
    btnadjnoitem57.setEnabled(false);
        txtitem57.setEnabled(false);
        lblcum57.setEnabled(false);
        lblnocum57.setEnabled(true);
         tr.setI571("");
        tr.setI571("No");
        tr.setA571("");
        tr.setA571("Si");
        tr.setV571("");
        tr.setV571("No");
        tr.setJ571("");
    }//GEN-LAST:event_rbnojustiitem57ActionPerformed

    private void txtitem57KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem57KeyPressed
      if(txtitem57.getText().length()>2){        
        lblcum57.setEnabled(true);
       btnadjnoitem57.setEnabled(true);
     // inserta datos que cumple  
       tr.setI571("");
       tr.setI571("Si");
       tr.setA571("");
       tr.setA571("No");
       tr.setV571("");
       tr.setV571("no aplica");
       tr.setJ571("");
       tr.setJ571(txtitem57.getText());
       
       
   }else{
        tr.setJ571("");
        tr.setI571("");
                
        
            lblcum57.setEnabled(false);
            lblnocum57.setEnabled(false);
            btnadjnoitem57.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem57KeyPressed

    private void btnadjnoitem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem57ActionPerformed
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
               tr.setId(57);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem57ActionPerformed

    private void rbsi571ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi571ActionPerformed
       tr.setV571("");
 tr.setV571("Si");
 btnmv571.setEnabled(true);
        
        if(rbsi571.isSelected()){
            lblcum57.setEnabled(true);
            lblnocum57.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi571ActionPerformed

    private void rbno571ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno571ActionPerformed
      tr.setV571("");
        tr.setV571("No");
        btnmv571.setEnabled(false);
        
        if(rbno571.isSelected()){
            lblcum57.setEnabled(false);
            lblnocum57.setEnabled(true);
        }
    }//GEN-LAST:event_rbno571ActionPerformed

    private void btnmv571ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv571ActionPerformed
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
               tr.setId(88);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv571ActionPerformed

    private void noaplicaitem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem58ActionPerformed
     if(noaplicaitem58.isSelected()){
        rbsi581.setEnabled(false);
        rbno581.setEnabled(false);
        btnmv581.setEnabled(false);
        txtitem58.setEnabled(false);
        btnadjnoitem58.setEnabled(false);
         rbjustiitem58.setEnabled(true);
          rbnojustiitem58.setEnabled(true);
          
          tr.setI581("");
        
        }else{
          rbsi581.setEnabled(true);
        rbno581.setEnabled(true);
        btnmv581.setEnabled(false);
        txtitem58.setEnabled(false);
        btnadjnoitem58.setEnabled(false);
           rbjustiitem58.setEnabled(false);
          rbnojustiitem58.setEnabled(false);
            
            
        }     
    }//GEN-LAST:event_noaplicaitem58ActionPerformed

    private void rbjustiitem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem58ActionPerformed
       txtitem58.setEnabled(true);
       tr.setI581("");
    }//GEN-LAST:event_rbjustiitem58ActionPerformed

    private void rbnojustiitem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem58ActionPerformed
        btnadjnoitem58.setEnabled(false);
        txtitem58.setEnabled(false);
        lblcum58.setEnabled(false);
        lblnocum58.setEnabled(true);
         tr.setI581("");
        tr.setI581("No");
        tr.setA581("");
        tr.setA581("Si");
        tr.setV581("");
        tr.setV581("No");
        tr.setJ581("");

    }//GEN-LAST:event_rbnojustiitem58ActionPerformed

    private void txtitem58KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem58KeyPressed
      if(txtitem58.getText().length()>2){        
        lblcum58.setEnabled(true);
       btnadjnoitem58.setEnabled(true);
     // inserta datos que cumple  
       tr.setI581("");
       tr.setI581("Si");
       tr.setA581("");
       tr.setA581("No");
       tr.setV581("");
       tr.setV581("no aplica");
       tr.setJ581("");
       tr.setJ581(txtitem58.getText());
       
       
   }else{
        tr.setJ581("");
        tr.setI581("");
             
        
            lblcum58.setEnabled(false);
            lblnocum58.setEnabled(false);
            btnadjnoitem58.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem58KeyPressed

    private void btnadjnoitem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem58ActionPerformed
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
               tr.setId(58);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem58ActionPerformed

    private void rbsi581ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi581ActionPerformed
     tr.setV581("");
 tr.setV581("Si");
 btnmv581.setEnabled(true);
        
        if(rbsi581.isSelected()){
            lblcum58.setEnabled(true);
            lblnocum58.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi581ActionPerformed

    private void rbno581ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno581ActionPerformed
      tr.setV581("");
        tr.setV581("No");
        btnmv581.setEnabled(false);
        
        if(rbno581.isSelected()){
            lblcum58.setEnabled(false);
            lblnocum58.setEnabled(true);
        }

    }//GEN-LAST:event_rbno581ActionPerformed

    private void btnmv581ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv581ActionPerformed
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
               tr.setId(89);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv581ActionPerformed

    private void noaplicaitem59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem59ActionPerformed
      if(noaplicaitem59.isSelected()){
        rbsi591.setEnabled(false);
        rbno591.setEnabled(false);
        btnmv591.setEnabled(false);
        txtitem59.setEnabled(false);
        btnadjnoitem59.setEnabled(false);
          rbjustiitem59.setEnabled(true);
          rbnojustiitem59.setEnabled(true);
          
          tr.setI591("");
        
        }else{
          rbsi591.setEnabled(true);
        rbno591.setEnabled(true);
        btnmv591.setEnabled(false);
        txtitem59.setEnabled(false);
        btnadjnoitem59.setEnabled(false);
          rbjustiitem59.setEnabled(false);
          rbnojustiitem59.setEnabled(false);
            
            
        }    
    }//GEN-LAST:event_noaplicaitem59ActionPerformed

    private void rbjustiitem59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem59ActionPerformed
        txtitem59.setEnabled(true);
        tr.setI591("");
    }//GEN-LAST:event_rbjustiitem59ActionPerformed

    private void rbnojustiitem59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem59ActionPerformed
        btnadjnoitem59.setEnabled(false);
        txtitem59.setEnabled(false);
        lblcum59.setEnabled(false);
        lblnocum59.setEnabled(true);
         tr.setI591("");
        tr.setI591("No");
        tr.setA591("");
        tr.setA591("Si");
        tr.setV591("");
        tr.setV591("No");
        tr.setJ591("");
    }//GEN-LAST:event_rbnojustiitem59ActionPerformed

    private void txtitem59KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem59KeyPressed
     if(txtitem59.getText().length()>2){        
        lblcum59.setEnabled(true);
       btnadjnoitem59.setEnabled(true);
     // inserta datos que cumple  
       tr.setI591("");
       tr.setI591("Si");
       tr.setA591("");
       tr.setA591("No");
       tr.setV591("");
       tr.setV591("no aplica");
       tr.setJ591("");
       tr.setJ591(txtitem59.getText());
       
       
   }else{
        tr.setJ591("");
        tr.setI591("");
              
            lblcum59.setEnabled(false);
            lblnocum59.setEnabled(false);
            btnadjnoitem59.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem59KeyPressed

    private void btnadjnoitem59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem59ActionPerformed
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
               tr.setId(59);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem59ActionPerformed

    private void rbsi591ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi591ActionPerformed
      tr.setV591("");
 tr.setV591("Si");
 btnmv591.setEnabled(true);
        
        if(rbsi591.isSelected()){
            lblcum59.setEnabled(true);
            lblnocum59.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi591ActionPerformed

    private void rbno591ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno591ActionPerformed
      tr.setV591("");
        tr.setV591("No");
        btnmv591.setEnabled(false);
        
        if(rbno591.isSelected()){
            lblcum59.setEnabled(false);
            lblnocum59.setEnabled(true);
        }
    }//GEN-LAST:event_rbno591ActionPerformed

    private void btnmv591ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv591ActionPerformed
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
               tr.setId(90);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv591ActionPerformed

    private void noaplicaitem60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem60ActionPerformed
       if(noaplicaitem60.isSelected()){
        rbsi601.setEnabled(false);
        rbno601.setEnabled(false);
        btnmv601.setEnabled(false);
        txtitem60.setEnabled(false);
        btnadjnoitem60.setEnabled(false);
           rbjustiitem60.setEnabled(true);
          rbnojustiitem60.setEnabled(true);
          
          tr.setI601("");
        
        }else{
          rbsi601.setEnabled(true);
        rbno601.setEnabled(true);
        btnmv601.setEnabled(false);
          txtitem60.setEnabled(false);
        btnadjnoitem60.setEnabled(false);
          rbjustiitem60.setEnabled(false);
          rbnojustiitem60.setEnabled(false);
            
            
        }       
        
    }//GEN-LAST:event_noaplicaitem60ActionPerformed

    private void rbjustiitem60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem60ActionPerformed
       txtitem60.setEnabled(true);
        tr.setI601("");
    }//GEN-LAST:event_rbjustiitem60ActionPerformed

    private void rbnojustiitem60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem60ActionPerformed
        btnadjnoitem60.setEnabled(false);
        txtitem60.setEnabled(false);
        lblcum60.setEnabled(false);
        lblnocum60.setEnabled(true);
         tr.setI601("");
        tr.setI601("No");
        tr.setA601("");
        tr.setA601("Si");
        tr.setV601("");
        tr.setV601("No");
        tr.setJ601("");
    }//GEN-LAST:event_rbnojustiitem60ActionPerformed

    private void txtitem60KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem60KeyPressed
       
if(txtitem60.getText().length()>2){        
        lblcum60.setEnabled(true);
       btnadjnoitem60.setEnabled(true);
     // inserta datos que cumple  
       tr.setI601("");
       tr.setI601("Si");
       tr.setA601("");
       tr.setA601("No");
       tr.setV601("");
       tr.setV601("no aplica");
       tr.setJ601("");
       tr.setJ601(txtitem60.getText());
       
       
   }else{
        tr.setJ601("");
        tr.setI601("");
       
            lblcum60.setEnabled(false);
            lblnocum60.setEnabled(false);
            btnadjnoitem60.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem60KeyPressed

    private void btnadjnoitem60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem60ActionPerformed
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
               tr.setId(60);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem60ActionPerformed

    private void rbsi601ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi601ActionPerformed
       tr.setV601("");
 tr.setV601("Si");
 btnmv601.setEnabled(true);
        
        if(rbsi601.isSelected()){
            lblcum60.setEnabled(true);
            lblnocum60.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi601ActionPerformed

    private void rbno601ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno601ActionPerformed
       tr.setV601("");
        tr.setV601("No");
        btnmv601.setEnabled(false);
        
        if(rbno601.isSelected()){
            lblcum60.setEnabled(false);
            lblnocum60.setEnabled(true);
        }
    }//GEN-LAST:event_rbno601ActionPerformed

    private void btnmv601ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv601ActionPerformed
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
               tr.setId(91);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv601ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
      /* Donde se guardan el cumplimiento de los items                       */
  
   // Item 57
        if(rbsi571.isSelected()){
            tr.setI571("");
            tr.setI571("si");
            tr.setA571("");
            tr.setA571("si");

        }

        if(rbno571.isSelected()){
            tr.setI571("");
            tr.setI571("no");
            tr.setA571("");
            tr.setA571("si");

        }
        

        
        // Item 58

        if(rbsi581.isSelected()){
            tr.setI581("");
            tr.setI581("si");
            tr.setA581("");
            tr.setA581("si");

        }

        if(rbno581.isSelected()){
            tr.setI581("");
            tr.setI581("no");
            tr.setA581("");
            tr.setA581("si");

        }

        // Item 59
        if(rbsi591.isSelected()){
            tr.setI591("");
            tr.setI591("si");
            tr.setA591("");
            tr.setA591("si");

        }

        if(rbno591.isSelected()){
            tr.setI591("");
            tr.setI591("no");
            tr.setA591("");
            tr.setA591("si");

        }

        // Item 60

        if(rbsi601.isSelected()){
            tr.setI601("");
            tr.setI601("si");
            tr.setA601("");
            tr.setA601("si");

        }

        if(rbno601.isSelected()){
            tr.setI601("");
            tr.setI601("no");
            tr.setA601("");
            tr.setA601("si");

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
                new Acciones_preventivas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadjnoitem57;
    private javax.swing.JButton btnadjnoitem58;
    private javax.swing.JButton btnadjnoitem59;
    private javax.swing.JButton btnadjnoitem60;
    private javax.swing.JButton btnmv571;
    private javax.swing.JButton btnmv581;
    private javax.swing.JButton btnmv591;
    private javax.swing.JButton btnmv601;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JLabel lblcum57;
    private javax.swing.JLabel lblcum58;
    private javax.swing.JLabel lblcum59;
    private javax.swing.JLabel lblcum60;
    private javax.swing.JLabel lblnocum57;
    private javax.swing.JLabel lblnocum58;
    private javax.swing.JLabel lblnocum59;
    private javax.swing.JLabel lblnocum60;
    private javax.swing.JCheckBox noaplicaitem57;
    private javax.swing.JCheckBox noaplicaitem58;
    private javax.swing.JCheckBox noaplicaitem59;
    private javax.swing.JCheckBox noaplicaitem60;
    private javax.swing.JRadioButton rbjustiitem57;
    private javax.swing.JRadioButton rbjustiitem58;
    private javax.swing.JRadioButton rbjustiitem59;
    private javax.swing.JRadioButton rbjustiitem60;
    private javax.swing.JRadioButton rbno571;
    private javax.swing.JRadioButton rbno581;
    private javax.swing.JRadioButton rbno591;
    private javax.swing.JRadioButton rbno601;
    private javax.swing.JRadioButton rbnojustiitem57;
    private javax.swing.JRadioButton rbnojustiitem58;
    private javax.swing.JRadioButton rbnojustiitem59;
    private javax.swing.JRadioButton rbnojustiitem60;
    private javax.swing.JRadioButton rbsi571;
    private javax.swing.JRadioButton rbsi581;
    private javax.swing.JRadioButton rbsi591;
    private javax.swing.JRadioButton rbsi601;
    private javax.swing.JTextArea txtitem57;
    private javax.swing.JTextArea txtitem58;
    private javax.swing.JTextArea txtitem59;
    private javax.swing.JTextArea txtitem60;
    // End of variables declaration//GEN-END:variables
}
