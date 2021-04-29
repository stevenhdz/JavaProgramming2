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
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo sebastian = new Vehiculo("Ferrari", "180km", Color.AZUL);
        Vehiculo clone = sebastian.clone();
        clone.setReferencia("Ferrari"); // varia para que se cumpla o no la condicion.

        if(clone.equals(sebastian)){
            System.out.println("Somos iguales de información");
            System.out.println(clone);
        }else{
            System.out.println("diferente información");
            System.out.println(sebastian);
        }
    }  
}
