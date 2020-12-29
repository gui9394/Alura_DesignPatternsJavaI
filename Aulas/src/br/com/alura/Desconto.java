package br.com.alura;

public interface Desconto {

  double desconta(Orcamento orcamento);

  void setProximo(Desconto proximo);

}
