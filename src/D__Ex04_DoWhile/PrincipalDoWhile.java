package D__Ex04_DoWhile;

import javax.swing.JOptionPane;
public class PrincipalDoWhile {
    public static void main(String[] args){
        int numero;
        DoWhile dowhile = new DoWhile();
        
        do{
            numero = Integer.parseInt(
            JOptionPane.showInputDialog("Informe o número: "));
            dowhile.somar(numero);
        }while(numero != 0);
        
        JOptionPane.showMessageDialog(null, "A soma é "+ dowhile.mostra());
    }
    
}
