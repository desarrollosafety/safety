/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.Cevaluacion;
import Controlador.Crecursos;
import Criterios.*;
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
      cm.Puntaje();
      gh.punt= ps.getPunt();
       gh.config();
       int valo=10;
       ps.setBarra(ps.getBarra()+valo);
       this.dispose();
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
        jLabel5 = new javax.swing.JLabel();
        rbsi112 = new javax.swing.JRadioButton();
        rbno112 = new javax.swing.JRadioButton();
        btnmv12 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        jLabel18 = new javax.swing.JLabel();
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
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        rbsi142 = new javax.swing.JRadioButton();
        rbno142 = new javax.swing.JRadioButton();
        btnmv42 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
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
        jLabel63 = new javax.swing.JLabel();
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
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        rbsi162 = new javax.swing.JRadioButton();
        rbno162 = new javax.swing.JRadioButton();
        btnmv62 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
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
        jLabel75 = new javax.swing.JLabel();
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
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        rbsi182 = new javax.swing.JRadioButton();
        rbno182 = new javax.swing.JRadioButton();
        btnmv82 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
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
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
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
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
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
        jLabel37 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E1.1\tRecursos financieros y técnico humanos y de otra índole requeridos para coordinar y desarrollar el sistema de gestión.(4%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel2.setToolTipText("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Modo de Verificación ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Responsable del sistema de gestión de Seguridad y Salud en el trabajo SG-SST  (0.5%).");

        lblnocum1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem1.setText("No Aplica");
        noaplicaitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem1ActionPerformed(evt);
            }
        });

        rbjustiitem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem1.setText("Justifica");
        rbjustiitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem1ActionPerformed(evt);
            }
        });

        rbnojustiitem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem1.setText("No justifica");
        rbnojustiitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem1ActionPerformed(evt);
            }
        });

        txtitem1.setColumns(20);
        txtitem1.setRows(5);
        txtitem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem1KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtitem1);

        btnadjnoitem1.setText("Adjuntar Doc");
        btnadjnoitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("1. Documento que consta la designación del responsable del sistema de gestión  SST, con la respectiva asignación de responsabilidades.");

        rbsi111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi111.setText("Cumple");
        rbsi111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi111ActionPerformed(evt);
            }
        });

        rbno111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno111.setText("No cumple");
        rbno111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno111ActionPerformed(evt);
            }
        });

        btnmv11.setText("Adjuntar Doc");
        btnmv11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv11ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("2. Titulo de formación del encargado del sistema de gestión y seguridad en el trabajo (Técnico-Tecnólogo-profesional-");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("maestría-especialización).");

        rbsi112.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi112.setText("Cumple");
        rbsi112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi112ActionPerformed(evt);
            }
        });

        rbno112.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno112.setText("No cumple");
        rbno112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno112ActionPerformed(evt);
            }
        });

        btnmv12.setText("Adjuntar Doc");
        btnmv12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv12ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("3. Licencia de seguridad y salud en el trabajo vigente (de persona natural o jurídica), en caso de no tenerla se le sugiere mirar los ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("requisitos de formación y cursos solicitados en los artículos 5 y 6 de la resolución 1111 del 2017.   ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("4. El encargado del sistema de gestión y seguridad en el trabajo cuenta con el certificado exigido de aprobación del curso ");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("virtual de 50 horas en seguridad y salud en el trabajo.  ");

        rbsi113.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi113.setText("Cumple");
        rbsi113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi113ActionPerformed(evt);
            }
        });

        rbno113.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno113.setText("No cumple");
        rbno113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno113ActionPerformed(evt);
            }
        });

        btnmv13.setText("Adjuntar Doc");
        btnmv13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv13ActionPerformed(evt);
            }
        });

        rbsi114.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi114.setText("Cumple");
        rbsi114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi114ActionPerformed(evt);
            }
        });

        rbno114.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno114.setText("No cumple");
        rbno114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno114ActionPerformed(evt);
            }
        });

        btnmv14.setText("Adjuntar Doc");
        btnmv14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv14ActionPerformed(evt);
            }
        });

        jButton3.setText("Criterio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblnocum1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcum1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jButton3))
                                .addGap(18, 18, 18)
                                .addComponent(noaplicaitem1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbjustiitem1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbsi114)
                                    .addComponent(rbnojustiitem1)
                                    .addComponent(rbsi113)
                                    .addComponent(rbsi112)
                                    .addComponent(rbsi111))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadjnoitem1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(124, 124, 124)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(rbno114)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnmv14))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(rbno113)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnmv13))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(rbno112)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnmv12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addComponent(rbno111)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnmv11)))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem1)
                        .addComponent(rbnojustiitem1)
                        .addComponent(noaplicaitem1))
                    .addComponent(btnadjnoitem1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblnocum1)
                                .addComponent(lblcum1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnmv11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbno111)
                            .addComponent(rbsi111))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi112)
                            .addComponent(rbno112)
                            .addComponent(btnmv12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsi113)
                    .addComponent(rbno113)
                    .addComponent(btnmv13)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi114)
                        .addComponent(rbno114)
                        .addComponent(btnmv14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        lblnocum2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Responsabilidades en el sistema de gestión de seguridad y salud en el trabajo SG-SST (0.5%).");

        noaplicaitem2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem2.setText("No Aplica");
        noaplicaitem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem2ActionPerformed(evt);
            }
        });

        rbjustiitem2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem2.setText("Justifica");
        rbjustiitem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem2ActionPerformed(evt);
            }
        });

        rbnojustiitem2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem2.setText("No justifica");
        rbnojustiitem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem2ActionPerformed(evt);
            }
        });

        txtitem2.setColumns(20);
        txtitem2.setRows(5);
        txtitem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem2KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtitem2);

        btnadjnoitem2.setText("Adjuntar Doc");
        btnadjnoitem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("Modo de Verificación ");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel12.setText("1. Soporte que contenga la asignación y documentación de las responsabilidades en seguridad y salud en el trabajo.");

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

        btnmv21.setText("Adjuntar Doc");
        btnmv21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv21ActionPerformed(evt);
            }
        });

        jButton4.setText("Criterio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnocum2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(96, 96, 96)
                        .addComponent(rbsi121)
                        .addGap(18, 18, 18)
                        .addComponent(rbno121)
                        .addGap(27, 27, 27)
                        .addComponent(btnmv21)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblcum2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jButton4))
                                .addGap(18, 18, 18)
                                .addComponent(noaplicaitem2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbjustiitem2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbnojustiitem2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadjnoitem2)
                        .addGap(253, 253, 253))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblnocum2)
                                .addComponent(lblcum2))
                            .addGap(60, 60, 60))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbjustiitem2)
                                    .addComponent(rbnojustiitem2)
                                    .addComponent(noaplicaitem2))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadjnoitem2)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rbsi121)
                    .addComponent(rbno121)
                    .addComponent(btnmv21))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Modo de Verificación ");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setText("Asignación de recursos para el sistema de gestión de seguridad y salud en el trabajo ");

        lblnocum3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem3.setText("No Aplica");
        noaplicaitem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem3ActionPerformed(evt);
            }
        });

        rbjustiitem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem3.setText("Justifica");
        rbjustiitem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem3ActionPerformed(evt);
            }
        });

        rbnojustiitem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem3.setText("No justifica");
        rbnojustiitem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem3ActionPerformed(evt);
            }
        });

        txtitem3.setColumns(20);
        txtitem3.setRows(5);
        txtitem3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem3KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(txtitem3);

        btnadjnoitem3.setText("Adjuntar Doc");
        btnadjnoitem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel17.setText("1. Evidencias físicas y/o  documentales que demuestren la definición y asignación de los recursos humanos, financieros y tecnicos y de otra indole ");

        rbsi131.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi131.setText("Cumple");
        rbsi131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi131ActionPerformed(evt);
            }
        });

        rbno131.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno131.setText("No cumple");
        rbno131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno131ActionPerformed(evt);
            }
        });

        btnmv31.setText("Adjuntar Doc");
        btnmv31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv31ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel18.setText("  para la implementación, mantenimiento y continuidad del SG-SST.");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel19.setText("SG-SST (0.5%).");

        jButton5.setText("Criterio");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbsi131)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbno131)
                        .addGap(18, 18, 18)
                        .addComponent(btnmv31)
                        .addGap(82, 82, 82))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(8, 8, 8)
                                .addComponent(jButton5)))
                        .addGap(18, 18, 18)
                        .addComponent(noaplicaitem3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbjustiitem3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnojustiitem3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadjnoitem3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem3)
                        .addComponent(rbnojustiitem3)
                        .addComponent(noaplicaitem3))
                    .addComponent(btnadjnoitem3)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(jButton5)))
                                .addComponent(lblnocum3)
                                .addComponent(lblcum3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi131)
                        .addComponent(rbno131)
                        .addComponent(btnmv31)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 4:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        lblnocum4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel20.setText("Afiliación al sistema general de riesgos laborales (0.5%).");

        noaplicaitem4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem4.setText("No Aplica");
        noaplicaitem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem4ActionPerformed(evt);
            }
        });

        rbjustiitem4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem4.setText("Justifica");
        rbjustiitem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem4ActionPerformed(evt);
            }
        });

        rbnojustiitem4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem4.setText("No justifica");
        rbnojustiitem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem4ActionPerformed(evt);
            }
        });

        txtitem4.setColumns(20);
        txtitem4.setRows(5);
        txtitem4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem4KeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(txtitem4);

        btnadjnoitem4.setText("Adjuntar Doc");
        btnadjnoitem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem4ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel21.setText("Modo de Verificación ");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel22.setText("1. Lista de los trabajadores vinculados laboralmente a la fecha y comparar con la planilla de pago de aportes de la seguridad social ");

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

        btnmv41.setText("Adjuntar Doc");
        btnmv41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv41ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel23.setText("de los cuatro meses anteriores a la fecha de verificación (Ver nota 1).");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel24.setText("2. Lista de los trabajadores vinculados por prestación de servicios a la fecha y comparar con la última planilla de pago de aportes ");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel25.setText("a la seguridad social suministrada por los contratistas (Ver nota 1 y 2).");

        rbsi142.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi142.setText("Cumple");
        rbsi142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi142ActionPerformed(evt);
            }
        });

        rbno142.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno142.setText("No cumple");
        rbno142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno142ActionPerformed(evt);
            }
        });

        btnmv42.setText("Adjuntar Doc");
        btnmv42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv42ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel26.setText("Nota 1: Empresas de 1 a 10 trabajadores verificar 100%, entre 11 y 50 el 20%, entre 51 y 200 el 10% y mayores a 200 verificar el registro de 30 trabajadores. También de la muestra");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel27.setText("seleccionada se verificara la afiliación al sistema general de seguridad social.");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel28.setText("Nota 2: Trabajadores independientes que se afilien través de agremiaciones verificar que corresponda a una agremiación autorizada por el Ministerio de salud y proteccion social");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel29.setText("(listado pagina Web).");

        jButton6.setText("Criterio");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblnocum4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lblcum4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(noaplicaitem4)
                                .addGap(30, 30, 30)
                                .addComponent(rbjustiitem4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbnojustiitem4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadjnoitem4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbsi141)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbno141)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnmv41))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel25))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbsi142)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbno142)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnmv42)))
                                .addGap(105, 105, 105))
                            .addComponent(jLabel28)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum4)
                            .addComponent(lblcum4)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel21))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(btnadjnoitem4)
                            .addGap(1, 1, 1))
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem4)
                        .addComponent(rbnojustiitem4)
                        .addComponent(noaplicaitem4)))
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel23))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbsi141)
                        .addComponent(rbno141)
                        .addComponent(btnmv41)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(rbsi142)
                    .addComponent(rbno142)
                    .addComponent(btnmv42))
                .addGap(31, 31, 31)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 5:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel60.setText("Modo de Verificación ");

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel61.setText("Pago de pensión de trabajadores de alto riesgo (0.5%).");

        lblnocum5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem5.setText("No Aplica");
        noaplicaitem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem5ActionPerformed(evt);
            }
        });

        rbjustiitem5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem5.setText("Justifica");
        rbjustiitem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem5ActionPerformed(evt);
            }
        });

        rbnojustiitem5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem5.setText("No justifica");
        rbnojustiitem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem5ActionPerformed(evt);
            }
        });

        txtitem5.setColumns(20);
        txtitem5.setRows(5);
        txtitem5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem5KeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(txtitem5);

        btnadjnoitem5.setText("Adjuntar Doc");
        btnadjnoitem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem5ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel62.setText("1. Se tienen identificados los trabajadores que se dedican en forma permanente al ejercicio de las actividades de alto riesgo que trata ");

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

        btnmv51.setText("Adjuntar Doc");
        btnmv51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv51ActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel63.setText("el decreto 2090 de 2003.");

        jButton7.setText("Criterio");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63))
                .addGap(36, 36, 36)
                .addComponent(rbsi151)
                .addGap(18, 18, 18)
                .addComponent(rbno151)
                .addGap(18, 18, 18)
                .addComponent(btnmv51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jButton7)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem5)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnadjnoitem5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum5)
                                    .addComponent(lblcum5))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel60))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbjustiitem5)
                            .addComponent(rbnojustiitem5)
                            .addComponent(noaplicaitem5))
                        .addComponent(btnadjnoitem5)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel63))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi151)
                            .addComponent(rbno151)
                            .addComponent(btnmv51))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 6:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        lblnocum6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel64.setText("Conformación COPASST/ Vigía (0.5%).");

        noaplicaitem6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem6.setText("No Aplica");
        noaplicaitem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem6ActionPerformed(evt);
            }
        });

        rbjustiitem6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem6.setText("Justifica");
        rbjustiitem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem6ActionPerformed(evt);
            }
        });

        rbnojustiitem6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem6.setText("No justifica");
        rbnojustiitem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem6ActionPerformed(evt);
            }
        });

        txtitem6.setColumns(20);
        txtitem6.setRows(5);
        txtitem6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem6KeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(txtitem6);

        btnadjnoitem6.setText("Adjuntar Doc");
        btnadjnoitem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem6ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel65.setText("Modo de Verificación ");

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel66.setText("1. Acta mediante la cual se designa el vigía SST (Seguridad y Salud en el Trabajo) o solicitar los soportes de la convocatoria, ");

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

        btnmv61.setText("Adjuntar Doc");
        btnmv61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv61ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel67.setText("elección, conformación del comité paritario SST y el acta de constitución (Para el caso del comité paritario constatar si es");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel68.setText("si es igual el número de representantes del empleador y de los trabajadores y que el acta de conformación se encuentra vigente).");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel69.setText("2. Actas de reunión mensuales del último año del comité paritario o los soportes de las gestiones adelantadas por el vigía ");

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

        btnmv62.setText("Adjuntar Doc");
        btnmv62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv62ActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel70.setText("Nota: Las empresas de menos de 10 trabajadores deben contar con un vigía en seguridad y salud en el trabajo, y de 10 o más trabajadores con un comité paritario SST.");

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel71.setText("SST y verificar el cumplimiento de sus funciones.");

        jButton8.setText("Criterio");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnocum6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(lblcum6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel64)
                                            .addComponent(jButton8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(noaplicaitem6)
                                        .addGap(30, 30, 30)
                                        .addComponent(rbjustiitem6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbnojustiitem6)
                                        .addGap(47, 47, 47)))
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnadjnoitem6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel67))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69)
                            .addComponent(jLabel71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(rbsi162)
                                .addGap(18, 18, 18)
                                .addComponent(rbno162))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(rbsi161)
                                .addGap(18, 18, 18)
                                .addComponent(rbno161)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmv61)
                            .addComponent(btnmv62))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel70)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum6)
                            .addComponent(lblcum6)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel65))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(btnadjnoitem6)
                            .addGap(1, 1, 1))
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem6)
                        .addComponent(rbnojustiitem6)
                        .addComponent(noaplicaitem6)))
                .addGap(18, 28, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addGap(6, 6, 6)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(rbsi161)
                    .addComponent(rbno161)
                    .addComponent(btnmv61))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi162)
                            .addComponent(rbno162)
                            .addComponent(btnmv62)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel71)))
                .addGap(18, 18, 18)
                .addComponent(jLabel70)
                .addContainerGap())
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 7:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel72.setText("Modo de Verificación ");

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel73.setText("Capacitación COPASST/ vigía (0.5%).");

        lblnocum7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem7.setText("No Aplica");
        noaplicaitem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem7ActionPerformed(evt);
            }
        });

        rbjustiitem7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem7.setText("Justifica");
        rbjustiitem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem7ActionPerformed(evt);
            }
        });

        rbnojustiitem7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem7.setText("No justifica");
        rbnojustiitem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem7ActionPerformed(evt);
            }
        });

        txtitem7.setColumns(20);
        txtitem7.setRows(5);
        txtitem7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem7KeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(txtitem7);

        btnadjnoitem7.setText("Adjuntar Doc");
        btnadjnoitem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem7ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel74.setText("1. Registros que constaten la capacitación y evaluación tanto para el vigía SST o para los miembros del comité paritario SST según aplique ");

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

        btnmv71.setText("Adjuntar Doc");
        btnmv71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv71ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel75.setText("que estén vigentes.");

        jButton9.setText("Criterio");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblnocum7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcum7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73)
                                    .addComponent(jButton9)))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noaplicaitem7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbjustiitem7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbnojustiitem7)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74)
                            .addComponent(jLabel75))
                        .addGap(30, 30, 30)
                        .addComponent(rbsi171)
                        .addGap(18, 18, 18)
                        .addComponent(rbno171)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmv71)
                    .addComponent(btnadjnoitem7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum7)
                            .addComponent(lblcum7)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel72))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbjustiitem7)
                            .addComponent(rbnojustiitem7)
                            .addComponent(noaplicaitem7))
                        .addComponent(btnadjnoitem7)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbsi171)
                            .addComponent(rbno171)
                            .addComponent(btnmv71))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 8:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        lblnocum8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setText("Conformación comité convivencia (0.5%).");

        noaplicaitem8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem8.setText("No Aplica");
        noaplicaitem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem8ActionPerformed(evt);
            }
        });

        rbjustiitem8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem8.setText("Justifica");
        rbjustiitem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem8ActionPerformed(evt);
            }
        });

        rbnojustiitem8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem8.setText("No justifica");
        rbnojustiitem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem8ActionPerformed(evt);
            }
        });

        txtitem8.setColumns(20);
        txtitem8.setRows(5);
        txtitem8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem8KeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(txtitem8);

        btnadjnoitem8.setText("Adjuntar Doc");
        btnadjnoitem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem8ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setText("Modo de Verificación ");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel30.setText("1. Documento de conformación del comité de convivencia laboral y verificar que este conformado de acuerdo a la normativa");

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

        btnmv81.setText("Adjuntar Doc");
        btnmv81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv81ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel31.setText("y que su periodo de conformación se encuentre vigente.");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel32.setText("2. Actas de las reuniones (como mínimo una reunión cada tres meses) junto con los informes de gestión del comité de convi- ");

        rbsi182.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi182.setText("Cumple");
        rbsi182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi182ActionPerformed(evt);
            }
        });

        rbno182.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno182.setText("No cumple");
        rbno182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno182ActionPerformed(evt);
            }
        });

        btnmv82.setText("Adjuntar Doc");
        btnmv82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv82ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel33.setText("vencia laboral, verificando el desarrollo de sus funciones. ");

        jButton10.setText("Criterio");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnocum8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblcum8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jButton10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(noaplicaitem8)
                                        .addGap(30, 30, 30)
                                        .addComponent(rbjustiitem8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbnojustiitem8)
                                        .addGap(47, 47, 47)))
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnadjnoitem8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(673, 673, 673)
                                        .addComponent(btnmv81))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel33))
                                        .addGap(77, 77, 77)
                                        .addComponent(rbsi182)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbno182)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnmv82)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(828, 828, 828)
                        .addComponent(rbsi181)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbno181)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum8)
                            .addComponent(lblcum8)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10)))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel14))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(btnadjnoitem8)
                            .addGap(1, 1, 1))
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem8)
                        .addComponent(rbnojustiitem8)
                        .addComponent(noaplicaitem8)))
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(rbsi181)
                    .addComponent(rbno181)
                    .addComponent(btnmv81))
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(rbsi182)
                    .addComponent(rbno182)
                    .addComponent(btnmv82))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E1.2Capacitación en el Sistema de Gestión de Seguridad y Salud en el Trabajo (6%)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N
        jPanel11.setToolTipText("");

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 1:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel49.setText("Modo de Verificación ");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel50.setText("Programa Capacitación, Promoción y Prevención - Pyp. (2%)");

        lblnocum9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        noaplicaitem9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem9.setText("No Aplica");
        noaplicaitem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem9ActionPerformed(evt);
            }
        });

        rbjustiitem9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem9.setText("Justifica");
        rbjustiitem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem9ActionPerformed(evt);
            }
        });

        rbnojustiitem9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem9.setText("No justifica");
        rbnojustiitem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem9ActionPerformed(evt);
            }
        });

        txtitem9.setColumns(20);
        txtitem9.setRows(5);
        txtitem9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem9KeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(txtitem9);

        btnadjnoitem9.setText("Adjuntar Doc");
        btnadjnoitem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem9ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel51.setText("1. programa de capacitación anual y la matriz de identificación de peligros y verificar  que el mismo este dirigido a los peligros ya ");

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

        btnmv91.setText("Adjuntar Doc");
        btnmv91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv91ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel52.setText("identificados, con la evaluación y control del riesgo, y/o necesidades en Seguridad y Salud en el Trabajo, y verificar las evidencias ");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel53.setText("de su cumplimiento.");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel54.setText("2. Verificar si el comité paritario SST o Vigia SST participo en la revisión anual del plan de capacitación. ");

        rbsi192.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi192.setText("Cumple");
        rbsi192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi192ActionPerformed(evt);
            }
        });

        rbno192.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno192.setText("No cumple");
        rbno192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno192ActionPerformed(evt);
            }
        });

        btnmv92.setText("Adjuntar Doc");
        btnmv92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv92ActionPerformed(evt);
            }
        });

        jButton12.setText("Criterio");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblnocum9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcum9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addComponent(jButton12)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noaplicaitem9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbjustiitem9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnojustiitem9)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnadjnoitem9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbsi191))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbsi192)))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbno192, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbno191, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnmv92)
                                    .addComponent(btnmv91))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnocum9)
                                    .addComponent(lblcum9))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel49))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbjustiitem9)
                            .addComponent(rbnojustiitem9)
                            .addComponent(noaplicaitem9))
                        .addComponent(btnadjnoitem9)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(rbsi191)
                    .addComponent(rbno191)
                    .addComponent(btnmv91))
                .addGap(1, 1, 1)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(rbsi192)
                    .addComponent(rbno192)
                    .addComponent(btnmv92))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 2:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        lblnocum10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel55.setText("Capacitación, inducción y Reinducción en Sistemas de Gestión de ");

        noaplicaitem10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem10.setText("No Aplica");
        noaplicaitem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem10ActionPerformed(evt);
            }
        });

        rbjustiitem10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem10.setText("Justifica");
        rbjustiitem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem10ActionPerformed(evt);
            }
        });

        rbnojustiitem10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem10.setText("No justifica");
        rbnojustiitem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem10ActionPerformed(evt);
            }
        });

        txtitem10.setColumns(20);
        txtitem10.setRows(5);
        txtitem10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem10KeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(txtitem10);

        btnadjnoitem10.setText("Adjuntar Doc");
        btnadjnoitem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem10ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel56.setText("Modo de Verificación ");

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel57.setText("Solicitar la lista de trabajadores, independientemente de su forma de vinculación y/o contratación y verificar los ");

        rbsi1101.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi1101.setText("Cumple");
        rbsi1101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi1101ActionPerformed(evt);
            }
        });

        rbno1101.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno1101.setText("No cumple");
        rbno1101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno1101ActionPerformed(evt);
            }
        });

        btnmv101.setText("Adjuntar Doc");
        btnmv101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv101ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel58.setText("soportes documentales que den cuenta de la capacitación y de su evaluación, de la inducción y reinducción de confor-");

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel59.setText("midad con el criterio. La referencia es el Plan de capacitación, su cumplimiento y la cobertura de los trabajadores obje- ");

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel76.setText("to de cada tema.");

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel77.setText("Seguridad y Salud en el trabajo SG-SST, actividade de promoción");

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel78.setText("y Prevención Pyp. (2%)");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel79.setText("Nota : Para la verificacion, empresas de 1 a 10 trabajadores verificar 100%, entre 11 y 50 el 20%, entre 51 y 200 el 10% y mayores a 200 verificar el registro de 30 trabajadores. ");

        jButton11.setText("Criterio");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(lblnocum10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(lblcum10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel55)
                                            .addComponent(jLabel77)
                                            .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(jLabel78)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton11)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(noaplicaitem10)
                                        .addGap(30, 30, 30)
                                        .addComponent(rbjustiitem10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbnojustiitem10)
                                        .addGap(47, 47, 47)))
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnadjnoitem10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                            .addComponent(rbsi1101)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rbno1101)
                                            .addGap(192, 192, 192))
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                            .addComponent(jLabel57)
                                            .addGap(461, 461, 461)))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel58)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnmv101)
                                        .addGap(70, 70, 70)))))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel79))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(btnadjnoitem10)
                            .addGap(1, 1, 1))
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem10)
                        .addComponent(rbnojustiitem10)
                        .addComponent(noaplicaitem10))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum10)
                            .addComponent(lblcum10)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel77)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78)
                            .addComponent(jButton11))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(4, 4, 4)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(rbsi1101)
                    .addComponent(rbno1101)
                    .addComponent(btnmv101))
                .addGap(4, 4, 4)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel79)
                .addGap(50, 50, 50))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ítem 3:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        lblnocum11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N

        lblcum11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checked.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel34.setText("Responsables del Sistema de Gestión de Seguridad y Salud en ");

        noaplicaitem11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        noaplicaitem11.setText("No Aplica");
        noaplicaitem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noaplicaitem11ActionPerformed(evt);
            }
        });

        rbjustiitem11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbjustiitem11.setText("Justifica");
        rbjustiitem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjustiitem11ActionPerformed(evt);
            }
        });

        rbnojustiitem11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbnojustiitem11.setText("No justifica");
        rbnojustiitem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnojustiitem11ActionPerformed(evt);
            }
        });

        txtitem11.setColumns(20);
        txtitem11.setRows(5);
        txtitem11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitem11KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtitem11);

        btnadjnoitem11.setText("Adjuntar Doc");
        btnadjnoitem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadjnoitem11ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel35.setText("Modo de Verificación ");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel36.setText("Solicitar el certificado de aprobación del curso de capacitación virtual de cincuenta (50) horas definido por el Ministerio ");

        rbsi1111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbsi1111.setText("Cumple");
        rbsi1111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsi1111ActionPerformed(evt);
            }
        });

        rbno1111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbno1111.setText("No cumple");
        rbno1111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbno1111ActionPerformed(evt);
            }
        });

        btnmv111.setText("Adjuntar Doc");
        btnmv111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmv111ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel37.setText("de Trabajo, expedido a nombre del responsable del Sistema de Gestión de Seguridad y Salud en el Trabajo.");

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

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel38.setText("el trabajo SG-SST, con curso (50 Horas). (2%)");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel39.setText("y Prevención Pyp. (2%)");

        jButton13.setText("Criterio");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblnocum11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lblcum11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel38)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(noaplicaitem11)
                                .addGap(30, 30, 30)
                                .addComponent(rbjustiitem11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbnojustiitem11)
                                .addGap(47, 47, 47)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnadjnoitem11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(rbsi1111)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbno1111)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnmv111)
                                .addGap(91, 91, 91))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37))
                                .addGap(461, 461, 461)))))
                .addGap(54, 54, 54))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(btnadjnoitem11)
                            .addGap(1, 1, 1))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbjustiitem11)
                        .addComponent(rbnojustiitem11)
                        .addComponent(noaplicaitem11))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnocum11)
                            .addComponent(lblcum11)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jButton13))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(rbsi1111)
                    .addComponent(rbno1111)
                    .addComponent(btnmv111))
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        Criterio1 im= new Criterio1();
        im.toFront();
        im.setVisible(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      Criterio2 im= new Criterio2();
        im.toFront();
        im.setVisible(true);
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    Criterio3 im= new Criterio3();
        im.toFront();
        im.setVisible(true);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Criterio4 im= new Criterio4();
        im.toFront();
        im.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       Criterio5 im= new Criterio5();
        im.toFront();
        im.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     Criterio6 im= new Criterio6();
        im.toFront();
        im.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       Criterio7 im= new Criterio7();
        im.toFront();
        im.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      Criterio8 im= new Criterio8();
        im.toFront();
        im.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      Criterio9 im= new Criterio9();
        im.toFront();
        im.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      Criterio10 im= new Criterio10();
        im.toFront();
        im.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Criterio11 im= new Criterio11();
        im.toFront();
        im.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
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
