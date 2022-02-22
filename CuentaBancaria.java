import javax.swing.JOptionPane;

public class CuentaBancaria {
  public String cuenta;
  public String titular;
  private double saldo; 
  private double transferencia;
  public double descuento;
  //Constructor
  public CuentaBancaria(String cuenta, String titular, double saldo ){
     this.cuenta = cuenta;
     this.titular= titular;
     this.saldo= saldo;

  }
  public String getCuenta()
  {
      return this.cuenta;
  }
  public String geTitular()
  {
      return this.titular;

  }
  public double getSaldo()
  {
      return this.saldo;
  }
  public void abono(double cantidad)
  {
    this.saldo += cantidad;
    JOptionPane.showMessageDialog(null,"El abono se realizo de forma correcta");
    this.estadodeCuenta();
}
  public void transferencia(double cantidad)
  {
   if(cantidad <=this.getSaldo())
   {
       saldo=saldo - cantidad;
       JOptionPane.showMessageDialog(null, "la transferencia se realizo de forma correcta");
       this.estadodeCuenta();
   }
  else
  JOptionPane.showMessageDialog(null,"Su transferencia no ha sido completada con un saldo de: "+ CuentaBancaria.this.transferencia);
}
public void estadodeCuenta()
{
    JOptionPane.showMessageDialog(null,"Estado de cuenta\nEl numero de cuenta"
    + " es: "+this.getCuenta()+"\nTitular es:  "
    +this.geTitular()+"\nEl saldo actual es: "+this.getSaldo());
}

}



