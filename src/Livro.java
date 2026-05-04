public class Livro extends Produto{
    protected String titulo;
    protected String autor;
    protected int ano;
    public Livro(String titulo, String autor, int ano, double valor) {
        super(valor);
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.aplicarDesconto();
    }
}
