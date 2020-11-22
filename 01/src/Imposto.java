public interface Imposto {

    double calcula(Orcamento orcamento);

    default String getTipo() {
        return getClass().getName();
    }

}
