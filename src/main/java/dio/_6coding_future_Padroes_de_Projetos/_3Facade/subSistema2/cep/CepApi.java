package dio._6coding_future_Padroes_de_Projetos._3Facade.subSistema2.cep;

public class CepApi {

    private static final CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "JP";

    }

    public String recuperarEstado(String cep){
        return "PB";
    }
}
