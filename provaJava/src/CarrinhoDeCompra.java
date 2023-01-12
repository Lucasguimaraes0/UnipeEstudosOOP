import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarrinhoDeCompra {
    private int codigo;
    private List<Produto> produto;

    public CarrinhoDeCompra() {
        
    }

    public CarrinhoDeCompra(int codigo){
        this.codigo = codigo;
        produto = new ArrayList<>(); //instanciei o objeto
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public Produto getProduto(Produto produtos){
        int indice = produto.indexOf(produtos);
        return produto.get(indice);
    }

    public void addProduto(Produto produtos){
        produto.add(produtos); //adiciona no fim da lista
    }
//    public double calculaValorToral(){
//        valorASerPago = 0.0
//    }

    public double[] getPrecosProdutos(){
        double[] precos = new double[produto.size()];
        for (int i = 0; i < produto.size(); i++){
            if (produto.get(i) != null){
                precos[i] = produto.get(i).getPreco();
            }
        }
        return precos;
    }
    public String valorTotalASerPago(){
        double contador = 0.0;
        for(Produto naruto:produto){
            contador += naruto.getPreco();
        }
        for (Produto p1:produto) {

        }

        return String.format("O valor total da feira é: R$%.2f", contador);
    }


    @Override
    public String toString() {
        return "CarrinhoDeCompra{" +
                "codigo=" + codigo +
                ", produto=" + produto +
                '}';
    }
}
