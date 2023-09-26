package F__Encapsulamento_Ex05;

public class SoloCTR {
    SoloDAO soloDAO = new SoloDAO();
    
    public String verifica(SoloDTO soloDTO){
        return soloDAO.verifica(soloDTO);
    }
    
}
