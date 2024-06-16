
// java program to 
import java.util.Scanner;

public class ArrayInProject {
//	this function returns the total sum of the array
	public static int sumOfArray(int[] arr) {

		int sum = 0;
		for (int j : arr) {
			sum += j;
		}
		return sum;
	}

//	this method mainly returns the average of the array
	public static int averageOfArray(int[] arr) {
		int sum = sumOfArray(arr);

		return (sum / arr.length);
	}

// this method search the element occurance
	public static int occuranceOfElement(int[] arr, int num) {
		System.out.println("Enter the element to detect the occurance:");
		int var = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				var++;
			}
		}

		return var;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner scanner = new Scanner(System.in);
		int myarr[] = ArrayInput.inputArray();

		int mysum = sumOfArray(myarr);
		System.out.println("The sum of the array is:" + mysum);
		int average = averageOfArray(myarr);
		System.out.println("The average of the array is :" + average);

//		passing the element and array to detect the occurance of element in array

		System.out.println("Enter the element to find the occurance of the element:");
		int myelement = scanner.nextInt();
		int occ = occuranceOfElement(myarr, myelement);
		System.out.println("The element " + myelement + " found " + occ + " times");

	}

}
