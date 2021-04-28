package sample.model;

/** Classes **/

public class Produto {
    private String nome;
    private double preco;

    /** Getter e Setter **/

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /** ToString **/

    public String toString(){
        return nome + ", R$: " + preco;
    }
}
