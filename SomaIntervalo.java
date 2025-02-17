public class SomaIntervalo {
    public static void main(String[] args) {
        int soma = 0; 
        int i = 1; 

        // repetição
        do {
            soma += i; // Adiciona o valor de i à soma
            i++; // Incremento
        } while (i <= 100);

        // Exibe o resultado
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}