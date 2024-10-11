package map.Pesquisa;

public class Application {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Camiseta", 29, 10d);
        estoqueProdutos.adicionarProduto(2L, "Calça Jeans", 79, 5d);
        estoqueProdutos.adicionarProduto(3L, "Calça Social", 49, 7d);
        estoqueProdutos.adicionarProduto(4L, "Camisa Polo", 39, 3d);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
