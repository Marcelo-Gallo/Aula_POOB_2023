package H__Polimorfismo_Ex02;

public class CalcDAO {
    
    public String imprimir(CalcDTO calcDTO){
        calcularMedia(calcDTO);
        return "A média é: "+calcDTO.getMedia();
    }
    


    public void calcularMedia(CalcDTO calcDTO){
        
        if(calcDTO.getOpc()==1){
            calcularMedia(calcDTO.getN1(), calcDTO.getN2(), calcDTO);

        }
        else if(calcDTO.getOpc() == 2){
            calcularMedia(calcDTO.getN1(), calcDTO.getN2(), calcDTO.getN3(), calcDTO);

        }
        else{
            calcularMedia(calcDTO.getN1(), calcDTO.getN2(), calcDTO.getN3(), calcDTO.getN4(), calcDTO);

        }
        
    }
    
    private void calcularMedia(double N1, double N2, CalcDTO calcDTO){
 
        calcDTO.setMedia((N1+N2)/2);
    }
    
    private void calcularMedia(double N1, double N2, double N3, CalcDTO calcDTO){

        calcDTO.setMedia((N1+N2+N3)/3);
    }
    
    private void calcularMedia(double N1, double N2, double N3, double N4, CalcDTO calcDTO){

        calcDTO.setMedia((N1+N2+N3+N4)/4);
    }
}   

