package SIuuu;
import javax.swing.JOptionPane;

public class NOoou {
    String clave;
    String ususario;
    public boolean val(boolean t){
    String a=JOptionPane.showInputDialog("Digite su usuario: ");
    String b=JOptionPane.showInputDialog("Digite su clave: ");
    if(a.equals(ususario) && b.equals(clave)){
   t=true;}
    return t;
}
    public void imp(){
    boolean t=false;
    boolean a=val(t);
    if (a){
    JOptionPane.showMessageDialog(null, "Bienvenido "+ususario);}
    else{
    JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrectos ");}}
    }
