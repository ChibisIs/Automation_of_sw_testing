package lesson_4;

public class Animal {
    public Animal(String name) {
        this.name = name;
        animalCount++;
    }
    protected String name;
    private static int animalCount = 0;

    public void run(int distance) {};
    public void swim(int distance) {};
    public static int getAnimalCount() {
        return animalCount;
    };
} 

