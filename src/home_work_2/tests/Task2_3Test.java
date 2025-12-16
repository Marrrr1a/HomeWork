package home_work_2.tests;

import home_work_2.task1_new_version.Task1_New;
import home_work_2.task2_3_new.DoWhileOperation;
import home_work_2.task2_3_new.ForEachOperation;
import home_work_2.task2_3_new.ForOperation;
import home_work_2.task2_3_new.WhileOperation;
import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2_3Test {

    int [] container = ArraysUtils.arrayRandom(5,50);
    DoWhileOperation operator1 = new DoWhileOperation();
    WhileOperation operator2 = new WhileOperation();
    ForOperation operator3 = new ForOperation();
    ForEachOperation operator4 = new ForEachOperation();

    @Test
    public void doWhile (){
        Assertions.assertEquals(1, operator1.everyElement(container));
        Assertions.assertEquals(0, operator1.everySecondElement(container));
        Assertions.assertEquals(2, operator1.swap(container));
    }

    @Test
    public void justWhile (){
        Assertions.assertEquals(1, operator2.everyElement(container));
        Assertions.assertEquals(0, operator2.everySecondElement(container));
        Assertions.assertEquals(2, operator2.swap(container));
    }

    @Test
    public void forEach (){
        Assertions.assertEquals(1, operator3.everyElement(container));
        Assertions.assertEquals(0, operator3.everySecondElement(container));
        Assertions.assertEquals(2, operator3.swap(container));
    }

    @Test
    public void justFor (){
        Assertions.assertEquals(1, operator4.everyElement(container));
        Assertions.assertEquals(0, operator4.everySecondElement(container));
        Assertions.assertEquals(2, operator4.swap(container));
    }

}
