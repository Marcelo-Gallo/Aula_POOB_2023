package G__Heranca_Ex02;

public class JuridicoDAO extends ClienteDAO{
    public String mostraDadosJuri(JuridicoDTO juridicoDTO){
        return mostraDadosCli(juridicoDTO) +
                "\nO CNPJ é: "+juridicoDTO.getCnpj()+
                "\nO ie é: "+juridicoDTO.getIe();
    }
    
}
