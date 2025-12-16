package home_work_2.tests;

import home_work_2.task2_4_new_version.Task2_4_New;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2_4Test {


    @Test
    public void evenAndPositive (){
        Assertions.assertEquals(16, Task2_4_New.evenAndPositive(new int [] {1,5,6,7,651,13,651,-8,10}));
        Assertions.assertEquals(0, Task2_4_New.evenAndPositive(new int [] {0,0,0,0,0,0}));
        Assertions.assertEquals(0, Task2_4_New.evenAndPositive(new int [] {-2,-5,-85,-56,-65,-1,-5546}));
    }

    @Test
    public void max (){
        Assertions.assertEquals(651, Task2_4_New.max(new int [] {1,5,6,7,651,13,-8,10}));
        Assertions.assertEquals(0, Task2_4_New.max(new int [] {0,0,0,0,0,0}));
        Assertions.assertEquals(-2, Task2_4_New.max(new int [] {-2,-5,-85,-56,-65,-1,-5546}));
    }

    @Test
    public void lessThanMean (){
        Assertions.assertEquals("[1, 2, 3, 0, 0, 0, 0]", Task2_4_New.lessThanMean(new int [] {1,2,3,4,5,6,7}));
        Assertions.assertEquals("[1, -7, 0, 0, 0, 0, 0]", Task2_4_New.lessThanMean(new int [] {1,2,3,4,5,6,-7}));
    }

    @Test
    public void min (){
        Assertions.assertEquals(1 & -8, Task2_4_New.min(new int [] {1,5,6,7,651,13,-8,10}));
        Assertions.assertEquals(0 & 0, Task2_4_New.min(new int [] {0,0,0,0,0,0}));
        Assertions.assertEquals(-5546 & -85, Task2_4_New.min(new int [] {-2,-5,-85,-56,-65,-1,-5546}));
    }

    @Test
    public void delete (){
        Assertions.assertEquals(0, Task2_4_New.delete(new int [] {1,5,6,7,651,13,-8,10},4,13));
    }
}
