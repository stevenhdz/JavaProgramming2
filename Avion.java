package Parcial1;
/**
 *
 * @author alexanderjimenez
 */
public class Avion extends Vehiculo {

    private final String altitudMaxima;

    public Avion(String referencia, String velocidadMaxima, String altitudMaxima, Color color) {
        super(referencia, velocidadMaxima, color);
        this.altitudMaxima = altitudMaxima;
    }

    public Avion(Vehiculo vehiculo, String altitudMaxima) {
        super(vehiculo);
        this.altitudMaxima = altitudMaxima;
    }

    public String getAltitudMaxima() {
        return altitudMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + " Altitud máxima: " + altitudMaxima;
    }
}
