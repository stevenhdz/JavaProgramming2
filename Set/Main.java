/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author alexanderjimenez
 */
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sn = new Scanner(System.in);

            String tecla = null;
            Set<Vehiculo> set = new HashSet<>();
            int i = 0;
            int opcion1;
            boolean salir = false;
            Scanner scanner = new Scanner(System.in);

            while (!salir) {
                if (i == 10) {
                    System.out.println("Parqueadero lleno");
                    System.exit(0);
                } else {
                    System.out.println("Escoge una de las siguientes opciones:\n");
                    System.out.println("1. Agregar vehicúlo");
                    System.out.println("2. Mostrar garaje");
                    System.out.println("3. Mas opciones nuevas");
                    System.out.println("4. Salir");

                    opcion1 = sn.nextInt();
                    switch (opcion1) {
                        case 1 -> {
                            do {
                                System.out.println("VEHICULOS");
                                System.out.println("1. Avión");
                                System.out.println("2. Yate");
                                System.out.println("3. Carro");
                                System.out.println("4. Salir");
                                System.out.println();
                                System.out.println("Ingresar opcion:");
                                int opcion = scanner.nextInt();
                                boolean opc = (opcion <= 4);
                                if (opc) {
                                    switch (opcion) {

                                        case 1 -> {
                                            System.out.println("Has seleccionado, Avion\n");
                                            Avion v = new RecibidorDeInformacion().ingresarInformacionAvion();
                                            set.add(v);
                                            i++;
                                        }
                                        case 2 -> {
                                            System.out.println("Has seleccionado, Yate\n");
                                            Yate y = new RecibidorDeInformacion().ingresarInformacionYate();
                                            set.add(y);
                                            i++;
                                        }
                                        case 3 -> {
                                            System.out.println("Has seleccionado, Carro\n");
                                            Carro c = new RecibidorDeInformacion().ingresarInformacionCarro();
                                            set.add(c);
                                            i++;
                                        }
                                        case 4 -> {
                                        }
                                    }
                                } else {
                                    System.out.println("Ingresa un numero del 1 al 4.");
                                }
                                System.out.print("\n¿Quieres seguir ingresando vehiculos?\n");
                                System.out.print("\nPara mas informacion: tecle s = si o tecle n = no\n");
                                tecla = new Scanner(System.in).nextLine();

                            } while (tecla.equals("s") || tecla.equals("S"));
                        }
                        case 2 -> {
                            System.out.println("\nVehiculos disponibles:\n");

                            System.out.println("Set" + set);
                        }
                        case 3 -> {
                            do {
                                System.out.println("1. Velocidad maxima");
                                System.out.println("2. Velocidad minima");
                                System.out.println("3. Ordenar de mayor a menor velocidad");
                                System.out.println("4. Mostrar vehiculos NEGRO o AZUL");
                                System.out.println("5. Vehiculos BLANCO o VERDE");
                                System.out.println();
                                System.out.println("Ingresar opcion:");
                                int opcion = scanner.nextInt();
                                boolean opc = (opcion <= 5);

                                if (opc) {
                                    switch (opcion) {

                                        case 1 -> {
                                            Optional<Vehiculo> vehiculoss = set.stream()
                                                    .max(Comparator.comparing(vehiculos -> vehiculos.getVelocidadMaxima()));
                                            Object n = vehiculoss.isEmpty() ? "Esta vacio" : vehiculoss;
                                            System.out.print(n);
                                        }
                                        case 2 -> {
                                            Optional<Vehiculo> vehiculoss = set.stream()
                                                    .min(Comparator.comparing(vehiculos -> vehiculos.getVelocidadMaxima()));
                                            Object n = vehiculoss.isEmpty() ? "Esta vacio" : vehiculoss;
                                            System.out.print(n);
                                        }
                                        case 3 -> {
                                            List<Vehiculo> vehiculoss = set.stream()
                                                    .sorted(Comparator.comparing(Vehiculo::getVelocidadMaxima).reversed())
                                                    .collect(Collectors.toList());
                                            Object n = vehiculoss.isEmpty() ? "Esta vacio" : vehiculoss;
                                            System.out.print(n);
                                        }
                                        case 4 -> {
                                            List<Vehiculo> vehiculoss = set.stream()
                                                    .filter(vehiculos -> vehiculos.getColor().equals(vehiculos.getColor().AZUL) || vehiculos.getColor().equals(vehiculos.getColor().NEGRO))
                                                    .collect(Collectors.toList());
                                            Object n = vehiculoss.isEmpty() ? "Esta vacio" : vehiculoss;
                                            System.out.print(n);
                                        }
                                        case 5 -> {
                                            String vehiculoss = set.stream()
                                                    .filter(vehiculos -> vehiculos.getColor().equals(vehiculos.getColor().BLANCO) || vehiculos.getColor().equals(vehiculos.getColor().VERDE))
                                                    .map(Vehiculo::getReferencia)
                                                    .reduce(" ", (acomulador, n) -> acomulador.concat(n) + " ");
                                            Object n = vehiculoss.isEmpty() ? "Esta vacio" : vehiculoss;
                                            System.out.print(n);
                                        }
                                       
                                    }
                                } else {
                                    System.out.println("Ingresa un numero del 1 al 5.");
                                }
                                System.out.print("\n¿Deseas continuar?\n");
                                System.out.print("\nPara mas informacion: tecle s = si o tecle n = no\n");
                                tecla = new Scanner(System.in).nextLine();

                            } while (tecla.equals("s") || tecla.equals("S"));

                        }
                        case 4 ->
                            salir = true;

                        default ->
                            System.out.println("opción no valida");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("toString(): " + e.toString());
            System.out.println("getMessage(): " + e.getMessage());
        }

    }
}
