public class Java02ArithmeticOperator {
    public static void main(String[] args) {
        /*
         * Operadores Aritmeticos: (*, /, %, +, -)
         * Incremeto e decremento: (++var, var++, --var, var--)
         * Para outros valores: (+=, -=, *=, /=, %=)
         */

        int a = 10;
        int b = 2 * a;
        
        System.out.println("Resultado = " + (a + b)); // Concatenação seguida de uma soma de A e B

        // Divisão inteira:
        int x = 5;
        int y = 2;
        System.out.println("\nDivisão inteira: " + x + " / " + y + " = " + (x / y));

        // Divisão normal:
        double z = 2;
        System.out.println("Divisão inteira: " + x + " / " + z + " = " + (x / z) + "\n");
    }
}
