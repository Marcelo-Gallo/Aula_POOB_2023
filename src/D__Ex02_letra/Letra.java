package D__Ex02_letra;

public class Letra {
    private String letra;
    private int qnt;
    
    public void verificar(String letra){
        this.letra = letra;
        if(this.letra.equalsIgnoreCase("x")){
            this.qnt++;
        }
    }
    
    public int mostra(){
        return this.qnt;
    }
    
}
