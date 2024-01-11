import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    List<CadastroProduto> produtos = new ArrayList<>();

    public void adicionar(CadastroProduto cp) {
        produtos.add(cp);
    }

    public void listaProdutos() {
        produtos.forEach((p) -> {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Modelo: " + p.getCodigo());
            System.out.println("Tamanho: " + p.getTamanho());
            System.out.println("Preço: " + p.getPreco());
            System.out.println("-----------------------------");
        });
    }
}
