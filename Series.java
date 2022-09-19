import java.util.ArrayList;
import java.util.List;

public class Series extends Media{
	
	private String title;
	private List<String> cast = new ArrayList<String>();
	private List<String> episodes = new ArrayList<String>();
	
	public Series(Format format, String isbn, String genre, String title, List<String> cast, List<String> episodes) {
		super(format, isbn, genre);
		this.title = title;
		this.cast.addAll(cast);
		this.episodes.addAll(episodes);
	}
	
	public String getType() {
		return "Series";
	}
	
	public final String getTitle() {
		return title;
	}
	
	public final List<String> getCast(){
		return cast;
	}
	
	public final List<String> getEpisodes(){
		return episodes;
	}
	
	public String toString() {
		String stringBuilder = "Title: " + getTitle() + ", " + super.toString();
		return stringBuilder;
	}
	
	public int compareTo(Media m) {
		/*
		 Books come before Movies, Movies come before Series, Series come before Music
		 Books are sorted first by author, then by title
		 Movies are sorted first by title, then by year
		 -Series are sorted just by title
		 Music is sorted first by artist, then by year, then by title
		 */
		int returningInt = 0;
		
		if(m instanceof Music) {
			returningInt = -1;
		}
		
		else if(! (m instanceof Series)) {
			returningInt = 1;
		}
		
		else {
			Series s = (Series) m;
			returningInt = this.title.compareTo(s.title);
		}
		return returningInt;
	}
}