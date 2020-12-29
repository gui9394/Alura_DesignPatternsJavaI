package br.com.alura;

public class Main {

  public static void main(String[] args) {
    testeStrategy();
    testeChainOfResponsibility();
    testeTemplateMethod();
    testeDecorator();
  }

  public static void testeStrategy() {
    System.out.println("Testes Strategy");

    final var iss = new ISS();
    final var icms = new ICMS();
    final var iccc = new ICCC();

    final var orcamento = new Orcamento(3001);

    final var calculadora = new CalculadorDeImposto();

    calculadora.realizaCalculo(orcamento, iss);
    calculadora.realizaCalculo(orcamento, icms);
    calculadora.realizaCalculo(orcamento, iccc);
  }

  public static void testeChainOfResponsibility() {
    System.out.println("Testes Chain of Responsibility");

    testeChainOfResponsibilityDescontoPorMaisDe500Reais();
    testeChainOfResponsibilityDescontoPorVendaCasada();
    testeChainOfResponsibilityDescontoPorMaisDe5Itens();
  }

  public static void testeChainOfResponsibilityDescontoPorMaisDe500Reais() {
    System.out.println("  Desconto por mais de 500 reais");

    final var calculadora = new CalculadorDeDesconto();
    final var orcamento = new Orcamento(600);

    orcamento.adicionaItens( //
        new Item("CANETA AZUL", 250.00), //
        new Item("LAPIS GRAFITE", 250.00) //
    );

    calculadora.calcula(orcamento);
  }

  public static void testeChainOfResponsibilityDescontoPorMaisDe5Itens() {
    System.out.println("  Desconto por mais de 5 itens");

    final var calculadora = new CalculadorDeDesconto();
    final var orcamento = new Orcamento(100);

    orcamento.adicionaItens( //
        new Item("CANETA PRETA", 10), //
        new Item("LAPIS GRAFITE", 10), //
        new Item("AGENDA", 10), //
        new Item("BLOCO DE NOTAS", 10), //
        new Item("POST-IT", 10), //
        new Item("CADERNO", 10) //
    );

    calculadora.calcula(orcamento);
  }

  public static void testeChainOfResponsibilityDescontoPorVendaCasada() {
    System.out.println("  Desconto por venda casada");

    final var calculadora = new CalculadorDeDesconto();
    final var orcamento = new Orcamento(100);

    orcamento.adicionaItens( //
        new Item("CANETA", 10), //
        new Item("LAPIS", 10) //
    );

    calculadora.calcula(orcamento);
  }

  public static void testeTemplateMethod() {
    System.out.println("Teste Template Method");

    testeTemplateMethodIcpp();
    testeTemplateMethodIkcv();
    testeTemplateMethodIhit();
  }

  public static void testeTemplateMethodIcpp() {
    final var calculadora = new CalculadorDeImposto();
    final var icpp = new ICPP();

    // Maxima
    final var orcamentoTaxacaoMaxima = new Orcamento(1000);

    calculadora.realizaCalculo(orcamentoTaxacaoMaxima, icpp);

    // Minima
    final var orcamentoTaxacaoMinima = new Orcamento(100);

    calculadora.realizaCalculo(orcamentoTaxacaoMinima, icpp);
  }

  public static void testeTemplateMethodIkcv() {
    final var calculadora = new CalculadorDeImposto();
    final var ikcv = new IKCV();

    // Maxima
    final var orcamentoTaxacaoMaxima = new Orcamento(1000);

    orcamentoTaxacaoMaxima.adicionaItens( //
        new Item("CADERNO", 1000) //
    );

    calculadora.realizaCalculo(orcamentoTaxacaoMaxima, ikcv);

    // Minima
    final var orcamentoTaxacaoMinima = new Orcamento(100);

    orcamentoTaxacaoMinima.adicionaItens( //
        new Item("CADERNO", 10) //
    );

    calculadora.realizaCalculo(orcamentoTaxacaoMinima, ikcv);
  }

  public static void testeTemplateMethodIhit() {
    final var calculadora = new CalculadorDeImposto();
    final var ihit = new IHIT();

    // Maxima
    final var orcamentoTaxacaoMaxima = new Orcamento(100);

    orcamentoTaxacaoMaxima.adicionaItens( //
        new Item("CADERNO", 10), //
        new Item("CADERNO", 10), //
        new Item("PAPEL A4", 20) //
    );

    calculadora.realizaCalculo(orcamentoTaxacaoMaxima, ihit);

    // Minima
    final var orcamentoTaxacaoMinima = new Orcamento(100);

    orcamentoTaxacaoMinima.adicionaItens( //
        new Item("CADERNO", 10), //
        new Item("PAPEL A4", 20) //
    );

    calculadora.realizaCalculo(orcamentoTaxacaoMinima, ihit);
  }

  private static void testeDecorator() {
    System.out.println("Teste Decorator");

    testeDecorator1();
    testeDecorator2();
  }

  private static void testeDecorator1() {
    final var imposto = new ISS(new ICMS());

    final var orcamento = new Orcamento(500);

    System.out.printf( //
        "  ISS e ICMS%n  Valor do orçamento: %f%n  Valor do imposto: %f%n%n", //
        orcamento.getValor(), //
        imposto.calcula(orcamento));

  }

  private static void testeDecorator2() {
    final var imposto = new ImpostoMuitoAlto(new ICMS());

    final var orcamento = new Orcamento(500);

    System.out.printf( //
        "  ImpostoMuitoAlto e ICMS%n  Valor do orçamento: %f%n  Valor do imposto: %f%n%n", //
        orcamento.getValor(), //
        imposto.calcula(orcamento));
  }

}
