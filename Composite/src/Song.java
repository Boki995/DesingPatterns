
public class Song extends SongComponent {
	
	String songName;
	String bandName;
	int releseYear;

	public Song(String newSongName, String newBandName, int newReleseYear) {
		songName=newSongName;
		bandName=newBandName;
		releseYear=newReleseYear;
	}
	
	public String getSongName(){ return songName;}
	public String getBandName(){ return bandName;}
	public int getReleseYear(){ return releseYear;}
	
	public void displaySongInfo(){
		
		System.out.println(getSongName()+" was record by "+getBandName()+" in "+getReleseYear());
		
		
	}

}
