
package casadecambio;

public class MonedaPorDefecto extends Moneda {

    @Override
    public String Convertir(String moneda, double valor) {
        
        mensaje = "La conversion no es valida";
        
        System.out.println("responsablidad realizada");
        System.out.println("----------------------------------");
        
        return mensaje;
        
    }
    
}
