package replitQuestions;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumOfDuplicateCharacterInString {

	public static void main(String[] args) {
		String str = "welcome to united states";
		char[] characters = str.toCharArray();
		Map<Character, Integer> countDuplicateMap = new HashMap<Character, Integer>();
		for (char c : characters) {
			if (countDuplicateMap.containsKey(c)) {
				countDuplicateMap.put(c, countDuplicateMap.get(c) + 1);
			} else {
				countDuplicateMap.put(c, 1);
			}

		}
		for (Map.Entry<Character, Integer> entry : countDuplicateMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
}
