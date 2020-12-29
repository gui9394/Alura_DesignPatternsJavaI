package br.com.alura;

import java.time.LocalDate;

public class Conta {

  private final String titular;
  private final double saldo;
  private final LocalDate dataAbertura;

  public Conta(String titular, double saldo, LocalDate dataAbertura) {
    this.titular = titular;
    this.saldo = saldo;
    this.dataAbertura = dataAbertura;
  }

  public LocalDate getDataAbertura() {
    return dataAbertura;
  }

  public String getTitular() {
    return titular;
  }

  public double getSaldo() {
    return saldo;
  }

}