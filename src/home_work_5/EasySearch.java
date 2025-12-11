package home_work_5;

import java.util.regex.Matcher;

public class EasySearch implements ISearchEngine {

    public long search(String text, String word){

        int wordsCounter = 0;
        int lastIndex = 0;

        if (text == null || text.isEmpty()){
            System.out.println("Не введён текст");
        } else if (word == null || word.isEmpty()){
            System.out.println("Не введено искомое слово");
        }

        while ((lastIndex = text.indexOf(word,lastIndex)) != -1){
            wordsCounter++;
            lastIndex += word.length();

        }
        return wordsCounter;
    }
}
