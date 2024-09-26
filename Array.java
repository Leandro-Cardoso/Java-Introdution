import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
         * Array -> Lista simples e com tamanho pré estabelecido.
         * ArrayList -> Melhor performance em pegar ou buscar valores.
         * LinkedList -> Melhor performance em adicionar ou remover elementos.
        */
        // DECLARAÇÃO:
        String[] array = new String[5];
        String[] array2 = {"A", "B", "C", "D", "E"};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

        // Pegar elemento:
        System.out.println("\n Pegar elementos:\n");
        System.out.println(" Array (3º elemento): " + array2[2]);
        System.out.println(" ArrayList (3º elemento): " + list2.get(2));

        // Tamanho:
        System.out.println("\n Tamanhos:\n");
        System.out.println(" Array: " + array2.length);
        System.out.println(" ArrayList: " + list2.size());

        // Adicionar elemento:
        System.out.println("\n Adicionar elemento:\n");
        list2.add("6");
        System.out.println(" ArrayList: " + list2.get(5));

        // Mudar elemento:
        System.out.println("\n Mudar elementos:\n");
        array2[0] = "L";
        list2.set(0, "35");
        System.out.println(" Array: " + array2[0]);
        System.out.println(" ArrayList: " + list2.get(0));

        // Remover elemento:
        System.out.println("\n Remover elemento:\n");
        list2.remove("6");
        list2.remove(1);
        System.out.println(" ArrayList: " + list2.get(3));
        System.out.println(" ArrayList 2: " + list2.get(1));

        // Print:
        System.out.println("\n Remover elemento:\n");
        System.out.println(" Array: " + array2);
        System.out.println(" ArrayList: " + list2 + "\n");
    }
}