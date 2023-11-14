package K__Matriz_Ex02;

public class MatrizDAO {
    String resp = "A Matriz é: ";
    public String mostraMatriz(MatrizDTO matrizDTO){
        this.resp += "\n";
        int matAux[][] = matrizDTO.getMatriz();
        for(int linha = 0; linha <20; linha++){
            for(int coluna = 0; coluna <20; coluna++){
                this.resp += matAux[linha][coluna]+"   ";
            }
            this.resp += "\n";
        }
        return this.resp;
    }
    public String mostraPrincipal(MatrizDTO matrizDTO){
        this.resp = "A diagonal principal é: ";
        this.resp += "\n";
        int matAux[][] = matrizDTO.getMatriz();
        for(int linha = 0; linha <20; linha++){
            for(int coluna = 0; coluna <20; coluna++){
                if(linha == coluna){
                    this.resp += "[" + matAux[linha][coluna] + "]";
                }
            }
        }
        return this.resp;
    }
}
