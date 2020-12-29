package br.com.alura;

public class ICCC extends Imposto {

  public ICCC() {
  }

  public ICCC(Imposto outroImposto) {
    super(outroImposto);
  }

  @Override
  public double calcula(Orcamento orcamento) {
    final var valor = orcamento.getValor();

    if (valor < 1000) {
      return (valor * 0.05) + calculoDoOutroImposto(orcamento);
    }

    if (valor <= 3000) {
      return (valor * 0.07) + calculoDoOutroImposto(orcamento);
    }

    return ((valor * 0.08) + 30) + calculoDoOutroImposto(orcamento);
  }

}
