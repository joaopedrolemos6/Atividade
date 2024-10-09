public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 100.0);

        Cliente cliente = new Cliente("João", "joao@gmail.com");

        ItemPedido item1 = new ItemPedido(produto1, 2);
        ItemPedido item2 = new ItemPedido(produto2, 1);

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        double total = pedido.calcularTotal();
        System.out.printf("Total do pedido: R$%.2f%n", total);
    }
}