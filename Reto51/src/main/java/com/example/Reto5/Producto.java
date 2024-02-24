/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto5;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author EQUIPO
 */
@Table("productos")
public class Producto {
    @Id
    @Column("codigo")
    int codigo;
    @Column("nombre")
    String nombre;
    @Column("precio")
    float precio;
    @Column("inventario")
    int inven;

    public Producto( int codigo,String nombre, float precio, int inven) {
        this.codigo=codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inven = inven;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getInven() {
        return inven;
    }

    public void setInven(int inven) {
        this.inven = inven;
    }
     public static Producto crearpro(int cod,String nombre,float precio, int inve){
    return new Producto(cod,nombre,precio,inve);}
}
