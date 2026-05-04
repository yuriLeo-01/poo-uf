public class Bibliocanto extends Produto{
    private String cor;
    private double tamanho;

    @Override
    public double aplicarDesconto() {
        this.valor = this.valor * 0.80;
        return this.valor;
    }
}
