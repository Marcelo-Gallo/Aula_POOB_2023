package F__Encapsulamento_Ex09;

public class ClassDAO {
    private String nome, classificacao;
    private double altura, peso;
    public String classifica(ClassDTO classDTO){
        this.nome=classDTO.getNome();
        this.altura=classDTO.getAltura();
        this.peso=classDTO.getPeso();
        
        if(this.altura<1.20 && this.peso<=60){
            this.classificacao = this.nome+" possui a classificação: A";
        }
        else if(this.altura>=1.20 && this.altura<=1.70 && this.peso<=60){
            this.classificacao = this.nome+" possui a classificação: B";
        }
        else if(this.altura>1.70 && this.peso<=60){
            this.classificacao = this.nome+" possui a classificação: C";
        }
        else if(this.altura<1.20 && this.peso>60 && this.peso<=90){
            this.classificacao = this.nome+" possui a classificação: D";
        }
        else if(this.altura>=1.20 && this.altura<=1.70 && this.peso>60 && this.peso<=90){
            this.classificacao = this.nome+" possui a classificação: E";
        }
        else if(this.altura>1.70 && this.peso>60 && this.peso<=90){
            this.classificacao = this.nome+" possui a classificação: F";
        }
        else if(this.altura < 1.20 && this.peso >90){
            this.classificacao = this.nome+" possui a classificação: G";
        }
        else if(this.altura>=1.20 && this.altura<=1.70 && this.peso >90){
            this.classificacao = this.nome+" possui a classificação: H";
        }
        else if(this.altura>1.70 && this.peso >90){
            this.classificacao = this.nome+" possui a classificação: I";
        }
        
        return classificacao;
        
    }
    
}
