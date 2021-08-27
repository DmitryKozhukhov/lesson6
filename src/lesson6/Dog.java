package lesson6;

public class Dog extends Animal {

    @Override
    public void run(int distance) {
        if (distance <= getDisRun()){
            System.out.printf("Собака %s пробежит %s метров!!!%n", getName(), distance);
        } else System.out.printf("Собака %s не пробежит %s метров!!!%n", getName(), distance);
    }

    @Override
    public void swim(int distance) {
        if (distance <= getDisRun()){
            System.out.printf("Собака %s проплывет %s метров!!!%n", getName(), distance);
        } else System.out.printf("Собака %s не проплыет %s метров!!!%n", getName(), distance);
    }

    public Dog(String name, int disRun, int disSwim) {
        super(name, disRun, disSwim);
    }
}