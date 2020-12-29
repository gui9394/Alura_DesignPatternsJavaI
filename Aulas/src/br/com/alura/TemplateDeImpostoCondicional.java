package br.com.alura;

public abstract class TemplateDeImpostoCondicional extends Imposto {

  protected TemplateDeImpostoCondicional() {
  }

  protected TemplateDeImpostoCondicional(Imposto outroImposto) {
    super(outroImposto);
  }

  @Override
  public double calcula(Orcamento orcamento) {
    if (deveUsarMaximaTaxacao(orcamento)) {
      return maximaTaxacao(orcamento);
    }

    return minimaTaxacao(orcamento);
  }

  protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

  protected abstract double maximaTaxacao(Orcamento orcamento);

  protected abstract double minimaTaxacao(Orcamento orcamento);

}
