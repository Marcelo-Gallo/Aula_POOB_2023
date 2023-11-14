package K__Matriz_Ex03;
import javax.swing.JOptionPane;
public class MediaVIEW {
    public static void main(String[] args){
        MediaDTO mediaDTO = new MediaDTO();
        MediaCTR mediaCTR = new MediaCTR();
        
        double aux[][] = new double[2][6];
        
        for(int linha = 0; linha <2; linha++){
            for(int coluna = 0; coluna <5; coluna++){
        aux[linha][coluna] = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                "Informe o " +(linha+1)+ "º aluno no modelo: [R.A] [n1] [n2] [n3] [n4]"));
            }
            
        }
        mediaDTO.setMatriz(aux);
        JOptionPane.showMessageDialog(null, mediaCTR.mostraMatriz(mediaDTO));
    }
}
