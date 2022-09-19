public class SearchFilter implements MediaFilter{
	
	private String searchTerm;
	
	public SearchFilter(String searchTerm) {
		this.searchTerm = searchTerm;
	}
	
	public boolean matches(Label<String, Media> a) {
		if(a.toString().indexOf(searchTerm) == -1) {
			return false;
		}
		else {
			return true;
		}
	}
}
