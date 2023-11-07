package J__Vetor_Ex03;
import J__Vetor_Ex04.MultCTR;
import J__Vetor_Ex04.MultDTO;
import javax.swing.JOptionPane;
public class MultVIEW {
    public static void main(String[] args){
        MultCTR multCTR = new MultCTR();
        MultDTO multDTO = new MultDTO();
        
        int aux[] = new int[20];
        int aux2[] = new int[20];
        
        for(int i = 0; i<20; i++){
            aux[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para a posição "+ i +" do vetor"));
        }
        multDTO.setVet1(aux);
        
        for(int i = 0; i<20; i++){
            aux2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para a posição "+ i +" do vetor 2"));
        }
        multDTO.setVet2(aux2);
        
        JOptionPane.showMessageDialog(null, multCTR.multVet(multDTO));
        
    }
}
