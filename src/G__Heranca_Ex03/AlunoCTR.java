package G__Heranca_Ex03;

public class AlunoCTR {
    AlunoDAO alunoDAO = new AlunoDAO();
        public String mostraDadosAluno(AlunoDTO alunoDTO){
            return alunoDAO.mostraDadosAluno(alunoDTO);
        }
}
