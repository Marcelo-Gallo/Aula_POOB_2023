package F__Encapsulamento_Ex03;

public class MotoristaDAO {
    
    public String verifica(MotoristaDTO motoristaDTO){

        if(motoristaDTO.getIdade()>=18){
             return "O motorista está habilitado a ter CNH";
        }
        else{
            return  "O motorista não está habilitado a ter CNH";}
        
    }
    
}
