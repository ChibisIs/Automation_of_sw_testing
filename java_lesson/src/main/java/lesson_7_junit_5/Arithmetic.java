package lesson_7_junit_5;

public class Arithmetic {
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Отрицательные числа не допускаются");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double triangleArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Такого треугольника не существует");
        }
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public class ArithmeticResult {
        public int sum;
        public int diff;
        public int mult;
        public Double div;

        public ArithmeticResult(int sum, int diff, int mult, Double div) {
            this.sum = sum;
            this.diff = diff;
            this.mult = mult;
            this.div = div;
        }
    }

    public ArithmeticResult arithmeticOperations(int a, int b) {
        ArithmeticResult result = new ArithmeticResult(0, 0, 0, null);
        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        Double div = (b != 0) ? ((double) a / b) : null;
        return result = new ArithmeticResult(sum, diff, mult, div);
    }

    public int compare(int a, int b) {
        if (a > b) {
            System.out.println(a + " > " + b);
            return 1;
        } else if (a < b) {
            System.out.println(a + " < " + b);
            return -1;
        } else {
            System.out.println(a + " = " + b);
            return 0;
        }
    }
}
