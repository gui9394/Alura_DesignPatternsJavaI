package br.com.alura;

public interface Investimento {

  double calcular(Conta conta);

  default String getTipo() {
    return getClass().getSimpleName();
  }

}
