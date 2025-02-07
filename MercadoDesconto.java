import java.util.Scanner;

public class MercadoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o preço do produto: ");
        double valor = scanner.nextDouble();

        System.out.print("Informe a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal;

        
        if (quantidade <= 10) {
            valorTotal = valor * quantidade;
        } else if (quantidade >= 11 && quantidade <= 20) {
            valorTotal = valor * quantidade * 0.9; // 10% de desconto
        } else if (quantidade >= 21 && quantidade <= 50) {
            valorTotal = valor * quantidade * 0.8; // 20% de desconto
        } else {
            valorTotal = valor * quantidade * 0.75; // 25% de desconto
        }

        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}