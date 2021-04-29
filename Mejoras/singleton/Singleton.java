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
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo singletonAfuera = Vehiculo.getInstance();
         System.out.println(singletonAfuera.getReferencia()+' '+singletonAfuera.getVelocidadMaxima());
    } 
}
