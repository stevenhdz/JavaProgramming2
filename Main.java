package Parcial1;
//profe recuerde quitar el package Parcial1 porque lo hice en netbeans 12.x
/**
 *
 * @author alexanderjimenez
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sn = new Scanner(System.in);

            String tecla = null;
            Vehiculo[] garage = new Vehiculo[10];
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
                    System.out.println("3. Salir");

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
                                            garage[i] = v;
                                            i++;
                                        }
                                        case 2 -> {
                                            System.out.println("Has seleccionado, Yate\n");
                                            Yate y = new RecibidorDeInformacion().ingresarInformacionYate();
                                            garage[i] = y;
                                            i++;
                                        }
                                        case 3 -> {
                                            System.out.println("Has seleccionado, Carro\n");
                                            Carro c = new RecibidorDeInformacion().ingresarInformacionCarro();
                                            garage[i] = c;
                                            i++;
                                        }
                                        case 4 -> {
                                        }
                                    }
                                } else {
                                    System.out.println("Ingresa un numero del 1 al 4.");
                                    System.exit(0);
                                }
                                System.out.print("\n¿Quieres seguir ingresando vehiculos?\n");
                                System.out.print("\nPara mas informacion: tecle s = si o tecle n = no\n");
                                tecla = new Scanner(System.in).nextLine();

                            } while (tecla.equals("s") || tecla.equals("S"));
                        }
                        case 2 -> {
                            System.out.println("\nVehiculos disponibles:\n");
                            System.out.println(Arrays.toString(garage));
                        }
                        case 3 -> salir = true;

                        default -> System.out.println("opción no valida");
                    }
                }
            }
        } catch (Exception e) {
         System.out.println("toString(): " + e.toString());
         System.out.println("getMessage(): " + e.getMessage());
        }

    }
}
