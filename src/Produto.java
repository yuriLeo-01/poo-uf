public class Produto {
    protected double valor;

    public double getValor() {
        return this.valor;
    }

    public double aplicarDesconto() {
        this.valor = this.valor * 0.90;
        return this.valor;
    }
}
