import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InternalRepresentationOfHashMap 
{
	public static void main(String[] args) 
	{
//		ArrayList<String> mh=new ArrayList<>();
//		mh.add("Pune");
//		mh.add("Kolhapur");
//		
//		ArrayList<String> up=new ArrayList<>();
//		mh.add("Mathura");
//		mh.add("Agra");
//		
//		Map<String,ArrayList<String>> ind=new HashMap<>();
//		ind.put("Maharashtra",mh);
//		ind.put("Utter Pradesh",up);
//		
//		
//		ArrayList<String> florida=new ArrayList<>();
//		florida.add("Central florida");
//		florida.add("baker");
//		
//		ArrayList<String> calofornia=new ArrayList<>();
//		calofornia.add("san Jose");
//		calofornia.add("san Francisco");
//		
//		Map<String,ArrayList<String>> us=new HashMap<>();
//		ind.put("Maharashtra",florida);
//		ind.put("Utter Pradesh",calofornia);
//		
//		Map<String,Map<String,ArrayList<String>>> world=new HashMap<>();
//        world.put("India", ind);
//        world.put("United State", us);
////        world.put("India", ind);
		
		ArrayList<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Kolhapur");
		
		ArrayList<String> up = new ArrayList<>();
		up.add("Mathura");
		up.add("Agra");
		
		Map<String, ArrayList<String>> Ind = new HashMap<>();
		
		Ind.put("Maharashtra", mh);
		Ind.put("Uttar Pradesh", up);
		
		ArrayList<String> florida = new ArrayList<>();
		florida.add("central florida");
		florida.add("baker");
		
		ArrayList<String> california = new ArrayList<>();
		california.add("san jose");
		california.add("san francisco");
		
		Map<String, ArrayList<String>> us = new HashMap<>();
		us.put("Florida", florida);
		us.put("california", california);
		
		
		Map<String, Map<String, ArrayList<String>>> world = new HashMap<>();
		world.put("India", Ind);
		world.put("US", us);
		

        
        for (String country : world.keySet()) {
        	  for (String state : world.get(country).keySet()) {
        	    for (String city : world.get(country).get(state)) {
        	      System.out.println(country + ": " + state + ": " + city);
        	    }
        	  }
        	}
		

	}

}
