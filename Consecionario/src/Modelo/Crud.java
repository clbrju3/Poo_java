/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
import Consecionariocon.Conexion;
public class Crud {
    public int cru(Cliente cloi){
        int a=0;
    try{
    
    Conexion u = new Conexion();

    Connection tr=u.con();
    Statement tro=tr.createStatement();
   tro.execute("use cafeteria;");
    PreparedStatement tru=tr.prepareStatement("insert into clientes values(?,?,?,?);");
    tru.setInt(1,cloi.getDoc());
    tru.setString(2,cloi.getNom());
    tru.setString(3,cloi.getAp());
    tru.setString(4,cloi.getCorr());
    a=tru.executeUpdate();
    }
    catch(Exception e){
        e.printStackTrace();
}
    return a;}
}
