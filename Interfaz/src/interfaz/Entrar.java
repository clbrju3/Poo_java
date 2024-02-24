/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class Entrar extends javax.swing.JFrame {
int r=0;

    public Entrar() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        con = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        usu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ima = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Usuario");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 90, 40));
        getContentPane().add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 140, 40));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 110, 30));
        getContentPane().add(usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 140, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 100, 40));

        ima.setOpaque(true);
        getContentPane().add(ima, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 240, 110));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("Validar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\EQUIPO\\Documents\\NetBeansProjects\\Interfaz\\src\\interfaz\\600x600bf-60.jpg")); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void jose(){
    jButton1.setEnabled(false);}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a=usu.getText();
        String b=String.valueOf(con.getPassword());
        if (a.equals("root") & b.equals("M1t2o!B2rn1l")){
            Vista jaja;
            try {
                jaja = new Vista();
                jaja.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Entrar.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            dispose();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        r++;
        String a=usu.getText();
        String b=String.valueOf(con.getPassword());
        if (a.equals("root") & b.equals("M1t2o!B2rn1l")){
            ima.setIcon(new ImageIcon("C:/Users/EQUIPO/Documents/NetBeansProjects/Interfaz/src/interfaz/Image/good.jpg"));
            jButton1.setEnabled(true);
            
        }
else {
     ima.setIcon(new ImageIcon("C:/Users/EQUIPO/Documents/NetBeansProjects/Interfaz/src/interfaz/Image/mal.png"));
         //JLabel jui=new JLabel();
         JOptionPane.showMessageDialog(null,"Erroneo, le quedan "+(5-r)+" intentos");
        /* JLayeredPane ka=new JLayeredPane();
         ka.add(jui,1);
         jui.setText("Erróneo, le quedan "+(r-5)+" intentos");*/
         if (r==5){jButton2.setEnabled(false);}
         }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrar().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField con;
    private javax.swing.JLabel ima;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField usu;
    // End of variables declaration//GEN-END:variables
}
//M1t2o!B2rn1l
