package J__Vetor_Ex03;

import J__Vetor_Ex04.MultDAO;
import J__Vetor_Ex04.MultDTO;

public class MultCTR {
    MultDAO multDAO = new MultDAO();
    public String multVet(MultDTO multDTO){
        return multDAO.multVet(multDTO);
    }
}
