package set.OperacoesBasicas;

public class Application {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("Pedro", 3);
        conjuntoConvidados.adicionarConvidado("Elza", 4);
        conjuntoConvidados.adicionarConvidado("Bruno", 5);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerCovidadoPorCodigoConvite(1);
        conjuntoConvidados.exibirConvidados();
    }
}
