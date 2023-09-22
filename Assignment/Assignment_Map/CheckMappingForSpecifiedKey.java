package Assignment_Map;

import java.util.HashMap;
import java.util.Map;

public class CheckMappingForSpecifiedKey {
	public static void main(String[] args) 
	{
		Map<String, String> hm = new HashMap<>();
		hm.put("Anish", "Kolhapur");
		hm.put("Shivam", "Kolhapur");
		hm.put("Abhi", "Pune");
		
		String key = "Anish";
		boolean containsKey = hm.containsKey(key);
		System.out.println("The map contains the key " + key + " : " + containsKey);
		
		String key2 = "Rohit";
		boolean containsKey2 = hm.containsKey(key2);
		System.out.println("The map contains the key " + key2 + " : " + containsKey2);
	}
}
