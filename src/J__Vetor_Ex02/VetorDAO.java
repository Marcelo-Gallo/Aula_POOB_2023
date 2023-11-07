package J__Vetor_Ex02;

public class VetorDAO {
    private String resposta= "";
    public String inverteVetor(VetorDTO vetorDTO){
        int vet[] = vetorDTO.getVet();
        
        for(int i=19; i>=0; i--){
            this.resposta += vet[i] + "\n";
        }
        return resposta;
        
    }
}
