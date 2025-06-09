package lesson_7_junit_5;

public class Arithmetic {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Отрицательные числа не допускаются");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double triangleArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Такого треугольника не существует");
        }
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void arithmetic(int a, int b) {
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        if (b != 0) {
            System.out.println("Деление: " + ((double)a / b));
        } else {
            System.out.println("Деление: на ноль делить нельзя");
        }
        System.out.println("Умножение: " + (a * b));
    }

    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
    }
}
