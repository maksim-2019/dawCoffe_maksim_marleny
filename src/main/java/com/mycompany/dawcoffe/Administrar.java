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
public class Administrar {

    private String usuario = "Admin";
    private String contraseña = "Admin";

    public boolean comprUsuario(String usuar, String contra) {
        
        if(usuar.equals(usuario) && contra.equals(contraseña)){
            System.out.println("Credenciales corectas");
            return true;
        } else {
            System.out.println("Credenciales erroneas");
            return false;
        }
        
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
}
