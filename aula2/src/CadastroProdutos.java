import java.util.Scanner;

public class CadastroProdutos {
    Boolean executar = true;


    public void iniciar() {
        while (executar) {
            System.out.println("-------------------------------------");
            System.out.println("1 - Visualizar produtos");
            System.out.println("2 - Cadastrar produto");
            System.out.println("3 - Ativar/Inativar proutos");
            System.out.println("4 - Adicionar Estoque");
            System.out.println("5 - Retirar Estoque");
            System.out.println("0 - Sair");
            System.out.println("-------------------------------------");
            System.out.print("Digite uma opção: ");

            Scanner opcao = new Scanner(System.in);
            Integer opcaoEscolhida = Integer.valueOf(String.valueOf(opcao));
            this.lidarOpcaoEscolhida(opcaoEscolhida);
        }
    }



    private void lidarOpcaoEscolhida(Integer opcaoEscolhida) {
        switch (opcaoEscolhida){
            case 1:
                System.out.println("A opcao escolhida foi " + opcaoEscolhida);
                break;
            case 2:
                this.cadastrarProuto();
                break;
            case 3:
                System.out.println("A opcao escolhida foi " + opcaoEscolhida);
                break;
            case 4:
                System.out.println("A opcao escolhida foi " + opcaoEscolhida);
                break;
            case 5:
                System.out.println("A opcao escolhida foi " + opcaoEscolhida);
                break;
            case 0:
                System.out.println("A opcao escolhida foi " + opcaoEscolhida);
                break;
        }
    }

    private void cadastrarProuto() {

    }



}

public class Prouto

