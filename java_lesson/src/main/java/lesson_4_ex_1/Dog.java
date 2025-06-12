package lesson_4_ex_1;

public class Dog extends Animal {
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

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