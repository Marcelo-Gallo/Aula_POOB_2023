package H__Polimorfismo_ExPratica;

public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    public String mostraDadosCli(FisicoDTO fisicoDTO){
        return fisicoDAO.mostraDadosCli(fisicoDTO);
    }
}
