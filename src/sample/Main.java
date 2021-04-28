package sample;
import sample.model.Cliente;
import sample.model.Pedido;
import sample.model.Pessoa;
import sample.model.Produto;

/** Class Main **/

public class Main  {

    public static void main(String[] args) {
         /*



        Cliente cliente1 = new Cliente("Emílio Santiago");
        cliente1.setCpf("200.900.111-90");
        cliente1.setEndereco("Sete de setembro", 12);
        Cliente cliente2 = new Cliente("Raul Seixas", "888.999.111.90");
        cliente2.setEndereco("Quinze de novembro", 101);
        Cliente cliente3 = new Cliente("Dom Pedro I", "1-01", "pedrao@brasil.br");
        cliente3.setEndereco("Vinte e Cinco de Março", 150);
        System.out.println(cliente1 + "\n");
        System.out.println(cliente2 + "\n");
        System.out.println(cliente3 + "\n");

        Produto produto1 = new Produto();
        produto1.setNome("Uva");
        produto1.setPreco(5.8);
        System.out.println(produto1 + "\n");

        Produto produto2 = new Produto();
        produto2.setNome("Laranja");
        produto2.setPreco(2.4);
        System.out.println(produto2 + "\n");

         */
        Cliente cliente1 = new Cliente("Emílio Santiago");
        cliente1.setCpf("200.900.111-90");
        cliente1.setEndereco("Sete de setembro", 12);
        cliente1.setEmail("santigo@emilio.br");

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente1);
        pedido.setData("22/3/21");
        pedido.setProduto("Uva", 3.6);
        pedido.setProduto("Laranja", 2.1);
        pedido.setProduto("Pera", 3.5);

        System.out.println(pedido);
    }

}



