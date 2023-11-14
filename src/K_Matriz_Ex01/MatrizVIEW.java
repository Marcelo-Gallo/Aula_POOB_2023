package K_Matriz_Ex01;
import javax.swing.JOptionPane;
public class MatrizVIEW {
    public static void main(String[] args){
        MatrizDTO matrizDTO = new MatrizDTO();
        MatrizCTR matrizCTR = new MatrizCTR();
        int aux[][] = new int [2][3];
        
        for(int linha = 0; linha<2; linha++){
            for(int coluna = 0; coluna<3; coluna++){
                aux[linha][coluna] = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Informe o numero da linha: "+linha+" Coluna: "+coluna));
            }
        }
        matrizDTO.setMatriz(aux);
        JOptionPane.showMessageDialog(null, matrizCTR.mostrarMatriz(matrizDTO));
    }
}
