package H__Polimorfismo_ExPratica;

public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    public String mostraDadosCli(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostraDadosCli(juridicoDTO);
    }
}
