package H__Polimorfismo_Ex01;

public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    public String mostrarInformacoes(ClienteDTO clienteDTO){
        return clienteDAO.mostrarInformações(clienteDTO);
    }
}
