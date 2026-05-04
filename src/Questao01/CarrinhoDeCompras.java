package Questao01;

public class CarrinhoDeCompras {
    private Produto[] listaDeProdutos = new Produto[4];
    private double valorTotal;
    private int contador = 0;

    public void adicionarProduto(Produto p){
        if (contador < listaDeProdutos.length){
            this.listaDeProdutos[contador] = p;
            this.valorTotal += p.getValor();
            contador++;
        } else {
            System.out.println("Carrinho cheio!");
        }
    }

    public void exibirValorTotal(){
        System.out.printf("O valor total é: %.2f%n" , this.valorTotal);
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public double getValorTotal() {
        return this.valorTotal;
    }

}

