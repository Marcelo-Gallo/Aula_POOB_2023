package G__Heranca_Ex02;



public class ClienteDAO {
    public String mostraDadosCli(ClienteDTO clienteDTO){
        return "O nome é: "+clienteDTO.getNome()
                +"\nO endereço é: "+clienteDTO.getEndereco()
                +"\nO numero é: "+clienteDTO.getNumero()
                +"\nA cidade é: "+clienteDTO.getCidade()
                +"\nO estado é: "+clienteDTO.getEstado();
    }
    
}
