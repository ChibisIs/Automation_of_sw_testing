package lesson_5;
import java.lang.ArrayIndexOutOfBoundsException;

public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        try {
            String[][] wrongArray = {
                {"00", "01", "02", "03"},
                {"10", "11", "12", "13"},
                {"20", "21", "22", "23"},
                {"30", "31", "32", "33"}
            };
            myArray.setArray(wrongArray);
            int sum = myArray.sumArray();
            myArray.getArrayElement(4, 4); // Попытка доступа к элементу вне границ массива
            System.out.println("Сумма элементов массива: " + sum);
        } 
        catch (MyArraySizeException e) {
            System.err.println("Массив должен быть размером 4x4");
        }
        catch (MyArrayDataException e) {
            System.err.println("Ошибка в данных ячейки: [" + e.row + "][" + e.col + "]");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка: выход за пределы массива");
        }
        catch (Exception e) {
            System.err.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }
}