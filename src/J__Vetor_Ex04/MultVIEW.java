package J__Vetor_Ex04;
import javax.swing.JOptionPane;
public class MultVIEW {
    public static void main(String[] args){
        MultCTR multCTR = new MultCTR();
        MultDTO multDTO = new MultDTO();
        int opc;
        
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
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("Qual operação deseja fazer?"
                                                                    +"1-Soma"
                                                                    +"2-Subtração"
                                                                    +"3-Multiplicação"
                                                                    +"4-Divisão"
        ));
            
            switch(opc){
                    case 1:
                        JOptionPane.showMessageDialog(null, multCTR.somaVet(multDTO));
                        break;
                    case 2: 
                        JOptionPane.showMessageDialog(null, multCTR.subVet(multDTO));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, multCTR.multVet(multDTO));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, multCTR.divVet(multDTO));
                        break;
                        
            }
        
        
        
    }
}
