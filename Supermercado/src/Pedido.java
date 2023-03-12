
import java.util.List;
public class Pedido {
    private List<Produto> produtos;

    public Pedido(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }
}

