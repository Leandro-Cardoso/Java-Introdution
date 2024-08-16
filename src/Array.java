import java.util.ArrayList;

public class Array {
    public static void test() {
        /*
        Array:
        */
        int[] numerosA = {1, 2, 3, 4, 5};
        int[] numerosB = new int[5];
        int n = numerosA.length;
        
        System.out.println(numerosA);
        System.out.println(numerosB);
        
        ArrayList<Integer> numerosIndeterminados = new ArrayList<Integer>();
        numerosIndeterminados.add(10);
        numerosIndeterminados.add(20);
        numerosIndeterminados.add(30);
        
        System.out.println(numerosIndeterminados);
    }
}
