package br.com.alura;

import java.time.LocalDate;
import java.util.Collection;
import java.util.stream.Stream;

public class FiltroDataDeAberturaMesAtual extends Filtro {

  public FiltroDataDeAberturaMesAtual() {
  }

  public FiltroDataDeAberturaMesAtual(Filtro outroFiltro) {
    super(outroFiltro);
  }

  @Override
  protected Stream<Conta> aplicarFiltro(Collection<Conta> contas) {
    return contas.stream() //
        .filter(conta -> LocalDate.now().getMonth().equals(conta.getDataAbertura().getMonth()));
  }

}
