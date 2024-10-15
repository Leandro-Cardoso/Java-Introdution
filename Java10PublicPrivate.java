public class Java10PublicPrivate {
    /*
     * Metodos ou atributos publicos podem ser usados em qualquer classe, já os privados, apenas podem ser usados dentro da classe que eles pertencem.
     */
    private int num;
    String name;

    public Java10PublicPrivate(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }
}
