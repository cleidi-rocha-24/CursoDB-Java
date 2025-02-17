import java.util.Scanner;

public class ValoresImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10]; 
        int contadorImpares = 0; 
        String impares = ""; 

        // Leitura dos valores do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Verificação de valores ímpares e armazenamento dos números ímpares
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) { 
                contadorImpares++;
                impares += vetor[i] + " "; // Adiciona o número ímpar à string
            }
        }

        // Exibição do resultado
        System.out.println("\nQuantidade de valores ímpares: " + contadorImpares);
        System.out.println("Números ímpares informados: " + impares);

        scanner.close();
    }
}