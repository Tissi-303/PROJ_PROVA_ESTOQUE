import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int quantidade;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();

        // Entrada
        System.out.print("Digite o nome do produto: ");
        p.nome = sc.nextLine();

        System.out.print("Digite o preço do produto: ");
        p.preco = sc.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        p.quantidade = sc.nextInt();

        System.out.print("Digite a quantidade vendida: ");
        int qtdVendida = sc.nextInt();

        System.out.println("\nProduto: " + p.nome);
        System.out.printf("Preço: R$ %.2f\n", p.preco);
        System.out.println("Estoque antes da venda: " + p.quantidade + " unidades");

        if (qtdVendida > p.quantidade) {
            System.out.println("Estoque insuficiente para realizar a venda.");
            System.out.println("Venda realizada: 0 unidades");
            System.out.println("Estoque atualizado: " + p.quantidade + " unidades");
        } else {
            p.quantidade -= qtdVendida;
            System.out.println("Venda realizada: " + qtdVendida + " unidades");
            System.out.println("Estoque atualizado: " + p.quantidade + " unidades");
        }

            }
}