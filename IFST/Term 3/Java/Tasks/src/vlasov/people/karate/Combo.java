package vlasov.people.karate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combo {
    List<Hit> hits = new ArrayList<>();

    public Combo (Hit... hits) {
        this.hits.addAll(Arrays.asList(hits));
    }

    public void execute(Karatist k) {
        for (Hit h : hits) h.hit(k);
    }
}
