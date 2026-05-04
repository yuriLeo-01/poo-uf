package Questao01;

public class MarcaPagina extends Produto {
    private String cor;

    public MarcaPagina(String cor, double valor) {
        super(valor);
        this.cor = cor;
        this.aplicarDesconto();
    }
}
