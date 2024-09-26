import java.util.Scanner;

public class Interacao {
    public static void main(String[] args) {
        /*
         * Interação com o usuário usando a classe Scanner.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("\n Seu nome é " + nome + "\n");

        scanner.close();
    }
}
