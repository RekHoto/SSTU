package vlasov.block7;

public class ValueSet {
    private String[] arr;
    private int size = 0;
    private int maxSize;

    // Constructor
    public ValueSet() {this.arr = new String[10]; this.maxSize = 10;}
    public ValueSet(ValueSet arr) {
        this.arr = new String[arr.size()];
        this.maxSize = arr.size();
        this.size = arr.size();
        for (int i = 0; i < arr.size(); i++) {
            this.arr[i] = arr.get(i);
        }
    }

    // Adding values
    public void addValue(String str) {
        if (isUnique(str)){
            if (size == maxSize) increaseCapacity();
            arr[size++] = str; System.out.println("Значение добавлено");
        } else {
            System.out.println("Значение не добавлено");
        }
    }
    public void addValues(String[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (size == maxSize) increaseCapacity();
            if (isUnique(arr[i])) {
                this.arr[size++] = arr[i];
                cnt++;
            }
        }
        System.out.println("Добавлено " + cnt + " значений");
    }
    public void addValues(ValueSet arr) {
        this.addValues(arr.getArr());
    }

    // Removing values
    public void removeValue(String str) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == str) remove(i);
        }
    }
    public void removeValues(String[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < size; j++) {
                if (this.arr[j] == arr[i]) {
                    remove(j);
                    cnt++;
                }
            }
        }
        System.out.println("Удалено " + cnt + " значений");
    }
    public void removeValues(ValueSet arr) {
        this.removeValues(arr.getArr());
    }

    private void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }


    // Getting values
    public int size(){return size;}
    public String get(int index) {return arr[index];}
    public String[] getArr() {return arr;}


    // Other
    private void increaseCapacity() {
        maxSize = (int) (maxSize * 1.5);
        String[] res = new String[maxSize];
        for (int i = 0; i < size; i++) {
            res[i] = arr[i];
        }
        arr = res;
    }

    public boolean isUnique(String str) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == str) return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            str.append(i == size - 1 ? arr[i] + "]" : arr[i] + ", ");
        }
        return str.toString();
    }

}