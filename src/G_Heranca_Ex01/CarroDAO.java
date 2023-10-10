package G_Heranca_Ex01;

public class CarroDAO extends VeiculoDAO {
    public String imprimirDadosCArro(CarroDTO carroDTO){
        return imprimirDadosVeiculo(carroDTO)+
                "\nA potencia é: "+carroDTO.getPotencia()+
                "\nA quantidade de portas é: "+carroDTO.getQnt_portas();
    }
}
