import java.util.Scanner;

public class MercadoBebidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha a bebida (cerveja, refrigerante, agua):");
        String bebida = scanner.nextLine().toLowerCase();
        
        if (bebida.equals("cerveja")) {
            System.out.println("Informe sua idade:");
            int idade = scanner.nextInt();
            
            if (idade < 18) {
                System.out.println("Compra negada");
            } else {
                System.out.println("Compra efetuada com sucesso");
            }
        } else if (bebida.equals("refrigerante") || bebida.equals("agua")) {
            System.out.println("Compra efetuada com sucesso");
        } else {
            System.out.println("Opção inválida");
        }
        
        scanner.close();
    }
}
