package J__Vetor_Ex02;
public class VetorCTR {
    VetorDAO vetorDAO = new VetorDAO();
    public String inverteVetor(VetorDTO VetorDTO){
        return vetorDAO.inverteVetor(VetorDTO);
    }
}
