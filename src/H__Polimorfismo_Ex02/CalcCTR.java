package H__Polimorfismo_Ex02;

public class CalcCTR {
    CalcDAO calcDAO = new CalcDAO();
    public String imprimir(CalcDTO calcDTO){
        return calcDAO.imprimir(calcDTO);
    }
}
