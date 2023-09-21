package D__Ex06_Canais;

public class Pesquisa {
    private int c9, c12, c23, c40, outros, canal;
    private String resp;
    
    public void computa(int canal){
        this.canal = canal;
        
        if(this.canal==9){
            this.c9++;
        }
        else if(this.canal==12){
            this.c12++;
        }
        else if(this.canal==23){
            this.c23++;   
        }
        else if(this.canal==40){
            this.c40++;
        }
        else if(this.canal!=0){
            this.outros++;
        }
    }

    public String mostrar(){
        this.resp = "Canal 9: "+this.c9+""
            + "\nCanal 12: "+this.c12+""
            + "\nCanal 23: "+this.c23+""
            + "\nCanal 40: "+this.c40+""
            + "\nOutros canais: "+this.outros;
        return this.resp;
    }
}