package home_work_5;

import java.io.IOException;
import java.util.*;

import static home_work_5.WarAndPeace.collectionAndCount;
import static home_work_5.WarAndPeace.countAndSort;


public class WarAndPeaceMain {
    public static void main(String[] args) throws IOException {


        WarAndPeace wholeText = new WarAndPeace();
        String [] words = wholeText.warAndPeaceReader();


        Set <String> countedWords = collectionAndCount(words);
        System.out.println(countedWords);


        List<Map.Entry<String, Integer>> finalList = countAndSort(words);
        System.out.println("Сколько записей из отсортированного набора вывести?");
        Scanner console = new Scanner(System.in);
        int amount = console.nextInt();

        for (int i = 0; i < amount; i++){
            System.out.println(i+1 + ". " + finalList.get(i));
        }


        ISearchEngine wordsSearch = new EasySearch();
        String text = wholeText.warAndPeaceReaderString();
        String word1 = "война";
        String word2 = " и ";
        String word3 = "мир";
        long result1 = wordsSearch.search(text,word1);
        long result2 = wordsSearch.search(text,word2);
        long result3 = wordsSearch.search(text,word3);
        System.out.println("Слово \"война\" встречается в тексте " + result1 + " раз(а)");
        System.out.println("Союз \"и\" встречается в тексте " + result2 + " раз(а)");
        System.out.println("Слово \"мир\" встречается в тексте " + result3 + " раз(а)");


    }
}


