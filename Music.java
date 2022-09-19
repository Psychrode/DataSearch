abstract class Music extends Media{
	
	private String artist;
	private String title;
	private int year;
	
	public Music(Format format, String isbn, String genre, String artist, String title, int year) {
		super(format, isbn, genre);
		this.artist = artist;
		this.title = title;
		this.year = year;
	}
	
	public final String getArtist() {
		return artist;
	}
	
	public final String getTitle() {
		return title;
	}
	
    public final int getYear() {
    	return year;
    }	
    
    public String toString() {
    	//"Artist: artist, Year: year, Title: title, " followed by the information given in the format of the toString( method of the parent class.
    	String stringBuilder = "Artist: " + getArtist() + ", Year: " + getYear() + ", Title: " + getTitle() + ", " + super.toString();
    	return stringBuilder;
    }
    

    public int compareTo(Media m){
		/*
		 Books come before Movies, Movies come before Series, Series come before Music
		 Books are sorted first by author, then by title
		 Movies are sorted first by title, then by year
		 Series are sorted just by title
		 Music is sorted first by artist, then by year, then by title
		 */
		int returningInt = 0;
		
		if(!(m instanceof Book)) {
			returningInt = 1;
		}
		else {
			Music r = (Music) m;
			int artistCompare = this.artist.compareTo(r.artist);
			int titleCompare = this.title.compareTo(r.title);
			
			if(artistCompare != 0) {
				returningInt = artistCompare;
			}
			else if(this.year == r.year) {
				returningInt = titleCompare;
			}
			else if(this.year < r.year){
				returningInt = -1;
			}
			else {
				returningInt = 1;
			}
		}
		return returningInt;
    }
	
}