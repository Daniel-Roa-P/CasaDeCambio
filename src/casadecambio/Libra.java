
package casadecambio;

public class Libra extends Moneda {

    @Override
    public String Convertir(String moneda, double valor) {
        
        System.out.println("responsablidad en clase Libra");
        
        if(moneda.equals("Libra") && valor>0){
            
            this.precio=valor/(4037);
            mensaje="Sus pesos equvalen a: "+String.format("%.2f", precio)+" Libras";
            System.out.println("responsablidad realizada");
            System.out.println("----------------------------------");
            
        } else {
            
            System.out.println("responsablidad pasada a Rupia");
            sucesor.Convertir(moneda, valor);
            
            
        }
        
        return mensaje;
                
    }
    
}
