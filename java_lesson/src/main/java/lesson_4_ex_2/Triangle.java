package lesson_4_ex_2;

public class Triangle implements Shape {
    private double a, b, c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Невозможный треугольник");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override  
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
    
    @Override
    public void printDetails() {
        System.out.printf("Треугольник: Периметр = %.2f, Площадь = %.2f, Заливка = %s, Граница = %s%n",
                          getPerimeter(), getArea(), getFillColor(), getBorderColor());
    }
}
