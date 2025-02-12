import java.util.Scanner;

public class CalculadoraComissaoImovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do corretor e valor do imóvel
        System.out.print("Informe o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Informe o valor do imóvel: R$ ");
        double valorImovel = scanner.nextDouble();

        double comissao = 0;

        if (valorImovel >= 50000) {
            comissao = valorImovel * 0.20; // 20% de comissão
        } else if (valorImovel >= 30000) {
            comissao = valorImovel * 0.15; // 15% de comissão
        } else {
            comissao = valorImovel * 0.10; // 10% de comissão
        }

        // Exibe os resultados
        System.out.println("\nRESULTADO");
        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.printf("Valor do imóvel: R$ %.2f%n", valorImovel);
        System.out.printf("Valor da comissão: R$ %.2f%n", comissao);

        scanner.close();
    }
}