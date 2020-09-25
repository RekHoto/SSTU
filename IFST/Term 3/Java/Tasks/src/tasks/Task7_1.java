package tasks;

public class Task7_1 {
    public static void main(String[] args) {
        ImmutableArray arr1 = new ImmutableArray(3, 5, 0, 1, 10, -2);
        System.out.println(arr1);
        ImmutableArray arr2 = new ImmutableArray(new int[]{5, -17, 2, 4});
        System.out.println(arr2);
        ImmutableArray arr3 = new ImmutableArray(new int[]{});
        System.out.println(arr3.isEmpty());
        System.out.println(arr1.size());
        System.out.println(arr1.getArr());
        arr2.set(2, 10);
        System.out.println(arr2);
        System.out.println(arr1.get(5));
    }
}

class ImmutableArray {
    private int[] arr;

    public ImmutableArray(int... arr) {
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }
    public ImmutableArray(ImmutableArray arr) {
        this.arr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            this.arr[i] = arr.get(i);
        }
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public int get(int i) {
        if (i < 0 || i > arr.length - 1) throw new IndexOutOfBoundsException();
        return arr[i];
    }
    public void set(int i, int n) {
        if (i < 0 || i > arr.length - 1) throw new IndexOutOfBoundsException();
        arr[i] = n;
    }
    public int size() {return arr.length;}
    public int[] getArr() {return arr;}

    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            str.append(i == arr.length - 1 ? arr[i] + "]" : arr[i] + ", ");
        }
        return str.toString();
    }
}