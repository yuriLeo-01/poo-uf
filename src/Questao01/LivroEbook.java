package Questao01;

public class LivroEbook extends Livro {

    public LivroEbook(String titulo, String autor, int ano, double valor) {
        super(titulo, autor, ano, valor);
        this.aplicarDesconto();
    }

    public double aplicarDesconto(){
        return this.valor;
    }
}
