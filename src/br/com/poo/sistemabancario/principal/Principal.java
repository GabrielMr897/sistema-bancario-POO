package br.com.poo.sistemabancario.principal;
import javax.swing.JOptionPane;

import br.com.poo.sistemabancario.contas.Conta;
public class Principal {
  public static void main(String[] args) {
    Conta minhaConta = new Conta("Gabriel", 28, 1500);
    double saldoConta;
    String titularConta;
    int numeroConta;
    Conta conta2 = new Conta("Ester", 29, 3000.0);
    double saldoConta2;
    String titularConta2;
    int numeroConta2;
   
   // It's calling the methods from the class Conta.
    minhaConta.sacar(200.0);
    minhaConta.transferencia(50.0, conta2);
    minhaConta.deposito(100.0);

    // It's shortening the name of the variables.
    saldoConta = minhaConta.saldo;
    titularConta = minhaConta.titular;
    numeroConta = minhaConta.numero;
    saldoConta2 = conta2.saldo;
    titularConta2 = conta2.titular;
    numeroConta2 = conta2.numero;
    
  // It's showing the message dialog.
    JOptionPane.showMessageDialog(null, "Saldo atual do(a) " + titularConta + " é: " + saldoConta);
    JOptionPane.showMessageDialog(null, "O número da conta é: " + numeroConta);
    
    // It's showing the message dialog.
    JOptionPane.showMessageDialog(null, "Saldo atual do(a) " + titularConta2 + " é: " + saldoConta2);
    JOptionPane.showMessageDialog(null,"O número da conta é: " + numeroConta2);
  }
}
