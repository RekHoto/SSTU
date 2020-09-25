package tasks;

public class Task7_2 {
    public static void main(String[] args) {
        NonExtendableArray arr1 = new NonExtendableArray(10);
        arr1.addValues(3,4,5,6,7);
        System.out.println(arr1);
        arr1.addValues(3L, 8,9,10,11,12);
        System.out.println(arr1);
        //arr1.addValue(10);
        System.out.println(arr1.get(0));
        System.out.println(arr1.size());
        System.out.println(arr1.isEmpty());
        arr1.removeValue(4);
        System.out.println(arr1);
        NonExtendableArray arr2 = new NonExtendableArray(arr1);
        System.out.println(arr2);
        arr2.addValue(10);
        System.out.println(arr1);
        System.out.println(arr2);


    }
}

class NonExtendableArray {
    private int[] arr;
    private int size = 0;
    private int maxSize;

    public NonExtendableArray(int maxSize) {
        if (maxSize < 0) throw new IllegalArgumentException();
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
    }
    public NonExtendableArray() {
        this.arr = new int[100];
        this.maxSize = 100;
    }
    public NonExtendableArray(NonExtendableArray arr) {
        this.arr = new int[arr.maxSize];
        this.copyArr(arr);
    }

    public void addValue(int value) {
        if (!canAdd(1)) throw new IllegalArgumentException();
        arr[size++] = value;
    }
    public void addValue(int index, int value) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        if (!canAdd(1)) throw new IllegalArgumentException();
        for (int i = index; i < size; i++) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        size++;
    }
    public void addValues(int... values) {
        if (!canAdd(values.length)) throw new IllegalArgumentException();
        for (int i = size; i < size + values.length; i++) {
            arr[i] = values[i-size];
        }
        size += values.length;
    }
    public void addValues(long index, int... values) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        if (!canAdd(values.length)) throw new IllegalArgumentException();
        for (int i = (int)index; i < size; i++) {
            arr[i+values.length] = arr[i];
        }
        for (int i = (int)index; i < index + values.length; i++) {
            arr[i] = values[i-(int)index];
        }
        size += values.length;
    }
    public void removeValue(int index) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        for (int i = index + 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }
    public void set(int index, int value) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();

    }
    public int get(int index) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        return arr[index];
    }
    public boolean canAdd(int numberOfElements) {
        return size + numberOfElements <= maxSize;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int[] getArr() {
        return arr;
    }

    private void copyArr(NonExtendableArray arr) {
        for (int i = 0; i < arr.size(); i++) {
            this.arr[i] = arr.get(i);
        }
        this.size = arr.size;
        this.maxSize= arr.maxSize;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            str.append(i == size - 1 ? arr[i] + "]" : arr[i] + ", ");
        }
        return str.toString();
    }
}