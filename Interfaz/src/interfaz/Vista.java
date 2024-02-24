package interfaz;
import java.sql.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EQUIPO
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() throws SQLException {
        initComponents();
        fuy();
        tablp();
        ag();
        ty();
        ge();
        bus();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        busacr = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cons = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cor = new javax.swing.JTextField();
        ap = new javax.swing.JTextField();
        doc = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        usi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 90, 30));

        busacr.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        busacr.setText("Buscar");
        getContentPane().add(busacr, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 90, 30));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton3.setText("Registrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, 30));

        cons.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cons.setText("Consultar");
        getContentPane().add(cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        eliminar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        eliminar.setText("Eliminar");
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 80, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Codigo");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Precio");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("inventario");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Nombre");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 80, 30));
        getContentPane().add(cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 150, 30));
        getContentPane().add(ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 30));
        getContentPane().add(doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 160, 30));
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, 30));
        getContentPane().add(usi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 210, 30));

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 430, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Image/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            ingresar();
            fuy();
            tablp();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            actualizar();
            fuy();
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        tablp();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked

    }//GEN-LAST:event_tabloMouseClicked
int g=0;
ArrayList<String[]> jose=new ArrayList<>();
   private Statement d(){
       Statement y=null;
       try {
        Connection x=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafeteria","root","M1t2o!B2rn1l");
         y=x.createStatement();}
       catch(Exception e){
       e.printStackTrace();}
       return y;
   }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Vista().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
  
  public void ingresar(){
      try{
      Statement ty=d();
      int ze=Integer.parseInt(doc.getText());
      String za=nom.getText();
      float zy=Float.parseFloat(ap.getText());
      int zu=Integer.parseInt(cor.getText());
  ty.executeUpdate("insert into productos values("+ze+",'"+za+"',"+zy+","+zu+");");}
      catch(Exception e){
          JOptionPane.showMessageDialog(null, "Codigo de registro o nombre ya existente");
      }
  }
  public void eliminar(){
      try{
      Statement ty=d();
      int ze=Integer.parseInt(doc.getText());
  ty.executeUpdate("delete from productos where codigo="+ze);}
      catch(Exception e){
          JOptionPane.showMessageDialog(null, "No se ecnuentra ese codigo de registro");
      }
  }
   public void actualizar() {
       try{
      Statement ty=d();
      int ze=Integer.parseInt(doc.getText());
      String za=nom.getText();
      float zy=Float.parseFloat(ap.getText());
      int zu=Integer.parseInt(cor.getText());
  ty.executeUpdate("update productos set nombre='"+za+"' where codigo="+ze+";");
  ty.executeUpdate("update productos set precio="+zy+" where codigo="+ze+";");
  ty.executeUpdate("update productos set inventario="+zu+" where codigo="+ze+";");}
       catch(Exception e){
       JOptionPane.showMessageDialog(null,"Codigo de registro no encontrado");}
  }
  private void ag(){
  MouseListener an=new MouseListener(){
      @Override
      public void mouseClicked(MouseEvent e){
          int a=tablo.getSelectedRow();
          String[] d=jose.get(a);
          doc.setText(d[0]);
          nom.setText(d[1]);
          ap.setText(d[2]);
          cor.setText(d[3]);
      }
      @Override
      public void mousePressed(MouseEvent e) {
           // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }

      @Override
      public void mouseReleased(MouseEvent e) {
          //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }

      @Override
      public void mouseEntered(MouseEvent e) {
          //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }

      @Override
      public void mouseExited(MouseEvent e) {
          //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
 };
  
   tablo.addMouseListener(an);    }

 private void ty(){
 MouseListener a=new MouseListener(){
     @Override
     public void mouseClicked(MouseEvent e) {
         eliminar();
         try {
             fuy();
         } catch (SQLException ex) {
             Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
         }
         tablp();
                 
     }

     @Override
     public void mousePressed(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }

     @Override
     public void mouseReleased(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }

     @Override
     public void mouseEntered(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }

     @Override
     public void mouseExited(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }
 };
 eliminar.addMouseListener (a) ; }
 private void ge(){ MouseListener an=new MouseListener(){
     
     boolean x=true;
     int a=0;
     @Override
     public void mouseClicked(MouseEvent e) {
         for (int i=0;i<jose.size();i++){
     if (usi.getText().equalsIgnoreCase((String)jose.get(i)[0])){
     x=true;
     a=i;}
     
 }
  if(x){
  doc.setText((String)jose.get(a)[0]);
  nom.setText((String)jose.get(a)[1]);
  ap.setText((String)jose.get(a)[2]);
  cor.setText((String)jose.get(a)[3]);
  }
 
  else{
     JOptionPane.showMessageDialog(null, "No existe ese registro ");}
         tablp();
                 
     }

     @Override
     public void mousePressed(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }

     @Override
     public void mouseReleased(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }

     @Override
     public void mouseEntered(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }

     @Override
     public void mouseExited(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }
 };
 busacr.addMouseListener (an) ; }
 private void bus(){ 
    
          MouseListener an=new MouseListener(){
     @Override
     public void mouseClicked(MouseEvent e) {
              for (int i=0;i<jose.size();i++){
                  if(jose.get(i)[0].equals((String)usi.getText())){
                      g=i;
                  }                
              }
              DefaultTableModel tab=new DefaultTableModel();
    tab.addColumn("Codigo");
    tab.addColumn("Nombre");
    tab.addColumn("Precio");
    tab.addColumn("Inventario");
    tab.addRow(jose.get(g));
    tablo.setModel(tab);
              
     }

     @Override
     public void mousePressed(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }

     @Override
     public void mouseReleased(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }

     @Override
     public void mouseEntered(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }

     @Override
     public void mouseExited(MouseEvent e) {
         //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }
 };
 cons.addMouseListener (an) ; 
 }
 
    public void fuy() throws SQLException{  
       jose.clear();
    Statement y=d();
    ResultSet z=y.executeQuery("select * from productos;");
    while(z.next()){
            String[] pi=new String[4];
            pi[0]=z.getString("codigo");
            pi[1]=z.getString("nombre");
            pi[2]=z.getString("precio");
            pi[3]=z.getString("inventario");
            jose.add(pi);
    }}
    private void tablp(){
      
    DefaultTableModel tab=new DefaultTableModel();
    tab.addColumn("Codigo");
    tab.addColumn("Nombre");
    tab.addColumn("Precio");
    tab.addColumn("Inventario");
    for(int i=0;i<jose.size();i++){
    tab.addRow(jose.get(i));}
    tablo.setModel(tab);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ap;
    private javax.swing.JButton busacr;
    private javax.swing.JButton cons;
    private javax.swing.JTextField cor;
    private javax.swing.JTextField doc;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nom;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField usi;
    // End of variables declaration//GEN-END:variables
}
