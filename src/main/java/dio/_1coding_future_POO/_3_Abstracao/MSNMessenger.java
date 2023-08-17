package dio._1coding_future_POO._3_Abstracao;

public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("enviando mensagem pelo MSN");

    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo MSN");

    }
}
