package dio._1coding_future_POO.desafio;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("tocar Musica");
    }

    @Override
    public void pausar() {
        System.out.println("pausar Musica");
    }

    @Override
    public void selecionar() {
        System.out.println("Selecionar musica");

    }

    @Override
    public void ligar() {
        System.out.println("Fazer ligação");

    }

    @Override
    public void atender() {
        System.out.println("atender ligação");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("ouvir correio de voz");

    }

    @Override
    public void exibirPagina() {
        System.out.println("entra na internet");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrir nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizar pagina");

    }
}
