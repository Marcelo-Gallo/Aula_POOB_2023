package F__Encapsulamento_Ex06;

public class TrianguloCTR {
    TrianguloDAO trianguloDAO = new TrianguloDAO();
    
    public String verifica(TrianguloDTO trianguloDTO){
        return trianguloDAO.verifica(trianguloDTO);
    }
    
}
