package F__Encapsulamento_Ex08;
import javax.swing.JOptionPane;
public class OrdVIEW {
    public static void main(String args[]){
        try{
            OrdDTO ordDTO = new OrdDTO();
            OrdCTR ordCTR =   new OrdCTR();     
                ordDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o n1: ")));
                ordDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o n2: ")));
                ordDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o n3: ")));
                
                JOptionPane.showMessageDialog(null, ordCTR.ordena(ordDTO));
                
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+e.getMessage());
        }
    }

    
}
