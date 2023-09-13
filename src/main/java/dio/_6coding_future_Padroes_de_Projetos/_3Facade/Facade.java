package dio._6coding_future_Padroes_de_Projetos._3Facade;

import dio._6coding_future_Padroes_de_Projetos._3Facade.subSistema1.crm.CrmService;
import dio._6coding_future_Padroes_de_Projetos._3Facade.subSistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
