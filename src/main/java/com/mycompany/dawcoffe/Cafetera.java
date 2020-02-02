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
            while (saldo < Productos.CAFE_LARGO.getPrecio()) {
                menu.recargaSaldo();
                saldo += menu.getRespD();
            };
            cafe.setCantidadActual(cafe.getCantidadActual() - Productos.CAFE_LARGO.getCafe());
            agua.setCantidadActual(agua.getCantidadActual() - Productos.CAFE_LARGO.getAgua());
            saldo -= Productos.CAFE_LARGO.getPrecio();
            ventasRealizadas++;
            saldoAcumulado += Productos.CAFE_LARGO.getPrecio();

        } else if (aux == 204 || aux == 205) {
            while (saldo < Productos.CAFE_CON_LECHE.getPrecio()) {
                menu.recargaSaldo();
                saldo += menu.getRespD();
            };
            cafe.setCantidadActual(cafe.getCantidadActual() - Productos.CAFE_CON_LECHE.getCafe());
            leche.setCantidadActual(leche.getCantidadActual() - Productos.CAFE_CON_LECHE.getLeche());
            saldo -= Productos.CAFE_CON_LECHE.getPrecio();
            saldoAcumulado += Productos.CAFE_CON_LECHE.getPrecio();
            ventasRealizadas++;

        } else if (aux == 206 || aux == 207) {
            while (saldo < Productos.CAFE_CORTADO.getPrecio()) {
                menu.recargaSaldo();
                saldo += menu.getRespD();
            };
            cafe.setCantidadActual(cafe.getCantidadActual() - Productos.CAFE_CORTADO.getCafe());
            agua.setCantidadActual(agua.getCantidadActual() - Productos.CAFE_CORTADO.getAgua());
            leche.setCantidadActual(leche.getCantidadActual() - Productos.CAFE_CORTADO.getLeche());
            saldo -= Productos.CAFE_CORTADO.getPrecio();
            saldoAcumulado += Productos.CAFE_CORTADO.getPrecio();
            ventasRealizadas++;

        } else if (aux == 208) {
            while (saldo < Productos.CHOCOLATE.getPrecio()) {
                menu.recargaSaldo();
                saldo += menu.getRespD();
            };
            leche.setCantidadActual(leche.getCantidadActual() - Productos.CHOCOLATE.getLeche());
            chocolate.setCantidadActual(chocolate.getCantidadActual() - Productos.CHOCOLATE.getChocolate());
            saldo -= Productos.CHOCOLATE.getPrecio();
            saldoAcumulado += Productos.CHOCOLATE.getPrecio();
            ventasRealizadas++;
        } else if (aux == 209) {
<<<<<<< Updated upstream
            while (saldo < Productos.LECHE_FRIA_CALIENTE.getPrecio()) {
=======
            leche.setCantidadActual(leche.getCantidadActual() - Productos.LECHE_FRIA_CALIENTE.getLeche());
            if (saldo > Productos.LECHE_FRIA_CALIENTE.getPrecio()) {
                saldo -= Productos.LECHE_FRIA_CALIENTE.getPrecio();
                ventasRealizadas++;
            } else {
>>>>>>> Stashed changes
                menu.recargaSaldo();
                saldo += menu.getRespD();
            };
            leche.setCantidadActual(leche.getCantidadActual() - Productos.LECHE_FRIA_CALIENTE.getLeche());
            saldo -= Productos.LECHE_FRIA_CALIENTE.getPrecio();
            saldoAcumulado += Productos.LECHE_FRIA_CALIENTE.getPrecio();
            ventasRealizadas++;
        }

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
