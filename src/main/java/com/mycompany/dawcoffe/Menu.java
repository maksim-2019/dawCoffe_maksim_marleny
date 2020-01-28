/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dawcoffe;

import java.util.Scanner;

/**
 *
 * @author maksim
 */
public class Menu {

    private int resp;
    private Scanner teclado = new Scanner(System.in);

    public void menuPrincipal() {
        System.out.println("-----------------------------------");
        System.out.println("1. Comprar Cafe.");
        System.out.println("2. Administrar Cafetera.");
        System.out.println("3. Salir");
        System.out.println("-----------------------------------");
        this.resp = teclado.nextInt();
    }

    public void menuAdministracion() {
        System.out.println("-----------------------------------");
        System.out.println("1. Comprobar Depositos.");
        System.out.println("2. Estado de Depositos.");
        System.out.println("3. Rellenar deposito.");
        System.out.println("4. Consultar Ventas.");
        System.out.println("5. Salir");
        System.out.println("-----------------------------------");
        resp = teclado.nextInt();
    }

    public void menuVentas() {
        System.out.println("-----------------------------------");
        System.out.println("200. Cafe Solo.");
        System.out.println("201. Cafe Solo Descafeinado.");
        System.out.println("202. Cafe Largo.");
        System.out.println("203. Cafe Largo Descafeinado.");
        System.out.println("204. Cafe con Leche.");
        System.out.println("205. Cafe con Leche Descafeinado.");
        System.out.println("206. Cafe Cortado.");
        System.out.println("207. Cafe Cortado Descafeinado.");
        System.out.println("208. Chocolate.");
        System.out.println("205. Leche Fria o Caliente.");
        System.out.println("-----------------------------------");
        resp = teclado.nextInt();
    }
    
    public void saldoIntro (){
        System.out.println("Deposite dinero para la compra.");
        resp = teclado.nextInt();
    }
    
    public void recargaSaldo(){
        System.out.println("Porfavor deposite mas dinero.");
        resp = teclado.nextInt();
    }
    
    public int getResp() {
        return resp;
    }

    public void setResp(int resp) {
        this.resp = resp;
    }

}
