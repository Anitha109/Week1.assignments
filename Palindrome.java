package firstweek.assignments;

//Class to find given text is a Palindrome or not 
public class Palindrome {
	public static void main(String[] args) {
		// Declaration
		String text = "madam";
		String revString = "";
		// Convert the input text to character array
		char[] charArray = text.toCharArray();
		// For loop in reverse order
		for (int i = charArray.length - 1; i >= 0; i--) {
			// Concatenate each character to a string
			revString = revString + charArray[i];
		}
		// Condition to check text strint and revString has same value
		if ((text.equals(revString)) == true) {
			// If the condition satisfy we print its a Palindrome
			System.out.println(text + " is a Palindrome");
		} else {
			// If both the string values are not same then we print its not a
			// Palindrome
			System.out.println(text + " is not a Palindrome");
		}
	}
}
