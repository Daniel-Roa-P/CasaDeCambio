
package casadecambio;

public class Yen extends Moneda {

    @Override
    public String Convertir(String moneda, double valor) {
        
        System.out.println("responsablidad en clase Yen");
        
        if(moneda.equals("Yen") && valor>0){
            
            this.precio=valor/(28.26);
            mensaje="Sus pesos equvalen a: "+String.format("%.2f", precio)+" Yenes";
            System.out.println("responsablidad realizada");
            System.out.println("----------------------------------");
            
        } else {
            
            sucesor.Convertir(moneda, valor);
            System.out.println("responsablidad pasada a MonedaPorDefecto");
            
        }
        
        return mensaje;
                
    }
    
}
