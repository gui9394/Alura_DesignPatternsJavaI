package br.com.alura;

public abstract class Resposta {

  private Resposta proximaResposta;

  protected Resposta(Resposta proximaResposta) {
    this.proximaResposta = proximaResposta;
  }

  public abstract String responde(Requisicao requisicao, Conta conta);

  protected String proximaResposta(Requisicao requisicao, Conta conta) {
    if (proximaResposta == null) {
      return "";
    }

    return proximaResposta.responde(requisicao, conta);
  }

}
