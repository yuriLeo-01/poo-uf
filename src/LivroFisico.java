public class LivroFisico extends Livro{
    public LivroFisico(String titulo, String autor, int ano, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.valor = valor;
        this.aplicarDesconto();
    }
    @Override
    public double aplicarDesconto() {
        this.valor = this.valor * 0.95;
        return this.valor;
    }

}
