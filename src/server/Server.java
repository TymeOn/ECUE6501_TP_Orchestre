package server;

import java.util.ArrayList;
import musician.Musician;
import partition.Partition;

public class Server
{
    private ArrayList<Musician> musicians = new ArrayList<Musician>();
    private ArrayList<Partition> partitions = new ArrayList<Partition>();

    private Server() {}
    
    private static Server INSTANCE = null;
     
    public static Server getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new Server(); 
        }
        return INSTANCE;
    }

    public void addMusician(Musician musician) {
        this.musicians.add(musician);
    }

    public void removeMusician(Musician musician) {
        this.musicians.remove(musician);
    }

    public void addPartition(Partition partition) {
        partitions.add(partition);
        for (Musician musician : this.musicians) {
            musician.update(partition);
        }
    }

    public void removePartition(Partition partition) {
        partitions.remove(partition);
    }

    public Integer countMusicians() {
        return musicians.size();
    }

    public Integer countPartitions() {
        return partitions.size();
    }

}