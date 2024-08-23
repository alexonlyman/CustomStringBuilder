package alex_pr;

import java.util.ArrayList;
import java.util.List;

public class Snapshot {

    private final StringBuilder stringBuilder;
    private final List<StringBuilder> snapshots = new ArrayList<>();

    public Snapshot(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void save(StringBuilder stringBuilder) {
        snapshots.add(new StringBuilder(stringBuilder));
    }


    public StringBuilder undo() {
        snapshots.remove(snapshots.size() - 1);
        return snapshots.get(snapshots.size() - 1);
    }


    @Override
    public String toString() {
        return "Snapshot{" +
                "stringBuilder=" + stringBuilder +
                '}';
    }
}
