package C__Ex04_Alturas;

import javax.swing.JOptionPane;
public class PrincipalAlturas {
    public static void main(String args[]){
        Alturas alturas = new Alturas();
        
        for(int i=1; i<=20; i++){
           alturas.SomaVerifica( 
           Integer.parseInt(JOptionPane.showInputDialog("Informe a "+i+"ª altura (cm): "))
           );
           
        }
        JOptionPane.showMessageDialog(null, alturas.mostrar(0));
    }
    
}
