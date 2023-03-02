package replitQuestions;

import java.util.ArrayList;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(2, 100));
	}

	public static ArrayList<Integer> isPrimeNumber(int start, int end) {

		ArrayList<Integer> primeList = new ArrayList<Integer>();

		for (int i = start; i < end; i++) {
			boolean isPrime = true;
			int number = 2;
			for (number = 2; number <= i / 2; number++) {
				if (i % number == 0) {
					isPrime = false;
					break;
				}

			}

			if (isPrime) {
				primeList.add(i);
			}
		}
		return primeList;

	}

}
