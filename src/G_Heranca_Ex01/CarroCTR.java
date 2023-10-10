package G_Heranca_Ex01;

public class CarroCTR{
    CarroDAO carroDAO = new CarroDAO();
    public String imprimirDadosCarro(CarroDTO carroDTO){
        return carroDAO.imprimirDadosCArro(carroDTO);
    }
}
