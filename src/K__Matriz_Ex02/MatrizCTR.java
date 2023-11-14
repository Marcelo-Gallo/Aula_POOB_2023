package K__Matriz_Ex02;
public class MatrizCTR {
    MatrizDAO matrizDAO = new MatrizDAO();
    public String mostraMatriz(MatrizDTO matrizDTO){ //criei esse método aqui
        return matrizDAO.mostraMatriz(matrizDTO); //usei esse da dao, mesmo nome pra facilitar
    }
    public String mostraPrincipal(MatrizDTO matrizDTO){
        return matrizDAO.mostraPrincipal(matrizDTO);
    }
}
