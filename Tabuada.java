import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Loop para ver valores valido
        while (true) {
            System.out.print("Informe um número inteiro entre 1 e 10: ");
            
            
            if (scanner.hasNextInt()) { //valida se é inteiro
                numero = scanner.nextInt();

                if (numero >= 1 && numero <= 10) {
                    break; 
                } else {
                    System.out.println("\n Valor inválido! O número deve estar entre 1 e 10.");
                }
            } else {
                System.out.println("\n Valor inválido! Digite um número inteiro.");
                scanner.next(); 
            }
        }

        // mostrando a tabuada do número informado
        System.out.println("\nTabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}