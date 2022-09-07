package firstweek.assignments;

//Class to Find Intersection from 2 array
public class FindIntersection {
	public static void main(String[] args) {
		// Declaration
		int[] input1 = { 3, 2, 11, 4, 6, 7 }; // First input
		int[] input2 = { 1, 2, 8, 4, 9, 7 }; // second input
		// Looping first array
		for (int i = 0; i < input1.length; i++) {
			// nested loop for second array
			for (int j = 0; j < input2.length; j++) {
				// Comparing first value of first array to all that value from
				// second array
				if (input1[i] == input2[j]) { // If any value matches in both
												// array Print the value

					System.out.print(input1[i] + ", ");
				}
			}
		}
	}
}
