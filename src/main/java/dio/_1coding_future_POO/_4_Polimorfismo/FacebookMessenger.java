package dio._1coding_future_POO._4_Polimorfismo;

public class FacebookMessenger extends ServicoMensagem{
    @Override
    public void enviarMensagem() {
        System.out.println("enviando mensagem pelo Face");

    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo Face");

    }
}
