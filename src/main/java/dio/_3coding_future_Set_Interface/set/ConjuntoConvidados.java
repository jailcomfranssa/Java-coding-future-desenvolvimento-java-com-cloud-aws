package dio._3coding_future_Set_Interface.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void addConvidados(String nome, int cod){
        convidadosSet.add(new Convidados(nome, cod));

    }
     public void removerConvidadoPorCodigoConvite(int cod){
        Convidados convidaoParaRemover = null;
        for(Convidados c : convidadosSet){
            if (c.getCodigoConvite() == cod){
                convidaoParaRemover = c;
                break;
            }

        }
        convidadosSet.remove(convidaoParaRemover);

     }

     public int contarConvidados(){
        return convidadosSet.size();
     }

     public void exibirConvidados(){
         System.out.println(convidadosSet);
     }
}
