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
public class Cafetera {

    private double saldo;
    private double saldoAcumulado;
    private int ventasRealizadas;

    Deposito cafe = new Deposito("Cafe", 1000);
    Deposito agua = new Deposito("Agua", 1000);
    Deposito leche = new Deposito("Leche", 1000);
    Deposito chocolate = new Deposito("Chocolate", 1000);
    Deposito azucar = new Deposito("Azucar", 1000);

    public void ventaProductos(int aux) {

        if (aux == 200 || aux == 201) {
            cafe.setCantidadActual(cafe.getCantidadActual() - Productos.CAFE_SOLO.getCafe());
            agua.setCantidadActual(agua.getCantidadActual() - Productos.CAFE_SOLO.getAgua());
            saldo -= Productos.CAFE_SOLO.getPrecio();
            ventasRealizadas++;
        } else if (aux == 202 || aux == 203) {
            cafe.setCantidadActual(cafe.getCantidadActual() - Productos.CAFE_LARGO.getCafe());
            agua.setCantidadActual(agua.getCantidadActual() - Productos.CAFE_LARGO.getAgua());
            saldo -= Productos.CAFE_LARGO.getPrecio();
            ventasRealizadas++;
        } else if (aux == 204 || aux == 205) {
            cafe.setCantidadActual(cafe.getCantidadActual() - Productos.CAFE_CON_LECHE.getCafe());
            leche.setCantidadActual(leche.getCantidadActual() - Productos.CAFE_CON_LECHE.getLeche());
            saldo -= Productos.CAFE_CON_LECHE.getPrecio();
            ventasRealizadas++;
        } else if (aux == 206 || aux == 207) {
            cafe.setCantidadActual(cafe.getCantidadActual() - Productos.CAFE_CORTADO.getCafe());
            agua.setCantidadActual(agua.getCantidadActual() - Productos.CAFE_CORTADO.getAgua());
            leche.setCantidadActual(leche.getCantidadActual() - Productos.CAFE_CORTADO.getLeche());
            saldo -= Productos.CAFE_CORTADO.getPrecio();
            ventasRealizadas++;
        } else if (aux == 208) {
            leche.setCantidadActual(leche.getCantidadActual() - Productos.CHOCOLATE.getLeche());
            chocolate.setCantidadActual(chocolate.getCantidadActual() - Productos.CHOCOLATE.getChocolate());
            saldo -= Productos.CHOCOLATE.getPrecio();
            ventasRealizadas++;
        } else if (aux == 209){
            leche.setCantidadActual(leche.getCantidadActual() - Productos.LECHE_FRIA_CALIENTE.getLeche()); 
            saldo -= Productos.LECHE_FRIA_CALIENTE.getPrecio();
            ventasRealizadas++;
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoAcumulado() {
        return saldoAcumulado;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

}
