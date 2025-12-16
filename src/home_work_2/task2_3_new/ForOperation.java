package home_work_2.task2_3_new;

public class ForOperation implements IArraysOperation{
    @Override
    public int everyElement(int[] container) {
        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            System.out.print(element + " ");
        }
        System.out.print("\n");
        return 1;
    }

    @Override
    public int everySecondElement(int[] container) {
        for (int i = 0; i < container.length; i += 2) {
            int element = container[i];
            System.out.print(element + " ");
        }
        System.out.print("\n");
        return 0;
    }

    @Override
    public int swap(int[] container) {
        for (int i = container.length - 1; i >= 0; i--) {
            int element = container[i];
            System.out.print(element + " ");
        }
        System.out.print("\n");
        return 2;
    }
}
