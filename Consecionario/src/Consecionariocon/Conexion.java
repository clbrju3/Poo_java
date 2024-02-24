/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consecionariocon;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class Conexion {

    public Conexion() {
    }    
    public Connection con(){
        Connection x=null;
    try{x=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","M1t2o!B2rn1l");
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(null, "Conexion rechazada");}
    return x;}
}


    
