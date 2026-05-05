package Polymorphism.Questao01;

public class LivroFisico extends Livro {

    public LivroFisico(String titulo, String autor, int ano, double valor) {
        super(titulo, autor, ano, valor);
        this.aplicarDesconto();
    }

    @Override
    public double aplicarDesconto() {
        this.valor = this.valor * 0.95;
        return this.valor;
    }

}
