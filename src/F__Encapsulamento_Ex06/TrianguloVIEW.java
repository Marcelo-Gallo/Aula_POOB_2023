package F__Encapsulamento_Ex06;
import javax.swing.JOptionPane;
public class TrianguloVIEW {
    public static void main(String args[]){
        try{
            TrianguloDTO trianguloDTO = new TrianguloDTO();
            TrianguloCTR trianguloCTR = new TrianguloCTR();
                trianguloDTO.setA(Integer.parseInt(JOptionPane.showInputDialog("Informe o Lado A: ")));
                trianguloDTO.setB(Integer.parseInt(JOptionPane.showInputDialog("Informe o Lado B: ")));
                trianguloDTO.setC(Integer.parseInt(JOptionPane.showInputDialog("Informe o Lado C: ")));
                
                JOptionPane.showMessageDialog(null, trianguloCTR.verifica(trianguloDTO));
                
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
