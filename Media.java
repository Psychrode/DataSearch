abstract class Media implements Comparable<Media>{

	private String isbn;
	private String genre;
	private Format format;
	
	public Media(Format format, String isbn, String genre) {
		this.format = format;
		this.isbn = isbn;
		this.genre = genre;
	}
	
	public final String getIsbn() {
		return this.isbn;
	}
	
	public final String getGenre() {
		return this.genre;
	}
	
	public final Format getFormat() {
		return format;
	}
	
	public abstract String getType();
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof Media && ((Media) o).isbn.equals(this.isbn)){
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		//This should have the form "Type: type, ISBN: isbn, Genre: genre, Format: format"
		String stringBuilder = "Type: " + getType() + ", ISBN: " + getIsbn() + ", Genre: " + getGenre() + ", Format: " + getFormat();
		//String stringBuilder = "Hello world!";
		return stringBuilder;
	}
	
	public abstract int compareTo(Media m);
}