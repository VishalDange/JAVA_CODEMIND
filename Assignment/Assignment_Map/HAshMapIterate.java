package Assignment_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HAshMapIterate 
{
	 public static void main(String[] args) 
	 {
	        Map<String, String> hashMap = new HashMap<>();
	        hashMap.put("Anish", "Shinde");
	        hashMap.put("Abhi", "Kumbhar");
	        hashMap.put("Shivam", "Chougale");

	        Iterator<Map.Entry<String, String>> itr = hashMap.entrySet().iterator();
	        while (itr.hasNext()) 
	        {
	            Map.Entry<String, String> entry = itr.next();
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	 }
}
