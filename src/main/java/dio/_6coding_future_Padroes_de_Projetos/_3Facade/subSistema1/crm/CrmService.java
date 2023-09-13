package dio._6coding_future_Padroes_de_Projetos._3Facade.subSistema1.crm;

public class CrmService {

    private CrmService() {
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente salvo no sistema CRM");

    }
}
