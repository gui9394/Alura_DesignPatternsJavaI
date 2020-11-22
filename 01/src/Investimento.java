public interface Investimento {

    double calcular(Conta conta);

    default String getTipo() {
        return getClass().getName();
    }

}
