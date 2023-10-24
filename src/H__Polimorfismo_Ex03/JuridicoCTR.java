package H__Polimorfismo_Ex03;

import G__Heranca_Ex02.*;

public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    public String mostraDadosCli(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostraDadosCli(juridicoDTO);
    }
}
