import musician.Musician;
import musician.MusicianFactory;
import partition.Partition;
import partition.TonalityEnum;
import server.Server;

public class Main {

    public static void main(String[] args) {
        Server server = Server.getInstance();

        Musician m1 = MusicianFactory.getMusician("Johnny", "PIANO");
        Musician m2 = MusicianFactory.getMusician("Mitchell", "VIOLIN");
        Musician m3 = MusicianFactory.getMusician("Léa", "TRUMPET");
        server.addMusician(m1);
        server.addMusician(m2);
        server.addMusician(m3);
        
        Partition p1 = new Partition("La Lettre à Élise", TonalityEnum.A);
        Partition p2 = new Partition("Pars t'y sion", TonalityEnum.D);
        server.addPartition(p1);
        server.addPartition(p2);
        
    }
}
