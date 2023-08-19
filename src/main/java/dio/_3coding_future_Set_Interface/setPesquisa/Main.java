package dio._3coding_future_Set_Interface.setPesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContato();

        agendaContato.addcionarContato("Contato01",123);
        agendaContato.addcionarContato("Contato01",3);
        agendaContato.addcionarContato("Contato02",12);
        agendaContato.addcionarContato("Contato03",1);

        agendaContato.exibirContato();

        System.out.println("\n Pesquisar por nome");
        System.out.println(agendaContato.pesquisarPorNome("Contato01"));

        System.out.println("\n Atualizar contato");
        System.out.println("Contato atualizado: "+ agendaContato.atualizarNumeroContato("Contato02", 55));
        agendaContato.exibirContato();


    }
}
