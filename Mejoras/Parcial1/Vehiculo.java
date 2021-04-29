package Parcial1;
/**
 *
 * @author alexanderjimenez
 */


import Parcial1.Color;
public class Vehiculo {

    private final String referencia;
    private final String velocidadMaxima;
    private final Color color;

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

    public static VehiculoBuilder builder(){
        return new VehiculoBuilder();
    }


    public static class VehiculoBuilder {
        private String referencia;
        private String velocidadMaxima;
        private Color color;

        public VehiculoBuilder referencia(String referencia){
            this.referencia = referencia;
            return this;
        }

        public VehiculoBuilder velocidadMaxima(String velocidadMaxima) {
            this.velocidadMaxima = velocidadMaxima;
            return this;
        }

        public VehiculoBuilder color(Color color) {
            this.color = color;
            return this;
        }

        public Vehiculo build(){
            return new Vehiculo(referencia, velocidadMaxima, color);
        }
    }
}
