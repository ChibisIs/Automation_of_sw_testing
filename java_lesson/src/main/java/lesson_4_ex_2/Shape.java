package lesson_4_ex_2;

public interface Shape {
    String getFillColor();
    
    String getBorderColor();
    
    default double getPerimeter() {
        throw new UnsupportedOperationException("Perimeter calculation is not supported for this shape.");
    }

    default double getArea() {
        throw new UnsupportedOperationException("Area calculation is not supported for this shape.");
    }

    void printDetails();
}

