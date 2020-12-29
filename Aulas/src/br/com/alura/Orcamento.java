package br.com.alura;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Orcamento {

  private final double valor;
  private final List<Item> itens;

  public Orcamento(double valor) {
    this.valor = valor;
    this.itens = new ArrayList<>();
  }

  public double getValor() {
    return valor;
  }

  public List<Item> getItens() {
    return Collections.unmodifiableList(itens);
  }

  public void adicionaItens(Item... novosItens) {
    itens.addAll(Arrays.asList(novosItens));
  }

  public boolean contemItens(String... nomeDoItens) {
    return itens.stream() //
        .map(Item::getNome) //
        .collect(toList()) //
        .containsAll(Arrays.asList(nomeDoItens));
  }

}