package home_work_2.task2_3_new;

public class WhileOperation implements IArraysOperation {

    @Override
    public int everyElement(int[] container) {
        int i = 0;
        while (i < container.length) {
            int element = container[i];
            System.out.print(element + " ");
            i++;
        }
        System.out.print("\n");
        return 1;
    }

    @Override
    public int everySecondElement(int[] container) {
        int i = 0;
        while (i < container.length) {
            int element = container[i];
            System.out.print(element + " ");
            i += 2;
        }
        System.out.print("\n");
        return 0;
    }

    @Override
    public int swap(int[] container) {
        int i = container.length - 1;;
        while (i >= 0) {
            int element = container[i];
            System.out.print(element + " ");
            i --;
        }
        System.out.print("\n");
        return 2;
    }
}
