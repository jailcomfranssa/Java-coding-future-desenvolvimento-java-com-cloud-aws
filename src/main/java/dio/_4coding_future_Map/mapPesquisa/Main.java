package dio._4coding_future_Map.mapPesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.exibirProduto();

        estoqueProduto.adicionarProduto(1L, "Produto A", 10.50, 1);
        estoqueProduto.adicionarProduto(1L, "Produto B", 1.50, 2);
        estoqueProduto.adicionarProduto(1L, "Produto C", 20.50, 3);
        estoqueProduto.adicionarProduto(1L, "Produto D", 15.50, 4);

        estoqueProduto.exibirProduto();

        System.out.println("\n Valor Total " + estoqueProduto.calcularValorTotalDeEstoque());
        System.out.println("\n produto mais caro " + estoqueProduto.produtoMaisCaro());

    }
}
