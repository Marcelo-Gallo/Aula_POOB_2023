package F__Encapsulamento_Ex04;

public class NotaCTR {
    NotaDAO notaDAO = new NotaDAO();
    
    public String calc(NotaDTO notaDTO){
        return notaDAO.calc(notaDTO);
    }
    
}
