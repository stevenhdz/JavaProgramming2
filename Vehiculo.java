package Parcial1;
/**
 *
 * @author alexanderjimenez
 */
public class Vehiculo {

    private final String referencia;
    private final String velocidadMaxima;
    private final Color color;

    public Vehiculo(String referencia, String velocidadMaxima, Color color) {
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public Vehiculo(Vehiculo vehiculo) {
        this.referencia = vehiculo.getReferencia();
        this.velocidadMaxima = vehiculo.getVelocidadMaxima();
        this.color = vehiculo.getColor();
    }

    public String getReferencia() {
        return referencia;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Referencia: " + referencia + " Velocidad maxima: " + velocidadMaxima + " Color: " + color;
    }
}
