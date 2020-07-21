import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InterviewJavaDuplicates {
	// write a method to get string and return as below:
	// aaaabbcccdda==> a4b2c3d2a

	public static void main(String[] args) {
		System.out.println(removeDuplicate("aaaabbcccdda"));
	}

	public static String removeDuplicate(String letters) {
		String text1 = letters.substring(0, letters.length() - 1);
		String text[] = text1.split("");
		Map<String, Integer> hmap = new HashMap<>();
		for (String t : text) {
			Integer count = hmap.get(t);// get the value of key which is integer and gives the number, simply i'm
										// pairing Key to value
			if (count == null) {// which means it doesn't have that character
				hmap.put(t, 1);// add pair to the map and if it is more than one increase the number by one
			} else {
				hmap.put(t, count + 1);
			}
		}
		String newString = "";
		//System.out.println(hmap);--> {a=4, b=2, c=3, d=2}
		Set<Entry<String, Integer>> entrySet = hmap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			newString += entry.getKey() + entry.getValue();
		}
		return newString = newString + letters.charAt(letters.length() - 1);
	}
}
