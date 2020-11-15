import java.util.ArrayList;
import java.util.List;
import vlasov.itmo.Scanner;

public class ReverseAvg {
    public static void main(String[] args) {
        reverse();
    }
    public static void reverse() {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> res = new ArrayList<>();
        int rescnt = 0;
        while (sc.hasNextLine()) {
            Scanner line = new Scanner(sc.nextLine());
            res.add(new ArrayList<>());
            while (line.hasNextInt()) {
                res.get(rescnt).add(line.nextInt());
            }
            rescnt++;
        }

        for (int i = 0; i < res.size(); i++) {
            List<Integer> list = averages(res, i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<Integer> averages(List<List<Integer>> list, int ind) {
        List<Integer> res = new ArrayList<>(list.get(ind).size());
        long sum = 0;
        for (int i = 0; i < list.get(ind).size(); i++) {
            sum += list.get(ind).get(i);
        }
        for (int i = 0; i < list.get(ind).size(); i++) {
            int cnt = -1;
            long sum2 = -list.get(ind).get(i);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).size() > i) {
                    sum2 += list.get(j).get(i);
                    cnt++;
                }
            }
            res.add((int)((sum + sum2) / (list.get(ind).size() + cnt)));
        }
        return res;
    }
}
