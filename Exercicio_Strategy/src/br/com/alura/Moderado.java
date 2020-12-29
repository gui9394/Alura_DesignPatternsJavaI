package br.com.alura;

import java.util.Random;

public class Moderado implements Investimento {

  @Override
  public double calcular(Conta conta) {
    final var chance = new Random().nextInt();

    if (chance < 0.5) {
      return conta.getSaldo() * 0.25;
    }

    return conta.getSaldo() * 0.07;
  }

}
