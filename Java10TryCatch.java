import java.util.Scanner;

public class Java10TryCatch {
    public static void main(String[] args) {
        /*
         * TRATAMENTO DE ERROS OU EXCECOES:
         * Tenta executar o "try" caso gere erro ou excecao executa o "catch" do erro ou excecao especificado entre (), existem varios tipos, "Exception" é o mais generico.
         * Já o "finally" e opcional, ele executa independente de ocorrer erro ou nao.
         * 
         * ESTRUTURA:
         * try {executar} catch (excecao var) {executar} finally {executar}
         */

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("\n Digite um numero inteiro: ");

        try {
            num = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("\n O valor digitado e invalido !!!");
            System.out.println(" Error: " + e.getMessage());
        }
        finally {
            System.out.println("\n Isso é executado independente de dar ou nao erro.\n");
        }
    }
}
