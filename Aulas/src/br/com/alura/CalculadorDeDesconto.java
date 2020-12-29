package br.com.alura;

public class CalculadorDeDesconto {

  public double calcula(Orcamento orcamento) {
    final var d1 = new DescontoPor5Itens();
    final var d2 = new DescontoPorMaisDe500Reais();
    final var d3 = new DescontoPorVendaCasada();
    final var sem = new SemDesconto();

    d1.setProximo(d2);
    d2.setProximo(d3);
    d3.setProximo(sem);

    final var desconto = d1.desconta(orcamento);

    System.out.printf("  Valor do orcamento: %f%n  Valor do desconto: %f%n%n", orcamento.getValor(), desconto);

    return desconto;
  }

}
