package dio._1coding_future_POO._2_Heranca;

public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        salvarHistoricoMensagem();
        System.out.println("Enviando mensagem ...");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem ...");
    }
    private  void validarConectadoInternet(){
        System.out.println("Validando Conectado !!!");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvar histórico");
    }
}
