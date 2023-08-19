package dio._4coding_future_Map.mapPesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutoMap.put( cod, new Produto(nome, preco, quantidade));

    }

    public void exibirProduto(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalDeEstoque(){
        double valorTotal = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values() ){
                valorTotal += p.getQuantidade() * p.getPreco();

            }

        }

        return valorTotal;

    }

    public Produto produtoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutoMap.values()){
            if (p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }

        }
        return  produtoMaisCaro;

    }

}
