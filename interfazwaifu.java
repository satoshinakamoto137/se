/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdef;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Inori
 */
public class interfazwaifu extends javax.swing.JFrame {
//-----------------VOY A INTENTAR COMENTAR BIEN QUE SHINGADOS HAGO!///
    ///PARA EVITAR CONFUSIONES, SUERTE CON EL PROYECTO!!!, 福！
    /**
     * Creates new form interfazwaifu
     */
    public interfazwaifu() {
        
        initComponents();
        String[] init = new String[0];
        jList1.setListData(init); //comenzar con la lista limpia.
    }
    
    
    //public static String pre1 = "¿Como prefieres el tipo de cabello?";
    //public static String pre2 = "¿que tan largo prefieres que sea el cabello?";
    //estaba usando la declaracion de cadenas, pero es mejor usar un objetos que tengan, 
    //pregunta, respuestas e indice de pregunta asignados.
    public static int qcounter = 0;
    public static int answnum = 100; //numero de respuesta que se van a usar
    public static String[] answ = new String[answnum];
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 120, 160, 110);

        jButton1.setText("Empezar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 240, 80, 20);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 100, 34, 14);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 130, 70, 110);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 70, 250, 40);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 100, 100);

        jButton2.setText("Siguiente");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 240, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       //boton inicio.
       qcounter = 0; // este contador nos dira en que pregunta vamos, si empezamos vuelve a cero.
       //hay que limpiar el arreglo donde vayamos guardando las respuestas. 
       quest_index[] array_of_questions = new quest_index[10]; //arreglo de preguntas que haremos.
       String[] resp1 = {"dark", "light"};
       array_of_questions[0] = new quest_index(1, "Que tipo de pelo te gusta mas", resp1); 
       //tuve un problema en la linea anterior, es importante recalcar que el constructor funciona
       //con new, de esta forma ya esta creada y declarada la pregunta y sus respuestas.
       //String[] respuesta1 = new String[2];
       //respuesta1[0]="dark";
       //respuesta1[1]="light"; esta parte tambien se mejoro con el constructor.
       pregunta_resp_list(array_of_questions[0]);
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //int ind = jList1.getLeadSelectionIndex();
        String selection = jList1.getSelectedValue();
        jLabel2.setText(selection);
        answ[qcounter] = selection; //guardar en la respuesta en nuestro arreglo de respuestas dadas.
        qcounter = qcounter + 1;
    }//GEN-LAST:event_jButton2MouseClicked

    public void pregunta_resp_list(quest_index v1)
    {
        jList1.setListData(v1.getresponses()); //imprimir respuestas
        jLabel1.setText(v1.getquestionstring()); //imprimir pregunta
        
    }
    
    public class quest_index
    {
         private int index;
         private String preguntax;
         private String[] respuestas;
         
         public quest_index(int newindex, String newpregunta, String[] newresps)
         {
             //constructor de preguntas
             index = newindex;
             preguntax = newpregunta;
             respuestas = newresps;
         }
         
         public String getquestionstring()
         {
             return preguntax;
         }
         public int getquestindex()
         {
             return index;
         }
         public String[] getresponses()
         {
             return respuestas;
         }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfazwaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazwaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazwaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazwaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazwaifu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
