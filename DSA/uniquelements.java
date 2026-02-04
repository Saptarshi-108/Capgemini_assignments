// Print all the unique elements in the string. Using HashMaps and Lists.
package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//print the unique element.
public class SampleMap {
	public static void main(String args[]) {
		String[] words = { "eat", "tea", "tan", "ate", "tab", "nat", "bat" };

		SampleMap map = new SampleMap();
		List<List<String>> lists = map.groupAnagram(words);
		 System.out.println(lists);
	}

	public List<List<String>> groupAnagram(String[] string) {
		HashMap<String, List<String>> ans = new HashMap<>();
		for (String word : string) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);
			String keyString = new String(charArray);
			ans.putIfAbsent(keyString, new ArrayList<>());
			ans.get(keyString).add(word);
		}
		return new ArrayList<>(ans.values());
	}

}
