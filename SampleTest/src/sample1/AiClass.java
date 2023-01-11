package sample1;

public class AiClass {
	
	public static void main(String[] args) {
		System.out.println("dd");
	}

	public static String reverseString(String input) {
	    char[] inputArray = input.toCharArray();
	    StringBuilder reversedString = new StringBuilder();
	    for (int i = inputArray.length - 1; i >= 0; i--) {
	        reversedString.append(inputArray[i]);
	    }
	    return reversedString.toString();
	}
}	


