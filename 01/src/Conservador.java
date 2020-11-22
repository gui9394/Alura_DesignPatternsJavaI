public class Conservador implements Investimento {

    @Override
    public double calcular(Conta conta) {
        return conta.getSaldo() * 0.08;
    }

}