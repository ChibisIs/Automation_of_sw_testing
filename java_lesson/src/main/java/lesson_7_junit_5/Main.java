package lesson_7_junit_5;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Факториал 5: " + Arithmetic.factorial(5));
            System.out.println("Площадь треугольника со сторонами 3, 4, 5: " + Arithmetic.triangleArea(3, 4, 5));
            Arithmetic.arithmetic(10, 2);
            Arithmetic.compare(10, 20);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
