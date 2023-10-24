package H__Polimorfismo_Ex03;

import G__Heranca_Ex02.*;

public class JuridicoDAO extends ClienteDAO{
    public String mostraDadosCli(JuridicoDTO juridicoDTO){
        return super.mostraDadosCli(juridicoDTO) +
                "\nO CNPJ é: "+juridicoDTO.getCnpj()+
                "\nO ie é: "+juridicoDTO.getIe();
    }
    
}
