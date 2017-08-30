/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Cevaluacion;
import Controlador.Cgestion_resul;
import Controlador.Crecursos;
import Modelo.Mevaluacion;
import Modelo.Mgestion_resul;
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
public class Gestion_resul extends javax.swing.JFrame {

    /**
     * Creates new form Gestion_resultadossistema
     */
    public Gestion_resul() {
        initComponents();
        // inhabilitar botones minimizar, cerrar y maximizar
         getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        this.setLocationRelativeTo(null);
        
         ButtonGroup rbnitem1 = new ButtonGroup();
        rbnitem1.add(rbjustiitem53);
        rbnitem1.add(rbnojustiitem53);

        ButtonGroup rbnitem2 = new ButtonGroup();
        rbnitem2.add(rbjustiitem54);
        rbnitem2.add(rbnojustiitem54);

        ButtonGroup rbnitem3 = new ButtonGroup();
        rbnitem3.add(rbjustiitem55);
        rbnitem3.add(rbnojustiitem55);

        ButtonGroup rbnitem4 = new ButtonGroup();
        rbnitem4.add(rbjustiitem56);
        rbnitem4.add(rbnojustiitem56);
        
         ButtonGroup mv111 = new ButtonGroup();
        mv111.add(rbsi531);
        mv111.add(rbno531);

        ButtonGroup mv112 = new ButtonGroup();
        mv112.add(rbsi541);
        mv112.add(rbno541);

        ButtonGroup mv113 = new ButtonGroup();
        mv113.add(rbsi551);
        mv113.add(rbno551);

        ButtonGroup mv114 = new ButtonGroup();
        mv114.add(rbsi561);
        mv114.add(rbno561);

        noVisibles();
        
    }
    Mevaluacion ps= new Mevaluacion();
    Evaluacion_Ini gh= new Evaluacion_Ini();
    public void noVisibles(){
        
         rbjustiitem53.setEnabled(false);
        rbjustiitem54.setEnabled(false);
        rbjustiitem55.setEnabled(false);
        rbjustiitem56.setEnabled(false);
       
        rbnojustiitem53.setEnabled(false);
        rbnojustiitem54.setEnabled(false);
        rbnojustiitem55.setEnabled(false);
        rbnojustiitem56.setEnabled(false);
        
        txtitem53.setEnabled(false);
        txtitem54.setEnabled(false);
        txtitem55.setEnabled(false);
        txtitem56.setEnabled(false);
        
        btnadjnoitem53.setEnabled(false);
        btnadjnoitem54.setEnabled(false);
        btnadjnoitem55.setEnabled(false);
        btnadjnoitem56.setEnabled(false);
       
            
        btnmv531.setEnabled(false);
        btnmv541.setEnabled(false);
        btnmv551.setEnabled(false);
        btnmv561.setEnabled(false);
        
        lblcum53.setEnabled(false);
        lblcum54.setEnabled(false);
        lblcum55.setEnabled(false);
        lblcum56.setEnabled(false);
       
        lblnocum53.setEnabled(false);
        lblnocum54.setEnabled(false);
        lblnocum55.setEnabled(false);
        lblnocum56.setEnabled(false);
        
        
        
        
    }
    
    Cevaluacion cm = new Cevaluacion();
    
   public void Validar(){
       
       
           
       
         if(tr.getI531().equals("")){
        
        JOptionPane.showMessageDialog(null,"El item 1 del estandar E6.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI541().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 2 del estandar E6.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI551().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 3 del estandar E6.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI561().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 4 del estandar E6.1 no se ha diligenciado correctamente ");
        
    }
    
        if(!tr.getI531().equals("") && !tr.getI541().equals("") && !tr.getI551().equals("") && !tr.getI561().equals("")){
     
        
    int dialogButton =JOptionPane.showConfirmDialog(null, "Esta seguro que desea guardar las respuesta diligenciadas en la evaluacion inicial,"
                                                        + " recuerde que si acepta no podra volver a diligenciar este formulario hasta que comience una nueva E. inicial ");
           if(dialogButton == JOptionPane.YES_OPTION){     
           Cgestion_resul func = new Cgestion_resul();

        func.insertarItem53(tr);
        func.insertarItem54(tr);
        func.insertarItem55(tr);
        
        if(func.insertarItem56(tr)){
            JOptionPane.showMessageDialog(rootPane, "Se han registrado los items satisfactoriamente");

        }
        
        
    ps.setE6(1);
       gh.config();
       int valo=5;
       ps.setBarra(ps.getBarra()+valo);
       this.dispose();
       gh.val=ps.getBarra();
        gh.empezar();
        
        cm.est_gestResul(ps);
       gh.setVisible(true);
       gh.toFront();
       
       
      
   
       
           }
       
     }
        
        
    }
       
       
    
Mgestion_resul tr= new Mgestion_resul();
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
        lblnocum53 = new javax.swing.JLabel();
        lblcum53 = new javax.swing.JLabel();
        noaplicaitem53 = new javax.swing.JCheckBox();
        rbjustiitem53 = new javax.swing.JRadioButton();
        rbnojustiitem53 = new javax.swing.JRadioButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtitem53 = new javax.swing.JTextArea();
        btnadjnoitem53 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        rbsi531 = new javax.swing.JRadioButton();
        rbno531 = new javax.swing.JRadioButton();
        btnmv531 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        lblnocum54 = new javax.swing.JLabel();
        lblcum54 = new javax.swing.JLabel();
        noaplicaitem54 = new javax.swing.JCheckBox();
        rbjustiitem54 = new javax.swing.JRadioButton();
        rbnojustiitem54 = new javax.swing.JRadioButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtitem54 = new javax.swing.JTextArea();
        btnadjnoitem54 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        rbsi541 = new javax.swing.JRadioButton();
        rbno541 = new javax.swing.JRadioButton();
        btnmv541 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        lblnocum55 = new javax.swing.JLabel();
        lblcum55 = new javax.swing.JLabel();
        noaplicaitem55 = new javax.swing.JCheckBox();
        rbjustiitem55 = new javax.swing.JRadioButton();
        rbnojustiitem55 = new javax.swing.JRadioButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtitem55 = new javax.swing.JTextArea();
        btnadjnoitem55 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        rbsi551 = new javax.swing.JRadioButton();
        rbno551 = new javax.swing.JRadioButton();
        btnmv551 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        lblnocum56 = new javax.swing.JLabel();
        lblcum56 = new javax.swing.JLabel();
        noaplicaitem56 = new javax.swing.JCheckBox();
        rbjustiitem56 = new javax.swing.JRadioButton();
        rbnojustiitem56 = new javax.swing.JRadioButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtitem56 = new javax.swing.JTextArea();
        btnadjnoitem56 = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        rbsi561 = new javax.swing.JRadioButton();
        rbno561 = new javax.swing.JRadioButton();
        btnmv561 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E6.1Gestión y resultados del sistema de gestión de seguridad y salud en el trabajo (5%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel17.setToolTipText("");

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel62.setText("Modo de Verificación ");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel63.setText("Indicadores estructura, proceso y resultado (1.25%)");

        lblnocum53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem53.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem53.setText("No Aplica");
        noaplicaitem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem53ActionPerformed(evt);
            }
        });

        rbjustiitem53.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem53.setText("Justifica");
        rbjustiitem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem53ActionPerformed(evt);
            }
        });

        rbnojustiitem53.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem53.setText("No justifica");
        rbnojustiitem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem53ActionPerformed(evt);
            }
        });

        txtitem53.setColumns(20);
        txtitem53.setRows(5);
        txtitem53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem53KeyPressed(evt);
            }
        });
        jScrollPane14.setViewportView(txtitem53);

        btnadjnoitem53.setText("Adjuntar Doc");
        btnadjnoitem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem53ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel64.setText("1. Solicitar los indicadores de estructura, proceso y resultado del Sistema de Gestión de Seguridad y Salud en el Trabajo que se encuentren ");

        rbsi531.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi531.setText("Cumple");
        rbsi531.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi531ActionPerformed(evt);
            }
        });

        rbno531.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno531.setText("No cumple");
        rbno531.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno531ActionPerformed(evt);
            }
        });

        btnmv531.setText("Adjuntar Doc");
        btnmv531.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv531ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel66.setText("alineados al plan estratégico de la empresa.");

        jButton13.setText("Criterio");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(842, 842, 842)
                .addComponent(jLabel65)
                .addGap(18, 18, 18))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap(937, Short.MAX_VALUE)
                        .addComponent(rbsi531)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno531))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnmv531)
                .addGap(97, 97, 97))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(noaplicaitem53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem53)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem53, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum53)
                            .addComponent(lblcum53)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel63)
                                .addComponent(jButton13)))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel62))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem53)
                        .addComponent(rbnojustiitem53)
                        .addComponent(noaplicaitem53))
                    .addComponent(btnadjnoitem53)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi531)
                        .addComponent(rbno531)
                        .addComponent(btnmv531))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel66)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel70.setText("Modo de Verificación ");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel82.setText("La empresa adelanta auditoria por lo menos una vez al año (1.25%)");

        lblnocum54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem54.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem54.setText("No Aplica");
        noaplicaitem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem54ActionPerformed(evt);
            }
        });

        rbjustiitem54.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem54.setText("Justifica");
        rbjustiitem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem54ActionPerformed(evt);
            }
        });

        rbnojustiitem54.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem54.setText("No justifica");
        rbnojustiitem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem54ActionPerformed(evt);
            }
        });

        txtitem54.setColumns(20);
        txtitem54.setRows(5);
        txtitem54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem54KeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(txtitem54);

        btnadjnoitem54.setText("Adjuntar Doc");
        btnadjnoitem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem54ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel83.setText("1. La empresa adelantaría por lo menos una vez al año, un ciclo completo de auditorías internas al SG-SST, en donde su alcance deberá incluir ");

        rbsi541.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi541.setText("Cumple");
        rbsi541.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi541ActionPerformed(evt);
            }
        });

        rbno541.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno541.setText("No cumple");
        rbno541.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno541ActionPerformed(evt);
            }
        });

        btnmv541.setText("Adjuntar Doc");
        btnmv541.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv541ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel85.setText("todas las áreas. Solicitar el programa de la auditoria, el alcance de la auditoria, la periodicidad, la metodología y la presentación de informes");

        jLabel86.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel86.setText("informes y verificar que se haya planificado con la participación del Comité Paritario o Vigía de Seguridad y Salud en el Trabajo.");

        jButton14.setText("Criterio");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel82)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(noaplicaitem54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem54)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem54, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel84)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(rbsi541)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno541)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnmv541)
                        .addGap(83, 83, 83))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum54)
                            .addComponent(lblcum54)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel82)
                                .addComponent(jButton14)))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel70))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem54)
                        .addComponent(rbnojustiitem54)
                        .addComponent(noaplicaitem54))
                    .addComponent(btnadjnoitem54)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi541)
                            .addComponent(rbno541)
                            .addComponent(btnmv541))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel84)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel86)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel71.setText("Modo de Verificación ");

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel87.setText("La empresa adelanta auditoria por lo menos una vez al año (1.25%)");

        lblnocum55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem55.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem55.setText("No Aplica");
        noaplicaitem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem55ActionPerformed(evt);
            }
        });

        rbjustiitem55.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem55.setText("Justifica");
        rbjustiitem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem55ActionPerformed(evt);
            }
        });

        rbnojustiitem55.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem55.setText("No justifica");
        rbnojustiitem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem55ActionPerformed(evt);
            }
        });

        txtitem55.setColumns(20);
        txtitem55.setRows(5);
        txtitem55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem55KeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(txtitem55);

        btnadjnoitem55.setText("Adjuntar Doc");
        btnadjnoitem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem55ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel88.setText("1. Se debe solicitar a la empresa los documentos, pruebas de la realización de actividades y obligaciones establecidas en los");

        rbsi551.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi551.setText("Cumple");
        rbsi551.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi551ActionPerformed(evt);
            }
        });

        rbno551.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno551.setText("No cumple");
        rbno551.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno551ActionPerformed(evt);
            }
        });

        btnmv551.setText("Adjuntar Doc");
        btnmv551.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv551ActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel90.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel90.setText("trece numerales del artículo 2.2.4.6.30 del decreto 1072/2015.");

        jButton15.setText("Criterio");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(noaplicaitem55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem55)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem55, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(858, 858, 858)
                        .addComponent(jLabel89)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(rbsi551)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno551)
                                .addGap(36, 36, 36))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnmv551)
                        .addGap(79, 79, 79))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum55)
                            .addComponent(lblcum55)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel87)
                                .addComponent(jButton15)))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel71))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem55)
                        .addComponent(rbnojustiitem55)
                        .addComponent(noaplicaitem55))
                    .addComponent(btnadjnoitem55)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi551)
                            .addComponent(rbno551)
                            .addComponent(btnmv551))
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
        jLabel92.setText("Planificación auditorias con el COPASST (1.25%)");

        lblnocum56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem56.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem56.setText("No Aplica");
        noaplicaitem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem56ActionPerformed(evt);
            }
        });

        rbjustiitem56.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem56.setText("Justifica");
        rbjustiitem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem56ActionPerformed(evt);
            }
        });

        rbnojustiitem56.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem56.setText("No justifica");
        rbnojustiitem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem56ActionPerformed(evt);
            }
        });

        txtitem56.setColumns(20);
        txtitem56.setRows(5);
        txtitem56.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem56KeyPressed(evt);
            }
        });
        jScrollPane18.setViewportView(txtitem56);

        btnadjnoitem56.setText("Adjuntar Doc");
        btnadjnoitem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem56ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel93.setText("1. Solicitar el documento donde conste la revisión anual por la Alta Dirección, así como la comunicación de los resultados a comité ");

        rbsi561.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi561.setText("Cumple");
        rbsi561.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi561ActionPerformed(evt);
            }
        });

        rbno561.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno561.setText("No cumple");
        rbno561.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno561ActionPerformed(evt);
            }
        });

        btnmv561.setText("Adjuntar Doc");
        btnmv561.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv561ActionPerformed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel95.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel95.setText("Paritario de Seguridad y Salud en el Trabajo o al Vigía de Seguridad y Salud en el Trabajo y al responsable del Sistema de Gestión");

        jLabel96.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel96.setText("de Seguridad y Salud en el Trabajo.");

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
                        .addComponent(lblnocum56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel92)
                            .addComponent(jButton16)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem56)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem56, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(39, 39, 39)
                                .addComponent(jButton2)
                                .addGap(111, 111, 111)))
                        .addComponent(jLabel94)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(rbsi561)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno561)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnmv561)
                        .addGap(77, 77, 77))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum56)
                            .addComponent(lblcum56)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel72))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem56)
                        .addComponent(rbnojustiitem56)
                        .addComponent(noaplicaitem56))
                    .addComponent(btnadjnoitem56)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi561)
                            .addComponent(rbno561)
                            .addComponent(btnmv561))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel94)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel96)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noaplicaitem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem53ActionPerformed
     if(noaplicaitem53.isSelected()){
        rbsi531.setEnabled(false);
        rbno531.setEnabled(false);
        btnmv531.setEnabled(false);
        txtitem53.setEnabled(false);
        btnadjnoitem53.setEnabled(false);
         rbjustiitem53.setEnabled(true);
          rbnojustiitem53.setEnabled(true);
          
          tr.setI531("");
        
        }else{
          rbsi531.setEnabled(true);
        rbno531.setEnabled(true);
        btnmv531.setEnabled(false);
        txtitem53.setEnabled(false);
        btnadjnoitem53.setEnabled(false);
          rbjustiitem53.setEnabled(false);
          rbnojustiitem53.setEnabled(false);
            
            
        } 
    }//GEN-LAST:event_noaplicaitem53ActionPerformed

    private void rbjustiitem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem53ActionPerformed
      txtitem53.setEnabled(true);
       tr.setI531("");

    }//GEN-LAST:event_rbjustiitem53ActionPerformed

    private void rbnojustiitem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem53ActionPerformed
     btnadjnoitem53.setEnabled(false);
        txtitem53.setEnabled(false);
        lblcum53.setEnabled(false);
        lblnocum53.setEnabled(true);
         tr.setI531("");
        tr.setI531("No");
        tr.setA531("");
        tr.setA531("Si");
        tr.setV531("");
        tr.setV531("No");
        tr.setJ531("");
    }//GEN-LAST:event_rbnojustiitem53ActionPerformed

    private void txtitem53KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem53KeyPressed
       if(txtitem53.getText().length()>2){        
        lblcum53.setEnabled(true);
       btnadjnoitem53.setEnabled(true);
     // inserta datos que cumple  
       tr.setI531("");
       tr.setI531("Si");
       tr.setA531("");
       tr.setA531("No");
       tr.setV531("");
       tr.setV531("no aplica");
       tr.setJ531("");
       tr.setJ531(txtitem53.getText());
       
       
   }else{
        tr.setJ531("");
        tr.setI531("");
        
        
            lblcum53.setEnabled(false);
            lblnocum53.setEnabled(false);
            btnadjnoitem53.setEnabled(false);
   }

    }//GEN-LAST:event_txtitem53KeyPressed

    private void btnadjnoitem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem53ActionPerformed
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
               tr.setId(53);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem53ActionPerformed

    private void rbsi531ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi531ActionPerformed
 tr.setV531("");
 tr.setV531("Si");
 btnmv531.setEnabled(true);
        
        if(rbsi531.isSelected()){
            lblcum53.setEnabled(true);
            lblnocum53.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi531ActionPerformed

    private void rbno531ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno531ActionPerformed
   tr.setV531("");
        tr.setV531("No");
        btnmv531.setEnabled(false);
        
        if(rbno531.isSelected()){
            lblcum53.setEnabled(false);
            lblnocum53.setEnabled(true);
        }
    }//GEN-LAST:event_rbno531ActionPerformed

    private void btnmv531ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv531ActionPerformed
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
               tr.setId(84);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv531ActionPerformed

    private void noaplicaitem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem54ActionPerformed
      if(noaplicaitem54.isSelected()){
        rbsi541.setEnabled(false);
        rbno541.setEnabled(false);
        btnmv541.setEnabled(false);
        txtitem54.setEnabled(false);
        btnadjnoitem54.setEnabled(false);
         rbjustiitem54.setEnabled(true);
          rbnojustiitem54.setEnabled(true);
        
        }else{
          rbsi541.setEnabled(true);
        rbno541.setEnabled(true);
        btnmv541.setEnabled(false);
        txtitem54.setEnabled(false);
        btnadjnoitem54.setEnabled(false);
         rbjustiitem54.setEnabled(false);
          rbnojustiitem54.setEnabled(false);
          
           tr.setI541("");
                       
        }   
        
        
    }//GEN-LAST:event_noaplicaitem54ActionPerformed

    private void rbjustiitem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem54ActionPerformed
       
        txtitem54.setEnabled(true);
        tr.setI541("");
        
    }//GEN-LAST:event_rbjustiitem54ActionPerformed

    private void rbnojustiitem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem54ActionPerformed
     btnadjnoitem54.setEnabled(false);
        txtitem54.setEnabled(false);
        lblcum54.setEnabled(false);
        lblnocum54.setEnabled(true);
         tr.setI541("");
        tr.setI541("No");
        tr.setA541("");
        tr.setA541("Si");
        tr.setV541("");
        tr.setV541("No");
        tr.setJ541("");
        
    }//GEN-LAST:event_rbnojustiitem54ActionPerformed

    private void txtitem54KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem54KeyPressed
      if(txtitem54.getText().length()>2){        
        lblcum54.setEnabled(true);
       btnadjnoitem54.setEnabled(true);
     // inserta datos que cumple  
       tr.setI541("");
       tr.setI541("Si");
       tr.setA541("");
       tr.setA541("No");
       tr.setV541("");
       tr.setV541("no aplica");
       tr.setJ541("");
       tr.setJ541(txtitem54.getText());
       
       
   }else{
        tr.setJ541("");
        tr.setI541("");
                
            lblcum54.setEnabled(false);
            lblnocum54.setEnabled(false);
            btnadjnoitem54.setEnabled(false);
   }

    }//GEN-LAST:event_txtitem54KeyPressed

    private void btnadjnoitem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem54ActionPerformed
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
               tr.setId(54);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem54ActionPerformed

    private void rbsi541ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi541ActionPerformed
        tr.setV541("");
 tr.setV541("Si");
 btnmv541.setEnabled(true);
        
        if(rbsi541.isSelected()){
            lblcum54.setEnabled(true);
            lblnocum54.setEnabled(false);
        }

    }//GEN-LAST:event_rbsi541ActionPerformed

    private void rbno541ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno541ActionPerformed
       tr.setV541("");
        tr.setV541("No");
        btnmv541.setEnabled(false);
        
        if(rbno541.isSelected()){
            lblcum54.setEnabled(false);
            lblnocum54.setEnabled(true);
        }
    }//GEN-LAST:event_rbno541ActionPerformed

    private void btnmv541ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv541ActionPerformed
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
               tr.setId(85);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv541ActionPerformed

    private void noaplicaitem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem55ActionPerformed
   if(noaplicaitem55.isSelected()){
        rbsi551.setEnabled(false);
        rbno551.setEnabled(false);
        btnmv551.setEnabled(false);
        txtitem55.setEnabled(false);
        btnadjnoitem55.setEnabled(false);
         rbjustiitem55.setEnabled(true);
          rbnojustiitem55.setEnabled(true);
        
        }else{
          rbsi551.setEnabled(true);
        rbno551.setEnabled(true);
        btnmv551.setEnabled(false);
       txtitem55.setEnabled(false);
        btnadjnoitem55.setEnabled(false);
           rbjustiitem55.setEnabled(false);
          rbnojustiitem55.setEnabled(false);
          
          tr.setI551("");
                      
        }  
        
        
    }//GEN-LAST:event_noaplicaitem55ActionPerformed

    private void rbjustiitem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem55ActionPerformed
     
        txtitem55.setEnabled(true);
         tr.setI551("");
      
    }//GEN-LAST:event_rbjustiitem55ActionPerformed

    private void rbnojustiitem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem55ActionPerformed
     
          btnadjnoitem55.setEnabled(false);
        txtitem55.setEnabled(false);
        lblcum55.setEnabled(false);
        lblnocum55.setEnabled(true);
         tr.setI551("");
        tr.setI551("No");
        tr.setA551("");
        tr.setA551("Si");
        tr.setV551("");
        tr.setV551("No");
        tr.setJ551("");
        
    }//GEN-LAST:event_rbnojustiitem55ActionPerformed

    private void txtitem55KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem55KeyPressed
     if(txtitem55.getText().length()>2){        
        lblcum55.setEnabled(true);
       btnadjnoitem55.setEnabled(true);
     // inserta datos que cumple  
       tr.setI551("");
       tr.setI551("Si");
       tr.setA551("");
       tr.setA551("No");
       tr.setV551("");
       tr.setV551("No");
       tr.setJ551("");
       tr.setJ551(txtitem55.getText());
       
       
   }else{
        tr.setJ551("");
        tr.setI551("");
           
        
            lblcum55.setEnabled(false);
            lblnocum55.setEnabled(false);
            btnadjnoitem55.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem55KeyPressed

    private void btnadjnoitem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem55ActionPerformed
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
               tr.setId(55);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem55ActionPerformed

    private void rbsi551ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi551ActionPerformed
     tr.setV551("");
 tr.setV551("Si");
 btnmv551.setEnabled(true);
        
        if(rbsi551.isSelected()){
            lblcum55.setEnabled(true);
            lblnocum55.setEnabled(false);
        }

    }//GEN-LAST:event_rbsi551ActionPerformed

    private void rbno551ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno551ActionPerformed
       tr.setV551("");
        tr.setV551("No");
        btnmv551.setEnabled(false);
        
        if(rbno551.isSelected()){
            lblcum55.setEnabled(false);
            lblnocum55.setEnabled(true);
        }
    }//GEN-LAST:event_rbno551ActionPerformed

    private void btnmv551ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv551ActionPerformed
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
               tr.setId(86);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv551ActionPerformed

    private void noaplicaitem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem56ActionPerformed
     if(noaplicaitem56.isSelected()){
        rbsi561.setEnabled(false);
        rbno561.setEnabled(false);
        btnmv561.setEnabled(false);
        txtitem56.setEnabled(false);
        btnadjnoitem56.setEnabled(false);
         rbjustiitem56.setEnabled(true);
          rbnojustiitem56.setEnabled(true);
          
           tr.setI561("");
        
        }else{
          rbsi561.setEnabled(true);
        rbno561.setEnabled(true);
        btnmv561.setEnabled(false);
        txtitem56.setEnabled(false);
        btnadjnoitem56.setEnabled(false);
        rbjustiitem56.setEnabled(false);
          rbnojustiitem56.setEnabled(false);
            
            
        }       
        
    }//GEN-LAST:event_noaplicaitem56ActionPerformed

    private void rbjustiitem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem56ActionPerformed
       txtitem56.setEnabled(true);
       tr.setI561("");

    }//GEN-LAST:event_rbjustiitem56ActionPerformed

    private void rbnojustiitem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem56ActionPerformed
       btnadjnoitem56.setEnabled(false);
        txtitem56.setEnabled(false);
        lblcum56.setEnabled(false);
        lblnocum56.setEnabled(true);
         tr.setI561("");
        tr.setI561("No");
        tr.setA561("");
        tr.setA561("Si");
        tr.setV561("");
        tr.setV561("No");
        tr.setJ561("");
    }//GEN-LAST:event_rbnojustiitem56ActionPerformed

    private void txtitem56KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem56KeyPressed
      if(txtitem56.getText().length()>2){        
        lblcum56.setEnabled(true);
       btnadjnoitem56.setEnabled(true);
     // inserta datos que cumple  
       tr.setI561("");
       tr.setI561("Si");
       tr.setA561("");
       tr.setA561("No");
       tr.setV561("");
       tr.setV561("no aplica");
       tr.setJ561("");
       tr.setJ561(txtitem56.getText());
       
       
   }else{
        tr.setJ561("");
        tr.setI561("");
         
        
            lblcum56.setEnabled(false);
            lblnocum56.setEnabled(false);
            btnadjnoitem56.setEnabled(false);
   }
    }//GEN-LAST:event_txtitem56KeyPressed

    private void btnadjnoitem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem56ActionPerformed
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
               tr.setId(56);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
               
       }
    }//GEN-LAST:event_btnadjnoitem56ActionPerformed

    private void rbsi561ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi561ActionPerformed
        tr.setV561("");
 tr.setV561("Si");
 btnmv561.setEnabled(true);
        
        if(rbsi561.isSelected()){
            lblcum56.setEnabled(true);
            lblnocum56.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi561ActionPerformed

    private void rbno561ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno561ActionPerformed
      tr.setV561("");
        tr.setV561("No");
        btnmv561.setEnabled(false);
        
        if(rbno561.isSelected()){
            lblcum56.setEnabled(false);
            lblnocum56.setEnabled(true);
        }
    }//GEN-LAST:event_rbno561ActionPerformed

    private void btnmv561ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv561ActionPerformed
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
               tr.setId(87);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv561ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
     // Item 53

        if(rbsi531.isSelected()){
            tr.setI531("");
            tr.setI531("si");
            tr.setA531("");
            tr.setA531("si");

        }

        if(rbno531.isSelected()){
            tr.setI531("");
            tr.setI531("no");
            tr.setA531("");
            tr.setA531("si");

        }

        // Item 54
        if(rbsi541.isSelected()){
            tr.setI541("");
            tr.setI541("si");
            tr.setA541("");
            tr.setA541("si");

        }

        if(rbno541.isSelected()){
            tr.setI541("");
            tr.setI541("no");
            tr.setA541("");
            tr.setA541("si");

        }
        
          // Item 55

        if(rbsi551.isSelected()){
            tr.setI551("");
            tr.setI551("si");
            tr.setA551("");
            tr.setA551("si");

        }

        if(rbno551.isSelected()){
            tr.setI551("");
            tr.setI551("no");
            tr.setA551("");
            tr.setA551("si");

        }

        // Item 56
        if(rbsi561.isSelected()){
            tr.setI561("");
            tr.setI561("si");
            tr.setA561("");
            tr.setA561("si");

        }

        if(rbno561.isSelected()){
            tr.setI561("");
            tr.setI561("no");
            tr.setA561("");
            tr.setA561("si");

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
                new Gestion_resul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadjnoitem53;
    private javax.swing.JButton btnadjnoitem54;
    private javax.swing.JButton btnadjnoitem55;
    private javax.swing.JButton btnadjnoitem56;
    private javax.swing.JButton btnmv531;
    private javax.swing.JButton btnmv541;
    private javax.swing.JButton btnmv551;
    private javax.swing.JButton btnmv561;
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
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
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
    private javax.swing.JLabel lblcum53;
    private javax.swing.JLabel lblcum54;
    private javax.swing.JLabel lblcum55;
    private javax.swing.JLabel lblcum56;
    private javax.swing.JLabel lblnocum53;
    private javax.swing.JLabel lblnocum54;
    private javax.swing.JLabel lblnocum55;
    private javax.swing.JLabel lblnocum56;
    private javax.swing.JCheckBox noaplicaitem53;
    private javax.swing.JCheckBox noaplicaitem54;
    private javax.swing.JCheckBox noaplicaitem55;
    private javax.swing.JCheckBox noaplicaitem56;
    private javax.swing.JRadioButton rbjustiitem53;
    private javax.swing.JRadioButton rbjustiitem54;
    private javax.swing.JRadioButton rbjustiitem55;
    private javax.swing.JRadioButton rbjustiitem56;
    private javax.swing.JRadioButton rbno531;
    private javax.swing.JRadioButton rbno541;
    private javax.swing.JRadioButton rbno551;
    private javax.swing.JRadioButton rbno561;
    private javax.swing.JRadioButton rbnojustiitem53;
    private javax.swing.JRadioButton rbnojustiitem54;
    private javax.swing.JRadioButton rbnojustiitem55;
    private javax.swing.JRadioButton rbnojustiitem56;
    private javax.swing.JRadioButton rbsi531;
    private javax.swing.JRadioButton rbsi541;
    private javax.swing.JRadioButton rbsi551;
    private javax.swing.JRadioButton rbsi561;
    private javax.swing.JTextArea txtitem53;
    private javax.swing.JTextArea txtitem54;
    private javax.swing.JTextArea txtitem55;
    private javax.swing.JTextArea txtitem56;
    // End of variables declaration//GEN-END:variables
}
