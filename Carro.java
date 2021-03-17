package Parcial1;
/**
 *
 * @author alexanderjimenez
 */
public class Carro extends Vehiculo {

    private final int numeroDePuertas;

    public Carro(String referencia, String velocidadMaxima, int numeroDePuertas, Color color) {
        super(referencia, velocidadMaxima, color);
        this.numeroDePuertas = numeroDePuertas;
    }

    public Carro(Vehiculo vehiculo, int numeroDePuertas) {
        super(vehiculo);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Número de puertas: " + numeroDePuertas;
    }
}
