package vlasov.birds;

import java.util.concurrent.ThreadLocalRandom;

public class Cuckoo extends Bird {
    @Override
    public void sing() {
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1,10); i++) System.out.println("ку-ку");
    }
}
