package lesson_6.lesson_6_ex_2;

public class Main {
    public static void main(String[] args) {
        TelephoneBook phoneBook = new TelephoneBook();
        phoneBook.add("Byers", "123-456-7890");
        phoneBook.add("Berenger", "098-765-4321");
        phoneBook.add("Byers", "555-555-5555");

        System.out.println("Byers " + phoneBook.getNumber("Byers"));
        System.out.println("Berenger " + phoneBook.getNumber("Berenger"));
    }
}