import java.util.ArrayList;
import java.util.List;

public class Album extends Music{
	
	private List<String> trackList = new ArrayList<String>();
	
	public Album(Format format, String isbn, String genre, String artist, String title, int year,  List<String> trackList) {
		super(format, isbn, genre, artist, title, year);
		this.trackList.addAll(trackList);
	}
    	
	public String getType(){
	      return "Album";
	}
	
	public final List<String> getTrackList() {
		return this.trackList;
	}
	
	public String toString() {
		String stringBuilder = super.toString() + ", Tracks: " + getTrackList();
		return stringBuilder;
	}
}

