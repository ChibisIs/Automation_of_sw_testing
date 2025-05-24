package lesson_4_ex_2;

public class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
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
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public void printDetails() {
        System.out.printf("Круг: Периметр = %.2f, Площадь = %.2f, Заливка = %s, Граница = %s%n",
                          getPerimeter(), getArea(), getFillColor(), getBorderColor());
    }
}