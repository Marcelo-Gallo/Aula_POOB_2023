package H__Polimorfismo_Ex03;
import G__Heranca_Ex02.*;
import javax.swing.JOptionPane;
public class ClienteVIEW {
    public static void main(String[] args){
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoCTR fisicoCTR = new FisicoCTR();
        
        fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: ")));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
        fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));
        fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o CPF: "));
        
        JOptionPane.showMessageDialog(null, fisicoCTR.mostraDadosCli(fisicoDTO));
        
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        
        juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        juridicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: ")));
        juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
        juridicoDTO.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ: "));
        juridicoDTO.setIe(JOptionPane.showInputDialog("Informe o ie: "));
        
        JOptionPane.showMessageDialog(null, fisicoCTR.mostraDadosCli(fisicoDTO));
        
        
        
    }
    
}
