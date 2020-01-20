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
    
    CAFE_SOLO (200, "Cafe solo" , 0.80, 5, 10),
    CAFE_SOLO_DESCAFEINADO (201, "Cafe solo descafeinado" , 0.80 , 5, 10),
    CAFE_LARGO (202, "Cafe largo" , 0.90, 10, 15),
    CAFE_LARGO_DESCAFEINADO (203, "Cafe largo descafeinado" , 0.90, 10, 15),
    CAFE_CON_LECHE(204, "Cafe con leche", 1 ,10 , 10),
    CAFE_CON_LECHE_DESCAFEINADO(205, "Cafe con leche", 1, 10, 10),
    CAFE_CORTADO(206, "Cafe cortado", 1, 10, 5),
    CAFE_CORTADO_DESCAFEINADO(207, "Cafe cortado", 1, 10 ,5),
    CHOCOLATE(207, "Chocolate", 1.4, 10, 10),
    LECHE_FRIA(208, "Leche fria", 0.50, 0, 15),
    LECHE_CALIENTE(209, "Leche caliente", 0.50, 0, 15);
    
    private int codigo;
    private String nombre;
    private double precio;
    private int cafe;
    private int dep; //agua,leche

    private Productos(int codigo, String nombre, double precio, int cafe, int dep) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cafe = cafe;
        this.dep = dep;
    }

    
    
        
    
}
