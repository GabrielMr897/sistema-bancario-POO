package br.com.poo.sistemabancario.contas;
import javax.swing.JOptionPane;
public class Conta {
  public int numero;
  public String titular;
  public double saldo;

  public boolean sacar(double valor) {
     if(this.saldo < valor) {
      JOptionPane.showMessageDialog(null,"Não é possível fazer esse saque, Seu saldo é: " + saldo);
      return false;
     }else {
      JOptionPane.showMessageDialog(null,"R$ " + valor + " sacado com sucesso!");
      this.saldo -= valor;
      return true;
     }
     
  }
  public void deposito(double valor) {
    if(valor < 0) {
      JOptionPane.showMessageDialog(null,"Valor de depósito inválido");
    } else {
      this.saldo += valor;
    }
  }

  public boolean transferencia(double valor, Conta numero){ 
    if(this.saldo < valor) {
      JOptionPane.showMessageDialog(null,"Não é possível fazer essa transferência, seu saldo é: " + saldo);
      return false;
     }else {
      JOptionPane.showMessageDialog(null,"R$ " + valor + " Transferido com sucesso!");
      this.saldo -= valor;
      numero.deposito(valor);
      return true;
     }



  }
}
