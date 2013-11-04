package simpleMap;


public class SimpleMap implements Map {

	private MapData[] mapArray = new MapData[1000];
	
	@Override
	public void put(int key, String value) {
			MapData newEntry = new MapData(key, value);
			mapArray[key] = newEntry;
	}

	@Override
	public String get(int key) {
		if(mapArray[key] != null) {
			return mapArray[key].value;
		} else {
			return null;
		}
		
	}

	@Override
	public boolean isEmpty() {
		boolean isempty = true; 
		for (int i = 0; i < mapArray.length; i++) {
			if(mapArray[i] != null) {
				return false;
			}
		}
		return isempty;
	}
	

}
