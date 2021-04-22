package sample.model;
import java.util.ArrayList;

public class Pedido {
    private String data;
    private itensDoPedido itens;
    private Cliente cliente;

    public Pedido(){
        itens = new itensDoPedido();
    }

    public void setProduto(String nome, double preco){
        itens.setProduto(nome, preco);
    }

    public itensDoPedido getItens(){
        return itens;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String toString(){
        return "NOVO PEDIDO\nData da Compra: " + data + "\n" +itens + "\nCliente: " + cliente ;
  }
}

