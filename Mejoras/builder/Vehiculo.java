/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.Color;

public class Vehiculo {

    private  String referencia;
    private  String velocidadMaxima;
    private  Color color;

    public Vehiculo(String referencia, String velocidadMaxima, Color color) {
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    @Override
    public String toString() {
        return  " Referencia: " + referencia +
                " Velocidad Maxima: " + velocidadMaxima +
                " Color: " + color ;
    }

    public static PersonaBuilder builder(){
        return new PersonaBuilder();
    }

    public static class PersonaBuilder {
        private String referencia;
        private String velocidadMaxima;
        private Color color;

        public PersonaBuilder referencia(String referencia){
            this.referencia = referencia;
            return this;
        }

        public PersonaBuilder velocidadMaxima(String velocidadMaxima) {
            this.velocidadMaxima = velocidadMaxima;
            return this;
        }

        public PersonaBuilder color(Color color) {
            this.color = color;
            return this;
        }

        public Vehiculo build(){
            return new Vehiculo(referencia, velocidadMaxima, color);
        }
    }
}
