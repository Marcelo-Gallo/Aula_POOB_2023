package F__Encapsulamento_Ex09;
import javax.swing.JOptionPane;
public class ClassVIEW {
    
    public static void main(String Args[]){
        try{
            ClassDTO classDTO = new ClassDTO();
            ClassCTR classCTR = new ClassCTR();
            
            classDTO.setNome(JOptionPane.showInputDialog("Informe o nome da pessoa a ser classificada: "));
            classDTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")));
            classDTO.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: ")));

            
            JOptionPane.showMessageDialog(null, classCTR.classifica(classDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema"+ e.getMessage());
        }
    }
    
}
