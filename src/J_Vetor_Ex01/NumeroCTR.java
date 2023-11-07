package J_Vetor_Ex01;

public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();
    public String veridicarPosicao(NumeroDTO numeroDTO){
        return numeroDAO.verificarPosicao(numeroDTO);
    }
}
