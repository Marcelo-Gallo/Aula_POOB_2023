package K_Matriz_Ex01;
public class MatrizCTR {
    MatrizDAO matrizDAO = new MatrizDAO();
    public String mostrarMatriz(MatrizDTO matrizDTO){
        return matrizDAO.mostrarMatriz(matrizDTO);
    }
}
