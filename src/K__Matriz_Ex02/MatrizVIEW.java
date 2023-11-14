package K__Matriz_Ex02;
import javax.swing.JOptionPane;
import java.util.Random;
public class MatrizVIEW {
    public static void main(String[] args){
        Random random = new Random();
        MatrizDTO matrizDTO = new MatrizDTO();
        MatrizCTR matrizCTR = new MatrizCTR();
        int aux[][] = new int[20][20];
        
        for(int linha = 0; linha<20; linha++){
            for(int coluna = 0; coluna<20; coluna++){
//                aux[linha][coluna] = Integer.parseInt(
//                        JOptionPane.showInputDialog(
//                                "Informe o numero da linha: "+linha+" Coluna: "+coluna));
                    aux[linha][coluna] = random.nextInt(9);
            }
        }
        
        
        
        matrizDTO.setMatriz(aux);
        JOptionPane.showMessageDialog(null, matrizCTR.mostraMatriz(matrizDTO));
        JOptionPane.showMessageDialog(null, matrizCTR.mostraPrincipal(matrizDTO));
        
    }
}
