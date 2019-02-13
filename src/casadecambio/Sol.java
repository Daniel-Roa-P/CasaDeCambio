
package casadecambio;

public class Sol extends Moneda {

    @Override
    public String Convertir(String moneda, double valor) {
        
        System.out.println("responsablidad en clase Sol");
        
        if(moneda.equals("Sol") && valor>0){
            
            this.precio=valor/(944);
            mensaje="Sus pesos equvalen a: "+String.format("%.2f", precio)+" Soles";
            System.out.println("responsablidad realizada");
            System.out.println("----------------------------------");
            
        } else {
            
            sucesor.Convertir(moneda, valor);
            System.out.println("responsablidad pasada a Yen");
            
        }
        
        return mensaje;
                
    }
}
