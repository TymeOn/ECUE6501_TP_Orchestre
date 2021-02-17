package musician;

public class MusicianFactory {
	
   public static Musician getMusician(String name, String instrumentType) {
      if (instrumentType == null) {
         return null;
      }	

      if (instrumentType.equalsIgnoreCase("PIANO")) {
         return new PianoMusician(name); 
      } else if(instrumentType.equalsIgnoreCase("VIOLIN")) {
         return new ViolinMusician(name);
      }
      else if(instrumentType.equalsIgnoreCase("TRUMPET")) {
         return new TrumpetMusician(name);
      }
       
      return null;
   }
}