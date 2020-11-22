public class CalculadorDeImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        System.out.println(" ----- Imposto " + imposto.getTipo() + " ----- ");
        System.out.println("Valor do orcamento: " + orcamento.getValor());
        System.out.println("Valor do imposto: " + imposto.calcula(orcamento));
        System.out.println();
    }

} 
