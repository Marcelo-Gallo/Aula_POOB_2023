package G_Heranca_Ex01;

public class MotoDAO extends VeiculoDAO {
    public String imprimirDadosMoto(MotoDTO motoDTO){
        return imprimirDadosVeiculo(motoDTO)+
                "\nA cilindrada é: "+motoDTO.getCilindadrada()+
                "\nO tipo do motor é: "+motoDTO.getTipo_motor();
    }
}
