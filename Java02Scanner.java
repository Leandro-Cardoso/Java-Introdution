import java.util.Scanner;

public class Java02Scanner {
    public static void main(String[] args) {
        /*
         * Interação com o usuário usando a classe Scanner.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("\n Seu nome é " + nome + "\n");

        System.out.print("\n Qual seu sexo? ");
        char sexo = scanner.next().charAt(0); // Pega o primeiro catacter da string.

        System.out.println("\n Sexo: " + sexo + "\n");

        scanner.close();
    }
}
