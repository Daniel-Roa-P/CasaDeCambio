
package casadecambio;

public abstract class Moneda {
    
    protected Moneda sucesor; 
    protected double precio;
    protected static String mensaje;
    
    public abstract String Convertir(String moneda,double valor);
    
    public Moneda getSuccessor() {
        return sucesor;
    }

    public void setSucesor(Moneda sucesor) {
        this.sucesor = sucesor;
    }
    
}
