package br.com.alura;

public class IHIT extends TemplateDeImpostoCondicional {

  public IHIT() {
  }

  public IHIT(Imposto outroImposto) {
    super(outroImposto);
  }

  @Override
  public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
    final var quantidadeDeItensDiferentes = orcamento.getItens().stream() //
        .map(Item::getNome) //
        .distinct() //
        .count();

    return quantidadeDeItensDiferentes < orcamento.getItens().size();
  }

  @Override
  public double maximaTaxacao(Orcamento orcamento) {
    return ((orcamento.getValor() * 0.13) + 100) + calculoDoOutroImposto(orcamento);
  }

  @Override
  public double minimaTaxacao(Orcamento orcamento) {
    return (orcamento.getValor() * (orcamento.getItens().size() * 0.01)) + calculoDoOutroImposto(orcamento);
  }

}