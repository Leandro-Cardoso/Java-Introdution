public class Java01Print {
    public static void main(String[] args) {
        /*
         * printf():
         * 
         * %b -> boolean
         * %c -> char
         * %s -> String
         * %d -> Numeros inteiros
         * %f -> Numeros fracionados
         * %n -> Pula linha
         * 
         * -  -> Inverte alinhamento
         * ,  -> Adiciona separador de milhar
         * .  -> Limita a fracao arredondando
         * +  -> Mostra o sinal do numero (+ ou -)
         *    -> Mostra o sinal do numero se negativo
         * 0  -> Preenche os espacos vazios com 0
         */

        String name = "Leandro";
        int age = 35;
        double balance = 5301.127456;

        System.out.printf("%n Alinhamento a direita:");
        System.out.printf("%n  Nome: %10s", name);
        System.out.printf("%n Idade: %10d", age);
        System.out.printf("%n Saldo: %,10.2f%n", balance);

        System.out.printf("%n Alinhamento a esquerda:");
        System.out.printf("%n  Nome: %-10s", name);
        System.out.printf("%n Idade: %-10d", age);
        System.out.printf("%n Saldo: %,-10.2f%n", balance);

        int num = -5;
        int num2 = 5;
        
        System.out.printf("%n O sinal de '+' mostra de é positivo ou negativo:");
        System.out.printf("%n Valor: %+4d", num);
        System.out.printf("%n Valor: %+4d", num2);
        System.out.printf("%n Valor: % 4d", num);
        System.out.printf("%n Valor: % 4d%n", num2);

        System.out.printf("%n O '0' preenche os espacos com 0:");
        System.out.printf("%n Valor: %+04d%n", num);

        System.out.printf("%n Nome %s em caixa alta:", name);
        System.out.printf("%n Valor: %10S%n%n", name);
    }
}
