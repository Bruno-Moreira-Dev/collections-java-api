package set.Pesquisa;

public class Application {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 123);
        agendaContatos.adicionarContato("Maria", 456);
        agendaContatos.adicionarContato("Pedro", 789);
        agendaContatos.adicionarContato("Elza", 321);
        agendaContatos.adicionarContato("Bruno", 654);

        agendaContatos.exibirContatos();

        agendaContatos.pesquisarPorNome("Bruno");
        agendaContatos.atualizarNumeroContato("Bruno", 1000);

        agendaContatos.exibirContatos();
    }
}
