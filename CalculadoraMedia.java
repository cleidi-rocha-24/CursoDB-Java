import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Informe a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Informe a segunda nota: ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;
            System.out.printf("A média final do aluno é: %.2f\n", media);

            if (media >= 7) {
                System.out.println("\nAluno aprovado!");
            } else {
                System.out.println("\nAluno reprovado.");
            }

            System.out.print("\nDeseja realizar um novo cálculo? (s/n): ");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}