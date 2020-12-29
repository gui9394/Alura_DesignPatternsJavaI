package br.com.alura;

import static java.util.stream.Collectors.toList;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public abstract class Filtro {

  protected final Filtro outroFiltro;

  protected Filtro() {
    this.outroFiltro = null;
  }

  protected Filtro(Filtro outroFiltro) {
    this.outroFiltro = outroFiltro;
  }

  protected abstract Stream<Conta> aplicarFiltro(Collection<Conta> contas);

  private Stream<Conta> aplicarOutroFiltro(Collection<Conta> contas) {
    return (outroFiltro == null) ? Stream.empty() : outroFiltro.aplicarFiltros(contas);
  }

  private Stream<Conta> aplicarFiltros(Collection<Conta> contas) {
    final var resultado = aplicarFiltro(contas);
    final var resultadoOutroFiltro = aplicarOutroFiltro(contas);

    return Stream.concat(resultado, resultadoOutroFiltro);
  }

  public List<Conta> filtrar(List<Conta> contas) {
    return aplicarFiltros(contas) //
        .distinct() //
        .collect(toList());
  }

}