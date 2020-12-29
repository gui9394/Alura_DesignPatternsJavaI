package br.com.alura;

public class CalculadorDeImposto {

  public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
    final var valorDoImposto = imposto.calcula(orcamento);

    System.out.printf( //
        "  %s%n  Valor do orcamento: %f%n  Valor do imposto: %f%n%n", //
        imposto.getTipo(), //
        orcamento.getValor(), //
        valorDoImposto);

    return valorDoImposto;
  }

}
