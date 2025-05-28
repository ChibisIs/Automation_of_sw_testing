package lesson_5;

public class MyArrayDataException extends Exception {
    public int row;
    public int col;

    public MyArrayDataException(int row, int col) {
        this.row = row;
        this.col = col;
    }
}