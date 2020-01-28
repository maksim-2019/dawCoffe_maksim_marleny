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
    
    CAFE_SOLO (200, "Cafe solo" , 0.80, 50, 50, 0, 0),
    CAFE_SOLO_DESCAFEINADO (201, "Cafe solo descafeinado" , 0.80 , 50, 50, 0, 0),
    CAFE_LARGO (202, "Cafe largo" , 0.90, 50, 100, 0, 0),
    CAFE_LARGO_DESCAFEINADO (203, "Cafe largo descafeinado" , 0.90, 50, 100, 0, 0),
    CAFE_CON_LECHE(204, "Cafe con leche", 1 ,50 , 0, 50 , 0),
    CAFE_CON_LECHE_DESCAFEINADO(205, "Cafe con leche", 1, 50, 0, 50, 0),
    CAFE_CORTADO(206, "Cafe cortado", 1, 25, 25, 25, 0),
    CAFE_CORTADO_DESCAFEINADO(207, "Cafe cortado descafeinado", 1, 25 ,25, 25, 0),
    CHOCOLATE(208, "Chocolate", 1.4, 0, 50, 0, 50),
    LECHE_FRIA_CALIENTE(209, "Leche fria", 0.50, 0, 0, 100, 0);
    
    private int codigo;
    private String nombre;
    private double precio;
    private int cafe;
    private int agua; 
    private int leche;
    private int chocolate;

    private Productos(int codigo, String nombre, double precio, int cafe, int agua, int leche, int chocolate) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cafe = cafe;
        this.agua = agua;
        this.leche = leche;
        this.chocolate = chocolate;
    }

    public int getAgua() {
        return agua;
    }

    public int getLeche() {
        return leche;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCafe() {
        return cafe;
    }

    public int getChocolate() {
        return chocolate;
    }

    
}
