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

    public void MenuPrincipal() {

        System.out.println("1. Comprar Cafe.");
        System.out.println("2. Administrar Cafetera.");
        System.out.println("3. Salir");
        this.resp = teclado.nextInt();
    }
    
    public void MenuAdministracion(){
        System.out.println("1. Comprobar Depositos.");
        System.out.println("2. Estado de Depositos.");
        System.out.println("3. Rellenar deposito.");
        System.out.println("4. Consultar Ventas.");
        System.out.println("5. Salir");
        resp = teclado.nextInt();
    }

    public int getResp() {
        return resp;
    }

    public void setResp(int resp) {
        this.resp = resp;
    }
    
    
}
