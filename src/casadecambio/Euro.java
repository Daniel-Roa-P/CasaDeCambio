
package casadecambio;

public class Euro extends Moneda {

    @Override
    public String Convertir(String moneda, double valor) {
        
        System.out.println("responsablidad en clase Euro");
        
        if(moneda.equals("Euro") && valor>0){
            
            this.precio=valor/(3544);
            mensaje="Sus pesos equvalen a: "+String.format("%.2f", precio)+" Euros";
            System.out.println("responsablidad realizada");
            System.out.println("----------------------------------");
            
        } else {
            
            sucesor.Convertir(moneda, valor);
            System.out.println("responsablidad pasada a Libra");
            
        }
        
        return mensaje;
                
    }
    
}
