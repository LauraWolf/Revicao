package sample.model;

import java.util.ArrayList;
import java.util.List;

/** Classes **/

public class itensDoPedido {
    private List<Produto> produtos;
    private double total;

    /** Getter e Setter **/

    public itensDoPedido(){
        produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

    public void setProduto(String nome, double preco){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        this.produtos.add(produto);
        total += preco;

    }

    public void setProduto(Produto produto){
        this.produtos.add(produto);
        total += produto.getPreco();
    }

    /** ToString **/

    public String toString(){
        return produtos + "\nTotal: " + total;
    }
}
