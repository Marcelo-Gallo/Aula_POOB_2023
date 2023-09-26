package F__Encapsulamento_Ex07;
import javax.swing.JOptionPane;
public class NumsVIEW {
    public static void main(String args[]){
        try{
            NumsDTO numsDTO = new NumsDTO();
            NumsCTR numsCTR = new NumsCTR();
                numsDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o N1: ")));
                numsDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o N2: ")));
                numsDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o N3: ")));
                numsDTO.setN4(Integer.parseInt(JOptionPane.showInputDialog("Informe o N4: ")));
                
                JOptionPane.showMessageDialog(null, numsCTR.recebe(numsDTO));
                
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema"+e.getMessage());
        }
    }  
}
