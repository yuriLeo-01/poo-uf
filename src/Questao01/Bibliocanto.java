package Questao01;

public class Bibliocanto extends Produto {
    private String cor;
    private double tamanho;

    public Bibliocanto(String cor, double tamanho, double valor){
        super(valor);
        this.cor = cor;
        this.tamanho = tamanho;
        this.aplicarDesconto();
    }

    @Override
    public double aplicarDesconto() {
        this.valor = this.valor * 0.80;
        return this.valor;
    }
}
