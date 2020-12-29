package br.com.alura;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    final var banco = new Banco("Banco de Narnia", "Fundo do guarda-roupa", "contato@bn.com", "99 9999-9999");
    final var contas = Arrays.asList( //
        new Conta(1, 1, "Aslam", 900000), //
        new Conta(1, 2, "Lúcia", 100), //
        new Conta(1, 3, "Edmundo", 10), //
        new Conta(1, 4, "Pedro", 40000), //
        new Conta(1, 5, "Susana", 20000) //
    );

    System.out.println(" ---- Relatorio de contas simples ---- ");
    System.out.printf(new RelatorioDeContasSimples(banco, contas).gerarRelatorio());

    System.out.println(" ---- Relatorio de contas compĺexo ---- ");
    System.out.printf(new RelatorioDeContasComplexo(banco, contas).gerarRelatorio());
  }

}
