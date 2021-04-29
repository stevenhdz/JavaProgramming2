package Parcial1;
/**
 *
 * @author alexanderjimenez
 */


public class Carro implements Cloneable {

    private String numeroDePuertas;

    public Carro(String numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public Carro(Carro carro) {
        this.numeroDePuertas = carro.numeroDePuertas;
    }
    
    
     @Override
    protected Carro clone() {
        return new Carro(this);
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Carro)){
            return false;
        }
        Carro persona = (Carro) obj;
        return  this.numeroDePuertas.equals(persona.numeroDePuertas);
    }

    public String getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(String numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    

    @Override
    public String toString() {
        return "Carro{" + "numeroDePuertas=" + numeroDePuertas +  '}';
    }


    

   
}
