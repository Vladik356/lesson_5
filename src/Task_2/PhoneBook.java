package Task_2;

import java.util.*;

public class PhoneBook {

    private final Map<String, List<String>> phoneBook;


    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи в телефонный справочник
    public void add(String lastName, String phoneNumber) {
        if (!phoneBook.containsKey(lastName)) {
            phoneBook.put(lastName, new ArrayList<>());
        }
        phoneBook.get(lastName).add(phoneNumber);
    }

    // Метод для получения списка номеров по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Экземпляр телефонного справочника
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "123-456");
        phoneBook.add("Petrov", "234-567");
        phoneBook.add("Ivanov", "789-999");
        phoneBook.add("Sidorov", "345-678");

        System.out.println("Ivanov's numbers: " + phoneBook.get("Ivanov"));
        System.out.println("Petrov's number: " + phoneBook.get("Petrov"));

        phoneBook.printAll();
    }
}

