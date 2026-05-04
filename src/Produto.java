public class Produto {
    protected double valor;

    public Produto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public double aplicarDesconto() {
        this.valor = this.valor * 0.90;
        return this.valor;
    }
}
