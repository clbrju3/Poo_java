/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author EQUIPO
 */
public class Facha extends javax.swing.JFrame {

    /**
     * Creates new form Facha
     */
    public Facha() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonag = new javax.swing.JButton();
        jButtonac = new javax.swing.JButton();
        jButtonbor = new javax.swing.JButton();
        jButtonbus = new javax.swing.JButton();
        cod = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        pre = new javax.swing.JTextField();
        in = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Generar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonag.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonag.setText("Agregar");
        getContentPane().add(jButtonag, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, -1));

        jButtonac.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonac.setText("Actualizar");
        getContentPane().add(jButtonac, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 100, 40));

        jButtonbor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonbor.setText("Borrar");
        getContentPane().add(jButtonbor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 80, -1));

        jButtonbus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonbus.setText("Buscar");
        getContentPane().add(jButtonbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 85, 80, 40));
        getContentPane().add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 160, 30));
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 129, 160, 30));
        getContentPane().add(pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 179, 160, 30));
        getContentPane().add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 239, 160, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Codigo");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 70, 50, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 130, 50, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Precio");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 50, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Inventario");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 240, 60, 30));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 390, 260));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/600x600bf-60.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 290, 390));

        Generar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Generar.setText("Generar informe");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });
        getContentPane().add(Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 140, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Bienvenido a la app productos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 360, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/600x600bf-60.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Generar;
    public javax.swing.JTextField cod;
    public javax.swing.JTextField in;
    public javax.swing.JButton jButtonac;
    public javax.swing.JButton jButtonag;
    public javax.swing.JButton jButtonbor;
    public javax.swing.JButton jButtonbus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField nom;
    public javax.swing.JTextField pre;
    public javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
