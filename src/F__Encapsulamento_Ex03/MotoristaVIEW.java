package F__Encapsulamento_Ex03;
import javax.swing.JOptionPane;
public class MotoristaVIEW {
    public static void main(String args[]){
        try{
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();
            
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do motorista: ")));
            
            JOptionPane.showMessageDialog(null, motoristaCTR.verifica(motoristaDTO));    
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage() );
        }
    }
}
