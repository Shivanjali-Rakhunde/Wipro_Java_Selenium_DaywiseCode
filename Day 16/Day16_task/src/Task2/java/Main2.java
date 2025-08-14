package Task2.java;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringSolution ss = new StringSolution();
		
		 System.out.println("Highest Frequency Char: " + ss.highestFrequencyChar("Beens"));
		 
		 System.out.println("Replace First Vowel: " + ss.replaceFirstVowel("apple"));
		 
		 int[] count = ss.countCharTypes("abc123@!");
	       System.out.println("Letters: " + count[0] + ", Digits: " + count[1] + ", Specials: " + count[2]);
	       
	       System.out.println("Without spaces: " + ss.removeSpaces("Hello  World"));
	       
	       System.out.println("Concatenated: " + ss.concatenate("Hello", "World"));

	}

}
