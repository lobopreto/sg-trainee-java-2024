public class CadastroProduto {

    private String nome;
    private int codigo;
    private String tamanho;
    private double preco;

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}