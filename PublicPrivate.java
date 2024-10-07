public class PublicPrivate {
    public static void main(String[] args) {
        /*
         * Metodos ou atributos publicos podem ser usados em qualquer classe, já os privados, apenas podem ser usados dentro da classe que eles pertencem.
         */
        InnerPublicPrivate obj1 = new InnerPublicPrivate(10, "Mesa");
        System.out.println("\n " + obj1.getNum() + "\n");
    }
}

public class InnerPublicPrivate {
    private int num;
    String name;

    public InnerPublicPrivate(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }
}
