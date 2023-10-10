package G_Heranca_Ex01;
import javax.swing.JOptionPane;
public class VeiculoVIEW {
    public static void main(String[] args){
        CarroDTO carroDTO = new CarroDTO();
        CarroCTR carroCTR = new CarroCTR();
        
        carroDTO.setPlaca(JOptionPane.showInputDialog("Informe a placa: "));
        carroDTO.setCor(JOptionPane.showInputDialog("Informe a cor: "));
        carroDTO.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Informe a potencia: ")));
        carroDTO.setQnt_portas(Integer.parseInt(JOptionPane.showInputDialog("Informe as portas: ")));
        
        JOptionPane.showMessageDialog(null, carroCTR.imprimirDadosCarro(carroDTO));
        
        MotoDTO motoDTO = new MotoDTO();
        MotoCTR motoCTR = new MotoCTR();
        
        motoDTO.setPlaca(JOptionPane.showInputDialog("Informe a placa: "));
        motoDTO.setCor(JOptionPane.showInputDialog("Informe a cor: "));
        motoDTO.setCilindadrada(Integer.parseInt(JOptionPane.showInputDialog("Informe a cilindrada: ")));
        motoDTO.setTipo_motor(JOptionPane.showInputDialog("2T / 4T: "));
        
        JOptionPane.showMessageDialog(null, motoCTR.imprimirDadosMoto(motoDTO));
        
    }
}
