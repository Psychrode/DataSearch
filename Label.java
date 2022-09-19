public class Label<K, V extends Comparable<V>> implements Comparable<Label<K,V>>{
	
    private K key; 
    private V value;    
    
    public Label(K key, V value){
        this.key = key; 
        this.value = value; 
    }
    
    public K getKey(){
        return this.key; 
    }
    
    public V getValue(){
        return this.value;   
    }
    
    public boolean equals(Object obj){
        if(obj instanceof Label && ((Label) obj).value == this.value){
            return true;  
        }
        else {
        	return false;
        }   
    }
    
    public int compareTo(Label<K,V> passedInKV){
        return this.value.compareTo(passedInKV.value);  
    }
}