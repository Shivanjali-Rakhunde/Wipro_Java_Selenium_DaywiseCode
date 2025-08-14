package Task2.java;

public class StringSolution {
	
	// Highest Frequency Character in a string
	
	public char highestFrequencyChar(String str) {
		int[] freq = new int[256];
		for(int i=0; i<str.length(); i++) {
			freq[str.charAt(i)]++;
		}
		
		int max =0;
		char result = ' ';
		for(int i=0; i<str.length(); i++) {
			if(freq[str.charAt(i)]> max) {
				max = freq[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
	
	//Repalce first vowel with '-'
	
	public String replaceFirstVowel(String str) {
		String vowels = "aeiouAEIOU";
		for(int i=0; i<str.length(); i++) {
			if (vowels.indexOf(str.charAt(i)) != -1) {
				return str.substring(0, i)+ '-'+str.substring(i+1);
			}
		}
		return str;
	}
	
	
	//Count alphabets, digit, and special characters
	
	public int[] countCharTypes(String str) {
		int alphabets = 0; int digits = 0; int specials = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)) {
				alphabets++;
			} else if(Character.isDigit(ch)) {
				digits++;
			}else {
				specials++;
			}
		}
		return new int[] {alphabets, digits, specials};
	}
	
	
	//Remove blank spaces
	
	 public String removeSpaces(String str) {
	        String result = "";
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) != ' ') {
	                result += str.charAt(i);
	            }
	        }
	        return result;
	    }
	 
	 //Concatenate two strings
	 public String concatenate(String a, String b) {
	        return a + b;
	    }

}
