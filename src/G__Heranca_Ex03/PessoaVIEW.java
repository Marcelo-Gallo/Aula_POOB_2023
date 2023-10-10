package G__Heranca_Ex03;
import javax.swing.JOptionPane;
public class PessoaVIEW {
    public static void main(String[] args){
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        FuncionarioCTR funcionarioCTR = new FuncionarioCTR();

        funcionarioDTO.setNome(JOptionPane.showInputDialog("Informe o Nome: "));
        funcionarioDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe o Idade: ")));
        funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe o Telefone: "));
        funcionarioDTO.setSiape(JOptionPane.showInputDialog("Informe o Siape: "));
        funcionarioDTO.setFuncao(JOptionPane.showInputDialog("Informe a Funçao: "));
        funcionarioDTO.setEndereco(JOptionPane.showInputDialog("Informe o Endereço: "));
        
        JOptionPane.showMessageDialog(null, funcionarioCTR.mostraDadosFunc(funcionarioDTO));
        
        AlunoDTO alunoDTO = new AlunoDTO();
        AlunoCTR alunoCTR = new AlunoCTR();
        
        alunoDTO.setNome(JOptionPane.showInputDialog("Informe o Nome: "));
        alunoDTO.setCurso(JOptionPane.showInputDialog("Informe o Curso: "));
        alunoDTO.setEndereco(JOptionPane.showInputDialog("Informe o Endereço: "));
        alunoDTO.setProntuario(JOptionPane.showInputDialog("Informe o Prontuario: "));
        alunoDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe o Idade: ")));
        alunoDTO.setTelefone(JOptionPane.showInputDialog("Informe o Telefone: "));
        
        JOptionPane.showMessageDialog(null, alunoCTR.mostraDadosAluno(alunoDTO));
        
    }
    
}
