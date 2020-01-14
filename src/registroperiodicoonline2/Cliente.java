/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroperiodicoonline2;

/**
 *
 * @author Your Name <Juan A. García Muelas (juangmuelas@hotmail.com)>
 */
//Clase Cliente de la que no se pueden instanciar objetos.
public abstract class Cliente {
    //Se declaran protected para que las clases heredadas puedan acceder, pero no otras.
    protected String email="";
    protected String contrasena="";
    protected double importe=0;

    //Constructor vacío
    protected Cliente() {
    }
    
    //Constructor con parámetros
    protected Cliente(String email, String contrasena, double importe){
        this.email= email;
        this.contrasena= contrasena;
        this.importe= importe;  
    }
    
    //Getters y Setters.

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getContrasena() {
        return contrasena;
    }

    protected void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    protected double getImporte() {
        return importe;
    }

    protected void setImporte(double importe) {
        this.importe = importe;
    }
    
    //Para la comprobación de datos, aunque no lo pida, sacamos un override

    @Override
    public String toString() {
        return "Cliente{" + "email=" + email + ", contrasena=" + contrasena + ", descuento=" + importe + '}';
    }
    
    
}//Fin clase Cliente
