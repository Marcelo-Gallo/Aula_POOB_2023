package H__Polimorfismo_Ex02;
import javax.swing.JOptionPane;
public class CalcVIEW {
    public static void main(String[] args){
        CalcDTO calcDTO = new CalcDTO();
        CalcCTR calcCTR = new CalcCTR();
        
        calcDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Informe a N1: ")));
        calcDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Informe a N2: ")));
        calcDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Informe a N3: ")));
        calcDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Informe a N4: ")));
        
        JOptionPane.showMessageDialog(null, calcCTR.imprimir(calcDTO));
        
    }
}
