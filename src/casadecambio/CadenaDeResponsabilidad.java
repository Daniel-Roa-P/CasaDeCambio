
package casadecambio;

public class CadenaDeResponsabilidad {

    private String moneda;
    public double valor;
    
    public void setMoneda(String moneda){
        
        this.moneda=moneda;
        
    }
    
    public void setValor(double valor){
    
        this.valor=valor;
        
    }
    
    public String pasoDeResponsabilidades(){
        
        Moneda tiposDeMoneda[] = new Moneda[8];
      
        tiposDeMoneda[7] = new MonedaPorDefecto();
        tiposDeMoneda[6] = new Yen();
        tiposDeMoneda[5] = new Sol();
        tiposDeMoneda[4] = new Rupia();
        tiposDeMoneda[3] = new Libra();
        tiposDeMoneda[2] = new Euro();
        tiposDeMoneda[1] = new Dolar();
        tiposDeMoneda[0] = new Bolivar();
        
        for(int i=0; i<tiposDeMoneda.length - 1;i++){
            tiposDeMoneda[i].setSucesor(tiposDeMoneda[i+1]); ;
        }
        
        return tiposDeMoneda[0].Convertir(moneda, valor);
        
    }
    
}
