package dio._4coding_future_Map.map;

public class Main {
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Contato01", 123);
        agendaContato.adicionarContato("Contato02", 13);
        agendaContato.adicionarContato("Contato03", 23);
        agendaContato.adicionarContato("Contato04", 3);
        agendaContato.adicionarContato("Contato05", 1);

        agendaContato.exibirContato();

        agendaContato.removerContato("Contato01");

        agendaContato.exibirContato();

        System.out.println("O numero é: " + agendaContato.pesquisarPorNome("Contato05"));



    }
}
