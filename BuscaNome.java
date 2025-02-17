import java.util.Scanner;

public class BuscaNome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10]; 

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Leitura do nome buscacdo
        System.out.print("Informe um nome para buscar no vetor: ");
        String nomeBusca = scanner.nextLine();

        boolean achei = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                achei = true;
                break; 
            }
        }

        // resultado
        if (achei) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }

        scanner.close();
    }
}