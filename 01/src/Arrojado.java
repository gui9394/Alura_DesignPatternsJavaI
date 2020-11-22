import java.util.Random;

public class Arrojado implements Investimento {

    @Override
    public double calcular(Conta conta) {
        final var chance = new Random().nextDouble();

        if (chance < 0.2) {
            return conta.getSaldo() * 0.05;
        }

        if (chance < 0.3) {
            return conta.getSaldo() * 0.03;
        }

        return conta.getSaldo() * 0.006;
    }

}
