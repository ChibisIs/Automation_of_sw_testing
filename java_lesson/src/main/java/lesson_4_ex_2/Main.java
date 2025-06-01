package lesson_4_ex_2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Чёрный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Серый");
        Shape triangle = new Triangle(3, 4, 5, "Зелёный", "Коричневый");

        circle.printDetails();
        rectangle.printDetails();
        triangle.printDetails();
    }
}
