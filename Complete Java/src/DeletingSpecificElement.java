import java.util.Scanner;

public class DeletingSpecificElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("Deleting specific element from the array");
		int []myarr=ArrayInput.inputArray();
		System.out.println("Enter the number to delete the specific array");
		int numDelete=inputScanner.nextInt();
		
		int [] newArr=deleteNum(myarr, numDelete);
		System.out.println("New array after deleting the element:");
		ArrayInput.displayArray(newArr);

	}
	public static int[] deleteNum(int [] arr, int numDelete) {
		int occ=ArrayInProject.occuranceOfElement(arr, numDelete);
		if(occ==0) {
			return arr;
		}
		int newSize=arr.length-occ;
		int[] newArr=new int[newSize];
		
		int i=0, j=0;
		while(i<arr.length) {
			i++;
			if(arr[i]!=numDelete) {
				newArr[j]=arr[i];
				j++;
			}
		}
		return newArr;
	}

}
