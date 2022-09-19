public class MediaAlreadyInLibrary extends Exception{
	
    private String name; 
    private String media;

    public MediaAlreadyInLibrary(String name, String media){
        super("Media already in Library");
        this.name = name;
        this.media = media;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public String getMedia() {
    	return this.media;
    }
}