package D__Ex03_WhileComoFor;

import javax.swing.JOptionPane;
public class PrincipalSoma {
    
    public static void main(String[] args){
        int cont = 1;
        int numero;
        Soma soma = new Soma();
        while(cont<=10){
            numero = Integer.parseInt( //conversão p/ inteiro
            JOptionPane.showInputDialog("Informe o numero: "));//janela de input
            soma.somar(numero); //chamada de método
            cont++;
        }
        JOptionPane.showMessageDialog(null,"A soma é: "+ soma.mostra());
    }
    
}
