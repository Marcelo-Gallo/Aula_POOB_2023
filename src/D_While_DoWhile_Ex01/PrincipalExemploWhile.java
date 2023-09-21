package D_While_DoWhile_Ex01;

import javax.swing.JOptionPane;
public class PrincipalExemploWhile {
    
    public static void main(String[] Args){
        ExemploWhile exemplowhile = new ExemploWhile();
        int numero=1;
        
        while(numero != 0){
            numero = Integer.parseInt( 
                JOptionPane.showInputDialog("Informe o número"));
            exemplowhile.somar(numero);
                    
        }
        JOptionPane.showMessageDialog(null, "A soma é: "+exemplowhile.mostra());
    }
    
}
