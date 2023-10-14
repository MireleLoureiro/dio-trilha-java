import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(i);
                }
            }
            itemList.removeAll(itemsParaRemover);
        }
        else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
          for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
          }
          return valorTotal;
        } 
        else {
          throw new RuntimeException("A lista está vazia!");
        }
      }
    
      public void exibirItens() {
        if (!itemList.isEmpty()) {
          System.out.println(this.itemList);
        } 
        else {
          System.out.println("A lista está vazia!");
        }
      }

      @Override
      public String toString() {
        return "CarrinhoDeCompras{" +
            "itens = " + itemList +
            '}';
      }
    }
