package br.com.alura;

public class Main {

  public static void main(String[] args) {
    final var processador = new ProcessadorDeRequisicao();
    final var conta = new Conta("Paulo Silva", 100);

    var requisicao = new Requisicao(Formato.CSV);
    processador.processar(requisicao, conta);

    requisicao = new Requisicao(Formato.PORCENTO);
    processador.processar(requisicao, conta);

    requisicao = new Requisicao(Formato.XML);
    processador.processar(requisicao, conta);

  }

}
