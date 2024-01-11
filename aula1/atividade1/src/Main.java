import java.util.Scanner;

import static java.lang.Integer.parseInt;

public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);
    Scanner dados1 = new Scanner(System.in);
    Scanner dados2 = new Scanner(System.in);
    Scanner dados3 = new Scanner(System.in);
    Scanner dados4 = new Scanner(System.in);
    ProdutoController produtoController = new ProdutoController();
    CadastroProduto c1 = new CadastroProduto();

    String nome;
    int codigo, i;
    String tamanho;
    double preco;

    System.out.println(
            "Opçoes\n 1-Cadastrar produto\n 2-Remover produto\n 3-Verificar produto\n 4-Dinheiro\n");
    int numopc;

    System.out.print("digite uma opção: ");

    numopc = dados.nextInt();

    while (numopc
            == 1) {
        for (i = 1; i <= 3; i++) {
            System.out.println("Nome do produto: ");
            nome = dados1.nextLine();
            c1.setNome(nome);

            System.out.println("Codigo do produto: ");
            codigo = parseInt(dados2.nextLine());
            c1.setCodigo(codigo);

            System.out.println("Tamanho do produto: ");
            tamanho = dados3.nextLine();
            c1.setTamanho(tamanho);

            System.out.println("Preço do produto: ");
            preco = dados.nextDouble();
            c1.setPreco(preco);

            //System.out.println("\n Cadastrar mais produtos?\n  1-Sim\n  0-Não\n");
            //numopc = dados.nextInt();

            produtoController.adicionar(c1);
            c1 = new CadastroProduto();

        }

        produtoController.listaProdutos();
    }
}