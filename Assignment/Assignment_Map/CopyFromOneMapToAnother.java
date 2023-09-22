package Assignment_Map;

import java.util.HashMap;
import java.util.Map;

public class CopyFromOneMapToAnother 
{
	public static void main(String[] args) 
	{
		Map<String, String> hm = new HashMap<>();
		hm.put("Anish", "Kolhapur");
		hm.put("Shivam", "Kolhapur");
		hm.put("Abhi", "Pune");

		Map<String, String> destHM = new HashMap<>();

		destHM.putAll(hm);

		for (String key : destHM.keySet()) 
		{
			System.out.println(key + " - " + destHM.get(key));
		}
	}

}
