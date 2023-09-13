package dio._6coding_future_Padroes_de_Projetos._2Strategy;

public class Robo {

    private Comportamento strategy;

    public void setStrategy(Comportamento strategy){
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();
    }
}
