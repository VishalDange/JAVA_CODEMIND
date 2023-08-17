package Assignment_Map;

import java.util.HashMap;
import java.util.Map;

public class AddinHashMap 
{

	public static void main(String[] args) 
	{
		Map<String, Map<String, String>> HM = new HashMap<>();

		HM.put("India", new HashMap<>());
		HM.get("India").put("Maharashtra", "Mumbai");
		HM.get("India").put("Karnataka", "Bengaluru");
		HM.get("India").put("Goa", "Panaji");

		for (String country : HM.keySet()) 
		{
			System.out.println("Country: " + country);
			for (String state : HM.get(country).keySet()) 
			{
				System.out.println("State: " + state + ", District: " + HM.get(country).get(state));
			}
		}
	}
}
