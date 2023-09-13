package dio._6coding_future_Padroes_de_Projetos._2Strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
