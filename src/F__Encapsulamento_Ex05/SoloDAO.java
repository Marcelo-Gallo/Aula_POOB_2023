package F__Encapsulamento_Ex05;

public class SoloDAO {
    
    private String mensagem = " ";
    private int pontos;
    
    public String verifica(SoloDTO soloDTO){
        this.pontos = soloDTO.getPontos();
        if(this.pontos <=10){
            this.mensagem = "Amostra Rochosa";
        }
        else if(this.pontos >10 && this.pontos<=40){
            this.mensagem = "Amostra Firme";
        }
        else if(this.pontos > 40 && this.pontos <=80){
            this.mensagem = "Amostra Pantanosa";
        }
        else{
            this.mensagem = "Quantidade Invalida";
        }
        return this.mensagem;
    }
}
