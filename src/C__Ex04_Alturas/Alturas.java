package C__Ex04_Alturas;
/*=======================================================*/
public class Alturas {
    private int soma;
    private int altura;
    private int contador;
    private double media;
    
    /*=======================================================*/
    public void SomaVerifica(int altura){
    this.altura=altura;
    
    if(this.altura>200){
        this.contador++;
    }
    this.soma+=this.altura;
    this.media(this.soma);
}
    /*=======================================================*/
    public void media(int soma){
        //this.soma = soma;
        this.media = this.soma / 20;
        
        this.mostrar(this.media);
    }
    /*=======================================================*/
    public String mostrar(double media){
        return "A média é: " + this.media +"centimetros.\n"+
                "A quantidade de pessoas com mais de 2 metros é: "+this.contador;
    }
   /*=======================================================*/ 
}
