import java.util.Random;

public class Java11Random {
    public static void main(String[] args) {
        /*
         * Biblioteca Random excelente para gerar numeros aleatorios, mas não possui seguranca.
         */

        Random random = new Random();
        int range = 10;
        int n = 10;

        int num;
        float numF;

        System.out.println("\n INTEIROS:");

        for (int i = 0; i < n; i++) {
            num = random.nextInt(range) + 1;
            System.out.println("\n Numero gerado: " + num);
        }
        
        System.out.println("\n FLUTUANTES:");

        for (int i = 0; i < n; i++) {
            numF = random.nextFloat() * range;
            System.out.println("\n Numero gerado: " + numF);
        }
        
        System.out.println();
    }
}
