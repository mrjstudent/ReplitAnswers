package replitQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateStringInArray {

	public static void main(String[] args) {
		// Write a java program to print which words and how many times
		// they are repeated in above array.

		String[] str = { "test", "take", "nice", "pass", "test", "nice", "test" };

		Map<String, Integer> strMap = new HashMap<String, Integer>();
		for (String word : str) {
			Integer count = strMap.get(word);

			if (count == null) {
				strMap.put(word, 1);
			} else {
				strMap.put(word, ++count);
			}

		}
		System.out.println(strMap);

	}

}
