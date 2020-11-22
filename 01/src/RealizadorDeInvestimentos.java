public class RealizadorDeInvestimentos {

    public void realiza(Conta conta, Investimento investimento) {
        double retorno = investimento.calcular(conta);
        conta.deposita(retorno * 0.75);

        System.out.println(" ----- Investimeto " + investimento.getTipo() + " ----- ");
        System.out.println("Retorno do investimeto: " + retorno);
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println();
    }

}
