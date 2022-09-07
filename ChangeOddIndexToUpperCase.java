package firstweek.assignments;

// Class to change odd index value to upper case
public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// Declaring the input string
		String test = "changeme";

		// Convert the string to upper case and assign to another String
		String upperCase = test.toUpperCase();
		// Convert the string to Character array
		char[] charArray = test.toCharArray();
		// Loop to find odd index value
		for (int i = 0; i < charArray.length; i++) {
			// Find the odd index
			if (i % 2 != 0) {
				// Passing the uppercase value for the odd index to the
				// inputtext

				charArray[i] = upperCase.charAt(i);

			}
			System.out.print(charArray[i]); // Print the each array value
		}
	}
}
