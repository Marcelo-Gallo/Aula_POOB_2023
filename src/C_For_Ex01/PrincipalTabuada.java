package C_For_Ex01;

import javax.swing.JOptionPane;

public class PrincipalTabuada {

    public static void main(String args[]) {
        Tabuada tabuada = new Tabuada();
        JOptionPane.showMessageDialog(null,
                tabuada.calcularTabuada(Integer.parseInt(
                        JOptionPane.showInputDialog("Informe o número para calcular a tabuada: ")))
        );
    }
}
