package home_work_4;


import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T> {

    private T[] data;
    private int size = 0;


    public DataContainer(int containerSize){
        this.data= (T[]) new Object[containerSize];
        size = containerSize;
    }



    /**
     * Метод, добавляющий данные во внутреннее поле data и возвращающий номер позиции, в которую были вставлены данные
     * @param item - добавляемые данные
     * @return i - номер позиции
     */
    public int add (T item){

        T [] newData = Arrays.copyOf(data,data.length+1);

        if (item == null){
            System.out.println("Данный элемент нельзя вставить в контейнер");
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
               data[i] = item;
//               size++;
                return i;
            }

            if (i == data.length-1 && data[i] != null){
                data = newData;
                newData[i+1] = item;
//                size++;
                return i+1;
            }
        }
        return 0;
    }


    /**
     * Метод, возвращающий из массива предварительно сохранённый объект, который мы передали через метод add
     * @param index - порядковый номер объекта в массиве
     * @return data [index] - объект
     */
    public T get (int index){
        if (index >= 0 && index < data.length){
            return data [index];
        } else {
            return null;
        }
    }


    /**
     * Метод, возвращающий массив из поля data
     * @return data - массив
     */
    public T[] getItems(){
        return data;
    }


    /**
     * Метод, который удаляет элемент из массива data по индексу
     * @param index - индекс элемента
     * @return true или false (в зависимости от результата удаления)
     */
    public boolean delete (int index){

        if (index < 0 || index >= data.length){
            return false;
        } else {
            for (int i = index; i < data.length; i++){
                 if (i + 1 < data.length - 1){
                    data[i] = data [i + 1];
                     data [i + 1] = data [i + 2];
                 } else if (i + 1 == data.length-1){
                     data [i] = data [i + 1];
                 } else if (i == data.length-1){
                     data [i] = null;
                     this.data = Arrays.copyOf(data,data.length-1);
                     return true;
                 }
            }
        }
        return true;
    }


    /**
     * Метод, который удаляет элемент из массива data по совпадению содержимого
     * @param item - элемент
     * @return true или false (в зависимости от результата удаления)
     */
    public boolean delete (T item){

        int indexOfEqual = 0;

        if (item == null){
            return false;
        } else {
            for (int i = 0; i < data.length; i++){
                if (item.equals(data[i])){
                    indexOfEqual = i;
                    delete(indexOfEqual);
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * Метод, переопределяющий метод toString
     * @return содержимое массива в указанном виде
     */
    public String toString(){
        if (data.length == 0){
            return "[]";
        }

        StringBuilder newString = new StringBuilder();
        newString.append("[");

        for (int i = 0; i < data.length; i++){
            if (data[i] == null){
                delete(i);
            }
        }

        for (int i = 0; i < data.length; i++){
            newString.append(data[i]);
            if (i < data.length-1){
                newString.append(", ");
            }
        }

        newString.append("]");
        return newString.toString();
    }
}

