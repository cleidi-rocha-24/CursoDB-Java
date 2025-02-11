import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informar os dados
        System.out.print("Informe o primeiro valor: ");
        float valor1 = scanner.nextFloat();

        System.out.print("Informe o segundo valor: ");
        float valor2 = scanner.nextFloat();

        System.out.print("Informe a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0); // para ler apenas primeiro caracter informado

        float resultado = 0;
        boolean operacaoCorreta = true;

        // Realiza a operação com base na escolha do usuário
        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case '*':
                resultado = valor1 * valor2;
                break;
            case '/':
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    System.out.println("\nErro: Divisão por zero não é permitida.");
                    operacaoCorreta = false;
                }
                break;
            default:
                System.out.println("\nOperação inválida! Utilize apenas +, -, * ou /.");
                operacaoCorreta = false;
                break;
        }

        // Exibe o resultado se a operação foi válida
        if (operacaoCorreta) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}