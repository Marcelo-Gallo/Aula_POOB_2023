package G__Heranca_Ex02;

public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    public String mostraDadosFis(FisicoDTO fisicoDTO){
        return fisicoDAO.mostraDadosfis(fisicoDTO);
    }
}
