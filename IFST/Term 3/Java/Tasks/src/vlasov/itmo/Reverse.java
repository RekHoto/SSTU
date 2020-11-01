package vlasov.itmo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse {
    public static void reverse() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("./src/vlasov/itmo/input.txt"));
        List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int rescnt = 0;
        while (sc.hasNextLine()) {
            Scanner line = new Scanner(sc.nextLine());
            res.add(new ArrayList<>());
            while (line.hasNextInt()) {
                res.get(rescnt).add(line.nextInt());
            }
            rescnt++;
        }

        for (int i = res.size() - 1; i >= 0; i--) {
            for (int j = res.get(i).size() - 1; j >= 0; j--) {
                System.out.print(res.get(i).get(j) + (j != 0 ? " " : "\n"));
            }
        }
    }
}
