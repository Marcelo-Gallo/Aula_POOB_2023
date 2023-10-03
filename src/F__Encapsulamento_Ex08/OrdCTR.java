package F__Encapsulamento_Ex08;

public class OrdCTR {
    OrdDAO ordDAO = new OrdDAO();
    
    public String ordena(OrdDTO ordDTO){
        return ordDAO.ordena(ordDTO);
    }
    
}
