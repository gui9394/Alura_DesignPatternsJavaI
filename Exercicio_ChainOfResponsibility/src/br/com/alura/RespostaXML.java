package br.com.alura;

public class RespostaXML extends Resposta {

  public RespostaXML(Resposta proximaResposta) {
    super(proximaResposta);
  }

  @Override
  public String responde(Requisicao requisicao, Conta conta) {
    if (Formato.XML.equals(requisicao.getFormato())) {
      return "<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>";
    }

    return proximaResposta(requisicao, conta);
  }

}
