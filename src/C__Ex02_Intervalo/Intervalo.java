package C__Ex02_Intervalo;

public class Intervalo {
    
    private int numero1;
    private int numero2;
    private String imprimir = "";
    
    public String mostrarIntervalo(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        
        for(int i=numero1; i<=numero2; i++){
            this.imprimir = this.imprimir + " [" + i + "] ";
        }
        return this.imprimir;
    }
    
}
