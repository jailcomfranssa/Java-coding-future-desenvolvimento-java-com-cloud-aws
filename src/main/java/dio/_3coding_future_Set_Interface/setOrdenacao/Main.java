package dio._3coding_future_Set_Interface.setOrdenacao;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Produto01", 1L, 2.0,4);
        cadastroProdutos.adicionarProduto("Produto02", 2L, 5.0,4);
        cadastroProdutos.adicionarProduto("Produto03", 3L, 1.0,4);
        cadastroProdutos.adicionarProduto("Produto04", 17L, 22.0,4);
        cadastroProdutos.adicionarProduto("Produto05", 12L, 23.0,4);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());

        System.out.println("\n");
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
