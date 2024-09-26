public class Cast {
    public static void main(String[] args) {
        /*
        Casting:
        Conversão de tipos de variáveis.
        */
        int inteiro1 = 10;
        double fracao1 = inteiro1;
        System.out.println("Inteiro para fração: "+ inteiro1 + " -> "  + fracao1);
        
        // Exemplo 2:
        double fracao2 = 5.65;
        int inteiro2 = (int) fracao2;
        System.out.println("Fração para inteiro: " + fracao2 + " -> " + inteiro2);
        
        // Exemplo 3:
        char letraA = 'A';
        char letraB = 'B';
        char letraC = 'C';
        String palavra = String.valueOf(letraA) + String.valueOf(letraB) + String.valueOf(letraC);
        System.out.println("Letras para palavra: " + palavra);
        
        // Exemplo 4:
        palavra = "Leandro";
        int nLetra = 3;
        char letraX = palavra.charAt(nLetra);
        System.out.println((nLetra + 1) + "ª letra de " + palavra + " é " + letraX);
        
        // Exemplo 5:
        int numero = 100;
        String palavra2 = String.valueOf(numero);
        System.out.println("Numero para String: " + numero + " -> " + palavra2);
        
        // Exemplo 6:
        String palavra3 = "123";
        int numero2 = Integer.parseInt(palavra3);
        System.out.println("String para número inteiro: " + palavra3 + " -> " + numero2);
    }
}
