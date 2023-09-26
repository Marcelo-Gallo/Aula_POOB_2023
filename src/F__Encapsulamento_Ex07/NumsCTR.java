package F__Encapsulamento_Ex07;

public class NumsCTR {
    NumsDAO numsDAO = new NumsDAO();
    
    public String recebe(NumsDTO numsDTO){
        return numsDAO.recebe(numsDTO);
    }
    
}
