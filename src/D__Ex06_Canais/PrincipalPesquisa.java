package D__Ex06_Canais;

import javax.swing.JOptionPane;
public class PrincipalPesquisa {
    public static void main(String[] args){
        int canal=1;
        Pesquisa pesquisa = new Pesquisa();
        
        while(canal!=0){
            canal = Integer.parseInt(
            JOptionPane.showInputDialog("Informe o canal: "));
            pesquisa.computa(canal);
        }
        JOptionPane.showMessageDialog(null, pesquisa.mostrar());
        
    }
    
}
