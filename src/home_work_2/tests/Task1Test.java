package home_work_2.tests;

import home_work_2.task1_new_version.Task1_New;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void mltplyLoop (){
        Assertions.assertEquals(720, Task1_New.mltplyLoop(6));
        Assertions.assertEquals(0, Task1_New.mltplyLoop(-15));
        Assertions.assertEquals(1, Task1_New.mltplyLoop(1));
        Assertions.assertEquals(2, Task1_New.mltplyLoop(14.3));
        Assertions.assertEquals(3, Task1_New.mltplyLoop(21));
    }

    @Test
    public void mltplyDigits () {
        Assertions.assertEquals(24, Task1_New.mltplyDigits("1234"));
        Assertions.assertEquals(0, Task1_New.mltplyDigits("456,5"));
        Assertions.assertEquals(1, Task1_New.mltplyDigits("-15"));
        Assertions.assertEquals(2, Task1_New.mltplyDigits("Привет"));
    }

    @Test
    public void degree () {
        Assertions.assertEquals(1331, Task1_New.degree("11","3"));
        Assertions.assertEquals(1, Task1_New.degree("15","0"));
        Assertions.assertEquals(166.375, Task1_New.degree("5.5","3"));
        Assertions.assertEquals(166.375, Task1_New.degree("5,5","3"));
        Assertions.assertEquals(1, Task1_New.degree("5","3.2"));
        Assertions.assertEquals(1, Task1_New.degree("5","3,2"));
        Assertions.assertEquals(-125, Task1_New.degree("-5","3"));
        Assertions.assertEquals(0.125, Task1_New.degree("2","-3"));
    }

    @Test
    public void max () {
        Assertions.assertEquals(5, Task1_New.max(153));
        Assertions.assertEquals(0, Task1_New.max(0));
        Assertions.assertEquals(9, Task1_New.max(-199));
    }

    @Test
    public void random () {
        Assertions.assertEquals(1, Task1_New.random());
    }

    @Test
    public void even () {
        Assertions.assertEquals(3 & 4, Task1_New.even(1234567));
        Assertions.assertEquals(0 & 0, Task1_New.even(0));
        Assertions.assertEquals(3 & 4, Task1_New.even(-1234567));
    }

    @Test
    public void fibonacci () {
        Assertions.assertEquals(3, Task1_New.fibonacci(3));
        Assertions.assertEquals(8, Task1_New.fibonacci(5));
        Assertions.assertEquals(-1, Task1_New.fibonacci(-12));
        Assertions.assertEquals(-2, Task1_New.fibonacci(0));
    }

    @Test
    public void range () {
        Assertions.assertEquals(0, Task1_New.range(45,100,8));
        Assertions.assertEquals(1, Task1_New.range(78,4,6));
        Assertions.assertEquals(2, Task1_New.range(4,78,0));
        Assertions.assertEquals(3, Task1_New.range(4,78,100));
        Assertions.assertEquals(4, Task1_New.range(4,78,-5));
        Assertions.assertEquals(5, Task1_New.range(-8,-54,5));
    }

    @Test
    public void swap () {
        Assertions.assertEquals(31465, Task1_New.swap(56413));
        Assertions.assertEquals(0, Task1_New.swap(0));
        Assertions.assertEquals(564621, Task1_New.swap(-126465));
    }

}
