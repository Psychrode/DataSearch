public class SearchFilter implements MediaFilter{
	
	private String searchTerm;
	
	public SearchFilter(String searchTerm) {
		this.searchTerm = searchTerm;
	}
	
	public boolean matches(Label<String, Media> a) {
		/*
		 * returns true if the label contains the searchTerm, or if the
		 * searchTerm is in the string returned by the toString method of the media item. You may find
		 * the string method indexOf useful for this.
		 */
		if(a.toString().indexOf(searchTerm) == -1) {
			return false;
		}
		else {
			return true;
		}
	}
}