import java.util.List;
import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {

        CarrinhoDeCompra carro1 = new CarrinhoDeCompra();



        for(int i = 0; i < quantidade;i++){
            input.nextLine();
            System.out.println("Qual a marca do produto " + (i+1) + "? ");
            String marcaProduto = input.nextLine();
            System.out.println("Qual é o nome do produto "+ (i+1) + "? ");
            String nomeProduto = input.nextLine();
            System.out.println("Qual o código do produto " + (i+1) + "? ");
            int codigoProduto = input.nextInt();
            System.out.println("Qual o preço do produto" + (i+1) + "? ");
            double precoProduto = input.nextDouble();

            Produto product = new Produto();
            product.setCodigo(codigoProduto);
            product.setPreco(precoProduto);
            product.setMarca(marcaProduto);
            product.setNome(nomeProduto);

            carro1.addProduto(product);
        }

        System.out.println(carro1.valorTotalASerPago());


        input.close();
    }
}
