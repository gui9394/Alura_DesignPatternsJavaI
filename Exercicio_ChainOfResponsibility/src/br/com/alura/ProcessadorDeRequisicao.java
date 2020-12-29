package br.com.alura;

public class ProcessadorDeRequisicao {

  public String processar(Requisicao requisicao, Conta conta) {
    final var r3 = new RespostaPorcento(null);
    final var r2 = new RespostaXML(r3);
    final var r1 = new RespostaCSV(r2);

    final var resposta = r1.responde(requisicao, conta);

    System.out.printf(" Formato: %s%n", requisicao.getFormato());
    System.out.printf("Resposta: %s%n%n", resposta);

    return resposta;
  }

}
