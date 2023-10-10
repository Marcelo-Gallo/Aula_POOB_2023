package G__Heranca_Ex02;

public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    public String mostraDadosJuri(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostraDadosJuri(juridicoDTO);
    }
}
