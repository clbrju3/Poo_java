/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author EQUIPO
 */
public class Entrada1 extends javax.swing.JFrame {

    /**
     * Creates new form Entrada1
     */
    public Entrada1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        siu1 = new javax.swing.JComboBox<>();
        siu2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        siu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija", "siu", "jaja", "sde" }));
        siu1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                siu1ItemStateChanged(evt);
            }
        });
        siu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siu1ActionPerformed(evt);
            }
        });
        getContentPane().add(siu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        siu2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                siu2ItemStateChanged(evt);
            }
        });
        getContentPane().add(siu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jButton1.setText("Listo!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Schwarze-sonne--black-sun--sonnenrad.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Suma jaj=new Suma();
        
        jaj.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void siu1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_siu1ItemStateChanged
        siu2.removeAllItems();
        if (siu1.getSelectedItem()=="siu"){
            siu2.addItem("Elegir");
            siu2.addItem("Suma");
            siu2.addItem("Multipliación");
            siu2.addItem("División");
            
        }
        if(siu1.getSelectedItem()=="jaja"){
            siu2.removeAllItems();
            siu2.addItem("4");
            siu2.addItem("5");
            siu2.addItem("6");
        }
        
      
    }//GEN-LAST:event_siu1ItemStateChanged

    private void siu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siu1ActionPerformed

    private void siu2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_siu2ItemStateChanged
        
    }//GEN-LAST:event_siu2ItemStateChanged
public int jui(){
int a=siu2.getSelectedIndex();
return a;}
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
            java.util.logging.Logger.getLogger(Entrada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> siu1;
    private javax.swing.JComboBox<String> siu2;
    // End of variables declaration//GEN-END:variables
}
