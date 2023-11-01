package H__Polimorfismo_ExPratica;

public class FisicoDAO extends ClienteDAO{
    
    public String mostraDadosCli(FisicoDTO fisicoDTO){
        return super.mostraDadosCli(fisicoDTO)+
                "\nO CPF é: "+fisicoDTO.getCPF()+
                "\nO RG é: "+fisicoDTO.getRG();
    }
    
}
