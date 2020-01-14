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
//Debemos declarar objetos de eta clase. La hacemos pública
public class Usuario extends Cliente {
    //El atributo premium lo ponemos false, para inicializar sin contratar esa tarifa
    protected boolean premium= false;
    
    //Constructor vacío.
    protected Usuario(){
    }
    
    //Constructor con parámetros.
    protected Usuario(String email, String contrasena, double importe, boolean premium) {
        super(email, contrasena, importe);
        this.premium= premium;
    }
    
    //Getter y Setter.

    /**
     * @return the premium
     */
    protected boolean isPremium() {
        return premium;
    }

    /**
     * @param premium the premium to set
     */
    protected void setPremium(boolean premium) {
        this.premium = premium;
    }
    
    protected double ingresos(double cuota, double descuento){
        if(premium){
            cuota= 35.5;//20.5
            return cuota-descuento;}
            else {
            cuota= 20.5;
            return cuota-descuento;}
            
    }
    
    //toString...

    @Override
    public String toString() {
        return super.toString() + "premium=" + premium + '}';
    }
    
    
    
}//Fin clase Usuario
