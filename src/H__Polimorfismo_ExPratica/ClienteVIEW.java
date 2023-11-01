package H__Polimorfismo_ExPratica;
import javax.swing.JOptionPane;
public class ClienteVIEW {
    public static void main(String[] args){
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoCTR fisicoCTR = new FisicoCTR();
        
        fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: ")));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
        fisicoDTO.setRG(JOptionPane.showInputDialog("Informe o RG: "));
        fisicoDTO.setCPF(JOptionPane.showInputDialog("Informe o CPF: "));
        
        JOptionPane.showMessageDialog(null, fisicoCTR.mostraDadosCli(fisicoDTO));
        
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        
        juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        juridicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: ")));
        juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
        juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
        juridicoDTO.setIE(JOptionPane.showInputDialog("Informe a IE: "));
        juridicoDTO.setCNPJ(JOptionPane.showInputDialog("Informe a CNPJ: "));
        
        JOptionPane.showMessageDialog(null, juridicoCTR.mostraDadosCli(juridicoDTO));
        
    }
}
