package dio._2coding_future_Collections.listOrdenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Jose", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Maria", 22, 1.76);
        ordenacaoPessoa.adicionarPessoa("João", 30, 1.86);
        ordenacaoPessoa.adicionarPessoa("Tião", 18, 1.50);
        ordenacaoPessoa.adicionarPessoa("Marcos", 15, 1.60);

        //System.out.println("Ordenar por Idade:");
       // System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println("Ordenar por Altura");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
