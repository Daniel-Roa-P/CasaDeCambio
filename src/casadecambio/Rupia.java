
package casadecambio;

public class Rupia extends Moneda {

    @Override
    public String Convertir(String moneda, double valor) {
        
        System.out.println("responsablidad en clase Rupia");
        
        if(moneda.equals("Rupia") && valor>0){
            
            this.precio=valor/(44.3);
            mensaje="Sus pesos equvalen a: "+String.format("%.2f", precio)+" Rupias";
            System.out.println("responsablidad realizada");
            System.out.println("----------------------------------");
            
        } else {
            
            System.out.println("responsablidad pasada a Sol");
            sucesor.Convertir(moneda, valor);
            
        }
        
        return mensaje;
                
    }
    
}
