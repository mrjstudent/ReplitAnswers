package replitQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsIndexInArray {

	public static void main(String[] args) {
		// 1. Method one
		String[] arr = { "test", "take", "nice", "pass", "test", "nice" };
//		Set <String> setArray=new HashSet<String>();
//		for(String words:arr) {
//			if (setArray.add(words)==false) {
//				System.out.println(words+ " is duplicate value");
//			}
//				
//		}
		// 2. Method two
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println(arr[i] + "is duplicae value");
				}

			}
		}

	}
}
