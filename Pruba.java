import javax.swing.JOptionPane;

public class Pruba {
    public static void main(String[] args) {
        {
           CuentaBancaria c1 = new CuentaBancaria("4936 8617 6385 6685",  "Jezrael Jared Gomez Torres"  ,0);
           CuentaBancaria c2 = new CuentaBancaria("4936 8617 6385 6685",  "Luis Felipe Diaz"   ,0); 

           double cantAbono= Double.parseDouble(JOptionPane.showInputDialog(null, 
           "Ingresa la cantidad a abonar"));
           c1.abono(cantAbono);
           double cantTransferencia= Double.parseDouble(JOptionPane.showInputDialog(null, 
           "Ingresa la cantidad a Transferir"));
           c1.transferencia(cantTransferencia);
           
           double cantAbonar= Double.parseDouble(JOptionPane.showInputDialog(null, 
           "Ingresa la cantidad a abonar"));
           c2.abono(cantAbonar);
           double canttransferencia= Double.parseDouble(JOptionPane.showInputDialog(null, 
           "Ingresa la cantidad a Transferir"));
           c2.transferencia(canttransferencia);
           
         
    }
        
}
}
