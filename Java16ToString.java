public class Java16ToString {
    public static void main(String[] args) {
        /*
         * Todos os objetos sao filhos da classe Object do Java, entao e possivel sobreescrever a descricao da classe sobreescrevendo o metodo "toString()".
         */

        Test test = new Test();
        System.out.println(test);
    }
}

class Test {
    private String name = "Teste";

    @Override
    public String toString() {
        return "\n Classe: Test\n Nome: " + this.name + "\n";
    }
}
