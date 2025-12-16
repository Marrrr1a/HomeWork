package home_work_2.task2_3_new;

import home_work_2.utils.ArraysUtils;

public class ArraysIterationMain {
    public static void main(String[] args) {
        int [] container = ArraysUtils.arrayRandom(15,500);

        System.out.println("do - while");
        DoWhileOperation doWhile = new DoWhileOperation();
        doWhile.everyElement(container);
        doWhile.everySecondElement(container);
        doWhile.swap(container);

        System.out.println("\n --------------");
        System.out.println("while");
        WhileOperation justWhile = new WhileOperation();
        justWhile.everyElement(container);
        justWhile.everySecondElement(container);
        justWhile.swap(container);

        System.out.println("\n --------------");
        System.out.println("for");
        ForOperation justFor = new ForOperation();
        justFor.everyElement(container);
        justFor.everySecondElement(container);
        justFor.swap(container);

        System.out.println("\n --------------");
        System.out.println("for each");
        ForEachOperation forEach = new ForEachOperation();
        forEach.everyElement(container);
    }
}
