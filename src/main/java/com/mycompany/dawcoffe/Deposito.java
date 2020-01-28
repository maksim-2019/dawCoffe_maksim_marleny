/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dawcoffe;

/**
 *
 * @author mar
 */
public class Deposito {
    private String nombre;
    private int cantidadMax = 1000;
    private int cantidadUmbral = 100;
    private int cantidadActual;

    public Deposito(String nombre, int cantidadActual) {
        this.nombre = nombre;
        this.cantidadActual = cantidadActual;
    }
    
    public void RellenarDeposito(){
        this.cantidadActual = 1000;
    }
    
    public void vaciarDeposito(){
        this.cantidadActual = 0;
    }
    
    public void mostrarDeposito () {
        this.toString();
    }

    @Override
    public String toString() {
        return "Deposito{" + "nombre=" + nombre + ", cantidadMax=" + cantidadMax + ", cantidadUmbral=" + cantidadUmbral + ", cantidadActual=" + cantidadActual + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public int getCantidadUmbral() {
        return cantidadUmbral;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
