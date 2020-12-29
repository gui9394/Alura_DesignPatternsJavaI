package br.com.alura;

public class Conta {

  private final int agencia;
  private final int numero;
  private final String titular;
  private final double saldo;

  public Conta(int agencia, int numero, String titular, double saldo) {
    this.agencia = agencia;
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public String getTitular() {
    return titular;
  }

}
