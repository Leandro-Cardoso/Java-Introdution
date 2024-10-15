public class Java09Loop {
    public static void main(String[] args) {
        /*
         * LOOPS:
         * 
         * ESTRUTURA WHILE:
         * while (condicao) {executa}
         * 
         * ESTRUTURA DO WHILE:
         * do {executa} while (condicao);
         * 
         * ESTRUTURA FOR:
         * for (declaracao de var; condicao; var++) {executa}
         * 
         * ESTRUTURA FOR-EACH:
         * for (var : lista de var) {executa}
         * 
         * OUTRAS:
         * continue -> Retorna para o inicio do loop
         * break    -> Interrompe o loop
         */

        System.out.print("\n WHILE:");
        int num = 1;
        int n = 10;
        while (num <= n) {
            System.out.print(" " + num);
            num++;
        }
        
        System.out.print("\n\n FOR:");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        
        System.out.print("\n\n FOR-EACH:");
        int[] nums = {5, 4, 3, 2, 1};
        for (int num2 : nums) {
            System.out.print(" " + num2);
        }
        System.out.println("\n");
    }
}
