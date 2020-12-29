package br.com.alura;

public class IKCV extends TemplateDeImpostoCondicional {

  public IKCV() {
  }

  public IKCV(Imposto outroImposto) {
    super(outroImposto);
  }

  @Override
  public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
    return orcamento.getValor() > 500 && itemMaiorQue100reais(orcamento);
  }

  private boolean itemMaiorQue100reais(Orcamento orcamento) {
    return orcamento.getItens() //
        .stream() //
        .filter(i -> i.getValor() > 100) //
        .findFirst() //
        .map(i -> true) //
        .orElse(false);
  }

  @Override
  public double maximaTaxacao(Orcamento orcamento) {
    return (orcamento.getValor() * 0.1) + calculoDoOutroImposto(orcamento);
  }

  @Override
  public double minimaTaxacao(Orcamento orcamento) {
    return (orcamento.getValor() * 0.06) + calculoDoOutroImposto(orcamento);
  }

}
