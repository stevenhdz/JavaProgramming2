package Parcial1;
/**
 *
 * @author alexanderjimenez
 */


public class Yate implements Cloneable {

    private String pesoMaximo;

    public Yate(String pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Yate(Yate yate) {
        this.pesoMaximo = yate.pesoMaximo;  
    }

    @Override
    protected Yate clone() {
        return new Yate(this);
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Yate)){
            return false;
        }
        Yate persona = (Yate) obj;
        return  this.pesoMaximo.equals(persona.pesoMaximo);
    }

    public String getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(String pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    @Override
    public String toString() {
        return "Yate{" + "pesoMaximo=" + pesoMaximo +'}';
    }
    
    
    
    
}
