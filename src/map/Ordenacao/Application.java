package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 11), "Evento 4", "Atração 4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
