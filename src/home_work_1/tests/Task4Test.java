package home_work_1.tests;

import home_work_1.Task4_1;
import home_work_1.task4_new_version.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {

    @Test
    public void oddNumber (){
        Assertions.assertEquals(0, Task4_1_New.oddNumber(7,5));
        Assertions.assertEquals(1, Task4_1_New.oddNumber(0,-2));
        Assertions.assertEquals(1, Task4_1_New.oddNumber(6,14));
        Assertions.assertEquals(2, Task4_1_New.oddNumber(3,14));
        Assertions.assertEquals(3, Task4_1_New.oddNumber(6,13));
        Assertions.assertEquals(1, Task4_1_New.oddNumber(0,0));
    }

    @Test
    public void midNumber (){
        Assertions.assertEquals(0, Task4_2_New.midNumber(7,5,16));
        Assertions.assertEquals(1, Task4_2_New.midNumber(-2,2,4));
        Assertions.assertEquals(2, Task4_2_New.midNumber(6,14,10));
        Assertions.assertEquals(3, Task4_2_New.midNumber(3,14,0));
        Assertions.assertEquals(4, Task4_2_New.midNumber(16,13,-7));
        Assertions.assertEquals(5, Task4_2_New.midNumber(7,5,6));
        Assertions.assertEquals(6, Task4_2_New.midNumber(0,0,0));
    }

    @Test
    public void divide (){
        Assertions.assertEquals(0, Task4_3_New.divide(7,0));
        Assertions.assertEquals(1, Task4_3_New.divide(10,2));
        Assertions.assertEquals(2, Task4_3_New.divide(15,4));
    }

    @Test
    public void bytesToKb (){
        Assertions.assertEquals(0, Task4_4_New.bytesToKb(5, "байты"));
        Assertions.assertEquals(1, Task4_4_New.bytesToKb(165165, "килобайты"));
        Assertions.assertEquals(2, Task4_4_New.bytesToKb(15, "гигабайты"));
    }

    @Test
    public void isLetter (){
        Assertions.assertEquals(0, Task4_5_New.isLetter(73));
        Assertions.assertEquals(1, Task4_5_New.isLetter(137));
    }

    @Test
    public void whatYear (){
        Assertions.assertEquals("Год является невисокосным", Task4_6_New.whatYear(1933));
        Assertions.assertEquals("Год является високосным", Task4_6_New.whatYear(1608));
    }
}
