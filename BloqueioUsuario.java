import java.util.Scanner;

public class BloqueioUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "aluno";
        String senhaCorreta = "segredo";
        int tentativas = 0;
        final int MAX_TENTATIVAS = 3;

        while (tentativas < MAX_TENTATIVAS) {
            System.out.print("\nInforme o usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Informe a senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("\nBem-vindo!");
                break; // Sai do loop se sucesso
            } else {
                tentativas++;
                if (tentativas < MAX_TENTATIVAS) {
                    System.out.println("Usuário ou senha incorretos. Tente novamente.");
                } else {
                    System.out.println("\nConta bloqueada após " + MAX_TENTATIVAS + " tentativas.");
                }
            }
        }

        scanner.close();
    }
}