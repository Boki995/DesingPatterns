
public class Main {

	public static void main(String[] args) {
		
		SongOfThe70s songs70s = new SongOfThe70s();
		SongOfThe80s songs80s = new SongOfThe80s();
		SongOfThe90s songs90s = new SongOfThe90s();
		
DiscJockey madMike=new DiscJockey(songs70s,songs80s,songs90s);
 					madMike.showTheSongs2();
	}

}
