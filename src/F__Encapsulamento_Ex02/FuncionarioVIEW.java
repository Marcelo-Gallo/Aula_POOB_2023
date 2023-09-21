package F__Encapsulamento_Ex02;
import javax.swing.JOptionPane;
public class FuncionarioVIEW {
    public static void main (String args[]){
        try{
            FuncionarioDTO  funcionarioDTO = new FuncionarioDTO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
            
            funcionarioDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ")));
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
            
            JOptionPane.showMessageDialog(null, funcionarioCTR.imprimir(funcionarioDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+e.getMessage() );
        }
    }
}
