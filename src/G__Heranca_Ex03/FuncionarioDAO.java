package G__Heranca_Ex03;

public class FuncionarioDAO extends PessoaDAO {
    public String mostraDadosFunc(FuncionarioDTO funcionarioDTO){
        return mostraDadosPessoa(funcionarioDTO)+
                "\nO Siape é: "+funcionarioDTO.getSiape()+
                "\nA função é: "+funcionarioDTO.getFuncao()+
                "\n "+this.calc(funcionarioDTO);
        
    }
    private String calc(PessoaDTO pessoaDTO){
        int apos;
        
        apos = (60-pessoaDTO.getIdade());
        
        if(apos<=0){
            return "Já pode se aposentar!";
        }
        else{
            return "A idade até se aposentar é: "+Integer.toString(apos);
        }
        
    }
    
}
