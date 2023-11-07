package J__Vetor_Ex04;
public class MultCTR {
    MultDAO multDAO = new MultDAO();
    public String multVet(MultDTO multDTO){
        return multDAO.multVet(multDTO);
    }
    public String subVet(MultDTO multDTO){
        return multDAO.subVet(multDTO);
    }
    public String divVet(MultDTO multDTO){
        return multDAO.divVet(multDTO);
    }
    public String somaVet(MultDTO multDTO){
        return multDAO.somaVet(multDTO);
    }
    
}
