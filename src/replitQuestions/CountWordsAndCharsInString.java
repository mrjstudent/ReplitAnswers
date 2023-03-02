package replitQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountWordsAndCharsInString {

	public static void main(String[] args) {
		String sentence = "This is a test of test";
		String[] words = sentence.split(" ");
		Map<String, Integer> wordsMap = new HashMap<String, Integer>();
		for (String word : words) {
			if (wordsMap.containsKey(word)) {
				wordsMap.put(word, wordsMap.get(word) + 1);
			} else {
				wordsMap.put(word, 1);
			}
		}
		System.out.println("Counting Words: " + wordsMap);

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
		System.out.println("Counting Chars: " + arrMap);

	}

}
