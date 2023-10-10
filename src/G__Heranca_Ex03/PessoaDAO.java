package G__Heranca_Ex03;

public class PessoaDAO {

    public String mostraDadosPessoa(PessoaDTO pessoaDTO){
        return "O nome é: "+pessoaDTO.getNome()
                +"\nO telefone é: "+pessoaDTO.getTelefone()
                +"\nO endereço é: "+pessoaDTO.getEndereco()
                +"\nA idade é: "+pessoaDTO.getIdade();
}
    
}

