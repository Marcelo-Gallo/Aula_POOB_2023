package F__Encapsulamento_Ex08;

public class OrdDAO {
    
    private int n1, n2, n3;
    private String retorno = " ";
    
    public String ordena(OrdDTO ordDTO){
        int temp;
        this.n1 = ordDTO.getN1();
        this.n2 = ordDTO.getN2();
        this.n3 = ordDTO.getN3();
        
        /* REFAZ ISSO SEU VACALO CALANGO
        if(this.n1>this.n2){
            temp = this.n1;
            this.n1 = this.n2;
            this.n2 = temp;
        }
        if(this.n2>this.n3){
            temp = this.n2;
            this.n2 = this.n3;
            this.n3=temp;
        }
        
        if(this.n3>this.n2){
            temp = this.n3;
            this.n3 = this.n2;
            this.n2=temp;
        }
        */
        this.retorno = "A ordem crescente é: "+this.n1+" "+this.n2+" "+this.n3;
        return retorno;
    }
    
}
