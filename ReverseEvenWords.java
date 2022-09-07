package firstweek.assignments;

//Class to reverse only the even position word and print
public class ReverseEvenWords {

	public static void main(String[] args) {
		// Declaring a input string
		String text = "I am a software tester Anitha Mahendran";
		// Spliting the string and making as string array
		String[] split = text.split(" ");
		// Declaring another string
		String revString = "";
		// For loop
		for (int i = 0; i < split.length; i++) {
			// Condition to find the old index value (Even position value)
			if (i % 2 != 0) {
				// changing the word into character array
				char[] charArray = split[i].toCharArray();
				// Initialising the string revSting
				revString = "";
				// For loop for Character Array to reverse the word
				for (int j = charArray.length - 1; j >= 0; j--) {
					// Concadenating the string with each letter from last to
					// first
					revString = revString + charArray[j];
				}
				// Printing the reversed word
				System.out.print(revString + " ");
			} else {
				// Printing the odd position word without reversing it
				System.out.print(split[i] + " ");
			}
		}
	}
}
