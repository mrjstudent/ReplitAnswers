package replitQuestions;

public class Palindrome {

	public static void main(String[] args) {
		String word = "dad";
		String reverse = "";
		
		StringBuilder sb=new StringBuilder(word);
		if(word.equals(reverse)) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("its not palindrome");
		}
		System.out.println(sb.reverse());
		
		
//		for (int i = word.length() - 1; i >= 0; i--) {
//			reverse = reverse + word.charAt(i);
//		}
//		if (word.equals(reverse)) {
//			System.out.println("they are palindrome");
//		}else {
//			System.out.println("it is not palindrome");
//		}
		

	}

}
