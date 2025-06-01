package lesson_2;

public class Test {
    //1
    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    //2
    static void checkSumSign() {
        int a = 0, b = 0;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    //3
    static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    //4
    static void compareNumbers() {
        int a = 0, b = 0;
        if (a >= b) {
            System.out.println("a >= b");
        } 
        else {
            System.out.println("a < b");
        }
    }
    //5
    static Boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    //6
    static void isPositive(int value) {
        if (value >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }
    //7
    static boolean isNegative(int value) {
        if (value < 0) {
            return true;
        }
        return false;
    }
    //8
    static void printString(String str, int n) {
        for (int i = 0; i < n; ++i) {
            System.out.println(str);
        }
    }
    //9
    static Boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
    //10
    static void reverseArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }
    //11
    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i + 1;
        }
    }
    //12 
    static void checkArray(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }
    //13
    static void fillArrayDiagonal(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; ++i) { 
            for (int j = 0; j < arr[i].length; ++j) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
            }
        }
    }
    //14
    static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        isSumBetween10And20(5, 5);
        isPositive(0);
        isNegative(-1);
        printString("some string", 4);
        isLeapYear(1900);
        reverseArray();
        fillArray();
        checkArray();
        fillArrayDiagonal(5);
        createArray(4, 1);
    }
}
