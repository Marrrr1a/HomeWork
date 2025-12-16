package home_work_2.task2_3_new;

public class ForEachOperation implements  IArraysOperation{
    @Override
    public int everyElement(int[] container) {
        for (int element : container) {
            System.out.print(element + " ");
        }
        System.out.print("\n------------");
        return 1;
    }

    @Override
    public int everySecondElement(int[] container) {

        return 0;
    }

    @Override
    public int swap(int[] container) {

        return 2;
    }
}
