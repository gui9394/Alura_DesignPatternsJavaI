package br.com.alura;

public class RespostaCSV extends Resposta {

  public RespostaCSV(Resposta proximaResposta) {
    super(proximaResposta);
  }

  @Override
  public String responde(Requisicao requisicao, Conta conta) {
    if (Formato.CSV.equals(requisicao.getFormato())) {
      return conta.getTitular() + ";" + conta.getSaldo();
    }

    return proximaResposta(requisicao, conta);
  }

}
