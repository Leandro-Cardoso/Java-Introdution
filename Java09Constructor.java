public class Java09Constructor {
    public static void main(String[] args) {
        /*
         * "this" pode invocar a propria classe tambem e passar os parametros como padrão dentro de um metodo construtor sem parametros.
         */
        Dog dog1 = new Dog();
        System.out.println(dog1.str());
    }
}

class Dog {
    String name;
    int age;

    public Dog() {
        this("Rex", 0); // Valor padrão para o metodo construtor.
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String str() {
        return "\n Nome: " + name + "\n Idade: " + age + "\n";
    }
}
