package br.com.alura;

import java.time.LocalDate;
import java.util.List;
import java.util.function.BiFunction;

public class RelatorioDeContasComplexo extends RelatorioComCabecalhoERodape {

  private final Banco banco;
  private final List<Conta> contas;

  public RelatorioDeContasComplexo(Banco banco, List<Conta> contas) {
    this.banco = banco;
    this.contas = contas;
  }

  @Override
  protected StringBuilder gerarCabecalho() {
    return new StringBuilder() //
        .append("Banco: ") //
        .append(banco.getNome()) //
        .append("\nEndereço: ") //
        .append(banco.getEndereco()) //
        .append("\nTelefone: ") //
        .append(banco.getTelefone()) //
        .append('\n');
  }

  @Override
  protected StringBuilder gerarCorpo() {
    final BiFunction<StringBuilder, Conta, StringBuilder> accumulator = //
        (builder, conta) -> builder //
            .append("Titular: ") //
            .append(conta.getTitular()) //
            .append("\nAgência: ") //
            .append(conta.getAgencia()) //
            .append(" Conta: ") //
            .append(conta.getNumero()) //
            .append("\nSaldo: ") //
            .append(conta.getSaldo()) //
            .append('\n');

    return contas.stream() //
        .reduce(new StringBuilder(), accumulator, StringBuilder::append);
  }

  @Override
  protected StringBuilder gerarRodape() {
    return new StringBuilder() //
        .append("Email: ") //
        .append(banco.getEmail()) //
        .append("\nData: ") //
        .append(LocalDate.now()) //
        .append('\n');
  }

}
