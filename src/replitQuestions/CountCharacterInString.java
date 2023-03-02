package replitQuestions;

public class CountCharacterInString {

	public static void main(String[] args) {
		//write a java program to count the number of characters in a string
		
		String sentence="wefeqf878979797fewfewrf879797efds&^&^*^*^";
		String characters= sentence.replaceAll("[^a-z]", "");
		char []arr=characters.toCharArray();
		
		int count=0;
		for (char ch:arr) {
			count++;
		}
		System.out.println("The number of characters are "+ count);

	}

}
