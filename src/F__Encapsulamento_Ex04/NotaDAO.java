package F__Encapsulamento_Ex04;

public class NotaDAO {
    
    private double media = 0;
    private String mensagem = "";
    
    public String calc(NotaDTO notaDTO){
        
        this.media = (notaDTO.getNota1()+notaDTO.getNota2())/2;
        
        if (this.media>=7){
            this.mensagem = "O aluno esta aprovado com média "+this.media+"!!";
        }
        else if(this.media<=4){
            this.mensagem = "O aluno esta de recuperação com média "+this.media+"!!";
        }
        else{
            this.mensagem = "O aluno esta reprovado com média "+this.media+"!!";
        }
        return this.mensagem;
    }
    
}
