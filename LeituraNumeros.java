import java.util.Scanner;

public class LeituraNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Informe um número inteiro de 1 a 10: ");
            
            // Verifica se é um número inteiro
            while (!scanner.hasNextInt()) { //hasNextIn verifica se é numero inteiro
                System.out.println("\nErro: Digite um número inteiro.");
                scanner.next(); 
                System.out.print("\nDigite um número inteiro de 1 a 10: ");
            }

            numero = scanner.nextInt();

            // Verifica se o número está entre 1 a 10
            if (numero >= 1 && numero <= 10) {
                System.out.println("\nNúmero digitado: " + numero);
            } else {
                System.out.println("\nErro: O número deve estar entre 1 e 10. Tente mais uma vez.");
            }

        } while (numero != 10); // loop até que o 10 seja digitado

        System.out.println("\nNúmero 10 digitado! Encerrando o programa...");
        scanner.close();
    }
}