package tasks;

import java.util.Map;

public class Task7_7 {
    public static void main(String[] args) {

    }
}

class Phonebook {
    private Map<String, String> phones;

    public void add(String name, String number) {
        phones.put(name, number);
    }
    public void remove(String name) {
        phones.remove(name);
    }
    public String getNumber(String name) {
        return phones.get(name);
    }
    public boolean isInBook(String str) {
        return phones.containsKey(str);
    }

}
