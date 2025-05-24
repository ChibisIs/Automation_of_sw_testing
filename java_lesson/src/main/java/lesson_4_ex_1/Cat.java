package lesson_4_ex_1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        catCount++;
        satiety = false;
    }
    final private int MAX_RUN_DISTANCE = 200;
    private static int catCount = 0;
    boolean satiety = false;
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
        System.out.println(name + " can't swim");
    }
    public static int getCatCount() {
        return catCount;
    }
    public void eat(Bolw bolw, int foodAmount) {
        if (bolw.isFoodEnough(foodAmount)) {
            satiety = true;
            bolw.eatFood(foodAmount);
            System.out.println(name + " has eaten");
        } 
        else {
            System.out.println(name + " is still hungry");
        }
    }
    public boolean isSatiety() {
        return satiety;
    }
}
