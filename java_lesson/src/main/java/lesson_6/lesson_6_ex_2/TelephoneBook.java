package lesson_6.lesson_6_ex_2;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TelephoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(name, numbers);
    }

    public List<String> getNumber(String name) {
        return phoneBook.getOrDefault(name, Collections.emptyList());
    }
}
