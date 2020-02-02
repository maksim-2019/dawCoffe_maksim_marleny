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
    Menu menu = new Menu();

    public void ventaProductos(int aux) {
        //Este metodo resta una cantidad fija de cada deposito segun el producto que hayamos comprado, tambien resta el saldo y tiene un contador de ventas.
        if (aux == 200 || aux == 201) {
//            while (saldo < Productos.CAFE_SOLO.getPrecio()) {
//                menu.recargaSaldo();
//                saldo += menu.getRespD();
//            };
//            cafe.setCantidadActual(cafe.getCantidadActual() - Productos.CAFE_SOLO.getCafe());
//            agua.setCantidadActual(agua.getCantidadActual() - Productos.CAFE_SOLO.getAgua());
//            saldo -= Productos.CAFE_SOLO.getPrecio();
//            saldoAcumulado += Productos.CAFE_SOLO.getPrecio();
//            ventasRealizadas++;
            this.ventaD(0);
        } else if (aux == 202 || aux == 203) {

            this.ventaD(1);

        } else if (aux == 204 || aux == 205) {

            this.ventaD(2);

        } else if (aux == 206 || aux == 207) {

            this.ventaD(3);

        } else if (aux == 208) {

            this.ventaD(4);

        } else if (aux == 209) {

            this.ventaD(5);

        }
    }

    public void ventaD(int i) {
        Productos[] arrayP = {Productos.CAFE_SOLO, Productos.CAFE_LARGO, Productos.CAFE_CON_LECHE, Productos.CAFE_CORTADO, Productos.CHOCOLATE, Productos.LECHE_FRIA_CALIENTE};
        while (saldo < arrayP[i].getPrecio()) {
            menu.recargaSaldo();
            saldo += menu.getRespD();
        };
        cafe.setCantidadActual(cafe.getCantidadActual() - arrayP[i].getCafe());
        agua.setCantidadActual(cafe.getCantidadActual() - arrayP[i].getAgua());
        chocolate.setCantidadActual(chocolate.getCantidadActual() - arrayP[i].getChocolate());
        leche.setCantidadActual(leche.getCantidadActual() - arrayP[i].getLeche());
        saldo -= arrayP[i].getPrecio();
        saldoAcumulado += arrayP[i].getPrecio();
        ventasRealizadas++;
    }

    public void saldoActu() {
        menu.saldoIntro();
        this.saldo += menu.getRespD();
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
