package F__Encapsulamento_Ex03;

public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String verifica(MotoristaDTO motoristaDTO){
        return motoristaDAO.verifica(motoristaDTO);
    }
    
}
