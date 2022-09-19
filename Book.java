public class Book extends Media{
	
	private String title;
	private String author;
	private String publisher;
	
	Book(Format format, String isbn, String genre, String author, String title, String publisher){
		super(format, isbn, genre);
		this.author = author;
		this.title = title;
		this.publisher = publisher;
	}
	
	public String getType() {
		return "Book";
	}
	
	public final String getTitle() {
		return this.title;
	}
	
	public final String getAuthor() {
		return this.author;
	}
	
	public final String getPublisher() {
		return this.publisher;
	}
	
	public String toString() {
		String stringBuilder = "Title: " + getTitle() + ", Author: " + getAuthor() + ", " + super.toString();
		return stringBuilder;
	}
	
	@Override
	public int compareTo(Media o) {

		if(! (o instanceof Book)) {
			return -1;
		}
		else {
			Book b = (Book) o;
			int authorCompare = this.author.compareTo(b.author);
			if(authorCompare == 0){
				return this.title.compareTo(b.title);
			}
			else {
				return authorCompare;
			}
		}
		
	}
}
