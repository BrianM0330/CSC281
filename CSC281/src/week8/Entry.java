package week8;

public class Entry <K, V>{
	
	private K key;
	private V value;
	
	public Entry(K thek, V thev) {
		key = thek;
		value = thev;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
