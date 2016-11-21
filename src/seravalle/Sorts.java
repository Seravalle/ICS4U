package seravalle;

/**
 * This program sorts an int, double, and string array by selection sort ,
 * insertion sort , and bubble sort
 * 
 * @author Adam Seravalle Sorts.java November 14 2016
 */
public class Sorts {
	/**
	 * main method not used
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void  selectionSort(int[] aInt) {
        int min =0 ;
		 for (int i = 0; i < aInt.length;i++) {
		 min = i;
		 for (int j = i + 1; j < aInt.length; j++) {
		 if (aInt[j] < aInt[min]) {
		 j = min;
		 }
		
		 }
		 int temp = aInt[i];
		 aInt[i] = aInt[min];
		 aInt[min] = temp;
		
		
		 
		
		 }
		 for(int x= 0;x< aInt.length-1;x++){
			 System.out.println(aInt[x]);
		 }
		 
	
	}

	public static int insertionSort(int[] aInt) {

		int j;
		int temp;
		for (int i = 1; i < aInt.length; i++) {
			j = i - 1;

			while (j >= 0 && aInt[j] > aInt[i]) {
				temp = aInt[i];
				aInt[i] = aInt[j];
				aInt[j] = temp;
				i = j;
				j--;
			}
		}
		for (int x = 0; x < aInt.length; x++) {
			System.out.println(aInt[x]);
		}

		return 0;
	}

	public static int bubbleSort(int[] aInt) {

		for (int i = 0; i < aInt.length; i++) {
			for (int j = 1; j < aInt.length - i; j++) {
				if (aInt[j - 1] > aInt[j]) {
					int temp = aInt[j - 1];
					aInt[j - 1] = aInt[j];
					aInt[j] = temp;
				}
			}

		}
		for (int x = 0; x < aInt.length; x++) {
			System.out.println(aInt[x]);
		}

		return 0;

	}
}
