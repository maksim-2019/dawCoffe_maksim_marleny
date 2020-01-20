/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dawcoffe;

/**
 *
 * @author maksim
 */
public enum Productos {
    
    CAFE_SOLO ("Cafe solo" , 0.80),
    CAFE_SOLO_DESCAFEINADO ("Cafe solo descafeinado" , 0.80),
    CAFE_LARGO ("Cafe largo" , 0.90),
    CAFE_LARGO_DESCAFEINADO ("Cafe largo descafeinado" , 0.90),
    CAFE_CON_LECHE("Cafe con leche", 1),
    CAFE_CON_LECHE_DESCAFEINADO("Cafe con leche", 1),
    CAFE_CORTADO("Cafe cortado", 1),
    CAFE_CORTADO_DESCAFEINADO("Cafe cortado", 1);
    private String nombre;
    private double precio;

    private Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
        
    
}
