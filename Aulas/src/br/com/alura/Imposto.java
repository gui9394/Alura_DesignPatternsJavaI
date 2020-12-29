package br.com.alura;

public abstract class Imposto {

  protected Imposto outroImposto;

  protected Imposto() {
  }

  protected Imposto(Imposto outroImposto) {
    this.outroImposto = outroImposto;
  }

  public abstract double calcula(Orcamento orcamento);

  protected double calculoDoOutroImposto(Orcamento orcamento) {
    return (outroImposto == null) ? 0 : outroImposto.calcula(orcamento);
  }

  public String getTipo() {
    return getClass().getSimpleName();
  }

}
