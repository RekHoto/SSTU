package vlasov.block7;

public class ImmutableArray {
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