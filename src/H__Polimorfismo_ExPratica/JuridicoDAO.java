package H__Polimorfismo_ExPratica;

public class JuridicoDAO extends ClienteDAO{
    public String mostraDadosCli(JuridicoDTO juridicoDTO){
        return super.mostraDadosCli(juridicoDTO) +
                "\nA CNPJ é: "+juridicoDTO.getCNPJ()+
                "\nA IE é: "+juridicoDTO.getIE();
    }
}
