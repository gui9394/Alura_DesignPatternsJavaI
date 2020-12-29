package br.com.alura;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    final var contas = Arrays.asList( //
        new Conta("Aslam", 900000, LocalDate.now()), //
        new Conta("Lúcia", 100, LocalDate.of(2019, 4, 6)), //
        new Conta("Edmundo", 10, LocalDate.of(2020, 11, 1)), //
        new Conta("Pedro", 40000, LocalDate.of(2020, 2, 16)), //
        new Conta("Susana", 20000, LocalDate.of(2020, 12, 10)), //
        new Conta("Franco", 80, LocalDate.now()), //
        new Conta("Helena", 2000000, LocalDate.of(2020, 12, 10)) //
    );

    final var filtro = new FiltroDataDeAberturaMesAtual(new FiltroSaldoInferiorA100(new FiltroSaldoSuperiorA500000()));

    final var contasFiltradas = filtro.filtrar(contas);

    contasFiltradas.forEach(conta -> System.out.printf( //
        "Titular: %s%nSaldo: %f%nData de abertura: %s%n%n", //
        conta.getTitular(), //
        conta.getSaldo(), //
        conta.getDataAbertura()));
  }

}
