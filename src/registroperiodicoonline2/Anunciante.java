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
public class Anunciante extends Cliente{
    protected int anuncios;
    
    //Constructor vacío.
    protected Anunciante(){
    }
    
    //Constructor con parámetros.
    public Anunciante(int anuncios, String email, String contrasena, double descuento) {
        super(email, contrasena, descuento);
        this.anuncios = anuncios;
    }
    
     //Getter y Setter

    /**
     * @return the anuncios
     */
    protected int getAnuncios() {
        return anuncios;
    }

    /**
     * @param anuncios the anuncios to set
     */
    protected void setAnuncios(int anuncios) {
        this.anuncios = anuncios;
    }
    
  
}//Fin de clase Anunciante
