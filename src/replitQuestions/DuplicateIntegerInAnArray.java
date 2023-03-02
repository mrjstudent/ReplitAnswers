package replitQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateIntegerInAnArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 4, 9, 3, 2, 5, 9, 4  };
		Set<Integer> arrSet = new HashSet<>();
		for (int r : arr) {
			if (arrSet.add(r) == false) {

				System.out.print( r+",");

			}
		}
//		for(int i=0; i<arr.length; i++) {
//			if (arrSet.add(arr[i])==false) {
//				System.out.println(arr[i]);
//			}
//		}

	}
}
