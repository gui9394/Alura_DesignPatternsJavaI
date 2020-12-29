package br.com.alura;

public class Main {

  public static void main(String[] args) {
    final var realizador = new RealizadorDeInvestimentos();

    var conta = new Conta();
    conta.deposita(100);
    realizador.realiza(conta, new Conservador());

    conta = new Conta();
    conta.deposita(100);
    realizador.realiza(conta, new Moderado());

    conta = new Conta();
    conta.deposita(100);
    realizador.realiza(conta, new Arrojado());
  }

}
