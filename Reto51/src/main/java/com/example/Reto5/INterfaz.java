/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Reto5;

/**
 *
 * @author EQUIPO
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author EQUIPO
 */
@Repository
public interface INterfaz extends CrudRepository<Producto, Integer> {
    
}
