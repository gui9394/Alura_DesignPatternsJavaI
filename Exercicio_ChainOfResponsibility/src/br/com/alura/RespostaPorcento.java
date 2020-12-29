package br.com.alura;

public class RespostaPorcento extends Resposta {

  public RespostaPorcento(Resposta proximaResposta) {
    super(proximaResposta);
  }
  
  @Override
  public String responde(Requisicao requisicao, Conta conta) {
    if (Formato.PORCENTO.equals(requisicao.getFormato())) {
      return conta.getTitular() + "%" + conta.getSaldo();
    }

    return proximaResposta(requisicao, conta);
  }

}
