package C__Ex03_Soma;

import javax.swing.JOptionPane;
public class PrincipalSoma {
    public static void main(String args[]){
        
        Soma soma = new Soma();
        
        for(int i=1; i<=10; i++){
           soma.calculo(
                   Integer.parseInt(JOptionPane.showInputDialog("Informe o "+ i +"º número: "))
           );
        }
        
        JOptionPane.showMessageDialog(null, soma.imprimir());
    }
    
}
