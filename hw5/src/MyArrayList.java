import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayList implements SimpleList {

    public int array[];
    public int current_size;
    public int size;

    public MyArrayList() {
        size = 10;
        current_size = 0;
        array = new int[10];

    }

    public MyArrayList(int capacity) {
        size = capacity;
        current_size = 0;
        array = new int[capacity];

    }

    @Override
    public void add(int item) {
        if (current_size < size) {
            array[current_size] = item;
            current_size++;
        } else {
            array = Arrays.copyOf(array, array.length * 2);
            array[current_size] = item;
            current_size++;
            size = size * 2;
        }
    }

    @Override
    public int remove(int idx) throws ArrayIndexOutOfBoundsException {
       try {
           int ret = array[idx];
           if(current_size<=idx) ret=array[size];
           for (int i = idx; i < current_size - 1; i++) {
               array[i] = array[i + 1];
           }
           current_size--;
           return ret;
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Такого элемента не существует!");

           throw e;
       }
    }

    @Override
    public int size() {
        return current_size;
    }

    @Override
    public int get(int idx) throws ArrayIndexOutOfBoundsException {
       try {int ss;
           if(current_size<=idx) ss=array[size];
           return array[idx];
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Такого элемента не существует!");
           throw e;

       }
    }

}