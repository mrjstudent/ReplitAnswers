package replitQuestions;

import java.util.Arrays;

public class LargestSmallestAverageOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 121, 321, 5, 11, 5, 12, 15, 1, 21, 5, 21,
					113, 5, 111, 2, 1 };
		int size = 0;
		int largest = arr[0];
		int smallest = arr[0]; 
		int sum = 0;
		double average = 0;
		int secondLargest = arr[0];
		int secondSmallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
			sum = sum + arr[i];
			size = arr.length;
			average = sum / size;
			Arrays.sort(arr);

		}
		System.out.println(largest);
		System.out.println(smallest);
		System.out.println(sum);
		System.out.println(average);
		System.out.println();
//		System.out.println(average);

	}

}
