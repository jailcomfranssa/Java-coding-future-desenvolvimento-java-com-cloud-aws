package dio._1coding_future_POO._4_Polimorfismo;

public class MSNMenssenger extends ServicoMensagem{
    @Override
    public void enviarMensagem() {
        System.out.println("enviando mensagem pelo MSN");

    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo MSN");

    }
}
