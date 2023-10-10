package G__Heranca_Ex03;

public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        public String mostraDadosFunc(FuncionarioDTO funcionarioDTO){
            return funcionarioDAO.mostraDadosFunc(funcionarioDTO);
        }
}
