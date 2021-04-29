/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author alexanderjimenez
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        new Vehiculo("FERRARI", "190KM", Color.NEGRO);
        Vehiculo persona = Vehiculo.builder().referencia("LAMBOR").velocidadMaxima("200KM").color(Color.AZUL).build();
        System.out.println(persona);
    }
    
}
