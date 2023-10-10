package G_Heranca_Ex01;

public class MotoCTR {
    MotoDAO motoDAO = new MotoDAO();
    public String imprimirDadosMoto(MotoDTO motoDTO){
        return motoDAO.imprimirDadosMoto(motoDTO);
    }
}
