package D__Ex05_LetrasSaidaZero;

import javax.swing.JOptionPane;
public class PrincipalSistema {
    public static void main(String[] args){
        String letra="";
        Sistema sistema = new Sistema();
        
        while(!letra.equalsIgnoreCase("0")){
            letra = JOptionPane.showInputDialog("Informe uma letra: ");
            sistema.verificar(letra);
        }
        JOptionPane.showMessageDialog(null, sistema.mostra());
    }
}
