package J__Vetor_Ex04;
public class MultDAO {
    private String resp = "";
    
    public String multVet(MultDTO multDTO){
        int Vet1[] = multDTO.getVet1();
        int Vet2[] = multDTO.getVet2();
        int VetR[] = multDTO.getVetR();
        
        for(int i=0; i<20; i++){
            VetR[i] = (Vet1[i] * Vet2[i]);
        }
        
        for(int i=0; i<20; i++){
            this.resp += VetR[i]+ "   ";
        }
        return this.resp;
    }
    
    public String subVet(MultDTO multDTO){
        int Vet1[] = multDTO.getVet1();
        int Vet2[] = multDTO.getVet2();
        int VetR[] = multDTO.getVetR();
        
        for(int i=0; i<20; i++){
            VetR[i] = (Vet1[i] - Vet2[i]);
        }
        
        for(int i=0; i<20; i++){
            this.resp += VetR[i]+ "   ";
        }
        return this.resp;
        
    }
    
    public String somaVet(MultDTO multDTO){
        int Vet1[] = multDTO.getVet1();
        int Vet2[] = multDTO.getVet2();
        int VetR[] = multDTO.getVetR();
        
        for(int i=0; i<20; i++){
            VetR[i] = (Vet1[i] + Vet2[i]);
        }
        
        for(int i=0; i<20; i++){
            this.resp += VetR[i]+ "   ";
        }
        return this.resp;
        
    }
    
    public String divVet(MultDTO multDTO){
        int Vet1[] = multDTO.getVet1();
        int Vet2[] = multDTO.getVet2();
        int VetR[] = multDTO.getVetR();
        
        for(int i=0; i<20; i++){
            VetR[i] = (Vet1[i] / Vet2[i]);
        }
        
        for(int i=0; i<20; i++){
            this.resp += VetR[i]+ "   ";
        }
        return this.resp;
        
    }
    
}
