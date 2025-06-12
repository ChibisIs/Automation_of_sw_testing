package lesson_4_ex_2;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
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
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
    
    @Override
    public void printDetails() {
        System.out.printf("Прямоугольник: Периметр = %.2f, Площадь = %.2f, Заливка = %s, Граница = %s%n",
                          getPerimeter(), getArea(), getFillColor(), getBorderColor());
    }
}
