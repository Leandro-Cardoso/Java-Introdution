public class Heranca {
    public static void main(String[] args) {
        /*
         * Herança de classe.
         */
        Human human1 = new Human("Humana", 35, true, "Leandro", "Cardoso");
        System.out.println(human1.str());

        Human human2 = new Human("Humana", 20, false, "Luna", "Lovegood");
        System.out.println(human2.str());

        Human human3 = new Human("Humana", 75, true, "Mario", "Carvalho");
        human3.die();
        System.out.println(human3.str());
    }
}

class Creature {
    String specie;
    int age;
    boolean gender;
    boolean isAlive;

    public Creature(String specie, int age, boolean gender) {
        this.specie = specie;
        this.age = age;
        this.gender = gender;
        this.isAlive = true;
    }

    public void die() {
        isAlive = false;
    }
}

class Human extends Creature {
    String name;
    String lastName;

    public Human(String specie, int age, boolean gender, String name, String lastName) {
        super(specie, age, gender);
        this.name = name;
        this.lastName = lastName;
    }

    public String str() {
        return "\n Espécie: " + specie + "\n Idade: " + age + "\n Genero: " + (gender ? "Masculino" : "Feminino") + "\n Nome: " + name + "\n Sobrenome: " + lastName + "\n Estatus: " + (isAlive ? "Vivo" : "Morto") + "\n";
    }
}
