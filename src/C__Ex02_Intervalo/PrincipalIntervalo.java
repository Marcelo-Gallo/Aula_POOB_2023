package C__Ex02_Intervalo;

import javax.swing.JOptionPane;
public class PrincipalIntervalo {
    
    public static void main(String args[]){
        Intervalo intervalo = new Intervalo();
            
        JOptionPane.showMessageDialog(null,
                intervalo.mostrarIntervalo(
                        Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")),
                        Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "))
                ));
    }//fecha main
}//fecha classe
