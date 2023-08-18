package dio._2coding_future_Collections.listPesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.addicionarLivros("Livro 01", "Autor 01", 2021);
        catalogoLivros.addicionarLivros("Livro 02", "Autor 02", 2020);
        catalogoLivros.addicionarLivros("Livro 02", "Autor 02", 2020);
        catalogoLivros.addicionarLivros("Livro 03", "Autor 03", 2023);
        catalogoLivros.addicionarLivros("Livro 04", "Autor 04", 2019);

        System.out.println("Pesquisando por Autor");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 02"));
        System.out.println("\n Pesquisando por intervalo de ano");
        System.out.println(catalogoLivros.PesquisarPorIntervaloAnos(2020, 2022));
        System.out.println("\n Pesquisar por titulo");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 02"));

    }
}
