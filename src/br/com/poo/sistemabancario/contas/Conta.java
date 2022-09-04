package br.com.poo.sistemabancario.contas;

public class Conta {
  public int numero;
  public String titular;
  public double saldo;

  public boolean sacar(double valor) {
     if(this.saldo < valor) {
      System.err.println("Não é possível fazer esse saque, Seu saldo é: " + saldo);
      return false;
     }else {
    
      this.saldo -= valor;
      return true;
     }
     
  }
  public void deposito(double valor) {
    if(valor < 0) {
      System.out.println("Valor de depósito inválido");
    } else {
      this.saldo += valor;
    }
  }

  public boolean transferencia(double valor, Conta numero){ 
    if(this.saldo < valor) {
      System.err.println("Não é possível fazer essa transferência, Seu saldo é: " + saldo);
      return false;
     }else {
      System.out.println("Transferido com sucesso!");
      this.saldo -= valor;
      numero.deposito(valor);
      return true;
     }



  }
}
