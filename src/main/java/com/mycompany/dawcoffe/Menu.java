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
    
    Scanner teclado = new Scanner(System.in);
    
    public int MenuPrincipal() {
        int resp;
        System.out.println("1. Comprar Cafe.");
        System.out.println("2. Administrar Cafetera.");
        System.out.println("3. Salir");
        resp = teclado.nextInt();
        return resp;
    }
}
