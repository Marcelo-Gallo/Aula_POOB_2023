package G__Heranca_Ex02;

public class FisicoDAO extends ClienteDAO{
    public String mostraDadosfis(FisicoDTO fisicoDTO){
        return mostraDadosCli(fisicoDTO)+
                "\nO CPF é: "+fisicoDTO.getCpf()
                +"\nO RG é: "+fisicoDTO.getRg();
                
    }
    
}
