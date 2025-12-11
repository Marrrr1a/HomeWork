package home_work_5;

import java.io.*;
import java.util.*;

public class WarAndPeace {

    static Set<String> allWords = new HashSet<String>();


    /**
     * Метод, который считывает текст из файла "Война и мир" и делит его на слова
     * @return массив со словами из текста
     * @throws IOException предупреждение о возможной ошибке чтения текста
     */
    public String[] warAndPeaceReader () throws IOException {
        String wholeText = " ";

        BufferedReader reader = new BufferedReader(new FileReader("Война и мир_книга.txt"));
        String lines = reader.readLine();
        while (lines != null){
            wholeText = wholeText + lines;
            lines = reader.readLine();
        }
        String [] words = wholeText.split(" ");
        return words;
    }


    /**
     * Метод, который считывает текст из файла "Война и мир" и делит его на слова
     * @return строку со словами из текста
     * @throws IOException предупреждение о возможной ошибке чтения текста
     */
    public String warAndPeaceReaderString () throws IOException {
        String wholeText = " ";

        BufferedReader reader = new BufferedReader(new FileReader("Война и мир_книга.txt"));
        String lines = reader.readLine();
        while (lines != null){
            wholeText = wholeText + lines;
            lines = reader.readLine();
        }
        return wholeText;
    }



    /**
     * Метод, который добавляет все использованные в тексте слова в коллекцию и выводит количество уникальных слов
     * @param words массив со словами из текста
     * @return коллекцию уникальных слов
     */
    public static Set<String> collectionAndCount (String [] words) {

        int wordsCounter = 0;

        for (int i = 0; i < words.length; i++) {
            allWords.add(words[i]);
            wordsCounter++;
        }
        System.out.println("Количество использованных слов: " + wordsCounter);
        System.out.println("Все использованные слова: ");
        return allWords;
    }


    /**
     * Метод, подсчитывающий, сколько раз каждое слово встречается в тексте
     * @param words массив со словами из текста
     * @return коллекцию Map с ключами (словами) и значениями (количество повторений слова)
     */
    public static List<Map.Entry<String, Integer>> countAndSort(String[] words) {

        Map <String, Integer> stringIntegerMap = new HashMap<>();
        int amount = 0;

        for (int i = 0; i < words.length; i++) {
            allWords.add(words[i]);

            if (!stringIntegerMap.containsKey(words[i])){
                stringIntegerMap.put(words[i],1);
            } else {
                stringIntegerMap.put(words[i],stringIntegerMap.get(words[i])+1);
            }
        }

        List <Map.Entry<String, Integer>> listForSorting = new ArrayList<>(stringIntegerMap.entrySet());
        listForSorting.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> x1, Map.Entry<String, Integer> x2) {
                return x2.getValue().compareTo(x1.getValue());
            }
        });
        return listForSorting;
    }
}


