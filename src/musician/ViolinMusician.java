package musician;

import partition.Partition;
import java.util.ArrayList;

public class ViolinMusician extends Observer implements Musician {

    String name;
    ArrayList<Partition> partitions = new ArrayList<Partition>();

    public ViolinMusician(String n) {
        name = n;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Partition> getPartitions() {
        return partitions;
    }

    @Override
    public void addPartition(Partition partition) {
       partitions.add(partition);
    }

    @Override
    public void removePartition(Partition partition) {
        partitions.remove(partition);
    }

    @Override
    public void update(Partition partition) {
        System.out.println(name + " (VIOLONIST) | Notified of the addition of the partition " + partition.getName() + " with the tonality " + partition.getTonality());
    }

}
