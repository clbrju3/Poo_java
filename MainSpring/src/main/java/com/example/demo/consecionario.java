/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author EQUIPO
 */
@Table("consecionario")
public class consecionario {
    @Id
    @Column("codigo")
    private int codigo;
    @Column("nombre")
    private String nombre;
    @Column("apellido")
    private String apellido;
    @Column("correo")
    private String correo;
    @Column("telefono")
    private String telefono;

    public consecionario( String nombre, String apellido, String correo, String telefono) {
     
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public static consecionario Crearcon(String nombre,String apellido, String correo, String telefono){
    return new consecionario(nombre,apellido,correo,telefono);}
}
