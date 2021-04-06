import java.util.Arrays;
import java.util.Iterator;

public class SongOfThe80s implements SongIterator {
	
SongInfo[] bestSongs;

int arrayValue=0;
	
	
	public SongOfThe80s(){
		
		bestSongs = new SongInfo[3];
		
		
		addSong("Roam", "B52s", 1989);
		addSong("Cruel Summer", "Bananarama", 1984);
		addSong("Head Over Heels", "Tears for Fears", 1985);
		
		
		
		
		
		
	}
	
	public void addSong(String songName, String bandName, int yearReleased){
		
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		
		bestSongs[arrayValue] = songInfo;
		arrayValue++;
	}
	
/*	public SongInfo[] getBestSongs(){
		
		return bestSongs;
		
	}
	
	*/

	@Override
	public Iterator createIterator() {
		
		return Arrays.asList(bestSongs).iterator();
	}


}
