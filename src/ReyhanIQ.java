import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReyhanIQ {

	public static void main(String[] args) {
		// Find first non-duplicate letter -> str = "testoftest" ==> should return 'o'
		// letter
		System.out.println(nonduplicate());
		String str = "testoftest";
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] array = str.toCharArray();

		for (char t : array) {
			Integer count = map.get(t);
			if (count == null) {
				map.put(t, 1);
			} else {
				map.put(t, count + 1);
			}
		}
	
		Set<Entry<Character, Integer>> entry = map.entrySet();
		Iterator it = entry.iterator();
		Character firstnonduplicate = 0;
		for (Entry<Character, Integer> e : entry) {
			int val=e.getValue();
			if( val>1) {
				map.remove(val);
			}
		}
		System.out.println(map);
		System.out.println(firstnonduplicate);
}

	public static Character nonduplicate() {
		String str = "testoftest";
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] array = str.toCharArray();

		for (char t : array) {
			Integer count = map.get(t);
			if (count == null) {
				map.put(t, 1);
			} else {
				map.put(t, count + 1);
			}
		}

		Set<Entry<Character, Integer>> entry = map.entrySet();
		Iterator it = entry.iterator();
		Character nonduplicate = 0;
		for (Entry<Character, Integer> e : entry) {
			nonduplicate = e.getKey();
			break;
		}
		return nonduplicate;
	}

}
