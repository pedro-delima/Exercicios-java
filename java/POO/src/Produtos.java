public class Produtos {
    String produto;
    double preco;
    int quantidade;

    public void ExibirInformacoes() {
        System.out.printf("Produto: %s\n Preço: %s\n Quantidade: %s ", produto, preco, quantidade);
    }
}
