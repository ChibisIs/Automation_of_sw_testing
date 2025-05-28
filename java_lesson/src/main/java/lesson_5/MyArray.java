package lesson_5;

public class MyArray {
    private String[][] array = new String[4][4];
    //1
    public void setArray(String[][] array) throws MyArraySizeException {
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) {
            throw new MyArraySizeException();
        }
        this.array = array;
    }
    //2
    public int sumArray() throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                int value;
                try {
                    value = Integer.parseInt(String.valueOf(array[i][j]));
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }                                
            }
        }
        return sum;
    }
    //4
    public int getArrayElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        if (i < 0 || i >= array.length || j < 0 || j >= array[i].length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return Integer.parseInt(array[i][j]);
    }
}
