package simpleMap;

public class MapTester {


	public static void main(String[] args) {
		MapTester run = new MapTester();
		run.launch();

	}
	private void launch() {
		SimpleMap mymap = new SimpleMap();
		String value = "hello";
		
		mymap.put(hash(value), value);
		System.out.println(mymap.get(hash(value)));

		System.out.println("Is the map empty? : " + mymap.isEmpty());
		
		
		
	}
	
	public int hash(String value) {		
		int hash = value.hashCode();
		hash = Math.abs(hash);
		hash = hash % 999;
		return hash;
	}

}
