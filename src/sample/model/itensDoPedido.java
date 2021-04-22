package sample.model;

import java.util.ArrayList;
import java.util.List;

public class itensDoPedido {
    private List<Produto> produtos;
    private double total;

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

    public String toString(){
        return produtos + "\nTotal: " + total;
    }
}
