package dio._1coding_future_POO._4_Polimorfismo;

public class Computador {
    public static void main(String[] args) {
        ServicoMensagem smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMenssenger();

        }
        else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();

        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
