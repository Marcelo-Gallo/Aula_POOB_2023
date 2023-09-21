package C__Ex05_Salario;

public class Salario {
    
    double salario;
    double novo_salario;
    double porcentagem;
    int ano;
    int anoAtual;
    
    public double ColetaDados(int anoAtual){
        this.salario=1000;
        this.porcentagem = 1.5;
        this.anoAtual = anoAtual;
        
        this.novo_salario=this.salario + (this.salario * porcentagem/100);
        
        for(int i=1997; i<=this.anoAtual; i++){
            this.porcentagem = this.porcentagem*2;
            this.novo_salario=this.novo_salario + (this.novo_salario * porcentagem/100);
        }
        
        return this.novo_salario;
    }
    
}
