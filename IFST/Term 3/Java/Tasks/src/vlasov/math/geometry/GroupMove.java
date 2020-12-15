package vlasov.math.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupMove implements Moveable {
    List<Moveable> list = new ArrayList<>();

    public GroupMove(Moveable... list) {
        this.list.addAll(Arrays.asList(list));
    }

    @Override
    public void move(int x, int y) {
        for (Moveable el : list) el.move(x, y);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
