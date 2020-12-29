package br.com.alura;

import java.util.Collection;
import java.util.stream.Stream;

public class FiltroSaldoInferiorA100 extends Filtro {

  public FiltroSaldoInferiorA100() {
  }

  public FiltroSaldoInferiorA100(Filtro outroFiltro) {
    super(outroFiltro);
  }

  @Override
  protected Stream<Conta> aplicarFiltro(Collection<Conta> contas) {
    return contas.stream() //
        .filter(conta -> conta.getSaldo() < 100);
  }

}
