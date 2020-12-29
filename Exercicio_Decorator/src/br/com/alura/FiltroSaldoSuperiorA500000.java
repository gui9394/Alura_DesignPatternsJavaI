package br.com.alura;

import java.util.Collection;
import java.util.stream.Stream;

public class FiltroSaldoSuperiorA500000 extends Filtro {

  public FiltroSaldoSuperiorA500000() {
  }

  public FiltroSaldoSuperiorA500000(Filtro outroFiltro) {
    super(outroFiltro);
  }

  @Override
  protected Stream<Conta> aplicarFiltro(Collection<Conta> contas) {
    return contas.stream() //
        .filter(conta -> conta.getSaldo() > 500000);
  }

}
