public class Java14Polimorfismo {
    public static void main(String[] args) {
        /*
         * No polimorfismo o mesmo metodo ou atributo pode retornar valores diferentes.
         */
        Creature human1 = new Human(20);
        Creature coala1 = new Coala(3);

        System.out.println("\n O Humano é " + human1.getDiet());
        System.out.println("\n O Coala é " + coala1.getDiet() + "\n");
    }
}

class Creature {
    int age;

    public Creature(int age) {
        this.age = age;
    }

    public String getDiet() {
        return null;
    }
}

class Human extends Creature {
    String specie;

    public Human(int age) {
        super(age);
        this.specie = "Humano";
    }

    @Override
    public String getDiet() {
        super.getDiet();
        return "\n Onivoro\n";
    }
}

class Coala extends Creature {
    String specie;

    public Coala(int age) {
        super(age);
        this.specie = "Coala";
    }

    @Override
    public String getDiet() {
        super.getDiet();
        return "\n Herbivoro\n";
    }
}
