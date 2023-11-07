package J__Vetor_Ex02;
import javax.swing.JOptionPane;
public class VetorVIEW {
    public static void main(String[] args){
        VetorCTR vetorCTR = new VetorCTR();
        VetorDTO vetorDTO = new VetorDTO();
        
        int aux[] = new int[20];
        
        for(int i=0; i<20; i++){
            aux[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para a posição "+ i +" do vetor"));
        }
        vetorDTO.setVet(aux);
        JOptionPane.showMessageDialog(null, vetorCTR.inverteVetor(vetorDTO));
    }
}
