package dio._6coding_future_Padroes_de_Projetos._2Strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente ....");
    }
}
