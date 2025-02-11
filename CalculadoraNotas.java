import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Digitar notas
        System.out.print("Informe a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Informe a segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Informe a terceira nota: ");
        float nota3 = scanner.nextFloat();

        // Calculo das medias
        float media = (nota1 + nota2 + nota3) / 3;

        // Resultado
        if (media >= 7) {
            System.out.println("\nSua nota final foi :"+ media + "\nAPROVADO\n");
        } else if (media >= 5) {
            System.out.println("\nSua nota final foi:"+ media + "\nRECUPERAÇÃO\n");
        } else {
            System.out.println("\nSua nota final foi:"+ media + "\nREPROVADO\n");
        }

        scanner.close();
    }
}




