package C__Ex03_Soma;

public class Soma{
    
    private int numero;
    private int soma;
    
    public void calculo(int numero){
        this.numero = numero;
        this.soma += this.numero;
        
    }
    
    public String imprimir(){ //é string pq coloquei aqui e to retornando ela, se eu tivesse colocado a string na main eu deixava o método como retorno de int
        return "A soma é: " + this.soma;
    }
}