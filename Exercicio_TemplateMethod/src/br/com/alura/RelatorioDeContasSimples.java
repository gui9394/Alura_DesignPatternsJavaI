package br.com.alura;

import java.util.List;
import java.util.function.BiFunction;

public class RelatorioDeContasSimples extends RelatorioComCabecalhoERodape {

  private final Banco banco;
  private final List<Conta> contas;

  public RelatorioDeContasSimples(Banco banco, List<Conta> contas) {
    this.banco = banco;
    this.contas = contas;
  }

  @Override
  protected StringBuilder gerarCabecalho() {
    return new StringBuilder() //
        .append("Banco: ") //
        .append(banco.getNome()) //
        .append('\n');
  }

  @Override
  protected StringBuilder gerarCorpo() {
    final BiFunction<StringBuilder, Conta, StringBuilder> accumulator = //
        (builder, conta) -> builder //
            .append("Titular: ") //
            .append(conta.getTitular()) //
            .append(" Saldo: ") //
            .append(conta.getSaldo()) //
            .append('\n');

    return contas.stream() //
        .reduce(new StringBuilder(), accumulator, StringBuilder::append);
  }

  @Override
  protected StringBuilder gerarRodape() {
    return new StringBuilder() //
        .append("Telefone: ") //
        .append(banco.getTelefone()) //
        .append('\n');
  }

}
