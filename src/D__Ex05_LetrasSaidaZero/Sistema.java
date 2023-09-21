package D__Ex05_LetrasSaidaZero;


public class Sistema {
    private int A, E, I, O, U, Cons;
    private String letra, resp;
    
    
    public void verificar(String letra){
        this.letra = letra;
        
        if(this.letra.equalsIgnoreCase("A")){
            this.A++;
        }
        else if(this.letra.equalsIgnoreCase("E")){
            this.E++;
        }
        else if(this.letra.equalsIgnoreCase("I")){
            this.I++;
        }
        else if(this.letra.equalsIgnoreCase("O")){
            this.O++;
        }
        else if(this.letra.equalsIgnoreCase("U")){
            this.U++;
        }
        else if(!this.letra.equalsIgnoreCase("0")){
            this.Cons++;
        }        
    }
    
    public String mostra(){
        this.resp = "A foi digitado: "+this.A+" vezes."
                + " \nE foi digitado: "+this.E+" vezes."
                + " \nI foi digitado: "+this.I+" vezes."
                + " \nO foi digitado: "+this.O+" vezes."
                + " \nU foi digitado: "+this.U+" vezes."
                + " \nForam digitadas "+this.Cons+" consoantes.";
        return this.resp;
    }
    
}
