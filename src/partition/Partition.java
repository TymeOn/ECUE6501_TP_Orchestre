package partition;

public class Partition {

    String name;
    TonalityEnum tonality;

    public Partition(String n, TonalityEnum t) {
        name = n;
        tonality = t;
    }

    public String getName() {
        return name;
    }

    public TonalityEnum getTonality() {
        return tonality;
    }
}
