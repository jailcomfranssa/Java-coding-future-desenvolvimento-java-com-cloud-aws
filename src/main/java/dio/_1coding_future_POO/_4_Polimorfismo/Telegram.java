package dio._1coding_future_POO._4_Polimorfismo;

public class Telegram extends ServicoMensagem{
    @Override
    public void enviarMensagem() {
        System.out.println("enviando mensagem pelo Telegram");

    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo Telegram");

    }
}
