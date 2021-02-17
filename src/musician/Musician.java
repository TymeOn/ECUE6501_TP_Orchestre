package musician;

import partition.Partition;
import java.util.ArrayList;

public interface Musician {
    String getName();
    ArrayList<Partition> getPartitions();
    void addPartition(Partition partition);
    void removePartition(Partition partition);
    void update(Partition partition);
}
