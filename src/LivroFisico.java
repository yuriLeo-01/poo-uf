public class LivroFisico extends Livro{
    @Override
    public double aplicarDesconto() {
        this.valor = this.valor * 0.95;
        return this.valor;
    }

}
