package F__Encapsulamento_Ex10_comErro;
import javax.swing.JOptionPane;
public class LancheVIEW {

    public static void main(String args[]){
        try{
            
            
            LancheDTO lancheDTO = new LancheDTO();
            LancheCTR lancheCTR = new LancheCTR();
            
            do{
                lancheDTO.setCod(JOptionPane.showInputDialog(
                                    "=================="+
                                    "\n1 - Hamburguer: $1,50"+
                                    "\n2 - CheeseBurguer: $1,80"+
                                    "\n3 - Misto quente: $1,20"+
                                    "\n4 - Americano: $2,00"+
                                    "\n5 - Queijo Prato: $1,00"+
                                    "\n==================\n"));
            }while(!lancheDTO.getCod().equals("0"));
            
            JOptionPane.showMessageDialog(null, lancheCTR.sistema(lancheDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+e.getMessage());
        }
    }
}
