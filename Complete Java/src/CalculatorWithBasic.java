import java.util.Scanner;

public class CalculatorWithBasic {
	void sum(int val1, int val2) {
		int mysum=val1+val2;
		System.out.println("The total sum is :"+mysum);
		
	}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the first number:");
	int var1=scanner.nextInt();
	System.out.println("Enter the second number:");
	int var2=scanner.nextInt();
	CalculatorWithBasic mCal=new CalculatorWithBasic();
	mCal.sum(var1,var2);
}
}


