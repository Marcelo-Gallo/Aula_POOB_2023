package H__Polimorfismo_ExPratica;

public class ClienteDAO {
    public String mostraDadosCli(ClienteDTO clienteDTO){
        return "\nO nome é: "+clienteDTO.getNome()+
                "\nO endereço é: "+clienteDTO.getEndereco()+
                "\nO numero é: "+clienteDTO.getNumero()+
                "\nA cidade é: "+clienteDTO.getCidade()+
                "\nO estado é: "+clienteDTO.getEstado();
    }
}
