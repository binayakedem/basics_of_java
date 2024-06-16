
public class CheckingSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = ArrayInput.inputArray();
		Boolean isDec = isDecreasing(myarr);
		Boolean isInc = isIncreasing(myarr);
		if (isDec || isInc) {
			System.out.println("Your arra is sorted");
		} else {
			System.out.println("Array is not sorted");
		}
	}

	public static boolean isDecreasing(int[] myarr) {
		int i = 1;
		while (i<myarr.length) {
		 if(myarr[i] > myarr[i - 1]) {
			 return false;
		 }
		 i++;
		}
		
		return true;
	}

	public static boolean isIncreasing(int[] myarr) {
		int i = 1;
		while (i < myarr.length) {
			if (myarr[i] < myarr[i - 1]) {
				return false;
			}
			i++;
		}

		return true;
	}

}
