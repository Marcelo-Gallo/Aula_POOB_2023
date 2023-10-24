package H__Polimorfismo_Ex03;

import G__Heranca_Ex02.*;

public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    public String mostraDadosCli(FisicoDTO fisicoDTO){
        return fisicoDAO.mostraDadosCli(fisicoDTO);
    }
}
