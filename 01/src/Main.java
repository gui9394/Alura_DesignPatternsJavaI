public class Main {
    
    public static void main(String[] args) {
        testeImposto();
        testeInvestimento();
    }

    public static void testeImposto() {
        final var iss = new ISS();
        final var icms = new ICMS();
        final var iccc = new ICCC();

        final var orcamento = new Orcamento(3001);

        final var calculadora = new CalculadorDeImposto();

        calculadora.realizaCalculo(orcamento, iss);
        calculadora.realizaCalculo(orcamento, icms);
        calculadora.realizaCalculo(orcamento, iccc);
    }


    public static void testeInvestimento() {
        var conta = new Conta();
        conta.deposita(100);
        new RealizadorDeInvestimentos().realiza(conta, new Conservador());

        conta = new Conta();
        conta.deposita(100);
        new RealizadorDeInvestimentos().realiza(conta, new Moderado());

        conta = new Conta();
        conta.deposita(100);
        new RealizadorDeInvestimentos().realiza(conta, new Arrojado());
    }

}
