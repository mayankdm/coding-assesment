package java.training.assesments.question6;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static TreeMap<String, ArrayList<String>> map = new TreeMap<>();
	
	public void listingCountry(String countryNAme, ArrayList<String> district) {
		map.put(countryNAme, district);
	}
	public ArrayList<String> getCountry(String countryName) {
		if(!map.containsKey(countryName)) {
			return null;
		}
		return map.get(countryName);
	}
	public void listCountryBefore(String countryName) {
		Set<String> keys = map.keySet();
		for(String key: keys) {
			if(key.compareToIgnoreCase(countryName) < 0) {
				System.out.print(key+ ":");
				for(String s: map.get(key)) {
					System.out.println(s);
				}
			}
		}
	}
	public void listCountryAfter(String countryName) {
		Set<String> keys = map.keySet();
		for(String key: keys) {
			if(key.compareToIgnoreCase(countryName) > 0) {
				System.out.print(key+ ":");
				for(String s: map.get(key)) {
					System.out.println(s);
				}
			}
		}
	}
}
