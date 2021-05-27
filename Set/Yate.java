package javaapplication5;
/**
 *
 * @author alexanderjimenez
 */
public class Yate extends Vehiculo {

    private final int pesoMaximo;

    public Yate(String referencia, String velocidadMaxima, int pesoMaximo, Color color) {
        super(referencia, velocidadMaxima, color);
        this.pesoMaximo = pesoMaximo;
    }

    public Yate(Vehiculo vehiculo, int pesoMaximo) {
        super(vehiculo);
        this.pesoMaximo = pesoMaximo;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    @Override
    public String toString() {
        return super.toString() + " Peso máximo: " + pesoMaximo;
    }
}
