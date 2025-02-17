import java.util.Scanner;

public class ExcluirNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[20]; 

        // Leitura dos 20 nomes
        System.out.println("Informe 20 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Vetor para armazena nomes únicos
        String[] nomesUnicos = new String[nomes.length];
        int tamanhoUnicos = 0; 

        // Percorre o vetor e adiciona apenas os nomes únicos ao vetor `nomesUnicos`
        for (String nome : nomes) {
            boolean repetido = false;
            for (int i = 0; i < tamanhoUnicos; i++) {
                if (nomesUnicos[i].equalsIgnoreCase(nome)) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                nomesUnicos[tamanhoUnicos] = nome;
                tamanhoUnicos++;
            }
        }

        // Mostra nomes únicos
        System.out.println("\nNomes únicos após a exclusão dos repetidos:");
        for (int i = 0; i < tamanhoUnicos; i++) {
            System.out.println(nomesUnicos[i]);
        }

        scanner.close();
    }
}
