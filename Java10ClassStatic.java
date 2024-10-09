public class Java10ClassStatic {
    /*
     * Metodos ou atibutos estaticos são gerais, funcionam na classe, já não estaticos funcionam apenas nos objetos instanciados.
     */
    private static int count;
    String name;
    String color;

    public Java10ClassStatic(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public String str() {
        return "\n Nome: " + name + "\n Cor: " + color;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        System.out.println("\n " + Java10ClassStatic.getCount());

        Java10ClassStatic class1 = new Java10ClassStatic("Miguel", "Azul");
        System.out.println(class1.str() + "\n " + Java10ClassStatic.getCount());

        Java10ClassStatic class2 = new Java10ClassStatic("Joana", "Amarelo");
        System.out.println(class2.str() + "\n " + Java10ClassStatic.getCount());

        Java10ClassStatic class3 = new Java10ClassStatic("Leandro", "Verde");
        System.out.println(class3.str() + "\n " + Java10ClassStatic.getCount() + "\n");
    }
}
