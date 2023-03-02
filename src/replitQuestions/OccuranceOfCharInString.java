package replitQuestions;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharInString {
	String sentence = "All Is Well";

	public static void main(String[] args) {
		getOccuranceOfChar("welcome to united states");
	}

	public static void getOccuranceOfChar(String sentence) {
		char[] arrChar = sentence.toCharArray();
		Map<Character, Integer> arrMap = new HashMap<>();
		for (char c : arrChar) {
			// below line disregard count of spaces
//			if (!String.valueOf(c).isBlank()) { 

			if (arrMap.containsKey(c)) {
				arrMap.put(c, arrMap.get(c) + 1);
			} else {
				arrMap.put(c, 1);
			}
		}

//		}
		System.out.println(sentence + ":" + arrMap);

	}

}
