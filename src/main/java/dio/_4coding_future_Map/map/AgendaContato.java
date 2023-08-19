package dio._4coding_future_Map.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);

        }
        return numeroPorNome;
    }
}
