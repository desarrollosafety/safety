/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Cevaluacion;
import Controlador.Crecursos;
import Modelo.Mevaluacion;
import Modelo.Mrecursos;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.UIManager;

/**
 *
 * @author leandro
 */
public class Recursos extends javax.swing.JFrame{
   
    Mrecursos tr = new Mrecursos();
    Mevaluacion ps = new Mevaluacion();
    Evaluacion_Ini gh = new Evaluacion_Ini();
    

    /**
     * Creates new form Recurso
     */
    public Recursos() {
        initComponents();
        
         // inhabilitar botones minimizar, cerrar y maximizar
         getRootPane().setWindowDecorationStyle(JRootPane.NONE);
         setLocationRelativeTo(null);
       // this.setExtendedState(MAXIMIZED_BOTH);
          ButtonGroup rbnitem1= new ButtonGroup();
        rbnitem1.add(rbjustiitem1);
        rbnitem1.add(rbnojustiitem1);
        
         ButtonGroup rbnitem2= new ButtonGroup();
        rbnitem2.add(rbjustiitem2);
        rbnitem2.add(rbnojustiitem2);
        
         ButtonGroup mv111= new ButtonGroup();
        mv111.add(rbsi111);
        mv111.add(rbno111);
        
        ButtonGroup mv112= new ButtonGroup();
        mv112.add(rbsi112);
        mv112.add(rbno112);
        
        ButtonGroup mv113= new ButtonGroup();
        mv113.add(rbsi113);
        mv113.add(rbno113);
        
         ButtonGroup mv114= new ButtonGroup();
        mv114.add(rbsi114);
        mv114.add(rbno114);
        
         ButtonGroup mv121= new ButtonGroup();
        mv121.add(rbsi121);
        mv121.add(rbno121);
        
         ButtonGroup rbnitem3= new ButtonGroup();
        rbnitem3.add(rbjustiitem3);
        rbnitem3.add(rbnojustiitem3);
        
         ButtonGroup rbnitem4= new ButtonGroup();
        rbnitem4.add(rbjustiitem4);
        rbnitem4.add(rbnojustiitem4);
        
         ButtonGroup mv131= new ButtonGroup();
        mv131.add(rbsi131);
        mv131.add(rbno131);
                
         ButtonGroup mv141= new ButtonGroup();
        mv141.add(rbsi141);
        mv141.add(rbno141);
        
         ButtonGroup mv142= new ButtonGroup();
        mv142.add(rbsi142);
        mv142.add(rbno142);
        
         ButtonGroup rbnitem5= new ButtonGroup();
        rbnitem5.add(rbjustiitem5);
        rbnitem5.add(rbnojustiitem5);
        
         ButtonGroup rbnitem6= new ButtonGroup();
        rbnitem6.add(rbjustiitem6);
        rbnitem6.add(rbnojustiitem6);
        
         ButtonGroup mv151= new ButtonGroup();
        mv151.add(rbsi151);
        mv151.add(rbno151);
        
        ButtonGroup mv161= new ButtonGroup();
        mv161.add(rbsi161);
        mv161.add(rbno161);
        
         ButtonGroup mv162= new ButtonGroup();
        mv162.add(rbsi162);
        mv162.add(rbno162);
        
        ButtonGroup rbnitem7= new ButtonGroup();
        rbnitem7.add(rbjustiitem7);
        rbnitem7.add(rbnojustiitem7);
        
         ButtonGroup rbnitem8= new ButtonGroup();
        rbnitem8.add(rbjustiitem8);
        rbnitem8.add(rbnojustiitem8);
        
         ButtonGroup mv171= new ButtonGroup();
        mv171.add(rbsi171);
        mv171.add(rbno171);
        
        ButtonGroup mv181= new ButtonGroup();
        mv181.add(rbsi181);
        mv181.add(rbno181);
        
         ButtonGroup mv182= new ButtonGroup();
        mv182.add(rbsi182);
        mv182.add(rbno182);
        
          ButtonGroup rbnitem9= new ButtonGroup();
        rbnitem9.add(rbjustiitem9);
        rbnitem9.add(rbnojustiitem9);
        
         ButtonGroup rbnitem10= new ButtonGroup();
        rbnitem10.add(rbjustiitem10);
        rbnitem10.add(rbnojustiitem10);
        
         ButtonGroup mv191= new ButtonGroup();
        mv191.add(rbsi191);
        mv191.add(rbno191);
        
        ButtonGroup mv192= new ButtonGroup();
        mv192.add(rbsi192);
        mv192.add(rbno192);
              
         ButtonGroup mv1101= new ButtonGroup();
        mv1101.add(rbsi1101);
        mv1101.add(rbno1101);
       
          ButtonGroup rbnitem11= new ButtonGroup();
        rbnitem11.add(rbjustiitem11);
        rbnitem11.add(rbnojustiitem11);
        
        ButtonGroup mv1111= new ButtonGroup();
        mv1111.add(rbsi1111);
        mv1111.add(rbno1111);
        
        NoVisibles();
    }
  
    
    public void NoVisibles(){
        // Item 1
          rbjustiitem1.setEnabled(false);
        rbnojustiitem1.setEnabled(false);
        btnadjnoitem1.setEnabled(false);
        txtitem1.setEnabled(false);
        btnmv11.setEnabled(false);
        btnmv12.setEnabled(false);
        btnmv13.setEnabled(false);
        btnmv14.setEnabled(false);
        lblnocum1.setEnabled(false);
        lblcum1.setEnabled(false);
        // Item 2        
        lblnocum2.setEnabled(false);
        lblcum2.setEnabled(false);
        rbjustiitem2.setEnabled(false);
        rbnojustiitem2.setEnabled(false);
        txtitem2.setEnabled(false);
        btnadjnoitem2.setEnabled(false);
        btnmv21.setEnabled(false);
         // Item 3 
        rbjustiitem3.setEnabled(false);
        rbnojustiitem3.setEnabled(false);
        btnadjnoitem3.setEnabled(false);
        txtitem3.setEnabled(false);
        btnmv31.setEnabled(false);
        lblnocum3.setEnabled(false);
        lblcum3.setEnabled(false);
        // Item 4
         lblnocum4.setEnabled(false);
        lblcum4.setEnabled(false);
        rbjustiitem4.setEnabled(false);
        rbnojustiitem4.setEnabled(false);
        txtitem4.setEnabled(false);
        btnadjnoitem4.setEnabled(false);
        btnmv41.setEnabled(false);
        btnmv42.setEnabled(false);
         // Item 5
        rbjustiitem5.setEnabled(false);
        rbnojustiitem5.setEnabled(false);
        btnadjnoitem5.setEnabled(false);
        txtitem5.setEnabled(false);
         btnmv51.setEnabled(false);
        lblnocum5.setEnabled(false);
        lblcum5.setEnabled(false);
        // Item 6        
         lblnocum6.setEnabled(false);
        lblcum6.setEnabled(false);
        rbjustiitem6.setEnabled(false);
        rbnojustiitem6.setEnabled(false);
        txtitem6.setEnabled(false);
        btnadjnoitem6.setEnabled(false);
        btnmv61.setEnabled(false);
        btnmv62.setEnabled(false);
         // Item 7
        rbjustiitem7.setEnabled(false);
        rbnojustiitem7.setEnabled(false);
        btnadjnoitem7.setEnabled(false);
        txtitem7.setEnabled(false);
        btnmv71.setEnabled(false);
        lblnocum7.setEnabled(false);
        lblcum7.setEnabled(false);
        // Item 8
         lblnocum8.setEnabled(false);
        lblcum8.setEnabled(false);
        rbjustiitem8.setEnabled(false);
        rbnojustiitem8.setEnabled(false);
        txtitem8.setEnabled(false);
        btnadjnoitem8.setEnabled(false);
        btnmv81.setEnabled(false);
        btnmv82.setEnabled(false);
       
        // Item 9
         rbjustiitem9.setEnabled(false);
        rbnojustiitem9.setEnabled(false);
        btnadjnoitem9.setEnabled(false);
        txtitem9.setEnabled(false);
        btnmv91.setEnabled(false);
         lblnocum9.setEnabled(false);
        lblcum9.setEnabled(false);
         btnmv92.setEnabled(false);
          // Item 10
         lblnocum10.setEnabled(false);
        lblcum10.setEnabled(false);
        rbjustiitem10.setEnabled(false);
        rbnojustiitem10.setEnabled(false);
        txtitem10.setEnabled(false);
        btnadjnoitem10.setEnabled(false);
        btnmv101.setEnabled(false);
       
        // Item 11
         lblnocum11.setEnabled(false);
        lblcum11.setEnabled(false);
        rbjustiitem11.setEnabled(false);
        rbnojustiitem11.setEnabled(false);
        txtitem11.setEnabled(false);
        btnadjnoitem11.setEnabled(false);
        btnmv111.setEnabled(false);
       
        
        
      
        
        
        
    }
    
    Cevaluacion cm = new Cevaluacion();
    public void Validar (){
           Crecursos func = new Crecursos();
           
           
        
           
       
    if(tr.getI1111().equals("")){
        
        JOptionPane.showMessageDialog(null,"El item 1 del estandar E1.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI1121().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 2 del estandar E1.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI1131().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 3 del estandar E1.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI1141().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 4 del estandar E1.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI1151().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 5 del estandar E1.1 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI1161().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 6 del estandar E1.1 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI1171().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 7 del estandar E1.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI1181().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 8 del estandar E1.1 no se ha diligenciado correctamente ");
        
    }
    
    if(tr.getI1191().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 1 del estandar E1.2 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI11101().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 2 del estandar E1.2 no se ha diligenciado correctamente ");
        
    }
    if(tr.getI11111().equals("")){
        
         JOptionPane.showMessageDialog(null,"El item 3 del estandar E1.2 no se ha diligenciado correctamente ");
        
    }
    
    if(!tr.getI1111().equals("") && !tr.getI1121().equals("") && !tr.getI1131().equals("") && !tr.getI1141().equals("") && !tr.getI1151().equals("") && !tr.getI1161().equals("") 
            && !tr.getI1171().equals("") && !tr.getI1181().equals("") && !tr.getI1191().equals("") && !tr.getI11101().equals("") && !tr.getI11111().equals("")){
     
        
    int dialogButton =JOptionPane.showConfirmDialog(null, "Esta seguro que desea guardar las respuesta diligenciadas en la evaluacion inicial,"
                                                        + " recuerde que si acepta no podra volver a diligenciar este formulario hasta que comience una nueva E. inicial ");
           if(dialogButton == JOptionPane.YES_OPTION){     
        
       func.insertarItem1(tr);
       func.insertarItem2(tr);
       func.insertarItem3(tr);
       func.insertarItem4(tr);
       func.insertarItem5(tr);
       func.insertarItem6(tr);
       func.insertarItem7(tr);
       func.insertarItem8(tr);
       func.insertarItem9(tr);
       func.insertarItem10(tr);
       if(func.insertarItem11(tr)){
          JOptionPane.showMessageDialog(rootPane, "Se han registrado los items satisfactoriamente");
       } 
  
     // configurar botones y llenar el progress bar dinamicamente
       ps.setE1(1);
       gh.config();
       int valo=10;
       ps.setBarra(ps.getBarra()+valo);
       this.dispose();
        cm.Puntaje();
        gh.punt=ps.getPunt();
       gh.val=ps.getBarra();
       gh.empezar();
      
       cm.est_recursos(ps); 
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblnocum1 = new javax.swing.JLabel();
        lblcum1 = new javax.swing.JLabel();
        noaplicaitem1 = new javax.swing.JCheckBox();
        rbjustiitem1 = new javax.swing.JRadioButton();
        rbnojustiitem1 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtitem1 = new javax.swing.JTextArea();
        btnadjnoitem1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rbsi111 = new javax.swing.JRadioButton();
        rbno111 = new javax.swing.JRadioButton();
        btnmv11 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rbsi112 = new javax.swing.JRadioButton();
        rbno112 = new javax.swing.JRadioButton();
        btnmv12 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbsi113 = new javax.swing.JRadioButton();
        rbno113 = new javax.swing.JRadioButton();
        btnmv13 = new javax.swing.JButton();
        rbsi114 = new javax.swing.JRadioButton();
        rbno114 = new javax.swing.JRadioButton();
        btnmv14 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblnocum2 = new javax.swing.JLabel();
        lblcum2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        noaplicaitem2 = new javax.swing.JCheckBox();
        rbjustiitem2 = new javax.swing.JRadioButton();
        rbnojustiitem2 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtitem2 = new javax.swing.JTextArea();
        btnadjnoitem2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rbsi121 = new javax.swing.JRadioButton();
        rbno121 = new javax.swing.JRadioButton();
        btnmv21 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblnocum3 = new javax.swing.JLabel();
        lblcum3 = new javax.swing.JLabel();
        noaplicaitem3 = new javax.swing.JCheckBox();
        rbjustiitem3 = new javax.swing.JRadioButton();
        rbnojustiitem3 = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtitem3 = new javax.swing.JTextArea();
        btnadjnoitem3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        rbsi131 = new javax.swing.JRadioButton();
        rbno131 = new javax.swing.JRadioButton();
        btnmv31 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblnocum4 = new javax.swing.JLabel();
        lblcum4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        noaplicaitem4 = new javax.swing.JCheckBox();
        rbjustiitem4 = new javax.swing.JRadioButton();
        rbnojustiitem4 = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtitem4 = new javax.swing.JTextArea();
        btnadjnoitem4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rbsi141 = new javax.swing.JRadioButton();
        rbno141 = new javax.swing.JRadioButton();
        btnmv41 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        rbsi142 = new javax.swing.JRadioButton();
        rbno142 = new javax.swing.JRadioButton();
        btnmv42 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        lblnocum5 = new javax.swing.JLabel();
        lblcum5 = new javax.swing.JLabel();
        noaplicaitem5 = new javax.swing.JCheckBox();
        rbjustiitem5 = new javax.swing.JRadioButton();
        rbnojustiitem5 = new javax.swing.JRadioButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtitem5 = new javax.swing.JTextArea();
        btnadjnoitem5 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        rbsi151 = new javax.swing.JRadioButton();
        rbno151 = new javax.swing.JRadioButton();
        btnmv51 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        lblnocum6 = new javax.swing.JLabel();
        lblcum6 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        noaplicaitem6 = new javax.swing.JCheckBox();
        rbjustiitem6 = new javax.swing.JRadioButton();
        rbnojustiitem6 = new javax.swing.JRadioButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtitem6 = new javax.swing.JTextArea();
        btnadjnoitem6 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        rbsi161 = new javax.swing.JRadioButton();
        rbno161 = new javax.swing.JRadioButton();
        btnmv61 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        rbsi162 = new javax.swing.JRadioButton();
        rbno162 = new javax.swing.JRadioButton();
        btnmv62 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        lblnocum7 = new javax.swing.JLabel();
        lblcum7 = new javax.swing.JLabel();
        noaplicaitem7 = new javax.swing.JCheckBox();
        rbjustiitem7 = new javax.swing.JRadioButton();
        rbnojustiitem7 = new javax.swing.JRadioButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtitem7 = new javax.swing.JTextArea();
        btnadjnoitem7 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        rbsi171 = new javax.swing.JRadioButton();
        rbno171 = new javax.swing.JRadioButton();
        btnmv71 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblnocum8 = new javax.swing.JLabel();
        lblcum8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        noaplicaitem8 = new javax.swing.JCheckBox();
        rbjustiitem8 = new javax.swing.JRadioButton();
        rbnojustiitem8 = new javax.swing.JRadioButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtitem8 = new javax.swing.JTextArea();
        btnadjnoitem8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        rbsi181 = new javax.swing.JRadioButton();
        rbno181 = new javax.swing.JRadioButton();
        btnmv81 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        rbsi182 = new javax.swing.JRadioButton();
        rbno182 = new javax.swing.JRadioButton();
        btnmv82 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lblnocum9 = new javax.swing.JLabel();
        lblcum9 = new javax.swing.JLabel();
        noaplicaitem9 = new javax.swing.JCheckBox();
        rbjustiitem9 = new javax.swing.JRadioButton();
        rbnojustiitem9 = new javax.swing.JRadioButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtitem9 = new javax.swing.JTextArea();
        btnadjnoitem9 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        rbsi191 = new javax.swing.JRadioButton();
        rbno191 = new javax.swing.JRadioButton();
        btnmv91 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        rbsi192 = new javax.swing.JRadioButton();
        rbno192 = new javax.swing.JRadioButton();
        btnmv92 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        lblnocum10 = new javax.swing.JLabel();
        lblcum10 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        noaplicaitem10 = new javax.swing.JCheckBox();
        rbjustiitem10 = new javax.swing.JRadioButton();
        rbnojustiitem10 = new javax.swing.JRadioButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtitem10 = new javax.swing.JTextArea();
        btnadjnoitem10 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        rbsi1101 = new javax.swing.JRadioButton();
        rbno1101 = new javax.swing.JRadioButton();
        btnmv101 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        lblnocum11 = new javax.swing.JLabel();
        lblcum11 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        noaplicaitem11 = new javax.swing.JCheckBox();
        rbjustiitem11 = new javax.swing.JRadioButton();
        rbnojustiitem11 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtitem11 = new javax.swing.JTextArea();
        btnadjnoitem11 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        rbsi1111 = new javax.swing.JRadioButton();
        rbno1111 = new javax.swing.JRadioButton();
        btnmv111 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(249, 251, 250));
        jPanel2.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(183, 219, 243));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Modo de Verificación ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 94, 210, -1));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Responsable del sistema de gestión de Seguridad y Salud en el trabajo SG-SST  (0.5%).");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 27, -1, -1));

        lblnocum1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel3.add(lblnocum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 27, -1, -1));

        lblcum1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel3.add(lblcum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 27, -1, -1));

        noaplicaitem1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem1.setText("No Aplica");
        noaplicaitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem1ActionPerformed(evt);
            }
        });
        jPanel3.add(noaplicaitem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        rbjustiitem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem1.setText("Justifica");
        rbjustiitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem1ActionPerformed(evt);
            }
        });
        jPanel3.add(rbjustiitem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        rbnojustiitem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem1.setText("No justifica");
        rbnojustiitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem1ActionPerformed(evt);
            }
        });
        jPanel3.add(rbnojustiitem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));

        txtitem1.setColumns(20);
        txtitem1.setRows(5);
        txtitem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem1KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtitem1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 27, 158, 85));

        btnadjnoitem1.setText("Adjuntar Doc");
        btnadjnoitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnadjnoitem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1127, 27, 108, -1));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("<html>1. Documento que consta la designación del responsable del sistema de gestión  SST, con la respectiva asignación de<br> \nresponsabilidades.");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 130, -1, -1));

        rbsi111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi111.setText("Cumple");
        rbsi111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi111ActionPerformed(evt);
            }
        });
        jPanel3.add(rbsi111, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, -1, -1));

        rbno111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno111.setText("No cumple");
        rbno111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno111ActionPerformed(evt);
            }
        });
        jPanel3.add(rbno111, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 132, -1, -1));

        btnmv11.setText("Adjuntar Doc");
        btnmv11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv11ActionPerformed(evt);
            }
        });
        jPanel3.add(btnmv11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("<html>2. Titulo de formación del encargado del sistema de gestión y seguridad en el trabajo (Técnico-Tecnólogo-profesional<br> \n maestría-especialización).");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        rbsi112.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi112.setText("Cumple");
        rbsi112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi112ActionPerformed(evt);
            }
        });
        jPanel3.add(rbsi112, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 180, -1, -1));

        rbno112.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno112.setText("No cumple");
        rbno112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno112ActionPerformed(evt);
            }
        });
        jPanel3.add(rbno112, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 180, -1, -1));

        btnmv12.setText("Adjuntar Doc");
        btnmv12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv12ActionPerformed(evt);
            }
        });
        jPanel3.add(btnmv12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 178, -1, -1));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("<html>3. Licencia de seguridad y salud en el trabajo vigente (de persona natural o jurídica), en caso de no tenerla se le<br> sugiere mirar los requisitos de formación y cursos solicitados en los artículos 5 y 6 de la resolución 1111 del 2017.   ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 750, -1));

        jLabel8.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("<html>4. El encargado del sistema de gestión y seguridad en el trabajo cuenta con el certificado exigido de aprobación<br> del curso virtual de 50 horas en seguridad y salud en el trabajo.  ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        rbsi113.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi113.setText("Cumple");
        rbsi113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi113ActionPerformed(evt);
            }
        });
        jPanel3.add(rbsi113, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, -1, -1));

        rbno113.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno113.setText("No cumple");
        rbno113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno113ActionPerformed(evt);
            }
        });
        jPanel3.add(rbno113, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 242, -1, -1));

        btnmv13.setText("Adjuntar Doc");
        btnmv13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv13ActionPerformed(evt);
            }
        });
        jPanel3.add(btnmv13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 240, -1, -1));

        rbsi114.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi114.setText("Cumple");
        rbsi114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi114ActionPerformed(evt);
            }
        });
        jPanel3.add(rbsi114, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 290, -1, -1));

        rbno114.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno114.setText("No cumple");
        rbno114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno114ActionPerformed(evt);
            }
        });
        jPanel3.add(rbno114, new org.netbeans.lib.awtextra.AbsoluteConstraints(1026, 290, -1, -1));

        btnmv14.setText("Adjuntar Doc");
        btnmv14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv14ActionPerformed(evt);
            }
        });
        jPanel3.add(btnmv14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 288, -1, -1));

        jButton3.setText("Criterio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 51, -1, -1));

        jPanel4.setBackground(new java.awt.Color(183, 219, 243));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnocum2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel4.add(lblnocum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 28, -1, -1));

        lblcum2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel4.add(lblcum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 28, -1, -1));

        jLabel10.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("<html>Responsabilidades en el sistema de gestión de seguridad<br> y salud en el trabajo SG-SST (0.5%).");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 32, -1, -1));

        noaplicaitem2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem2.setText("No Aplica");
        noaplicaitem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem2ActionPerformed(evt);
            }
        });
        jPanel4.add(noaplicaitem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        rbjustiitem2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem2.setText("Justifica");
        rbjustiitem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem2ActionPerformed(evt);
            }
        });
        jPanel4.add(rbjustiitem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        rbnojustiitem2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem2.setText("No justifica");
        rbnojustiitem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem2ActionPerformed(evt);
            }
        });
        jPanel4.add(rbnojustiitem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));

        txtitem2.setColumns(20);
        txtitem2.setRows(5);
        txtitem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem2KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtitem2);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 158, 85));

        btnadjnoitem2.setText("Adjuntar Doc");
        btnadjnoitem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnadjnoitem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Modo de Verificación ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 120, 210, -1));

        jLabel12.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("1. Soporte que contenga la asignación y documentación de las responsabilidades en seguridad y salud en el trabajo.");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        rbsi121.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi121.setText("Cumple");
        rbsi121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi121ActionPerformed(evt);
            }
        });
        jPanel4.add(rbsi121, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, -1, -1));

        rbno121.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno121.setText("No cumple");
        rbno121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno121ActionPerformed(evt);
            }
        });
        jPanel4.add(rbno121, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, -1, -1));

        btnmv21.setText("Adjuntar Doc");
        btnmv21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv21ActionPerformed(evt);
            }
        });
        jPanel4.add(btnmv21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 140, -1, -1));

        jButton4.setText("Criterio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 74, -1, -1));

        jPanel6.setBackground(new java.awt.Color(183, 219, 243));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Modo de Verificación ");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, -1));

        jLabel16.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Asignación de recursos para el sistema de gestión de seguridad y salud en el trabajo ");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 27, -1, -1));

        lblnocum3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel6.add(lblnocum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 27, -1, -1));

        lblcum3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel6.add(lblcum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 27, -1, -1));

        noaplicaitem3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem3.setText("No Aplica");
        noaplicaitem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem3ActionPerformed(evt);
            }
        });
        jPanel6.add(noaplicaitem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 27, -1, -1));

        rbjustiitem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem3.setText("Justifica");
        rbjustiitem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem3ActionPerformed(evt);
            }
        });
        jPanel6.add(rbjustiitem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 27, -1, -1));

        rbnojustiitem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem3.setText("No justifica");
        rbnojustiitem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem3ActionPerformed(evt);
            }
        });
        jPanel6.add(rbnojustiitem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 27, -1, -1));

        txtitem3.setColumns(20);
        txtitem3.setRows(5);
        txtitem3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem3KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(txtitem3);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 28, 158, 85));

        btnadjnoitem3.setText("Adjuntar Doc");
        btnadjnoitem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem3ActionPerformed(evt);
            }
        });
        jPanel6.add(btnadjnoitem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 27, -1, -1));

        jLabel17.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("<html>1. Evidencias físicas y/o  documentales que demuestren la definición y asignación de los recursos humanos,<br> financieros y tecnicos y de otra\nindole   para la implementación, mantenimiento y continuidad del SG-SST.");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 155, -1, -1));

        rbsi131.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi131.setText("Cumple");
        rbsi131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi131ActionPerformed(evt);
            }
        });
        jPanel6.add(rbsi131, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 161, -1, -1));

        rbno131.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno131.setText("No cumple");
        rbno131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno131ActionPerformed(evt);
            }
        });
        jPanel6.add(rbno131, new org.netbeans.lib.awtextra.AbsoluteConstraints(1013, 161, -1, -1));

        btnmv31.setText("Adjuntar Doc");
        btnmv31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv31ActionPerformed(evt);
            }
        });
        jPanel6.add(btnmv31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 159, -1, -1));

        jLabel19.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("SG-SST (0.5%).");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 51, -1, -1));

        jButton5.setText("Criterio");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jPanel7.setBackground(new java.awt.Color(183, 219, 243));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 4:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnocum4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel7.add(lblnocum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 47, -1, -1));

        lblcum4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel7.add(lblcum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 47, -1, -1));

        jLabel20.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Afiliación al sistema general de riesgos laborales (0.5%).");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 47, -1, -1));

        noaplicaitem4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem4.setText("No Aplica");
        noaplicaitem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem4ActionPerformed(evt);
            }
        });
        jPanel7.add(noaplicaitem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        rbjustiitem4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem4.setText("Justifica");
        rbjustiitem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem4ActionPerformed(evt);
            }
        });
        jPanel7.add(rbjustiitem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        rbnojustiitem4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem4.setText("No justifica");
        rbnojustiitem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem4ActionPerformed(evt);
            }
        });
        jPanel7.add(rbnojustiitem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, -1, -1));

        txtitem4.setColumns(20);
        txtitem4.setRows(5);
        txtitem4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem4KeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(txtitem4);

        jPanel7.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, 158, 85));

        btnadjnoitem4.setText("Adjuntar Doc");
        btnadjnoitem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem4ActionPerformed(evt);
            }
        });
        jPanel7.add(btnadjnoitem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 60, -1, -1));

        jLabel21.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Modo de Verificación ");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 125, 210, -1));

        jLabel22.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("<html>1. Lista de los trabajadores vinculados laboralmente a la fecha y comparar con la planilla de pago de<br>\n aportes de la seguridad social de los cuatro meses anteriores a la fecha de verificación (Ver nota 1).");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        rbsi141.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi141.setText("Cumple");
        rbsi141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi141ActionPerformed(evt);
            }
        });
        jPanel7.add(rbsi141, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, -1, -1));

        rbno141.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno141.setText("No cumple");
        rbno141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno141ActionPerformed(evt);
            }
        });
        jPanel7.add(rbno141, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, -1, -1));

        btnmv41.setText("Adjuntar Doc");
        btnmv41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv41ActionPerformed(evt);
            }
        });
        jPanel7.add(btnmv41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 190, 100, -1));

        jLabel24.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("<html>2. Lista de los trabajadores vinculados por prestación de servicios a la fecha y comparar con la última<br>\n planilla de pago de aportes a la seguridad social suministrada por los contratistas (Ver nota 1 y 2).");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        rbsi142.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi142.setText("Cumple");
        rbsi142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi142ActionPerformed(evt);
            }
        });
        jPanel7.add(rbsi142, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, -1, -1));

        rbno142.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno142.setText("No cumple");
        rbno142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno142ActionPerformed(evt);
            }
        });
        jPanel7.add(rbno142, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, -1, -1));

        btnmv42.setText("Adjuntar Doc");
        btnmv42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv42ActionPerformed(evt);
            }
        });
        jPanel7.add(btnmv42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 260, -1, -1));

        jLabel26.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("<html>Nota 1: Empresas de 1 a 10 trabajadores verificar 100%, entre 11 y 50 el 20%, entre 51 y 200 el 10% y mayores a 200 verificar el registro<br>\nde 30 trabajadores. También de la muestraseleccionada se verificara la afiliación al sistema general de seguridad social.\n");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel28.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("<html>Nota 2: Trabajadores independientes que se afilien través de agremiaciones verificar que corresponda a una agremiación autorizada por<br>\nel Ministerio de salud y proteccion social (listado pagina Web).");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jButton6.setText("Criterio");
        jPanel7.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 71, -1, -1));

        jPanel15.setBackground(new java.awt.Color(183, 219, 243));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 5:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Modo de Verificación ");
        jPanel15.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 101, 210, -1));

        jLabel61.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("Pago de pensión de trabajadores de alto riesgo (0.5%).");
        jPanel15.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 27, -1, -1));

        lblnocum5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel15.add(lblnocum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 27, -1, -1));

        lblcum5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel15.add(lblcum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 27, -1, -1));

        noaplicaitem5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem5.setText("No Aplica");
        noaplicaitem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem5ActionPerformed(evt);
            }
        });
        jPanel15.add(noaplicaitem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        rbjustiitem5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem5.setText("Justifica");
        rbjustiitem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem5ActionPerformed(evt);
            }
        });
        jPanel15.add(rbjustiitem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        rbnojustiitem5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem5.setText("No justifica");
        rbnojustiitem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem5ActionPerformed(evt);
            }
        });
        jPanel15.add(rbnojustiitem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        txtitem5.setColumns(20);
        txtitem5.setRows(5);
        txtitem5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem5KeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(txtitem5);

        jPanel15.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 158, 85));

        btnadjnoitem5.setText("Adjuntar Doc");
        btnadjnoitem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem5ActionPerformed(evt);
            }
        });
        jPanel15.add(btnadjnoitem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 40, -1, -1));

        jLabel62.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("<html>1. Se tienen identificados los trabajadores que se dedican en forma permanente al ejercicio de las<br>\n actividades de alto riesgo que trata el decreto 2090 de 2003.");
        jPanel15.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 137, -1, -1));

        rbsi151.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi151.setText("Cumple");
        rbsi151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi151ActionPerformed(evt);
            }
        });
        jPanel15.add(rbsi151, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, -1, -1));

        rbno151.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno151.setText("No cumple");
        rbno151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno151ActionPerformed(evt);
            }
        });
        jPanel15.add(rbno151, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, -1, -1));

        btnmv51.setText("Adjuntar Doc");
        btnmv51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv51ActionPerformed(evt);
            }
        });
        jPanel15.add(btnmv51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 140, -1, -1));

        jButton7.setText("Criterio");
        jPanel15.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 51, -1, -1));

        jPanel16.setBackground(new java.awt.Color(183, 219, 243));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 6:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnocum6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel16.add(lblnocum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 47, -1, -1));

        lblcum6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel16.add(lblcum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 47, -1, -1));

        jLabel64.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Conformación COPASST/ Vigía (0.5%).");
        jPanel16.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 47, -1, -1));

        noaplicaitem6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem6.setText("No Aplica");
        noaplicaitem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem6ActionPerformed(evt);
            }
        });
        jPanel16.add(noaplicaitem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));

        rbjustiitem6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem6.setText("Justifica");
        rbjustiitem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem6ActionPerformed(evt);
            }
        });
        jPanel16.add(rbjustiitem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        rbnojustiitem6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem6.setText("No justifica");
        rbnojustiitem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem6ActionPerformed(evt);
            }
        });
        jPanel16.add(rbnojustiitem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, -1));

        txtitem6.setColumns(20);
        txtitem6.setRows(5);
        txtitem6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem6KeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(txtitem6);

        jPanel16.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, 158, 85));

        btnadjnoitem6.setText("Adjuntar Doc");
        btnadjnoitem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem6ActionPerformed(evt);
            }
        });
        jPanel16.add(btnadjnoitem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 60, 108, -1));

        jLabel65.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Modo de Verificación ");
        jPanel16.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 126, 210, -1));

        jLabel66.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("<html>1. Acta mediante la cual se designa el vigía SST (Seguridad y Salud en el Trabajo) o solicitar los soportes de la convocatoria,<br>\nelección, conformación del comité paritario SST y el acta de constitución (Para el caso del comité paritario constatar si es<br>\nsi es igual el número de representantes del empleador y de los trabajadores y que el acta de conformación se encuentra vigente).");
        jPanel16.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        rbsi161.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi161.setText("Cumple");
        rbsi161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi161ActionPerformed(evt);
            }
        });
        jPanel16.add(rbsi161, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 180, -1, -1));

        rbno161.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno161.setText("No cumple");
        rbno161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno161ActionPerformed(evt);
            }
        });
        jPanel16.add(rbno161, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, -1, -1));

        btnmv61.setText("Adjuntar Doc");
        btnmv61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv61ActionPerformed(evt);
            }
        });
        jPanel16.add(btnmv61, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 180, -1, -1));

        jLabel69.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("<html>2. Actas de reunión mensuales del último año del comité paritario o los soportes de las gestiones adelantadas por el vigía<br>\nSST y verificar el cumplimiento de sus funciones.");
        jPanel16.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        rbsi162.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi162.setText("Cumple");
        rbsi162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi162ActionPerformed(evt);
            }
        });
        jPanel16.add(rbsi162, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, -1, -1));

        rbno162.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno162.setText("No cumple");
        rbno162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno162ActionPerformed(evt);
            }
        });
        jPanel16.add(rbno162, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, -1, -1));

        btnmv62.setText("Adjuntar Doc");
        btnmv62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv62ActionPerformed(evt);
            }
        });
        jPanel16.add(btnmv62, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 250, -1, -1));

        jLabel70.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("Nota: Las empresas de menos de 10 trabajadores deben contar con un vigía en seguridad y salud en el trabajo, y de 10 o más trabajadores con un comité paritario SST.");
        jPanel16.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jButton8.setText("Criterio");
        jPanel16.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 72, -1, -1));

        jPanel17.setBackground(new java.awt.Color(183, 219, 243));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 7:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setText("Modo de Verificación ");
        jPanel17.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 102, 150, -1));

        jLabel73.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 0));
        jLabel73.setText("Capacitación COPASST/ vigía (0.5%).");
        jPanel17.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 27, 240, -1));

        lblnocum7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel17.add(lblnocum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 27, -1, -1));

        lblcum7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel17.add(lblcum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 27, -1, -1));

        noaplicaitem7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem7.setText("No Aplica");
        noaplicaitem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem7ActionPerformed(evt);
            }
        });
        jPanel17.add(noaplicaitem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        rbjustiitem7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem7.setText("Justifica");
        rbjustiitem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem7ActionPerformed(evt);
            }
        });
        jPanel17.add(rbjustiitem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, -1));

        rbnojustiitem7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem7.setText("No justifica");
        rbnojustiitem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem7ActionPerformed(evt);
            }
        });
        jPanel17.add(rbnojustiitem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, -1, -1));

        txtitem7.setColumns(20);
        txtitem7.setRows(5);
        txtitem7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem7KeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(txtitem7);

        jPanel17.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 36, 158, 85));

        btnadjnoitem7.setText("Adjuntar Doc");
        btnadjnoitem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem7ActionPerformed(evt);
            }
        });
        jPanel17.add(btnadjnoitem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, 108, -1));

        jLabel74.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("<html>1. Registros que constaten la capacitación y evaluación tanto para el vigía SST o para los miembros del <br>comité paritario SST según aplique \nque estén vigentes.");
        jPanel17.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 139, -1, -1));

        rbsi171.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi171.setText("Cumple");
        rbsi171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi171ActionPerformed(evt);
            }
        });
        jPanel17.add(rbsi171, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, -1, -1));

        rbno171.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno171.setText("No cumple");
        rbno171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno171ActionPerformed(evt);
            }
        });
        jPanel17.add(rbno171, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, -1, -1));

        btnmv71.setText("Adjuntar Doc");
        btnmv71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv71ActionPerformed(evt);
            }
        });
        jPanel17.add(btnmv71, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 140, -1, -1));

        jButton9.setText("Criterio");
        jPanel17.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 52, -1, -1));

        jPanel5.setBackground(new java.awt.Color(183, 219, 243));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 8:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnocum8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel5.add(lblnocum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 47, -1, -1));

        lblcum8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel5.add(lblcum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 47, -1, -1));

        jLabel13.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Conformación comité convivencia (0.5%).");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 47, -1, -1));

        noaplicaitem8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem8.setText("No Aplica");
        noaplicaitem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem8ActionPerformed(evt);
            }
        });
        jPanel5.add(noaplicaitem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));

        rbjustiitem8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem8.setText("Justifica");
        rbjustiitem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem8ActionPerformed(evt);
            }
        });
        jPanel5.add(rbjustiitem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

        rbnojustiitem8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem8.setText("No justifica");
        rbnojustiitem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem8ActionPerformed(evt);
            }
        });
        jPanel5.add(rbnojustiitem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, -1, -1));

        txtitem8.setColumns(20);
        txtitem8.setRows(5);
        txtitem8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem8KeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(txtitem8);

        jPanel5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 158, 85));

        btnadjnoitem8.setText("Adjuntar Doc");
        btnadjnoitem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem8ActionPerformed(evt);
            }
        });
        jPanel5.add(btnadjnoitem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 50, 108, -1));

        jLabel14.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Modo de Verificación ");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 126, 210, -1));

        jLabel30.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("<html>1. Documento de conformación del comité de convivencia laboral y verificar que este conformado de acuerdo a la normativa<br>\ny que su periodo de conformación se encuentre vigente.");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        rbsi181.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi181.setText("Cumple");
        rbsi181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi181ActionPerformed(evt);
            }
        });
        jPanel5.add(rbsi181, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 160, -1, -1));

        rbno181.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno181.setText("No cumple");
        rbno181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno181ActionPerformed(evt);
            }
        });
        jPanel5.add(rbno181, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 160, -1, -1));

        btnmv81.setText("Adjuntar Doc");
        btnmv81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv81ActionPerformed(evt);
            }
        });
        jPanel5.add(btnmv81, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 160, -1, -1));

        jLabel32.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("<html>2. Actas de las reuniones (como mínimo una reunión cada tres meses) junto con los informes de gestión del comité de convi-<br>\nvencia laboral, verificando el desarrollo de sus funciones. ");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        rbsi182.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi182.setText("Cumple");
        rbsi182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi182ActionPerformed(evt);
            }
        });
        jPanel5.add(rbsi182, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, -1, -1));

        rbno182.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno182.setText("No cumple");
        rbno182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno182ActionPerformed(evt);
            }
        });
        jPanel5.add(rbno182, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, -1, -1));

        btnmv82.setText("Adjuntar Doc");
        btnmv82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv82ActionPerformed(evt);
            }
        });
        jPanel5.add(btnmv82, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 250, -1, -1));

        jButton10.setText("Criterio");
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 72, -1, -1));

        jPanel12.setBackground(new java.awt.Color(183, 219, 243));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Modo de Verificación ");
        jPanel12.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 102, 140, -1));

        jLabel50.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Programa Capacitación, Promoción y Prevención - Pyp. (2%)");
        jPanel12.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 27, -1, -1));

        lblnocum9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel12.add(lblnocum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 27, -1, -1));

        lblcum9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel12.add(lblcum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 27, -1, -1));

        noaplicaitem9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem9.setText("No Aplica");
        noaplicaitem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem9ActionPerformed(evt);
            }
        });
        jPanel12.add(noaplicaitem9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        rbjustiitem9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem9.setText("Justifica");
        rbjustiitem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem9ActionPerformed(evt);
            }
        });
        jPanel12.add(rbjustiitem9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        rbnojustiitem9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem9.setText("No justifica");
        rbnojustiitem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem9ActionPerformed(evt);
            }
        });
        jPanel12.add(rbnojustiitem9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        txtitem9.setColumns(20);
        txtitem9.setRows(5);
        txtitem9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem9KeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(txtitem9);

        jPanel12.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 158, 85));

        btnadjnoitem9.setText("Adjuntar Doc");
        btnadjnoitem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem9ActionPerformed(evt);
            }
        });
        jPanel12.add(btnadjnoitem9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, 108, -1));

        jLabel51.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("<html>1. programa de capacitación anual y la matriz de identificación de peligros y verificar  que el mismo este dirigido a los peligros ya<br>\nidentificados, con la evaluación y control del riesgo, y/o necesidades en Seguridad y Salud en el Trabajo, y verificar las evidencias<br>\nde su cumplimiento.");
        jPanel12.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        rbsi191.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi191.setText("Cumple");
        rbsi191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi191ActionPerformed(evt);
            }
        });
        jPanel12.add(rbsi191, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, -1, -1));

        rbno191.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno191.setText("No cumple");
        rbno191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno191ActionPerformed(evt);
            }
        });
        jPanel12.add(rbno191, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 150, -1, -1));

        btnmv91.setText("Adjuntar Doc");
        btnmv91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv91ActionPerformed(evt);
            }
        });
        jPanel12.add(btnmv91, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 150, -1, -1));

        jLabel54.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("2. Verificar si el comité paritario SST o Vigia SST participo en la revisión anual del plan de capacitación. ");
        jPanel12.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        rbsi192.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi192.setText("Cumple");
        rbsi192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi192ActionPerformed(evt);
            }
        });
        jPanel12.add(rbsi192, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, -1, -1));

        rbno192.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno192.setText("No cumple");
        rbno192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno192ActionPerformed(evt);
            }
        });
        jPanel12.add(rbno192, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 220, -1, -1));

        btnmv92.setText("Adjuntar Doc");
        btnmv92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv92ActionPerformed(evt);
            }
        });
        jPanel12.add(btnmv92, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 220, -1, -1));

        jButton12.setText("Criterio");
        jPanel12.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 52, -1, -1));

        jPanel13.setBackground(new java.awt.Color(183, 219, 243));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnocum10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel13.add(lblnocum10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 47, -1, -1));

        lblcum10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel13.add(lblcum10, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 47, -1, -1));

        jLabel55.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("<html>Capacitación, inducción y Reinducción en Sistemas de Gestión de <br>\nSeguridad y Salud en el trabajo SG-SST, actividade de promoción<br>\ny Prevención Pyp. (2%)");
        jPanel13.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 47, -1, -1));

        noaplicaitem10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem10.setText("No Aplica");
        noaplicaitem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem10ActionPerformed(evt);
            }
        });
        jPanel13.add(noaplicaitem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 47, -1, -1));

        rbjustiitem10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem10.setText("Justifica");
        rbjustiitem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem10ActionPerformed(evt);
            }
        });
        jPanel13.add(rbjustiitem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 47, -1, -1));

        rbnojustiitem10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem10.setText("No justifica");
        rbnojustiitem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem10ActionPerformed(evt);
            }
        });
        jPanel13.add(rbnojustiitem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 47, -1, -1));

        txtitem10.setColumns(20);
        txtitem10.setRows(5);
        txtitem10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem10KeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(txtitem10);

        jPanel13.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 47, 158, 85));

        btnadjnoitem10.setText("Adjuntar Doc");
        btnadjnoitem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem10ActionPerformed(evt);
            }
        });
        jPanel13.add(btnadjnoitem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1141, 47, 108, -1));

        jLabel56.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Modo de Verificación ");
        jPanel13.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 160, -1, -1));

        jLabel57.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("<html>Solicitar la lista de trabajadores, independientemente de su forma de vinculación y/o contratación y verificar los <br>\nsoportes documentales que den cuenta de la capacitación y de su evaluación, de la inducción y reinducción de confor-<br>\nmidad con el criterio. La referencia es el Plan de capacitación, su cumplimiento y la cobertura de los trabajadores obje- <br>\nto de cada tema.");
        jPanel13.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        rbsi1101.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi1101.setText("Cumple");
        rbsi1101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi1101ActionPerformed(evt);
            }
        });
        jPanel13.add(rbsi1101, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, -1, -1));

        rbno1101.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno1101.setText("No cumple");
        rbno1101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno1101ActionPerformed(evt);
            }
        });
        jPanel13.add(rbno1101, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 210, -1, -1));

        btnmv101.setText("Adjuntar Doc");
        btnmv101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv101ActionPerformed(evt);
            }
        });
        jPanel13.add(btnmv101, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 210, -1, -1));

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel79.setText("Nota : Para la verificacion, empresas de 1 a 10 trabajadores verificar 100%, entre 11 y 50 el 20%, entre 51 y 200 el 10% y mayores a 200 verificar el registro de 30 trabajadores. ");
        jPanel13.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 294, -1, -1));

        jButton11.setText("Criterio");
        jPanel13.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 116, -1, -1));

        jPanel8.setBackground(new java.awt.Color(183, 219, 243));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnocum11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jPanel8.add(lblnocum11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 47, -1, -1));

        lblcum11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N
        jPanel8.add(lblcum11, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 47, -1, -1));

        jLabel34.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("<html>Responsables del Sistema de Gestión de Seguridad y Salud en<br> \nel trabajo SG-SST, con curso (50 Horas). (2%) y Prevención Pyp. (2%)");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 47, -1, -1));

        noaplicaitem11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem11.setText("No Aplica");
        noaplicaitem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem11ActionPerformed(evt);
            }
        });
        jPanel8.add(noaplicaitem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        rbjustiitem11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem11.setText("Justifica");
        rbjustiitem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem11ActionPerformed(evt);
            }
        });
        jPanel8.add(rbjustiitem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        rbnojustiitem11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem11.setText("No justifica");
        rbnojustiitem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem11ActionPerformed(evt);
            }
        });
        jPanel8.add(rbnojustiitem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, -1, -1));

        txtitem11.setColumns(20);
        txtitem11.setRows(5);
        txtitem11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem11KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtitem11);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, 158, 85));

        btnadjnoitem11.setText("Adjuntar Doc");
        btnadjnoitem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem11ActionPerformed(evt);
            }
        });
        jPanel8.add(btnadjnoitem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 50, -1, -1));

        jLabel35.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Modo de Verificación ");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 144, 210, -1));

        jLabel36.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("<html>Solicitar el certificado de aprobación del curso de capacitación virtual de cincuenta (50) horas definido por el Ministerio <br>\nde Trabajo, expedido a nombre del responsable del Sistema de Gestión de Seguridad y Salud en el Trabajo.");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        rbsi1111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi1111.setText("Cumple");
        rbsi1111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi1111ActionPerformed(evt);
            }
        });
        jPanel8.add(rbsi1111, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, -1, -1));

        rbno1111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno1111.setText("No cumple");
        rbno1111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno1111ActionPerformed(evt);
            }
        });
        jPanel8.add(rbno1111, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 190, -1, -1));

        btnmv111.setText("Adjuntar Doc");
        btnmv111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv111ActionPerformed(evt);
            }
        });
        jPanel8.add(btnmv111, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 190, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setText("<<< Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 264, -1, 32));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save(1).png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 264, -1, 32));

        jButton13.setText("Criterio");
        jPanel8.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel40.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("E1.2Capacitación en el Sistema de Gestión de Seguridad y Salud en el Trabajo (6%)");

        jLabel41.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("E1.1 Recursos financieros y técnico humanos y de otra índole requeridos para coordinar y desarrollar el sistema de gestión.(4%)");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recursos.jpg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Decker", 1, 100)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("RECURSOS");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)))))
                        .addGap(50, 151, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(43, 43, 43)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel40)
                .addGap(26, 26, 26)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noaplicaitem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem1ActionPerformed

        if(noaplicaitem1.isSelected()){
            rbjustiitem1.setEnabled(true);
            rbnojustiitem1.setEnabled(true);
            rbsi111.setEnabled(false);
            rbsi112.setEnabled(false);
            rbsi113.setEnabled(false);
            rbsi114.setEnabled(false);
            rbno111.setEnabled(false);
            rbno112.setEnabled(false);
            rbno113.setEnabled(false);
            rbno114.setEnabled(false);
            btnmv11.setEnabled(false);
            btnmv12.setEnabled(false);
            btnmv13.setEnabled(false);
            btnmv14.setEnabled(false);
          
            txtitem1.setEnabled(false);
            btnadjnoitem1.setEnabled(false);
            lblcum1.setEnabled(false);
            lblnocum1.setEnabled(false);
            
             tr.setI1111("");
             

        }else{
            lblcum1.setEnabled(false);
            lblnocum1.setEnabled(false);
            rbjustiitem1.setEnabled(false);
            rbnojustiitem1.setEnabled(false);
            btnadjnoitem1.setEnabled(false);
            txtitem1.setEnabled(false);
            rbsi111.setEnabled(true);
            rbsi112.setEnabled(true);
            rbsi113.setEnabled(true);
            rbsi114.setEnabled(true);
            rbno111.setEnabled(true);
            rbno112.setEnabled(true);
            rbno113.setEnabled(true);
            rbno114.setEnabled(true);

        }
    }//GEN-LAST:event_noaplicaitem1ActionPerformed

    private void rbjustiitem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem1ActionPerformed

        txtitem1.setEnabled(true);
         tr.setI1111("");
        
        
        
    }//GEN-LAST:event_rbjustiitem1ActionPerformed

    private void rbnojustiitem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem1ActionPerformed
         tr.setI1111("");
         tr.setI1111("no");
          tr.setA1111("");
          tr.setA1111("si");
          tr.setV1111("no");
           tr.setV1112("no");
            tr.setV1113("no");
             tr.setV1114("no");
          
        btnadjnoitem1.setEnabled(false);
        txtitem1.setEnabled(false);
        lblnocum1.setEnabled(true);
        lblcum1.setEnabled(false);
    }//GEN-LAST:event_rbnojustiitem1ActionPerformed

    private void txtitem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem1KeyPressed

        if(txtitem1.getText().length()>2){
             tr.setI1111("");
             tr.setI1111("si");
             tr.setA1111("");
             tr.setA1111("no");
             tr.setJ1111("");
             tr.setJ1111(txtitem1.getText());
             tr.setV1111("no aplica");
             tr.setV1112("no aplica");
             tr.setV1113("no aplica");
             tr.setV1114("no aplica");
             
            
            lblcum1.setEnabled(true);
            lblnocum1.setEnabled(false);
            btnadjnoitem1.setEnabled(true);
        }else{
           
            tr.setI1111("");
            tr.setA1111("");
             
             
            lblcum1.setEnabled(false);
            lblnocum1.setEnabled(false);
            btnadjnoitem1.setEnabled(false);
        }
    }//GEN-LAST:event_txtitem1KeyPressed

    private void rbsi111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi111ActionPerformed
        tr.setV1111("");
        tr.setV1111("si");
         btnmv11.setEnabled(true);
        if(rbsi111.isSelected() && rbsi112.isSelected() && rbsi113.isSelected() && rbsi114.isSelected() ){
            lblcum1.setEnabled(true);
            lblnocum1.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi111ActionPerformed

    private void rbno111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno111ActionPerformed
        tr.setV1111("");
        tr.setV1111("no");
        btnmv11.setEnabled(false);
        if(rbno111.isSelected() || rbno112.isSelected() || rbno113.isSelected() || rbno114.isSelected()){
            lblnocum1.setEnabled(true);
            lblcum1.setEnabled(false);

        }
    }//GEN-LAST:event_rbno111ActionPerformed

    private void rbsi112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi112ActionPerformed
        tr.setV1112("");
        tr.setV1112("si");
        btnmv12.setEnabled(true);
        if(rbsi111.isSelected() && rbsi112.isSelected() && rbsi113.isSelected() && rbsi114.isSelected() ){
            lblcum1.setEnabled(true);
            lblnocum1.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi112ActionPerformed

    private void rbno112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno112ActionPerformed
        tr.setV1112("");
        tr.setV1112("no");
        
        btnmv12.setEnabled(false);
        if(rbno111.isSelected() || rbno112.isSelected() || rbno113.isSelected() || rbno114.isSelected()){
            lblnocum1.setEnabled(true);
            lblcum1.setEnabled(false);

        }
    }//GEN-LAST:event_rbno112ActionPerformed

    private void rbsi113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi113ActionPerformed
        tr.setV1113("");
        tr.setV1113("si");
        btnmv13.setEnabled(true);
        if(rbsi111.isSelected() && rbsi112.isSelected() && rbsi113.isSelected() && rbsi114.isSelected() ){
            lblcum1.setEnabled(true);
            lblnocum1.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi113ActionPerformed

    private void rbno113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno113ActionPerformed
        tr.setV1113("");
        tr.setV1113("no");
        btnmv13.setEnabled(false);
        if(rbno111.isSelected() || rbno112.isSelected() || rbno113.isSelected() || rbno114.isSelected()){
            lblnocum1.setEnabled(true);
            lblcum1.setEnabled(false);

        }
    }//GEN-LAST:event_rbno113ActionPerformed

    private void rbsi114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi114ActionPerformed
         tr.setV1114("");
        tr.setV1114("si");
        
        btnmv14.setEnabled(true);
        if(rbsi111.isSelected() && rbsi112.isSelected() && rbsi113.isSelected() && rbsi114.isSelected() ){
            lblcum1.setEnabled(true);
            lblnocum1.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi114ActionPerformed

    private void rbno114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno114ActionPerformed
         tr.setV1114("");
        tr.setV1114("si");
        
        
        btnmv14.setEnabled(false);
        if(rbno111.isSelected() || rbno112.isSelected() || rbno113.isSelected() || rbno114.isSelected()){
            lblnocum1.setEnabled(true);
            lblcum1.setEnabled(false);

        }
    }//GEN-LAST:event_rbno114ActionPerformed

    private void noaplicaitem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem2ActionPerformed
        if(noaplicaitem2.isSelected()){

            rbsi121.setEnabled(false);
            rbno121.setEnabled(false);
            btnmv21.setEnabled(false);
            rbjustiitem2.setEnabled(true);
            rbnojustiitem2.setEnabled(true);
            txtitem2.setEnabled(false);
            btnadjnoitem2.setEnabled(false);
            lblcum2.setEnabled(false);
            lblnocum2.setEnabled(false);
            
            tr.setI1121("");
        }else{
            rbsi121.setEnabled(true);
            rbno121.setEnabled(true);
            btnmv21.setEnabled(false);
            rbjustiitem2.setEnabled(false);
            rbnojustiitem2.setEnabled(false);
            txtitem2.setEnabled(false);
            btnadjnoitem2.setEnabled(false);
            lblcum2.setEnabled(false);
            lblnocum2.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem2ActionPerformed

    private void rbjustiitem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem2ActionPerformed
        txtitem2.setEnabled(true);
        tr.setI1121("");
    }//GEN-LAST:event_rbjustiitem2ActionPerformed

    private void rbnojustiitem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem2ActionPerformed
         tr.setI1121("");
         tr.setI1121("no");
         tr.setA1121("");
         tr.setA1121("si");
         tr.setV1121("no");
         
        txtitem2.setEnabled(false);
        lblcum2.setEnabled(false);
        lblnocum2.setEnabled(true);
    }//GEN-LAST:event_rbnojustiitem2ActionPerformed

    private void txtitem2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem2KeyPressed
        if(txtitem2.getText().length()>2){
             tr.setI1121("");
             tr.setI1121("si");
             tr.setA1121("");
             tr.setA1121("no");
             tr.setV1121("no aplica");
          tr.setJ1121(txtitem2.getText());
            lblcum2.setEnabled(true);
            lblnocum2.setEnabled(false);
            btnadjnoitem2.setEnabled(true);
        }else{
            tr.setI1121("");
            tr.setA1121("");
            lblcum2.setEnabled(false);
            lblnocum2.setEnabled(false);
            btnadjnoitem2.setEnabled(false);

        }
    }//GEN-LAST:event_txtitem2KeyPressed

    private void rbsi121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi121ActionPerformed
        tr.setV1121("");
        tr.setV1121("si");
        btnmv21.setEnabled(true);
        lblcum2.setEnabled(true);
        lblnocum2.setEnabled(false);
    }//GEN-LAST:event_rbsi121ActionPerformed

    private void rbno121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno121ActionPerformed
         tr.setV1121("");
         tr.setV1121("no");
        btnmv21.setEnabled(false);
        lblcum2.setEnabled(false);
        lblnocum2.setEnabled(true);
    }//GEN-LAST:event_rbno121ActionPerformed

    private void noaplicaitem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem3ActionPerformed

        if(noaplicaitem3.isSelected()){
            rbjustiitem3.setEnabled(true);
            rbnojustiitem3.setEnabled(true);
            rbsi131.setEnabled(false);
            rbno131.setEnabled(false);
            btnmv31.setEnabled(false);
            txtitem3.setEnabled(false);
            btnadjnoitem3.setEnabled(false);
            lblcum3.setEnabled(false);
            lblnocum3.setEnabled(false);
            
             tr.setI1131("");
        }else{
            lblcum3.setEnabled(false);
            lblnocum3.setEnabled(false);
            rbjustiitem3.setEnabled(false);
            rbnojustiitem3.setEnabled(false);
            btnadjnoitem3.setEnabled(false);
            txtitem3.setEnabled(false);
            rbsi131.setEnabled(true);

            rbno131.setEnabled(true);

        }
    }//GEN-LAST:event_noaplicaitem3ActionPerformed

    private void rbjustiitem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem3ActionPerformed

        txtitem3.setEnabled(true);
        
        tr.setI1131("");
    }//GEN-LAST:event_rbjustiitem3ActionPerformed

    private void rbnojustiitem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem3ActionPerformed
         tr.setI1131("");
         tr.setI1131("no");
         tr.setA1131("");
         tr.setA1131("si");
         tr.setV1131("no");
         btnadjnoitem3.setEnabled(false);
        txtitem3.setEnabled(false);
        lblnocum3.setEnabled(true);
        lblcum3.setEnabled(false);
    }//GEN-LAST:event_rbnojustiitem3ActionPerformed

    private void txtitem3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem3KeyPressed

        if(txtitem3.getText().length()>2){
             tr.setI1131("");
             tr.setI1131("si");
             tr.setA1131("");
             tr.setA1131("no");
             tr.setV1131("no aplica");
             tr.setJ1131(txtitem3.getText());
            
            lblcum3.setEnabled(true);
            lblnocum3.setEnabled(false);
            btnadjnoitem3.setEnabled(true);
        }else{
             tr.setI1131("");
             tr.setA1131("");
            lblcum3.setEnabled(false);
            lblnocum3.setEnabled(false);
            btnadjnoitem3.setEnabled(false);
        }
    }//GEN-LAST:event_txtitem3KeyPressed

    private void rbsi131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi131ActionPerformed
        btnmv31.setEnabled(true);
        if(rbsi131.isSelected() ){
             tr.setV1131("");
             tr.setV1131("si");
            lblcum3.setEnabled(true);
            lblnocum3.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi131ActionPerformed

    private void rbno131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno131ActionPerformed
        btnmv31.setEnabled(false);
        if(rbno131.isSelected()){
             tr.setV1131("");
             tr.setV1131("no");
            lblnocum3.setEnabled(true);
            lblcum3.setEnabled(false);

        }
    }//GEN-LAST:event_rbno131ActionPerformed

    private void noaplicaitem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem4ActionPerformed
        if(noaplicaitem4.isSelected()){

            rbsi141.setEnabled(false);
            rbno141.setEnabled(false);
            btnmv41.setEnabled(false);
            rbsi142.setEnabled(false);
            rbno142.setEnabled(false);
            btnmv42.setEnabled(false);
            rbjustiitem4.setEnabled(true);
            rbnojustiitem4.setEnabled(true);
            txtitem4.setEnabled(false);
            btnadjnoitem4.setEnabled(false);
            lblcum4.setEnabled(false);
            lblnocum4.setEnabled(false);
            
             tr.setI1141("");
        }else{
            rbsi142.setEnabled(true);
            rbno142.setEnabled(true);
            rbsi141.setEnabled(true);
            rbno141.setEnabled(true);
            btnmv41.setEnabled(false);
            rbjustiitem4.setEnabled(false);
            rbnojustiitem4.setEnabled(false);
            txtitem4.setEnabled(false);
            btnadjnoitem4.setEnabled(false);
            lblcum4.setEnabled(false);
            lblnocum4.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem4ActionPerformed

    private void rbjustiitem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem4ActionPerformed
        txtitem4.setEnabled(true);
         tr.setI1141("");
    }//GEN-LAST:event_rbjustiitem4ActionPerformed

    private void rbnojustiitem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem4ActionPerformed
        tr.setI1141("");
         tr.setI1141("no");
         tr.setA1141("");
         tr.setA1141("si");
         tr.setV1141("no");
         tr.setV1142("no");
        txtitem4.setEnabled(false);
        lblcum4.setEnabled(false);
        lblnocum4.setEnabled(true);
    }//GEN-LAST:event_rbnojustiitem4ActionPerformed

    private void txtitem4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem4KeyPressed
        if(txtitem4.getText().length()>2){
         tr.setI1141("");
         tr.setI1141("si");
         tr.setA1141("");
         tr.setA1141("no");
         tr.setV1141("no aplica");
         tr.setV1142("no aplica");
         
         tr.setJ1141(txtitem4.getText());
            lblcum4.setEnabled(true);
            lblnocum4.setEnabled(false);
            btnadjnoitem4.setEnabled(true);
        }else{
             tr.setI1141("");
             tr.setA1141("");
        
            lblcum4.setEnabled(false);
            lblnocum4.setEnabled(false);
            btnadjnoitem4.setEnabled(false);

        }
    }//GEN-LAST:event_txtitem4KeyPressed

    private void rbsi141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi141ActionPerformed
      tr.setV1141("");
      tr.setV1141("si");
       
        btnmv41.setEnabled(true);
        if(rbsi141.isSelected() && rbsi142.isSelected()){
            lblcum4.setEnabled(true);
            lblnocum4.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi141ActionPerformed

    private void rbno141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno141ActionPerformed
        tr.setV1141("");
        tr.setV1141("no");
        btnmv41.setEnabled(false);
        if(rbno141.isSelected() || rbno142.isSelected()){
            lblcum4.setEnabled(false);
            lblnocum4.setEnabled(true);
        }
    }//GEN-LAST:event_rbno141ActionPerformed

    private void rbsi142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi142ActionPerformed
        btnmv42.setEnabled(true);
        tr.setV1142("");
         tr.setV1142("si");
        

        if(rbsi141.isSelected() && rbsi142.isSelected()){
            lblcum4.setEnabled(true);
            lblnocum4.setEnabled(false);}
    }//GEN-LAST:event_rbsi142ActionPerformed

    private void rbno142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno142ActionPerformed
        btnmv42.setEnabled(false);
        tr.setV1142("");
        tr.setV1142("no");
        if(rbno141.isSelected() || rbno142.isSelected()){
            lblcum4.setEnabled(false);
            lblnocum4.setEnabled(true);
        }
    }//GEN-LAST:event_rbno142ActionPerformed

    private void noaplicaitem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem5ActionPerformed

        if(noaplicaitem5.isSelected()){
            rbjustiitem5.setEnabled(true);
            rbnojustiitem5.setEnabled(true);
            rbsi151.setEnabled(false);

            rbno151.setEnabled(false);

            btnmv51.setEnabled(false);

            

            txtitem5.setEnabled(false);
            btnadjnoitem5.setEnabled(false);
            
            lblcum5.setEnabled(false);
            lblnocum5.setEnabled(false);
            
            tr.setI1151("");

        }else{
            lblcum5.setEnabled(false);
            lblnocum5.setEnabled(false);
            rbjustiitem5.setEnabled(false);
            rbnojustiitem5.setEnabled(false);
            btnadjnoitem5.setEnabled(false);
            txtitem5.setEnabled(false);
            rbsi151.setEnabled(true);

            rbno151.setEnabled(true);

        }
    }//GEN-LAST:event_noaplicaitem5ActionPerformed

    private void rbjustiitem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem5ActionPerformed
         tr.setI1151("");
        txtitem5.setEnabled(true);
    }//GEN-LAST:event_rbjustiitem5ActionPerformed

    private void rbnojustiitem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem5ActionPerformed
             
         tr.setI1151("");
         tr.setI1151("no");
         tr.setA1151("");
         tr.setA1151("si");
         tr.setV1151("no");

        btnadjnoitem5.setEnabled(false);
        txtitem5.setEnabled(false);
        lblnocum5.setEnabled(true);
        lblcum5.setEnabled(false);
    }//GEN-LAST:event_rbnojustiitem5ActionPerformed

    private void txtitem5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem5KeyPressed

        if(txtitem5.getText().length()>2){
             tr.setI1151("");
             tr.setI1151("si");
             tr.setA1151("");
             tr.setA1151("no");
              tr.setV1151("no aplica");
             
             tr.setJ1151(txtitem5.getText());
            lblcum5.setEnabled(true);
            lblnocum5.setEnabled(false);
            btnadjnoitem5.setEnabled(true);
        }else{
             tr.setI1151("");
             tr.setA1151("");
             
            lblcum5.setEnabled(false);
            lblnocum5.setEnabled(false);
            btnadjnoitem5.setEnabled(false);
        }
    }//GEN-LAST:event_txtitem5KeyPressed

    private void rbsi151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi151ActionPerformed
         
        tr.setV1151("");
         tr.setV1151("si");
        btnmv51.setEnabled(true);
        if(rbsi151.isSelected() ){
            lblcum5.setEnabled(true);
            lblnocum5.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi151ActionPerformed

    private void rbno151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno151ActionPerformed
         tr.setV1151("");
         tr.setV1151("no");
       
        btnmv51.setEnabled(false);
        if(rbno151.isSelected()){
            lblnocum5.setEnabled(true);
            lblcum5.setEnabled(false);

        }
    }//GEN-LAST:event_rbno151ActionPerformed

    private void noaplicaitem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem6ActionPerformed
        if(noaplicaitem6.isSelected()){

            rbsi161.setEnabled(false);
            rbno161.setEnabled(false);
            btnmv61.setEnabled(false);
            rbsi162.setEnabled(false);
            rbno162.setEnabled(false);
            btnmv62.setEnabled(false);
            rbjustiitem6.setEnabled(true);
            rbnojustiitem6.setEnabled(true);
            txtitem6.setEnabled(false);
            btnadjnoitem6.setEnabled(false);
            lblcum6.setEnabled(false);
            lblnocum6.setEnabled(false);
            
            tr.setI1161("");
            
        }else{
            rbsi162.setEnabled(true);
            rbno162.setEnabled(true);
            rbsi161.setEnabled(true);
            rbno161.setEnabled(true);
            btnmv61.setEnabled(false);
            rbjustiitem6.setEnabled(false);
            rbnojustiitem6.setEnabled(false);
            txtitem6.setEnabled(false);
            btnadjnoitem6.setEnabled(false);
            lblcum6.setEnabled(false);
            lblnocum6.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem6ActionPerformed

    private void rbjustiitem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem6ActionPerformed
        txtitem6.setEnabled(true);
        tr.setI1161("");
    }//GEN-LAST:event_rbjustiitem6ActionPerformed

    private void rbnojustiitem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem6ActionPerformed
        txtitem6.setEnabled(false);
        tr.setI1161("");
         tr.setI1161("no");
         tr.setA1161("");
         tr.setA1161("si");
         tr.setV1161("no");
         tr.setV1162("no");
        lblcum6.setEnabled(false);
        lblnocum6.setEnabled(true);
    }//GEN-LAST:event_rbnojustiitem6ActionPerformed

    private void txtitem6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem6KeyPressed
        if(txtitem6.getText().length()>2){
            tr.setI1161("");
            tr.setI1161("si");
            tr.setA1161("");
            tr.setA1161("no");
             tr.setV1161("no aplica");
            tr.setV1162("no aplica");
           
            tr.setJ1161(txtitem6.getText());
            
            lblcum6.setEnabled(true);
            lblnocum6.setEnabled(false);
            btnadjnoitem6.setEnabled(true);
        }else{
            tr.setI1161("");
            tr.setA1161("");
            
            lblcum6.setEnabled(false);
            lblnocum6.setEnabled(false);
            btnadjnoitem6.setEnabled(false);

        }
    }//GEN-LAST:event_txtitem6KeyPressed

    private void btnadjnoitem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem6ActionPerformed
           // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(6);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
           
           
           
           
       }
       
    }//GEN-LAST:event_btnadjnoitem6ActionPerformed

    private void rbsi161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi161ActionPerformed
        btnmv61.setEnabled(true);
         tr.setV1161("");
         tr.setV1161("si");
        if(rbsi161.isSelected() && rbsi162.isSelected()){
            lblcum6.setEnabled(true);
            lblnocum6.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi161ActionPerformed

    private void rbno161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno161ActionPerformed
        btnmv61.setEnabled(false);
         tr.setV1161("");
         tr.setV1161("no");
        
        if(rbno161.isSelected() || rbno162.isSelected()){
            lblcum6.setEnabled(false);
            lblnocum6.setEnabled(true);
        }
    }//GEN-LAST:event_rbno161ActionPerformed

    private void rbsi162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi162ActionPerformed
        btnmv62.setEnabled(true);
         tr.setV1162("");
         tr.setV1162("si");
        if(rbsi161.isSelected() && rbsi162.isSelected()){
            lblcum6.setEnabled(true);
            lblnocum6.setEnabled(false);}
    }//GEN-LAST:event_rbsi162ActionPerformed

    private void rbno162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno162ActionPerformed
        btnmv62.setEnabled(false);
         tr.setV1162("");
         tr.setV1162("no");
        
        if(rbno161.isSelected() || rbno162.isSelected()){
            lblcum6.setEnabled(false);
            lblnocum6.setEnabled(true);
        }
    }//GEN-LAST:event_rbno162ActionPerformed

    private void noaplicaitem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem7ActionPerformed

        if(noaplicaitem7.isSelected()){
            rbjustiitem7.setEnabled(true);
            rbnojustiitem7.setEnabled(true);
            rbsi171.setEnabled(false);

            rbno171.setEnabled(false);

            btnmv71.setEnabled(false);

           

            txtitem7.setEnabled(false);
            btnadjnoitem7.setEnabled(false);
           
            lblcum7.setEnabled(false);
            lblnocum7.setEnabled(false);
            
             tr.setI1171("");

        }else{
            lblcum7.setEnabled(false);
            lblnocum7.setEnabled(false);
            rbjustiitem7.setEnabled(false);
            rbnojustiitem7.setEnabled(false);
            btnadjnoitem7.setEnabled(false);
            txtitem7.setEnabled(false);
            rbsi171.setEnabled(true);

            rbno171.setEnabled(true);

        }
    }//GEN-LAST:event_noaplicaitem7ActionPerformed

    private void rbjustiitem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem7ActionPerformed
          tr.setI1171("");
        txtitem7.setEnabled(true);
    }//GEN-LAST:event_rbjustiitem7ActionPerformed

    private void rbnojustiitem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem7ActionPerformed
         tr.setI1171("");
         tr.setI1171("no");
         tr.setA1171("");
         tr.setA1171("si");
          tr.setV1171("no");
        
        btnadjnoitem7.setEnabled(false);
        txtitem7.setEnabled(false);
        lblnocum7.setEnabled(true);
        lblcum7.setEnabled(false);
    }//GEN-LAST:event_rbnojustiitem7ActionPerformed

    private void txtitem7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem7KeyPressed

        if(txtitem7.getText().length()>2){
             tr.setI1171("");
             tr.setI1171("si");
             tr.setA1171("");
             tr.setA1171("no");
              tr.setV1171("no aplica");
             tr.setJ1171(txtitem7.getText());
             
            
            lblcum7.setEnabled(true);
            lblnocum7.setEnabled(false);
            btnadjnoitem7.setEnabled(true);
        }else{
             tr.setI1171("");
             tr.setA1171("");
            
            
            
            lblcum7.setEnabled(false);
            lblnocum7.setEnabled(false);
            btnadjnoitem7.setEnabled(false);
        }
    }//GEN-LAST:event_txtitem7KeyPressed

    private void rbsi171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi171ActionPerformed
        btnmv71.setEnabled(true);
         tr.setV1171("");
         tr.setV1171("si");
        if(rbsi171.isSelected() ){
            lblcum7.setEnabled(true);
            lblnocum7.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi171ActionPerformed

    private void rbno171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno171ActionPerformed
        btnmv71.setEnabled(false);
         tr.setV1171("");
         tr.setV1171("no");
        if(rbno171.isSelected()){
            lblnocum7.setEnabled(true);
            lblcum7.setEnabled(false);

        }
    }//GEN-LAST:event_rbno171ActionPerformed

    private void noaplicaitem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem8ActionPerformed
        if(noaplicaitem8.isSelected()){

            rbsi181.setEnabled(false);
            rbno181.setEnabled(false);
            btnmv81.setEnabled(false);
            rbsi182.setEnabled(false);
            rbno182.setEnabled(false);
            btnmv82.setEnabled(false);
            rbjustiitem8.setEnabled(true);
            rbnojustiitem8.setEnabled(true);
            txtitem8.setEnabled(false);
            btnadjnoitem8.setEnabled(false);
            lblcum8.setEnabled(false);
            lblnocum8.setEnabled(false);
            
             tr.setI1181("");
        }else{
            rbsi182.setEnabled(true);
            rbno182.setEnabled(true);
            rbsi181.setEnabled(true);
            rbno181.setEnabled(true);
            btnmv81.setEnabled(false);
            rbjustiitem8.setEnabled(false);
            rbnojustiitem8.setEnabled(false);
            txtitem8.setEnabled(false);
            btnadjnoitem8.setEnabled(false);
            lblcum8.setEnabled(false);
            lblnocum8.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem8ActionPerformed

    private void rbjustiitem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem8ActionPerformed
         tr.setI1181("");
        txtitem8.setEnabled(true);
    }//GEN-LAST:event_rbjustiitem8ActionPerformed

    private void rbnojustiitem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem8ActionPerformed

         tr.setI1181("");
         tr.setI1181("no");
         tr.setA1181("");
         tr.setA1181("si");
          tr.setV1181("no");
          tr.setV1182("no");
         
        txtitem8.setEnabled(false);
        lblcum8.setEnabled(false);
        lblnocum8.setEnabled(true);
    }//GEN-LAST:event_rbnojustiitem8ActionPerformed

    private void txtitem8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem8KeyPressed
        if(txtitem8.getText().length()>2){
            tr.setI1181("");
         tr.setI1181("si");
         tr.setA1181("");
         tr.setA1181("no");
         tr.setJ1181(txtitem8.getText());
         tr.setV1181("no aplica");
         tr.setV1182("no aplica");
            lblcum8.setEnabled(true);
            lblnocum8.setEnabled(false);
            btnadjnoitem8.setEnabled(true);
        }else{
            tr.setI1181("");
           tr.setA1181("");
            lblcum8.setEnabled(false);
            lblnocum8.setEnabled(false);
            btnadjnoitem8.setEnabled(false);

        }
    }//GEN-LAST:event_txtitem8KeyPressed

    private void btnadjnoitem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem8ActionPerformed
           // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(8);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
           
           
           
           
       }
       
    }//GEN-LAST:event_btnadjnoitem8ActionPerformed

    private void rbsi181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi181ActionPerformed
         tr.setV1181("");
         tr.setV1181("si");

        btnmv81.setEnabled(true);
        if(rbsi181.isSelected() && rbsi182.isSelected()){
            lblcum8.setEnabled(true);
            lblnocum8.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi181ActionPerformed

    private void rbno181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno181ActionPerformed
       tr.setV1181("");
       tr.setV1181("no");
        btnmv81.setEnabled(false);
        if(rbno181.isSelected() || rbno182.isSelected()){
            lblcum8.setEnabled(false);
            lblnocum8.setEnabled(true);
        }
    }//GEN-LAST:event_rbno181ActionPerformed

    private void rbsi182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi182ActionPerformed
       tr.setV1182("");
       tr.setV1182("si");
        
        btnmv82.setEnabled(true);

        if(rbsi181.isSelected() && rbsi182.isSelected()){
            lblcum8.setEnabled(true);
            lblnocum8.setEnabled(false);}
    }//GEN-LAST:event_rbsi182ActionPerformed

    private void rbno182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno182ActionPerformed
        tr.setV1182("");
        tr.setV1182("no");
        btnmv82.setEnabled(false);
        if(rbno181.isSelected() || rbno182.isSelected()){
            lblcum8.setEnabled(false);
            lblnocum8.setEnabled(true);
        }
    }//GEN-LAST:event_rbno182ActionPerformed

    private void noaplicaitem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem9ActionPerformed

          if(noaplicaitem9.isSelected()){
            rbjustiitem9.setEnabled(true);
            rbnojustiitem9.setEnabled(true);
            rbsi191.setEnabled(false);
            rbno192.setEnabled(false);
            rbsi192.setEnabled(false);
            btnmv92.setEnabled(false);
            rbno191.setEnabled(false);
            btnmv91.setEnabled(false);
            txtitem9.setEnabled(false);
            btnadjnoitem9.setEnabled(false);
            lblcum9.setEnabled(false);
            lblnocum9.setEnabled(false);
            tr.setI1191("");
            
            
        }else{
              lblcum9.setEnabled(false);
            lblnocum9.setEnabled(false);
            rbjustiitem9.setEnabled(false);
            rbnojustiitem9.setEnabled(false);
            btnadjnoitem9.setEnabled(false);
            txtitem9.setEnabled(false);
            rbsi191.setEnabled(true);
            rbno191.setEnabled(true);
            rbno192.setEnabled(true);
            rbsi192.setEnabled(true);
            

        }
        
        
    }//GEN-LAST:event_noaplicaitem9ActionPerformed

    private void rbjustiitem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem9ActionPerformed
 txtitem9.setEnabled(true);
 tr.setI1191("");
    }//GEN-LAST:event_rbjustiitem9ActionPerformed

    private void rbnojustiitem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem9ActionPerformed
        
         tr.setI1191("");
         tr.setI1191("no");
         tr.setA1191("");
         tr.setA1191("si");
         tr.setV1191("no");
         tr.setV1192("no");
        btnadjnoitem9.setEnabled(false);
        txtitem9.setEnabled(false);
        lblnocum9.setEnabled(true);
        lblcum9.setEnabled(false);
    }//GEN-LAST:event_rbnojustiitem9ActionPerformed

    private void txtitem9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem9KeyPressed

        if(txtitem9.getText().length()>2){
         tr.setI1191("");
         tr.setI1191("si");
         tr.setA1191("");
         tr.setA1191("no");
         tr.setJ1191(txtitem9.getText());
         tr.setV1191("no aplica");
         tr.setV1192("no aplica");
            lblcum9.setEnabled(true);
            lblnocum9.setEnabled(false);
             btnadjnoitem9.setEnabled(true);
                }else{
         tr.setI1191("");
         tr.setA1191("");
         
             lblcum9.setEnabled(false);
            lblnocum9.setEnabled(false);
             btnadjnoitem9.setEnabled(false);
        }
        
    }//GEN-LAST:event_txtitem9KeyPressed

    private void rbsi191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi191ActionPerformed
             
        tr.setV1191("");
        tr.setV1191("si");
        
        btnmv91.setEnabled(true);
          if(rbsi191.isSelected() && rbsi192.isSelected() ){
            lblcum9.setEnabled(true);
            lblnocum9.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi191ActionPerformed

    private void rbno191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno191ActionPerformed
   
        tr.setV1191("");
        tr.setV1191("no");
        
        btnmv91.setEnabled(false);
         if(rbno191.isSelected() || rbno192.isSelected()){
            lblnocum9.setEnabled(true);
            lblcum9.setEnabled(false);

        }
    }//GEN-LAST:event_rbno191ActionPerformed

    private void rbsi192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi192ActionPerformed
  btnmv92.setEnabled(true);
  
    tr.setV1192("");
    tr.setV1192("si");
          if(rbsi191.isSelected() && rbsi192.isSelected() ){
            lblcum9.setEnabled(true);
            lblnocum9.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi192ActionPerformed

    private void rbno192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno192ActionPerformed
 btnmv92.setEnabled(false);
             tr.setV1192("");
             tr.setV1192("no");
 
              if(rbno191.isSelected() || rbno192.isSelected()){
            lblnocum9.setEnabled(true);
            lblcum9.setEnabled(false);

        }
    }//GEN-LAST:event_rbno192ActionPerformed

    private void noaplicaitem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem10ActionPerformed
 if(noaplicaitem10.isSelected()){
           
           rbsi1101.setEnabled(false);
           rbno1101.setEnabled(false);
           btnmv101.setEnabled(false);
            rbjustiitem10.setEnabled(true);
           rbnojustiitem10.setEnabled(true);
           txtitem10.setEnabled(false);
           btnadjnoitem10.setEnabled(false);
           lblcum10.setEnabled(false);
           lblnocum10.setEnabled(false);
            tr.setI11101("");
       }else{
           rbsi1101.setEnabled(true);
           rbno1101.setEnabled(true);
           btnmv101.setEnabled(false);
           rbjustiitem10.setEnabled(false);
           rbnojustiitem10.setEnabled(false);
           txtitem10.setEnabled(false);
           btnadjnoitem10.setEnabled(false);
            lblcum10.setEnabled(false);
           lblnocum10.setEnabled(false);
                 
       }
    }//GEN-LAST:event_noaplicaitem10ActionPerformed

    private void rbjustiitem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem10ActionPerformed
 txtitem10.setEnabled(true);
  tr.setI11101("");
    }//GEN-LAST:event_rbjustiitem10ActionPerformed

    private void rbnojustiitem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem10ActionPerformed
      tr.setI11101("");
      tr.setI11101("no");
      tr.setA11101("");
      tr.setA11101("si");
      tr.setV11101("no");
        
        txtitem10.setEnabled(false);
       lblcum10.setEnabled(false);
       lblnocum10.setEnabled(true);
    }//GEN-LAST:event_rbnojustiitem10ActionPerformed

    private void txtitem10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem10KeyPressed
   if(txtitem10.getText().length()>2){
         tr.setI11101("");
         tr.setI11101("si");
         tr.setA11101("");
         tr.setA11101("no");
         tr.setJ11101(txtitem10.getText());
         tr.setV11101("no aplica");
       
          lblcum10.setEnabled(true);
          lblnocum10.setEnabled(false);
          btnadjnoitem10.setEnabled(true);
           }else{
         tr.setI11101("");
         tr.setA11101("");
         
          lblcum10.setEnabled(false);
          lblnocum10.setEnabled(false);
          btnadjnoitem10.setEnabled(false);
                 
      }
    }//GEN-LAST:event_txtitem10KeyPressed

    private void btnadjnoitem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem10ActionPerformed
          // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(10);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
           
           
           
           
       }
       
    }//GEN-LAST:event_btnadjnoitem10ActionPerformed

    private void rbsi1101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi1101ActionPerformed
        tr.setV11101("");
        tr.setV11101("si");
        btnmv101.setEnabled(true);
        if(rbsi1101.isSelected() ){
         lblcum10.setEnabled(true);
       lblnocum10.setEnabled(false);
     }
    }//GEN-LAST:event_rbsi1101ActionPerformed

    private void rbno1101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno1101ActionPerformed
    tr.setV11101("");
    tr.setV11101("no");
        btnmv101.setEnabled(false);
       if(rbno1101.isSelected()){
         lblcum10.setEnabled(false);
       lblnocum10.setEnabled(true);
     }
    }//GEN-LAST:event_rbno1101ActionPerformed

    private void noaplicaitem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noaplicaitem11ActionPerformed
        if(noaplicaitem11.isSelected()){

            rbsi1111.setEnabled(false);
            rbno1111.setEnabled(false);
            btnmv111.setEnabled(false);

            rbjustiitem11.setEnabled(true);
            rbnojustiitem11.setEnabled(true);
            txtitem11.setEnabled(false);
            btnadjnoitem11.setEnabled(false);
            lblcum11.setEnabled(false);
            lblnocum11.setEnabled(false);
             tr.setI11111("");
        }else{

            rbsi1111.setEnabled(true);
            rbno1111.setEnabled(true);
            btnmv111.setEnabled(false);
            rbjustiitem11.setEnabled(false);
            rbnojustiitem11.setEnabled(false);
            txtitem11.setEnabled(false);
            btnadjnoitem11.setEnabled(false);
            lblcum11.setEnabled(false);
            lblnocum11.setEnabled(false);

        }
    }//GEN-LAST:event_noaplicaitem11ActionPerformed

    private void rbjustiitem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjustiitem11ActionPerformed
        txtitem11.setEnabled(true);
         tr.setI11111("");
    }//GEN-LAST:event_rbjustiitem11ActionPerformed

    private void rbnojustiitem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnojustiitem11ActionPerformed
       tr.setI11111("");
       tr.setI11111("no");
       tr.setA11111("");
       tr.setA11111("si");
        tr.setV11111("no");
       

        txtitem11.setEnabled(false);
        lblcum11.setEnabled(false);
        lblnocum11.setEnabled(true);
    }//GEN-LAST:event_rbnojustiitem11ActionPerformed

    private void txtitem11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitem11KeyPressed
        if(txtitem11.getText().length()>2){
             tr.setI11111("");
             tr.setI11111("si");
             tr.setA11111("");
             tr.setA11111("no");
              tr.setJ11111(txtitem11.getText());
              tr.setV11111("no aplica"); 
            lblcum11.setEnabled(true);
            lblnocum11.setEnabled(false);
            btnadjnoitem11.setEnabled(true);
        }else{
             tr.setI11111("");
             tr.setA11111("");
            lblcum11.setEnabled(false);
            lblnocum11.setEnabled(false);
            btnadjnoitem11.setEnabled(false);

        }
    }//GEN-LAST:event_txtitem11KeyPressed

    private void btnadjnoitem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem11ActionPerformed
           // objeto para llamar el metodo (MVC)
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
               tr.setId(11);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
           
           
           
           
       }
       
    }//GEN-LAST:event_btnadjnoitem11ActionPerformed

    private void rbsi1111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsi1111ActionPerformed
          tr.setV11111("");
          tr.setV11111("si");
        btnmv111.setEnabled(true);
        if(rbsi1111.isSelected() ){
            lblcum11.setEnabled(true);
            lblnocum11.setEnabled(false);
        }
    }//GEN-LAST:event_rbsi1111ActionPerformed

    private void rbno1111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbno1111ActionPerformed
          tr.setV11111("");
          tr.setV11111("no");
        
        btnmv111.setEnabled(false);
        if(rbno1111.isSelected()){
            lblcum11.setEnabled(false);
            lblnocum11.setEnabled(true);
        }
    }//GEN-LAST:event_rbno1111ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

this.dispose();
gh.setVisible(true);
gh.toFront();
       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

                
// Item 1

       if(rbsi111.isSelected() && rbsi112.isSelected() && rbsi113.isSelected() && rbsi114.isSelected() ){
     tr.setI1111("");
     tr.setI1111("si");
     tr.setA1111("");
     tr.setA1111("si");
     
          }
       
     if(rbno111.isSelected() || rbno112.isSelected() || rbno113.isSelected() || rbno114.isSelected()){
     
 if((!rbno111.isSelected() && !rbsi111.isSelected()) || (!rbno112.isSelected() && !rbsi112.isSelected()) || (!rbno113.isSelected() && !rbsi113.isSelected()) 
         || (!rbno114.isSelected() && !rbsi114.isSelected())){   
                
        }else{
     
      tr.setI1111("");
      tr.setI1111("no");
      tr.setA1111("");
      tr.setA1111("si");
     
 }
              
        }   
     
         // Item 2
       
       if(rbsi121.isSelected()){
           tr.setI1121("");
           tr.setI1121("si");
           tr.setA1121("");
           tr.setA1121("si");
           
       }
       
       if(rbno121.isSelected()){
           tr.setI1121("");
           tr.setI1121("no");
           tr.setA1121("");
           tr.setA1121("si");
           
       }
       
     // Item 3  
 if(rbsi131.isSelected()){
           tr.setI1131("");
           tr.setI1131("si");
           tr.setA1131("");
           tr.setA1131("si");
           
       }
       
       if(rbno131.isSelected()){
           tr.setI1131("");
           tr.setI1131("no");
           tr.setA1131("");
           tr.setA1131("si");
           
       }       
       
       // Item 4
       
       if(rbsi141.isSelected() && rbsi142.isSelected()){
           tr.setI1141("");
           tr.setI1141("si");
           tr.setA1141("");
           tr.setA1141("si");
           
                     
       }
       
       if(rbno141.isSelected() || rbno142.isSelected()){
           
          if((!rbno141.isSelected() && !rbsi141.isSelected()) || (!rbno142.isSelected() && !rbsi142.isSelected())){   
                
        }else{  
           
           
           tr.setI1141("");
           tr.setI1141("no");
           tr.setA1141("");
           tr.setA1141("si");}
           
       }       
       
       
       // Item 5
       
        if(rbsi151.isSelected()){
           tr.setI1151("");
           tr.setI1151("si");
           tr.setA1151("");
           tr.setA1151("si");
           
       }
       
       if(rbno151.isSelected()){
           tr.setI1151("");
           tr.setI1151("no");
           tr.setA1151("");
           tr.setA1151("si");
           
       }      

       
       // Item 6
        if(rbsi161.isSelected() && rbsi162.isSelected()){
           tr.setI1161("");
           tr.setI1161("si");
           tr.setA1161("");
           tr.setA1161("si");
           
       }
       
       if(rbno161.isSelected() || rbno162.isSelected()){
                  
        if((!rbno161.isSelected() && !rbsi161.isSelected()) || (!rbno162.isSelected() && !rbsi162.isSelected())){   
                
        }else{     
           
           tr.setI1161("");
           tr.setI1161("no");
           tr.setA1161("");
           tr.setA1161("si");
        }    
       }      

       
       // Item 7
         if(rbsi171.isSelected()){
           tr.setI1171("");
           tr.setI1171("si");
           tr.setA1171("");
           tr.setA1171("si");
           
       }
       
       if(rbno171.isSelected()){
           tr.setI1171("");
           tr.setI1171("no");
           tr.setA1171("");
           tr.setA1171("si");
           
       }      

       
       // Item 8
        if(rbsi181.isSelected() && rbsi182.isSelected()){
           tr.setI1181("");
           tr.setI1181("si");
           tr.setA1181("");
           tr.setA1181("si");
           
       }
       
       if(rbno181.isSelected() || rbno182.isSelected()){
         if((!rbno181.isSelected() && !rbsi181.isSelected()) || (!rbno182.isSelected() && !rbsi182.isSelected())){   
                
        }else{   
           
           tr.setI1181("");
           tr.setI1181("no");
           tr.setA1181("");
           tr.setA1181("si");
         }
       }      
       
       
       // Item 9
       
       if(rbsi191.isSelected() && rbsi192.isSelected()){
           tr.setI1191("");
           tr.setI1191("si");
           tr.setA1191("");
           tr.setA1191("si");
           
                     
       }
       
       if(rbno191.isSelected() || rbno192.isSelected()){
           
          if((!rbno191.isSelected() && !rbsi191.isSelected()) || (!rbno192.isSelected() && !rbsi192.isSelected())){   
                
        }else{   
           tr.setI1191("");
           tr.setI1191("no");
           tr.setA1191("");
           tr.setA1191("si");
          }
       }       
       
       
       
       // Item 10
       if(rbsi1101.isSelected()){
           tr.setI11101("");
           tr.setI11101("si");
           tr.setA11101("");
           tr.setA11101("si");
           
       }
       
       if(rbno1101.isSelected()){
           tr.setI11101("");
           tr.setI11101("no");
           tr.setA11101("");
           tr.setA11101("si");
           
       }     
       
       // Item 11
        if(rbsi1111.isSelected()){
           tr.setI11111("");
           tr.setI11111("si");
           tr.setA11111("");
           tr.setA11111("si");
           
       }
       
       if(rbno1111.isSelected()){
           tr.setI11111("");
           tr.setI11111("no");
           tr.setA11111("");
           tr.setA11111("si");
           
       }  
       
        Validar();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnadjnoitem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem1ActionPerformed
       // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(1);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
           
           
           
           
       }
       
        
        
        
    }//GEN-LAST:event_btnadjnoitem1ActionPerformed

    private void btnmv11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv11ActionPerformed
        // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(1);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                  JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
        
    }//GEN-LAST:event_btnmv11ActionPerformed
    
       
    private void btnmv12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv12ActionPerformed
      // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(2);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
              
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }      
        
        
        
        
    }//GEN-LAST:event_btnmv12ActionPerformed

    private void btnmv13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv13ActionPerformed
    
        
      // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(3);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
              
              JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }

        
        
        
        
    }//GEN-LAST:event_btnmv13ActionPerformed

    private void btnmv14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv14ActionPerformed
    
            // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(4);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }

        
        
        
    }//GEN-LAST:event_btnmv14ActionPerformed

    private void btnadjnoitem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem2ActionPerformed
  
        // objeto para llamar los metodos de insertar datos (MVC)
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
               tr.setId(2);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                
              JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
  
        
        
        
    }//GEN-LAST:event_btnadjnoitem2ActionPerformed

    private void btnmv21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv21ActionPerformed
   
           // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(5);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
        
        
    }//GEN-LAST:event_btnmv21ActionPerformed

    private void btnadjnoitem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem3ActionPerformed
     
           // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(3);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
              
             JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
        
        
        
        
    }//GEN-LAST:event_btnadjnoitem3ActionPerformed

    private void btnmv31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv31ActionPerformed

     
           // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(6);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv31ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnadjnoitem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem4ActionPerformed
         // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(4);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
           
           
           
           
       }
       
    }//GEN-LAST:event_btnadjnoitem4ActionPerformed

    private void btnadjnoitem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem5ActionPerformed
          // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(5);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
           
           
           
           
       }
       
    }//GEN-LAST:event_btnadjnoitem5ActionPerformed

    private void btnadjnoitem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem7ActionPerformed
         // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(7);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
           
           
           
           
       }
       
    }//GEN-LAST:event_btnadjnoitem7ActionPerformed

    private void btnadjnoitem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadjnoitem9ActionPerformed
          // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(9);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivos(tr)){
                         
               JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
           
           
           
           
       }
       
    }//GEN-LAST:event_btnadjnoitem9ActionPerformed

    private void btnmv41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv41ActionPerformed
     
           // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(7);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv41ActionPerformed

    private void btnmv42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv42ActionPerformed
       
           // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(8);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv42ActionPerformed

    private void btnmv51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv51ActionPerformed
       
           // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(9);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv51ActionPerformed

    private void btnmv61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv61ActionPerformed
       
           // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(10);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv61ActionPerformed

    private void btnmv62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv62ActionPerformed
      
           // objeto para guardar la informacion de las variables (MVC)
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
               tr.setId(11);
               tr.setNombre("\\" + (se.getSelectedFile().getName()));
               
               //llama el metodo
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv62ActionPerformed

    private void btnmv71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv71ActionPerformed
      
           // objeto para guardar la informacion de las variables (MVC)
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
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv71ActionPerformed

    private void btnmv81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv81ActionPerformed
       
           // objeto para guardar la informacion de las variables (MVC)
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
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv81ActionPerformed

    private void btnmv82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv82ActionPerformed
      
           // objeto para guardar la informacion de las variables (MVC)
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
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv82ActionPerformed

    private void btnmv91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv91ActionPerformed
       
           // objeto para guardar la informacion de las variables (MVC)
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
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv91ActionPerformed

    private void btnmv92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv92ActionPerformed
     
           // objeto para guardar la informacion de las variables (MVC)
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
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv92ActionPerformed

    private void btnmv101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv101ActionPerformed
      
           // objeto para guardar la informacion de las variables (MVC)
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
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv101ActionPerformed

    private void btnmv111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmv111ActionPerformed
     
           // objeto para guardar la informacion de las variables (MVC)
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
               if(func.insertarArchivosVeri(tr)){
                 
            JOptionPane.showMessageDialog(null,"El archivo ha sido guardado exitosamente");
           }
                              
           }catch(Exception e){
               
               
           }
           
       }
    }//GEN-LAST:event_btnmv111ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
     this.dispose();       
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
                new Recursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadjnoitem1;
    private javax.swing.JButton btnadjnoitem10;
    private javax.swing.JButton btnadjnoitem11;
    private javax.swing.JButton btnadjnoitem2;
    private javax.swing.JButton btnadjnoitem3;
    private javax.swing.JButton btnadjnoitem4;
    private javax.swing.JButton btnadjnoitem5;
    private javax.swing.JButton btnadjnoitem6;
    private javax.swing.JButton btnadjnoitem7;
    private javax.swing.JButton btnadjnoitem8;
    private javax.swing.JButton btnadjnoitem9;
    private javax.swing.JButton btnmv101;
    private javax.swing.JButton btnmv11;
    private javax.swing.JButton btnmv111;
    private javax.swing.JButton btnmv12;
    private javax.swing.JButton btnmv13;
    private javax.swing.JButton btnmv14;
    private javax.swing.JButton btnmv21;
    private javax.swing.JButton btnmv31;
    private javax.swing.JButton btnmv41;
    private javax.swing.JButton btnmv42;
    private javax.swing.JButton btnmv51;
    private javax.swing.JButton btnmv61;
    private javax.swing.JButton btnmv62;
    private javax.swing.JButton btnmv71;
    private javax.swing.JButton btnmv81;
    private javax.swing.JButton btnmv82;
    private javax.swing.JButton btnmv91;
    private javax.swing.JButton btnmv92;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblcum1;
    private javax.swing.JLabel lblcum10;
    private javax.swing.JLabel lblcum11;
    private javax.swing.JLabel lblcum2;
    private javax.swing.JLabel lblcum3;
    private javax.swing.JLabel lblcum4;
    private javax.swing.JLabel lblcum5;
    private javax.swing.JLabel lblcum6;
    private javax.swing.JLabel lblcum7;
    private javax.swing.JLabel lblcum8;
    private javax.swing.JLabel lblcum9;
    private javax.swing.JLabel lblnocum1;
    private javax.swing.JLabel lblnocum10;
    private javax.swing.JLabel lblnocum11;
    private javax.swing.JLabel lblnocum2;
    private javax.swing.JLabel lblnocum3;
    private javax.swing.JLabel lblnocum4;
    private javax.swing.JLabel lblnocum5;
    private javax.swing.JLabel lblnocum6;
    private javax.swing.JLabel lblnocum7;
    private javax.swing.JLabel lblnocum8;
    private javax.swing.JLabel lblnocum9;
    private javax.swing.JCheckBox noaplicaitem1;
    private javax.swing.JCheckBox noaplicaitem10;
    private javax.swing.JCheckBox noaplicaitem11;
    private javax.swing.JCheckBox noaplicaitem2;
    private javax.swing.JCheckBox noaplicaitem3;
    private javax.swing.JCheckBox noaplicaitem4;
    private javax.swing.JCheckBox noaplicaitem5;
    private javax.swing.JCheckBox noaplicaitem6;
    private javax.swing.JCheckBox noaplicaitem7;
    private javax.swing.JCheckBox noaplicaitem8;
    private javax.swing.JCheckBox noaplicaitem9;
    private javax.swing.JRadioButton rbjustiitem1;
    private javax.swing.JRadioButton rbjustiitem10;
    private javax.swing.JRadioButton rbjustiitem11;
    private javax.swing.JRadioButton rbjustiitem2;
    private javax.swing.JRadioButton rbjustiitem3;
    private javax.swing.JRadioButton rbjustiitem4;
    private javax.swing.JRadioButton rbjustiitem5;
    private javax.swing.JRadioButton rbjustiitem6;
    private javax.swing.JRadioButton rbjustiitem7;
    private javax.swing.JRadioButton rbjustiitem8;
    private javax.swing.JRadioButton rbjustiitem9;
    private javax.swing.JRadioButton rbno1101;
    private javax.swing.JRadioButton rbno111;
    private javax.swing.JRadioButton rbno1111;
    private javax.swing.JRadioButton rbno112;
    private javax.swing.JRadioButton rbno113;
    private javax.swing.JRadioButton rbno114;
    private javax.swing.JRadioButton rbno121;
    private javax.swing.JRadioButton rbno131;
    private javax.swing.JRadioButton rbno141;
    private javax.swing.JRadioButton rbno142;
    private javax.swing.JRadioButton rbno151;
    private javax.swing.JRadioButton rbno161;
    private javax.swing.JRadioButton rbno162;
    private javax.swing.JRadioButton rbno171;
    private javax.swing.JRadioButton rbno181;
    private javax.swing.JRadioButton rbno182;
    private javax.swing.JRadioButton rbno191;
    private javax.swing.JRadioButton rbno192;
    private javax.swing.JRadioButton rbnojustiitem1;
    private javax.swing.JRadioButton rbnojustiitem10;
    private javax.swing.JRadioButton rbnojustiitem11;
    private javax.swing.JRadioButton rbnojustiitem2;
    private javax.swing.JRadioButton rbnojustiitem3;
    private javax.swing.JRadioButton rbnojustiitem4;
    private javax.swing.JRadioButton rbnojustiitem5;
    private javax.swing.JRadioButton rbnojustiitem6;
    private javax.swing.JRadioButton rbnojustiitem7;
    private javax.swing.JRadioButton rbnojustiitem8;
    private javax.swing.JRadioButton rbnojustiitem9;
    private javax.swing.JRadioButton rbsi1101;
    private javax.swing.JRadioButton rbsi111;
    private javax.swing.JRadioButton rbsi1111;
    private javax.swing.JRadioButton rbsi112;
    private javax.swing.JRadioButton rbsi113;
    private javax.swing.JRadioButton rbsi114;
    private javax.swing.JRadioButton rbsi121;
    private javax.swing.JRadioButton rbsi131;
    private javax.swing.JRadioButton rbsi141;
    private javax.swing.JRadioButton rbsi142;
    private javax.swing.JRadioButton rbsi151;
    private javax.swing.JRadioButton rbsi161;
    private javax.swing.JRadioButton rbsi162;
    private javax.swing.JRadioButton rbsi171;
    private javax.swing.JRadioButton rbsi181;
    private javax.swing.JRadioButton rbsi182;
    private javax.swing.JRadioButton rbsi191;
    private javax.swing.JRadioButton rbsi192;
    private javax.swing.JTextArea txtitem1;
    private javax.swing.JTextArea txtitem10;
    private javax.swing.JTextArea txtitem11;
    private javax.swing.JTextArea txtitem2;
    private javax.swing.JTextArea txtitem3;
    private javax.swing.JTextArea txtitem4;
    private javax.swing.JTextArea txtitem5;
    private javax.swing.JTextArea txtitem6;
    private javax.swing.JTextArea txtitem7;
    private javax.swing.JTextArea txtitem8;
    private javax.swing.JTextArea txtitem9;
    // End of variables declaration//GEN-END:variables
}
