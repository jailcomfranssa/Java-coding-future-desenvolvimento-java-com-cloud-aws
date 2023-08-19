package dio._3coding_future_Set_Interface.setOrdenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtossSet;

    public CadastroProdutos() {
        this.produtossSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, Long cod, double preco, int toral){
        produtossSet.add(new Produto(nome, cod, preco, toral));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtossSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> exibirPorPreco = new TreeSet<>(new ComparatorPorPreco() );
        exibirPorPreco.addAll(produtossSet);
        return exibirPorPreco;
    }



}
