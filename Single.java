public class Single extends Music{
	
	public Single(Format format, String isbn, String genre, String artist, String title, int year) {
		super(format, isbn, genre, artist, title, year);
	}
	
	@Override
	public String getType() {
		return "Single";
	}
}
//EXPECTED: Type: Single, ISBN: [000-1-22-33333333-4, Genre: Fiction], Format: BLURAY> 
//RECEIVED: Type: Single, ISBN: [Fiction, Genre: 000-1-22-33333333-4], Format: BLURAY>
