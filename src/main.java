public static void main(String[] args){

    LivroFisico lf = new LivroFisico("A Revolta de Atlas", "Ayn Rand", 2017, 89.90, 0.800);
    LivroEbook le = new LivroEbook();
    Bibliocanto bibli = new Bibliocanto();
    MarcaPagina mp = new MarcaPagina();

    CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
        meuCarrinho.adicionarProduto(lf);
        meuCarrinho.adicionarProduto(le);
        meuCarrinho.adicionarProduto(bibli);
        meuCarrinho.adicionarProduto(mp);


        meuCarrinho.exibirValorTotal();

}
