package musician;

import partition.Partition;

public abstract class Observer {
    public abstract void update(Partition partition);
}
