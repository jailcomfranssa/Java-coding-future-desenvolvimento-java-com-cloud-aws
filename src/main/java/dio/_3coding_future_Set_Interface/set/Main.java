package dio._3coding_future_Set_Interface.set;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Total de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.addConvidados("convidado01", 137);
        conjuntoConvidados.addConvidados("convidado02", 135);
        conjuntoConvidados.addConvidados("convidado03", 136);
        conjuntoConvidados.addConvidados("convidado04", 134);

        System.out.println(" \n Total de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(137);
        System.out.println("\n Total de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();



    }
}
