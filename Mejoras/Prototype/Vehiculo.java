/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;
/**
 *
 * @author alexanderjimenez
 */
import Prototype.Color;

public class Vehiculo implements Cloneable {

    private  String referencia;
    private  String velocidadMaxima;
    private Color color;
    


    public Vehiculo(String referencia, String velocidadMaxima, Color color) {
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public Vehiculo(Vehiculo vehiculo) {
        this.referencia = vehiculo.referencia;
        this.velocidadMaxima = vehiculo.velocidadMaxima;
        this.color = vehiculo.color;
    }
    
    @Override
    protected Vehiculo clone() {
        return new Vehiculo(this);
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Vehiculo)){
            return false;
        }
        Vehiculo persona = (Vehiculo) obj;
        return  this.referencia.equals(persona.referencia) &&
                this.velocidadMaxima.equals(persona.velocidadMaxima) &&
                this.color.equals(persona.color);
    }

    public String getReferencia() {
        return referencia;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    @Override
    public String toString() {
        return "Referencia: " + referencia
                + " Velocidad Maxima: " + velocidadMaxima
                + " Color: " + color;
    }
}
