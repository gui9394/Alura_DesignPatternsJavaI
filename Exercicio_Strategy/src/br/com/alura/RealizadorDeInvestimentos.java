package br.com.alura;

public class RealizadorDeInvestimentos {

  public void realiza(Conta conta, Investimento investimento) {
    double retorno = investimento.calcular(conta);
    conta.deposita(retorno * 0.75);

    System.out.printf("   Tipo de investimeto: %s%n", investimento.getTipo());
    System.out.printf("Retorno do investimeto: %s%n", retorno);
    System.out.printf("        Saldo da conta: %s%n%n", conta.getSaldo());
  }

}
