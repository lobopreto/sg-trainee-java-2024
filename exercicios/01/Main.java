import java.util.Scanner;

public class Main {
    private static int[] quantidade, tempQuantidade;
    private static char tempProduto, produto;

    public static void main(String[] args) {
        System.out.printf("Contagem de etoque.");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite um produto");
            Scanner ler;
            Object produto = ler.nextLine();
            System.out.printf("Digite a quantidade do prouto");
            Object quantidade = ler.nextLine();

        }
        for (int j = 1; j <= 4; j++) {
            for (int j = 1; j <= 4; j++) {
                boolean[] quantiade;
                if (quantiade[j] < quantiade[j + 1]){
                    tempQuantidade <- quantidade[j]
                    quantidade[j] <- quantidade[j + 1]

                    quantidade[j + 1] <- tempQuantidade


                     tempProduto <- produto[j]
                     produto[j] <- produto[j + 1]
                     produto[j + 1] <- tempProduto

                }


            }
        }

    }
}