package Parcial1;
/**
 *
 * @author alexanderjimenez
 */


public class Avion implements Cloneable {

    private String altitudMaxima;

    public Avion(String altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public Avion(Avion avion) {
        this.altitudMaxima = avion.altitudMaxima;
    }

    
     @Override
    protected Avion clone() {
        return new Avion(this);
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Avion)){
            return false;
        }
        Avion persona = (Avion) obj;
        return  this.altitudMaxima.equals(persona.altitudMaxima);
    }

    public String getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(String altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }


    @Override
    public String toString() {
        return "Avion{" + "altitudMaxima=" + altitudMaxima  + '}';
    }
    
    
    
    
}
