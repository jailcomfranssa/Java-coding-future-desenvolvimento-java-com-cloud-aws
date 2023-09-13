package dio._6coding_future_Padroes_de_Projetos._2Strategy;

public class Main {
    public static void main(String[] args) {

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();
        System.out.println("\n");
        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();
        System.out.println("\n");
        robo.setStrategy(agressivo);
        robo.mover();


    }
}
