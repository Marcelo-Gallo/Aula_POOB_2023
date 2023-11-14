package K__Matriz_Ex03;
public class MediaDAO {
    String resp = "Alunos Registrados: ";
    double media;
    
    public void calculaMatriz(MediaDTO mediaDTO){
        double matAux[][] = mediaDTO.getMatriz();
        for(int linha = 0; linha <2; linha++){
            for(int coluna = 0; coluna <6; coluna++){
                if(coluna>0 && coluna<6){
                    this.media += matAux[linha][coluna];
                }
                    
            }
            this.media = (this.media/4);
            matAux[linha][5] = this.media;
            this.media = 0;
        }
    
}
    
    public String mostraMatriz(MediaDTO mediaDTO){
        this.calculaMatriz(mediaDTO);
        this.resp += "\n";
        double matAux[][] = mediaDTO.getMatriz();
                
        for(int linha = 0; linha <2; linha++){
            for(int coluna = 0; coluna <6; coluna++){
                this.resp += "[" + matAux[linha][coluna]+"]"+"   ";
            }
            this.resp += "\n";
        }
        return this.resp;
    }
}
