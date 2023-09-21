package F__Encapsulamento_Ex04;
import javax.swing.JOptionPane;
public class NotaVIEW {
    public static void main(String args[]){
        try{
            NotaDTO notaDTO = new NotaDTO();
            NotaCTR notaCTR = new NotaCTR();
            
            notaDTO.setNota1(Integer.parseInt(JOptionPane.showInputDialog("Informe a nota 1: ")));
            notaDTO.setNota2(Integer.parseInt(JOptionPane.showInputDialog("Informe a nota 2: ")));
            
            JOptionPane.showMessageDialog(null, notaCTR.calc(notaDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+ e.getMessage() );
        }
    }
    
}
