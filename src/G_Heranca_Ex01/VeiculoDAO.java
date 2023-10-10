package G_Heranca_Ex01;

public class VeiculoDAO {
    public String imprimirDadosVeiculo(VeiculoDTO veiculoDTO){
        return "A placa é: "+ veiculoDTO.getPlaca() +
                "\nA cor é: "+veiculoDTO.getCor();
    }
}
