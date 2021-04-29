/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author alexanderjimenez
 */
public class Vehiculo {
    
    private static Vehiculo singleton;
    private  String referencia;
    private  String velocidadMaxima;
    

    private Vehiculo(){
        this.referencia = "MAZDA";
        this.velocidadMaxima = "190KM";
    }

    public static Vehiculo getInstance(){
        if(null == singleton){
            singleton = new Vehiculo();
        }
        return singleton;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
   
    
   
}
