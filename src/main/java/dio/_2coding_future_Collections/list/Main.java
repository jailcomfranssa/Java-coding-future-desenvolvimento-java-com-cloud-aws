package dio._2coding_future_Collections.list;

public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Numero Total de elemento na lista: " + listaTarefa.obterNumeroTotalDeTarefa());
        listaTarefa.adicionarTarefa("tarefa 01");
        listaTarefa.adicionarTarefa("tarefa 01");
        listaTarefa.adicionarTarefa("tarefa 02");

        System.out.println("Numero Total de elemento na lista: " + listaTarefa.obterNumeroTotalDeTarefa());

        listaTarefa.removerTarefa("tarefa 02");
        System.out.println("Numero Total de elemento na lista: " + listaTarefa.obterNumeroTotalDeTarefa());

        listaTarefa.obterDescricaoTarefas();

    }
}
