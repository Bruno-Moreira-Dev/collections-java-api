package set.Ordenacao;

public class Application {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Camiseta", 29d, 10);
        cadastroProdutos.adicionarProduto(2L, "Calça Jeans", 79.90, 5);
        cadastroProdutos.adicionarProduto(3L, "Calça Social", 49d, 7);
        cadastroProdutos.adicionarProduto(4L, "Camisa Polo", 39.90, 3);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
