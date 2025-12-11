package home_work_1.tests;

import home_work_1.task6_new_version.ICommunicationPrinter;
import home_work_1.task6_new_version.Task6_1_New;
import home_work_1.task6_new_version.Task6_2_New;
import home_work_1.task6_new_version.Task6_3_New;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6Test {

    @Test
    public void welcom (){

        ICommunicationPrinter ifElse = new Task6_1_New();
        ICommunicationPrinter ifElseIf = new Task6_2_New();
        ICommunicationPrinter switch3 = new Task6_3_New();

        Assertions.assertEquals("1", ifElse.welcom("Вася"));
        Assertions.assertEquals("2", ifElse.welcom("Анастасия"));
        Assertions.assertEquals("3", ifElse.welcom("Петя"));
        Assertions.assertEquals("1", ifElseIf.welcom("Вася"));
        Assertions.assertEquals("2", ifElseIf.welcom("Анастасия"));
        Assertions.assertEquals("3", ifElseIf.welcom("Петя"));
        Assertions.assertEquals("1", switch3.welcom("Вася"));
        Assertions.assertEquals("2", switch3.welcom("Анастасия"));
        Assertions.assertEquals("3", switch3.welcom("Петя"));
    }

}
