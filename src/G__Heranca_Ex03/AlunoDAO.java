package G__Heranca_Ex03;

public class AlunoDAO extends PessoaDAO{
    public String mostraDadosAluno(AlunoDTO alunoDTO){
        return mostraDadosPessoa(alunoDTO)+
                "\nO prontuario é: "+alunoDTO.getProntuario()+
                "\nO cursó é: "+alunoDTO.getCurso();
    }
}
