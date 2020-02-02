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
public class Programa {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Cafetera cafetera = new Cafetera();
        do {

            menu.menuPrincipal();
            if (menu.getResp() == 1) {
                cafetera.saldoActu();
                menu.menuVentas();
                cafetera.ventaProductos(menu.getResp());
                System.out.println("Saldo actual: " + String.format("%.2f", cafetera.getSaldo()));
                System.out.println("Saldo acumulado: " + String.format("%.2f", cafetera.getSaldoAcumulado()));
            } else if (menu.getResp() == 2) {
                menu.menuAdministracion();

            }

        } while (menu.getResp() > 3 || menu.getResp() < 0);
    }
}
