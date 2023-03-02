package replitQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatedIntegerFromArray {

	public static void main(String[] args) {
//		int[] arr = { 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 8 };
		
//		Arrays.sort(arr);
//		int []newArr= new int [arr.length];
//		int j=0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]!=arr[i+1]) {
//				newArr[j]=arr[i];
//				j++;
//			}
//			
//		}
//		newArr[j++]=arr[arr.length];
//		for(int i=0; i<j; i++) {
//			System.out.println(newArr[i]);
//		}
		//Using HashSet
		int[] arr = { 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 8 };
		Set<Integer> setArray=new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(setArray.add(arr[i])==true) {
				
			}
		}
		System.out.println(setArray);
	}
}
