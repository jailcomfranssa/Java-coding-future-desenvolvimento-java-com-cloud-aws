package dio._6coding_future_Padroes_de_Projetos._1Singleton;

public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }


}
