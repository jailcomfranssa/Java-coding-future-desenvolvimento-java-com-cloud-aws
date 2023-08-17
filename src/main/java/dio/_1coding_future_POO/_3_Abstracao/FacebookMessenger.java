package dio._1coding_future_POO._3_Abstracao;
public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("enviando mensagem pelo Face");

    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo Face");

    }
}
