import java.util.Scanner;

public class ArrayInput {
	public static int[] inputArray(){
		
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the size of array:");
int size=scanner.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++) {
	System.out.println("Enter the array at:"+i);
	arr[i]=scanner.nextInt();
}
return arr;
	}
	
	public static void displayArray(int [] myarr) {
		int i=0;
		while(i<myarr.length) {
			System.out.println("Index of "+i+" is "+myarr[i]);
		}
	}
}
