/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.sql.*;
import Vista.Facha;
import Vista.Actualizar;
import com.example.Reto5.INterfaz;
import com.example.Reto5.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author EQUIPO
 */

public class Vamoo implements ActionListener {
    INterfaz inter;
    Facha facha;
    Actualizar jose;
    Producto producto;
    public Vamoo(Actualizar jose,INterfaz inter, Facha facha) {
        this.inter = inter;
        this.facha = facha;
        this.jose=jose;
        ag();
        selcf();
        agregarbo();
        listar();
        
    }
    public void agregarbo(){
    facha.jButtonag.addActionListener((ActionListener) this);
    facha.jButtonac.addActionListener((ActionListener) this);
    facha.jButtonbor.addActionListener((ActionListener) this);
    facha.jButtonbus.addActionListener((ActionListener) this);
    jose.jButton1.addActionListener((ActionListener)this);
    facha.Generar.addActionListener((ActionListener)this);
    }

public void buscar(){
    int id=Integer.parseInt(facha.cod.getText());
    
    Producto pro=inter.findById(id).get();
    facha.nom.setText(pro.getNombre());
    facha.pre.setText(String.valueOf(pro.getPrecio()));
    facha.in.setText(String.valueOf(pro.getInven()));
}
public void listar(){
    String[] arr=new String[4];
    int row=1;
     List<Producto> resu=(List<Producto>)inter.findAll();
      DefaultTableModel tab=new DefaultTableModel();
    tab.addColumn("Codigo");
    tab.addColumn("Nombre");
    tab.addColumn("Precio");
    tab.addColumn("Inventario");
    for(int i=0;i<resu.size();i++){
    arr[0]=String.valueOf(resu.get(i).getCodigo());
    arr[1]=String.valueOf(resu.get(i).getNombre());
    arr[2]=String.valueOf(resu.get(i).getPrecio());
    arr[3]=String.valueOf(resu.get(i).getInven());
    tab.addRow(arr);
    }
    facha.tabla1.setModel(tab);
    
}
public Connection con(){
    Connection x=null;
try{
x=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafeteria","root","M1t2o!B2rn1l");}
catch(Exception e){
    e.printStackTrace();
}
return x;}
public void agregar(){
//Añadir filas
        if(facha.cod.getText().isEmpty() || facha.nom.getText().isEmpty() || facha.in.getText().isEmpty() || facha.pre.getText().isEmpty() ){
    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }
        else{
        Producto yu=Producto.crearpro( Integer.parseInt(facha.cod.getText()),
                    facha.nom.getText(), Float.parseFloat(facha.pre.getText()), 
                    Integer.parseInt(facha.in.getText()));
        Connection x=con();
        try{
            Statement y=x.createStatement();
         y.executeUpdate("insert into productos values("+String.valueOf(yu.getCodigo())+",'"+yu.getNombre()+"',"+String.valueOf(yu.getPrecio())+","+String.valueOf(yu.getInven())+");");
         JOptionPane.showMessageDialog(null, "Producto agregado");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "El codigo o el nombre del producto ya existe");
        }
        }
}
public void selcf(){
     
  MouseListener an=new MouseListener(){
      @Override
      public void mouseClicked(MouseEvent e){
          List<Producto> resu=(List<Producto>)inter.findAll();
          int a=facha.tabla1.getSelectedRow();
          Producto d=resu.get(a);
          facha.cod.setText(String.valueOf(d.getCodigo()));
          facha.nom.setText(String.valueOf(d.getNombre()));
          facha.pre.setText(String.valueOf(d.getPrecio()));
          facha.in.setText(String.valueOf(d.getInven()));
          jose.doc.setText(String.valueOf(d.getCodigo()));
          jose.nom.setText(String.valueOf(d.getNombre()));
          jose.pre.setText(String.valueOf(d.getPrecio()));
          jose.inve.setText(String.valueOf(d.getInven()));
        
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
   facha .tabla1.addMouseListener(an);    }
    

public void eliminar(){
try{
inter.deleteById(Integer.parseInt(facha.cod.getText()));
JOptionPane.showMessageDialog(null, "Producto eliminado");}
catch(Exception e){
JOptionPane.showMessageDialog(null, "No existe producto con ese codigo");}
}
public void actualizar(){
if(jose.doc.getText().isEmpty() || jose.nom.getText().isEmpty() || jose.inve.getText().isEmpty() || jose.pre.getText().isEmpty() ){
    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }
else{
int a=Integer.parseInt(jose.doc.getText());
String b=jose.nom.getText();
float c=Float.parseFloat(jose.pre.getText());
int d=Integer.parseInt(jose.inve.getText());
Producto x=inter.findById(a).get();
x.setInven(d);
x.setNombre(b);
x.setPrecio(c);


    try{
inter.save(x);
JOptionPane.showMessageDialog(null,"Producto actualizado");
    }
catch(Exception e){
JOptionPane.showMessageDialog(null,"No existe un producto con ese codigo");}}
}
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==facha.jButtonag){
          agregar();
          listar();
      }
      else if (e.getSource()==facha.jButtonac){
           jose.setVisible(true);
           jose.setDefaultCloseOperation(1);
          }
      else if(e.getSource()==facha.jButtonbor){

          eliminar();
          listar();


          }
      
      else if(e.getSource()==facha.Generar){
          generar();
      }
      else if(e.getSource()==facha.jButtonbus){
      buscar();
      listar();}
    }
    private void ag(){
  MouseListener an=new MouseListener(){
      @Override
      public void mouseClicked(MouseEvent e) {
          if(e.getSource()==jose.jButton1){
      try{
      actualizar();
      listar();
          }
      catch(Exception d){
      JOptionPane.showMessageDialog(null,"No existe producto con ese codigo");}}      
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
         // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
  };
    jose.jButton1.addMouseListener(an);}
    public void generar(){
        float w=0;
        float z=0;
        ArrayList<Integer> arra=new ArrayList<>();
        HashMap<Float,String> juan=new HashMap<>();
        List<Producto> resu=(List<Producto>)inter.findAll();
        for(Producto x:resu){
        arra.add(x.getInven());
       juan.put(x.getPrecio(),x.getNombre() );
       w+=(x.getPrecio())*(x.getInven());//VAlor total
            z+=(x.getPrecio());
        }
        Collection<Float> are=juan.keySet();
        Float a=Collections.max(are);
        Float b=Collections.min(are);
        String c=juan.get(a);//Nombre del amyor
        String d=juan.get(b);//Nombre del menor
        float re=z/Float.parseFloat(String.valueOf(are.size()));//Promedio
        
        JOptionPane.showMessageDialog(null, "Articulo precio mayor: "+c+"\nArticulo precio menor: "+d+"\nPromedio de precios="+re+"\nValor total="+w);}
}
