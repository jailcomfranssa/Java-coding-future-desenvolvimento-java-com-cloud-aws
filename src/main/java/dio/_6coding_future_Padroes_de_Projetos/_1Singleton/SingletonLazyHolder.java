package dio._6coding_future_Padroes_de_Projetos._1Singleton;

public class SingletonLazyHolder {

    private static class Holder{
        public static final SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }


}
