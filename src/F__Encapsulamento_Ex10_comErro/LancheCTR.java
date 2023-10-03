package F__Encapsulamento_Ex10_comErro;

public class LancheCTR {
    LancheDAO lancheDAO = new LancheDAO();
    
    public String sistema(LancheDTO lancheDTO){
        return lancheDAO.sistema(lancheDTO);
    }
    
}
