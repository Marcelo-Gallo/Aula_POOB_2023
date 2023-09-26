package F__Encapsulamento_Ex07;

public class NumsDAO {
private int n1, n2, n3, n4;
private String retorno = " ";

    public String recebe(NumsDTO numsDTO){
        this.n1 = numsDTO.getN1();
        this.n2 = numsDTO.getN2();
        this.n3 = numsDTO.getN3();
        this.n4 = numsDTO.getN4();
        
        
        if(this.n4<this.n3 && this.n4>this.n2){
           this.retorno = "A ordem decrescente é: " + this.n3+" "+this.n4+" "+this.n2+" "+this.n1;
        }
        else if(this.n4<this.n2 && this.n4>this.n1){
            this.retorno = "A ordem descrescente é: " + this.n3+" "+this.n2+" "+this.n4+" "+this.n1;
        }
        else if(this.n4<this.n1){
            this.retorno = "A ordem descrescente é: "+ this.n3+" "+this.n2+" "+this.n1+" "+this.n4;
        }
        else{
            this.retorno = "A ordem descrescente é: "+this.n4+" "+this.n3+" "+this.n2+" "+this.n1;
        }
        return this.retorno;
    }
    
}
