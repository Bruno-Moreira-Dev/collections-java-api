package map.OperacoesBasicas;

public class Application {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joao", 123);
        agendaContatos.adicionarContato("Maria", 456);
        agendaContatos.adicionarContato("Pedro", 789);
        agendaContatos.adicionarContato("Elza", 321);
        agendaContatos.adicionarContato("Bruno", 654);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Joao");
        agendaContatos.pesquisarPorNome("Bruno");

        agendaContatos.exibirContatos();
    }
}
