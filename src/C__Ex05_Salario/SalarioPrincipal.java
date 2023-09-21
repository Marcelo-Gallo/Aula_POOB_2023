/*
Um Funcionário de uma empresa recebe aumento salarial 
  anualmente. Sabe-se que:
  a – esse funcionário foi contratado em 1995, com salário 
  inicial de R$ 1.000,00;
  b – em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
  c – a partir de 1997 (inclusive), os aumentos salariais 
  sempre corresponderam ao dobro do percentual do ano anterior.
  Faça uma programa qua solicite o ano atual e
  determine o salário atual desse funcionário.
*/

package C__Ex05_Salario;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SalarioPrincipal {
    
    public static void main(String[] args){
        DecimalFormat formatando = new DecimalFormat("##,###.00");
        Salario salario = new Salario();
        
        JOptionPane.showMessageDialog(null,
                "O novo salario é: " + 
                formatando.format(
                    salario.ColetaDados(
        Integer.parseInt(JOptionPane.showInputDialog("Ano Atual: "))
        )));
        
        
    }
    
}
