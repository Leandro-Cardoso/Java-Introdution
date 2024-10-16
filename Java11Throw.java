import java.util.Scanner;

public class Java11Throw {
    public static void main(String[] args) {
        /*
         * Lancando uma excecao:
         * Utilizado quando e necessario interromper a execucao do programa.
         * 
         * throw new Excecao(mensagem);
         */

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("\n Digite um numero inteiro positivo: ");

        try {
            num = scanner.nextInt();

            if (num < 0) {
                throw new IllegalArgumentException(" O valor precisa ser maior que 0 !!!");
            }
        }
        catch (IllegalArgumentException iae) {
            System.out.println("\n" + iae.getMessage() + "\n");
        }
        catch (Exception e) {
            System.out.println("\n O numero digitado precisa ser um inteiro !!!\n");
        }
    }
}
