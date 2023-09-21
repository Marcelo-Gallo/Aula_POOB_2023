package F_Encapsulamento_Ex01;

public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    //usar mesmo nome do método da ClienteDAO ajuda na chamada/organização;
    //nome em questão: "mostrarNomeRg && mostrarNomeIdade;
    public String mostrarNomeRg(ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeRg(clienteDTO);
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeIdade(clienteDTO);
    }
    
} //Fecha classe ClienteCTR
