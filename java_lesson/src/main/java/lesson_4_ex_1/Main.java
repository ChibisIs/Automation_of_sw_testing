package lesson_4_ex_1;

public class Main {
    public static void main(String[] args) {
        {
        Animal[] animals = { new Dog("Barsik"), new Dog("Sharik"), new Cat("Murzik") };
        animals[0].run(600);
        animals[0].swim(5);
        animals[2].run(100);
        System.out.println("Total animals: " + Animal.getAnimalCount());
        System.out.println("Total dogs: " + Dog.getDogCount());
        System.out.println("Total cats: " + Cat.getCatCount());
        }
        {
        Bolw bolw = new Bolw(200);
        Cat[] cats = { new Cat("Barsik"), new Cat("Murzik") };
        cats[0].eat(bolw, 100);
        cats[1].eat(bolw, 150);
        bolw.addFood(50);
        cats[1].eat(bolw, 150);
        for (Cat cat : cats) {
            System.out.println(cat.name + " is satiety: " + cat.isSatiety());
        }
        }
    }
}
