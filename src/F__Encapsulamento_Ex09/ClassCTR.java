package F__Encapsulamento_Ex09;

public class ClassCTR {
    ClassDAO classDAO = new ClassDAO();
    
    public String classifica(ClassDTO classDTO){
        return classDAO.classifica(classDTO);
    }
    
}
