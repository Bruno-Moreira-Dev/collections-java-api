package list.Ordenacao;

public class Application {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("João", 30, 1.75);
        ordenacaoPessoa.adicionarPessoa("Maria", 25, 1.65);
        ordenacaoPessoa.adicionarPessoa("Pedro", 40, 1.80);
        ordenacaoPessoa.adicionarPessoa("Elza", 86, 1.50);
        ordenacaoPessoa.adicionarPessoa("Bruno", 29, 1.80);

        System.out.println(ordenacaoPessoa);
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
