package G__Heranca_Pratica1;

public class ClienteDAO {
    
    public String ImprimirDadosCliente(ClienteDTO clienteDTO){
        return "\nO nome é: "+clienteDTO.getNome()
                +"\nO endereço é: "+clienteDTO.getEndereco()
                +"\nO numero é: "+clienteDTO.getNumero()
                +"\nA cidade é: "+clienteDTO.getCidade()
                +"\nO estado é: "+clienteDTO.getEstado();
    }
}
