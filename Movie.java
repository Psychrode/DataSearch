import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
	
	private String title;
	private String director;
	private int year;
	private List<String> cast = new ArrayList<String>();
	
	public Movie(Format format, String isbn, String genre, String title, String director, int year,  List<String> cast) {
		super(format,isbn,genre);
		this.title = title;
		this.director = director;
		this.year = year;
		this.cast.addAll(cast);
	}
	
	public String getType() {
		return "Movie";
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDirector() {
		return director;
	}
	
	public int getYear() {
		return year;
	}
	
	public List<String> getCast(){
		return cast;
	}
	
	public String toString() {
		//"Title: title, Year: year, "
		String stringBuilder = "Title: " + getTitle() + ", Year: " + getYear() + ", " + super.toString(); 
        return stringBuilder;
	}
	
	public int compareTo(Media o){
		/*
		 Books come before Movies, Movies come before Series, Series come before Music
		 Books are sorted first by author, then by title
		 Movies are sorted first by title, then by year
		 Series are sorted just by title
		 Music is sorted first by artist, then by year, then by title
		 */
		int returningInt = 0;
		if(o instanceof Book) {
			returningInt = 1;
		}
		else if(! (o instanceof Movie) && ! (o instanceof Book)) {
			returningInt = -1;
		}
		else {
			Movie m = (Movie) o;
			int titleCompare = this.title.compareTo(m.title);
			if(titleCompare == 0){
				if (this.year < m.year) {
					returningInt = -1;
				}
				else if(this.year > m.year) {
					returningInt = 1;
				}
				else {
					returningInt = 0;
				}
			}
		}
		return returningInt;
    }
}






