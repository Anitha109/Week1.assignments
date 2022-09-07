package firstweek.assignments;

//Class to remove the duplicate word from the given string
public class RemoveDuplicates {
	public static void main(String[] args) {
		// Declaring String text as input
		String inputText = "We learn java basics as part of java sessions in java week1";
		// Another string which we need to check against the above input
		String dupText = "java";
		int count = 0;
		// Split the string into each word into a string array strString
		String[] strSplit = inputText.split(" ");
		// loop
		for (int i = 0; i < strSplit.length; i++) {
			// Checking whether the first value from strSplit array matches the
			// second string dupText
			if (strSplit[i].equals(dupText) == true) {
				// increase count value by 1
				count++;
				// Condition to check If the dupText value is there in strString
				// more than once
				if (count > 1) {
					// If the condition satisfy remove the text
					strSplit[i] = "";
				}
			}
			if (strSplit[i] != "") {
				// Print the strSplit value one by one with space
				System.out.print(strSplit[i] + " ");
			}
		}
	}
}
