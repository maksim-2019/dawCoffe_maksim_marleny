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
        Administrar admin = new Administrar();
        do {

            menu.menuPrincipal();
            if (menu.getResp() == 1) {
                cafetera.saldoActu();
                menu.menuVentas();
                cafetera.ventaProductos(menu.getResp());
                System.out.println("Saldo actual: " + String.format("%.2f", cafetera.getSaldo()));
                System.out.println("Saldo acumulado: " + String.format("%.2f", cafetera.getSaldoAcumulado()));
            } else if (menu.getResp() == 2) {
                do{
                menu.usuario();
                admin.comprUsuario(menu.getUsuario(), menu.getContraseña());
                }while(admin.comprUsuario(menu.getUsuario(), menu.getContraseña()) == false);
                menu.menuAdministracion();

            }

        } while (menu.getResp() > 3 || menu.getResp() < 0);
    }
}
