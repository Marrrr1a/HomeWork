package home_work_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineTest {

    private final ISearchEngine searchWithIndexOf = new EasySearch();


    @Test
    public void mamaRama() {
        Assertions.assertEquals(0, searchWithIndexOf.search("Мама мыла раму", "мыл"));
    }
}

