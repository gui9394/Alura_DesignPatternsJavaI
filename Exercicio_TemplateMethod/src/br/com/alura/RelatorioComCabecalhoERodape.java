package br.com.alura;

public abstract class RelatorioComCabecalhoERodape implements Relatorio {

  @Override
  public final String gerarRelatorio() {
    return new StringBuilder() //
        .append(gerarCabecalho()) //
        .append("\n\n") //
        .append(gerarCorpo()) //
        .append("\n\n") //
        .append(gerarRodape()) //
        .append("\n\n") //
        .toString();
  }

  protected abstract StringBuilder gerarRodape();

  protected abstract StringBuilder gerarCorpo();

  protected abstract StringBuilder gerarCabecalho();

}
