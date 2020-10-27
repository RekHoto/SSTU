package vlasov.block7;

public class MutableArray {
    private int[] arr;
    private int size = 0;
    private int maxSize;


    public MutableArray() {
        this.arr = new int[10];
        this.maxSize = 10;
    }
    public MutableArray(int... values) {
        this.size = values.length;
        this.maxSize = values.length;
        this.arr = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            this.arr[i] = values[i];
        }

    }
    public MutableArray(MutableArray arr) {
        this.arr = new int[arr.maxSize];
        this.copyArr(arr);
    }

    public void addValue(int value) {
        if (size == maxSize) increaseCapacity();
        arr[size++] = value;
    }
    public void addValue(int index, int value) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        if (size == maxSize) increaseCapacity();
        for (int i = index; i < size; i++) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        size++;
    }
    public void addValues(int[] values) {
        if (size + values.length >= maxSize) increaseCapacity(values.length);
        for (int i = size; i < size + values.length; i++) {
            arr[i] = values[i-size];
        }
        size += values.length;
    }
    public void addValues(int index, int[] values) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        if (size + values.length >= maxSize) increaseCapacity(values.length);
        for (int i = index; i < size; i++) {
            arr[i + values.length] = arr[i];
        }
        for (int i = index; i < index + values.length; i++) {
            arr[i] = values[i - index];
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
        arr[index] = value;
    }
    public int get(int index) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        return arr[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int[] getArr() {
        return arr;
    }
    private void increaseCapacity() {
        maxSize = (int) (maxSize * 1.5);
        int[] res = new int[maxSize];
        for (int i = 0; i < size; i++) {
            res[i] = arr[i];
        }
        arr = res;
    }
    private void increaseCapacity(int n) {
        maxSize = (int) ((maxSize + n) * 1.5);
        int[] res = new int[maxSize];
        for (int i = 0; i < size; i++) {
            res[i] = arr[i];
        }
        arr = res;
    }
    private void copyArr(MutableArray arr) {
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