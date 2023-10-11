package G__Heranca_Pratica1;

public class FisicoDAO extends ClienteDAO{
    public String ImprimirDadosFisico(FisicoDTO fisicoDTO){
        return ImprimirDadosCliente(fisicoDTO)
                +"\nO CPF é: "+fisicoDTO.getCpf()
                +"\nO RG é: "+fisicoDTO.getRg();
                
    }
    
    
}
