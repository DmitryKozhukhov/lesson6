package lesson6;

public abstract class Animal {

    private String name;
    private int disRun;
    private int disSwim;

    public int getDisRun() {
        return disRun;
    }

    public int getDisSwim() {
        return disSwim;
    }

    public String getName() {
        return name;
    }

    public Animal(String name, int DisRun, int disSwim) {
        this.name = name;
        this.disRun = DisRun;
        this.disSwim = disSwim;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

}