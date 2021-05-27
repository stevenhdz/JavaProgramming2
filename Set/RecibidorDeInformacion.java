package javaapplication5;
/**
 *
 * @author alexanderjimenez
 */
import java.util.Scanner;

public class RecibidorDeInformacion {

    private final Scanner scanner = new Scanner(System.in);

    public void recibirInformacion() {
        Avion avion = ingresarInformacionAvion();
        Yate yate = ingresarInformacionYate();
        Carro carro = ingresarInformacionCarro();
    }

    public Avion ingresarInformacionAvion() {
        System.out.println("Ingrese la información del Avion:");
        Vehiculo vehiculo = ingresarInformacionVehiculo();
        System.out.println("Ingrese la altitud maxima");
        String altitudMaxima = scanner.nextLine();
        return new Avion(vehiculo, altitudMaxima);

    }

    public Carro ingresarInformacionCarro() {
        System.out.println("Ingrese la información del Carro:");
        Vehiculo vehiculo = ingresarInformacionVehiculo();
        System.out.println("Ingrese el numero de puertas");
        int numeroDePuertas = scanner.nextInt();
        scanner.nextLine();
        return new Carro(vehiculo, numeroDePuertas);
    }

    public Yate ingresarInformacionYate() {
        System.out.println("Ingrese la información del Yate:");
        Vehiculo vehiculo = ingresarInformacionVehiculo();
        System.out.println("Ingrese el peso maximo");
        int pesoMaximo = scanner.nextInt();
        scanner.nextLine();
        return new Yate(vehiculo, pesoMaximo);

    }

    public Vehiculo ingresarInformacionVehiculo() {
        System.out.println("ingresa un color entre NEGRO, BLANCO, AZUL, VERDE , GRIS");
        Color color = Color.valueOf(scanner.nextLine().trim().toUpperCase());
        System.out.println("Ingrese la referencia");
        String referencia = scanner.nextLine();
        System.out.println("Ingrese la velocidad maxima");
        String velocidadMaxima = scanner.nextLine();
        return new Vehiculo(referencia, velocidadMaxima, color);
    }

}
