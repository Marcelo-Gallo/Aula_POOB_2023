package D__Ex02_letra;

import javax.swing.JOptionPane;
public class PrincipalLetra {
    public static void main(String[] args){
        String varLetra="x";
        
        Letra letra = new Letra();
        
        while(varLetra.equalsIgnoreCase("x")){
            varLetra = JOptionPane.showInputDialog("Informe a letra: ");
            letra.verificar(varLetra);
        }
        JOptionPane.showMessageDialog(null, "A quantidade de vezes tecladas foi: "+ letra.mostra());
    }
    
}
