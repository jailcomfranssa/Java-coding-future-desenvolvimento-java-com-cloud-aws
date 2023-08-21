package dio._4coding_future_Map.mapOrdenacao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        AgendaEvento agendaEvento = new AgendaEvento();

        agendaEvento.adicionarEvento(LocalDate.of(2022, Month.AUGUST, 16),"Evento1", "Atração1");
        agendaEvento.adicionarEvento(LocalDate.of(2022, Month.OCTOBER, 16),"Evento2", "Atração2");
        agendaEvento.adicionarEvento(LocalDate.of(2022, Month.SEPTEMBER, 16),"Evento3", "Atração3");

        agendaEvento.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEvento.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEvento.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEvento.adicionarEvento(LocalDate.of(2023, Month.JULY, 14), "Evento 5", "Atração 5");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 6", "Atração 6");

//        agendaEvento.exibirAgenda();
        agendaEvento.obterProximoEvento();

    }
}
