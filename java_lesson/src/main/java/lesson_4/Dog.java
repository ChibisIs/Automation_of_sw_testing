package lesson_4;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    final private int MAX_RUN_DISTANCE = 500;
    final private int MAX_SWIM_DISTANCE = 10;
    private static int dogCount = 0;
    @Override
    public void run(int distance) {
        if (distance > MAX_RUN_DISTANCE) {
            System.out.println(name + " can't run " + distance + " meters");
            return;
        }
        System.out.println(name + " is running " + distance + " meters");
    }
    @Override
    public void swim(int distance) {
        if (distance > MAX_SWIM_DISTANCE) {
            System.out.println(name + " can't swim " + distance + " meters");
            return;
        }
        System.out.println(name + " is swimming " + distance + " meters");
    }
    public static int getDogCount() {
        return dogCount;
    }
}