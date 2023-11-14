package K_Matriz_Ex01;
public class MatrizDAO {
    String resposta = "";
    public String mostrarMatriz(MatrizDTO matrizDTO){
        int MatrizAux[][] = matrizDTO.getMatriz();
        for(int linha = 0; linha<2; linha++){
            for(int coluna = 0; coluna <3; coluna++){
                this.resposta += MatrizAux[linha][coluna]+"   ";
            }
            this.resposta += "\n"; //cada troca de linha, realmente quebra uma linha *estética*
        }
        return this.resposta;
    }
}
