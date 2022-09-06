package br.com.poo.sistemabancario.principal;
import javax.swing.JOptionPane;

import br.com.poo.sistemabancario.contas.Conta;
public class Principal {
  public static void main(String[] args) {
    Conta minhaConta = new Conta();
    double saldoConta;
    String titularConta;
    int numeroConta;
    Conta conta2 = new Conta();
    double saldoConta2;
    String titularConta2;
    int numeroConta2;

// It's setting the values of the variables.
    minhaConta.titular = "Gabriel";
    minhaConta.saldo = 1500.0;
    minhaConta.numero = 28;
    
   
    conta2.saldo = 3000.0;
    conta2.titular = "Ester";
    conta2.numero = 29;
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
    
    JOptionPane.showMessageDialog(null, "Saldo atual do(a) " + titularConta + " é: " + saldoConta);
    JOptionPane.showMessageDialog(null, "O número da conta é: " + numeroConta);
    
    JOptionPane.showMessageDialog(null, "Saldo atual do(a) " + titularConta2 + " é: " + saldoConta2);
    JOptionPane.showMessageDialog(null,"O número da conta é: " + numeroConta2);
  }
}
