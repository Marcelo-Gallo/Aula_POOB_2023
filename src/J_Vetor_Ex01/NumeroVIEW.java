package J_Vetor_Ex01;
import javax.swing.JOptionPane;
public class NumeroVIEW {
    public static void main(String[] args){
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        
        int num[] = new int[5]; //vetor auxiliar, vou passar ele inteiro para o vetor que é trabalhado na DAO
        
        for(int i=0; i<5; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero para a posição "+i+" do vetor."));
        }
        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.veridicarPosicao(numeroDTO));
        
    }
    
}
