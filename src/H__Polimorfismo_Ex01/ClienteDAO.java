package H__Polimorfismo_Ex01;

public class ClienteDAO {
    
    public String mostrarInformações(ClienteDTO clienteDTO){
        return "O nome informado foi: "+clienteDTO.getNome()+
                "\nO RG informado foi: "+clienteDTO.getRg()+
                verifica(clienteDTO.getIdade())+
                verifica(clienteDTO.getAltura());
    }
    
    public String verifica(int idade){
        if(idade>18){
            return "\nIdade maior que 18 anos, pode entrar no brinquedo!";
        }
        else{
            return "\nIdade menor que 18 anos, não pode entrar no brinquedo!";
        }
    }
    
    public String verifica(double altura){
        if(altura>1.50){
            return "\nAltura maior que 1.50, pode entrar no brinquedo!";
        }
        else{
            return "nAltura menor que 1.50, não pode entrar no brinquedo!";
        }
    }
    
}
