import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] words = {"Яблоко", "Банан", "Виноград", "Банан", "Дыня", "Арбуз",
                "Груша", "Яблоко", "Банан", "Персик", "Банан", "Абрикос",
                "Груша", "Яблоко", "Апельсин"};

        // Создаем HashMap
        Map<String, Integer> wordCount = new HashMap<>();

        // Заполняем HashMap
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Создаем HashSet
        Set<String> uniqueWords = new HashSet<>(wordCount.keySet());

        // Выводим список
        System.out.println("Уникальные слова: " + uniqueWords);

        // Выводим, сколько раз встречается каждое слово
        System.out.println("Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
