package lesson6;

public class Cat extends Animal{

    @Override
    public void run(int distance) {
        if (distance <= getDisRun()){
            System.out.printf("Кот %s пробежит %s метров!!!%n", getName(), distance);
        } else System.out.printf("Кот %s не пробежит %s метров!!!%n", getName(), distance);
    }

    @Override
    public void swim(int distance) {
        if (distance >= getDisSwim()){
            System.out.printf("Кот %s не умеет плавать!!!%n", getName());
        }
    }

    public Cat(String name, int disRun, int disSwim) {
        super(name, disRun, disSwim);
    }
}
