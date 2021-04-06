import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
public class DiscJockey {
	
	SongOfThe70s song70s;
	SongOfThe80s song80s;
	SongOfThe90s song90s;
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	
	public DiscJockey(SongIterator newSong70s,SongIterator newSong80s,SongIterator newSong90s){
		
		iter70sSongs = newSong70s;
		iter80sSongs = newSong80s;
		iter90sSongs = newSong90s;
		
	}
	
	/*public void showTheSongs(){
		ArrayList aL70sSongs = song70s.getBestSongs();
		
		System.out.println("Songs of the 70s\n");
		for(int i=0; i<aL70sSongs.size();i++){
			
			SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
			
			
			
		}
		
	SongInfo[] array80sSongs = song80s.getBestSongs();
		
		System.out.println("Songs of the 80s\n");
		for(int i=0; i<array80sSongs.length;i++){
			
			SongInfo bestSongs = array80sSongs[i];
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
		
		
	}
		
Hashtable<Integer, SongInfo> ht90sSongs = song90s.getBestSongs();
		
		for(Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();){
			
			SongInfo bestSongs = ht90sSongs.get(e.nextElement());
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());

	}
	
	
}*/
	
	public void showTheSongs2(){
		Iterator songs70s= iter70sSongs.createIterator();
		Iterator songs80s= iter80sSongs.createIterator();
		Iterator songs90s= iter90sSongs.createIterator();
		
		System.out.println("Songs of the 70s\n");
		printTheSongs(songs70s);
		
		
		
	}
	public void printTheSongs(Iterator iterator){
		
		while(iterator.hasNext()){
			
			SongInfo songInfo = (SongInfo) iterator.next();
			
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased());
			
			
			
		}
		
		
		
		
	}
}
