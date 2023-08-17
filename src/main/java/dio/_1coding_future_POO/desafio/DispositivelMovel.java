package dio._1coding_future_POO.desafio;

public class DispositivelMovel {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Ligação");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n Ouvir Musica");
        iphone.selecionar();
        iphone.pausar();
        iphone.tocar();

        System.out.println("\n Usar Internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
