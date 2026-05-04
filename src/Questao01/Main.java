package Questao01;

public class Main {
    public static void main(String[] args) {

        LivroFisico lf = new LivroFisico("A Revolta de Atlas", "Ayn Rand", 1957, 100.00);
        LivroEbook le = new LivroEbook("A Sutil Arte de Ligar o F*da-se", "Mark Manson", 2016, 80.00);
        Bibliocanto bibli = new Bibliocanto("Azul", 20.0, 50.0);
        MarcaPagina mp = new MarcaPagina("Vermelho", 15.0);

        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
        meuCarrinho.adicionarProduto(lf);
        meuCarrinho.adicionarProduto(le);
        meuCarrinho.adicionarProduto(bibli);
        meuCarrinho.adicionarProduto(mp);


        meuCarrinho.exibirValorTotal();

    }
}