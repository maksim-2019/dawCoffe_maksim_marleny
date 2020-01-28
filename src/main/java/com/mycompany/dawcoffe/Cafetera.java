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
    private double ventasRealizadas;

    Deposito cafe = new Deposito("Cafe", 1000);
    Deposito agua = new Deposito("Agua", 1000);
    Deposito leche = new Deposito("Leche", 1000);
    Deposito chocolate = new Deposito("Chocolate", 1000);
    Deposito azucar = new Deposito("Azucar", 1000);
    public void ventaProductos(){
        
    }
    
    public double getSaldo() {
        return saldo;
    }

    public double getSaldoAcumulado() {
        return saldoAcumulado;
    }

    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

}
