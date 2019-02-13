
package casadecambio;

public class Bolivar extends Moneda {

    @Override
    public String Convertir(String moneda, double valor) {
        
        System.out.println("responsablidad en clase Bolivar");
        
        if(moneda.equals("Bolivar") && valor>0){
            
            this.precio=valor/(0.95);
            mensaje="Sus pesos equvalen a: "+String.format("%.2f", precio)+" Bolivares";
            System.out.println("responsablidad realizada");
            System.out.println("----------------------------------");
            
        } else {
            
            System.out.println("responsablidad pasada a Dolar");
            sucesor.Convertir(moneda, valor);
            
        }
        
        return mensaje;
                
    }
    
}
