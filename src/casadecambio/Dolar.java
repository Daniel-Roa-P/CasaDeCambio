
package casadecambio;

public class Dolar extends Moneda {

    @Override
    public String Convertir(String moneda, double valor) {
        
        System.out.println("responsablidad en clase Dolar");
        System.out.println(moneda);
        System.out.println(valor);
        
        
        if(moneda.equals("Dolar") && valor>0){
            
            this.precio=valor/(3126);
            mensaje="Sus pesos equvalen a: "+String.format("%.2f", precio)+" Dolares";
            System.out.println("responsablidad realizada");
            System.out.println("----------------------------------");
        } else {
            
            sucesor.Convertir(moneda, valor);
            System.out.println("responsablidad pasada a Euro");
            
        }
        
        return mensaje;
                
    }
    
}
