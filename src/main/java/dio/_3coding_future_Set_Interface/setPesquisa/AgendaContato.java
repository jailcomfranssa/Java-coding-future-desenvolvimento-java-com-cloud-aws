package dio._3coding_future_Set_Interface.setPesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void addcionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public  Set<Contato> pesquisarPorNome(String nonem){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c: contatoSet){
            if (c.getNome().startsWith(nonem)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato atualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                atualizado = c;
                break;
            }

        }

        return atualizado;

    }


}
