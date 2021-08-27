package lesson6;

public class Main {

    public static void main(String[] args) {

        Animal Cat = new Cat("Барсик",200, 0);
        Animal Dog = new Dog("Барбос",500, 10);

        Dog.run(600);
        Cat.run(150);
        Dog.swim(9);
        Cat.swim(10);

    }
}
