import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // primeiro valor
        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        // segundo valor e valida se é zero
        double valor2 = 0;
        while (valor2 == 0) {
            System.out.print("Informe o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();
            if (valor2 == 0) {
                System.out.println("Valor inválido! O segundo valor não pode ser zero.");
            }
        }

        double resultado = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }
}