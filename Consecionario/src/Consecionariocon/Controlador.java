/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consecionariocon;
import Bista.Vista;
import Modelo.Cliente;
import Modelo.Crud;
import javax.swing.JOptionPane;
public class Controlador {
    Vista f;
    public Controlador(Vista f){
        this.f=f;
    }
    public void control(){
        int a;
        int doc;
        String nomb;
        String ape;
        String corr;
        String telef;
        doc=Integer.parseInt(f.cod.getText());
        nomb=f.nom.getText();
        ape=f.ap.getText();
        corr=f.cor.getText();
        Cliente cli=new Cliente(doc,nomb,ape,corr);
        Crud ca=new Crud();
        a=ca.cru(cli);
        if(a==1){
            JOptionPane.showMessageDialog(null, "Datos guardados");
        }
        else{
        JOptionPane.showMessageDialog(null, "No c pai");}
        
    }
}
