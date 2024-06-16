
public class FindingMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to max and min");
		int myarr[] = ArrayInput.inputArray();
		int max=max(myarr);
		int min=min(myarr);
		System.out.println("Maximum number in array is :"+max);
		System.out.println("Minimum number in array is :"+min);

	}

	public static int min(int[] myarr) {
		if(myarr.length==0) {
			return Integer.MIN_VALUE;
		}
		int minVal=myarr[0];
		for(int i=0;i<myarr.length;i++) {
			if(minVal>myarr[i]) {
				minVal=myarr[i];
			}
		}

		return minVal;
	}

	public static int max(int[] myarr) {
		if(myarr.length==0) {
			return Integer.MAX_VALUE;
		}
		int maxVal=myarr[0];
		for(int i=0;i<myarr.length;i++) {
			if(maxVal<myarr[i]) {
				maxVal=myarr[i];
			}
		}

		return maxVal;
	}

}
