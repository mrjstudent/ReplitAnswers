package replitQuestions;

public class ParenthesisBalanced {
	public static void main(String[] args) {
//		String sample1 = "()()()()()()()()()()()";
//		String sample2 ="(((()()()(()))))";
//		String sample3 =")((()()()(()))))";
//		String sample4 ="<(()){}{<((({{{{}}}})))>()<>()}>";
		String sample5 ="<{[()]}>";
//		String sample6 ="<{[(test)(test2)]}>";//?
		
		boolean flag = true;
		int count = 0;
		for (int i = 0; i < sample5.length(); i++) {
			if (sample5.charAt(i) == '(' || sample5.charAt(i)=='{'|| 
					sample5.charAt(i)=='[' ||sample5.charAt(i)=='<' ) {
				count++;
			} else {
				count--;
			}
		}
		if (count != 0) {
			flag = false;
		} else {
			flag = true;
		}
		System.out.println(flag);

	}

}
