import java.util.Scanner;

public class Java08Conditional {
    public static void main(String[] args) {
        /*
         * ESTRUTURA IF:
         * if (condicao) {executa}
         * else if (condicao) {executa}
         * else {executa}
         * 
         * ESTRUTURA TERNARIA:
         * (condicao) ? verdadeiro : falso
         * 
         * OBS: E totalmente possivel encadear condicionais.
         * 
         * ESTRUTURA DE VERIFICACAO DE CONDICAO:
         * (condicao) && (condicao) -> As duas e verdadeira?
         * (condicao) || (condicao) -> Uma das duas e verdadeira?
         * !(condicao) -> A condicao nao e verdadeira?
         * 
         * ESTRUTURA SWITCH:
         * switch (var) {
         *      case valor:
         *          executar
         *          break;
         *      default:
         *          executar
         *          break;
         * }
         */

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("\n Digite um numero de 1 a 5: ");
        num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("\n Voce digitou: 1");
                break;
            case 2:
                System.out.println("\n Voce digitou: 2");
                break;
            case 3:
                System.out.println("\n Voce digitou: 3");
                break;
            case 4:
                System.out.println("\n Voce digitou: 4");
                break;
            case 5:
                System.out.println("\n Voce digitou: 5");
                break;
            default:
                System.out.println("\n Opcao invalida !");
                break;
        }
        System.out.println();
    }
}
