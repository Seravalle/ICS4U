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

	/**
	 * 
	 * @param arrayInt
	 */
	public static void selectionSort(int[] arrayInt) {
		int min = 0;
		for (int i = 0; i < arrayInt.length; i++) {
			min = i;
			for (int j = i + 1; j < arrayInt.length; j++) {
				if (arrayInt[j] < arrayInt[min]) {
					min = j;
				}

			}
			int temp = arrayInt[i];
			arrayInt[i] = arrayInt[min];
			arrayInt[min] = temp;

			System.out.println(arrayInt[i]);
		}

	}

	/**
	 * 
	 * @param arrayInt
	 */
	public static void insertionSort(int[] arrayInt) {

		int j;
		int temp;
		for (int i = 1; i < arrayInt.length; i++) {
			j = i - 1;

			while (j >= 0 && arrayInt[j] > arrayInt[i]) {
				temp = arrayInt[i];
				arrayInt[i] = arrayInt[j];
				arrayInt[j] = temp;
				i = j;
				j--;
			}
		}
		for (int x = 0; x < arrayInt.length; x++) {
			System.out.println(arrayInt[x]);
		}

	}

	/**
	 * 
	 * @param arrayInt
	 */
	public static void bubbleSort(int[] arrayInt) {

		for (int i = 0; i < arrayInt.length; i++) {
			for (int j = 1; j < arrayInt.length - i; j++) {
				if (arrayInt[j - 1] > arrayInt[j]) {
					int temp = arrayInt[j - 1];
					arrayInt[j - 1] = arrayInt[j];
					arrayInt[j] = temp;
				}
			}

		}
		for (int x = 0; x < arrayInt.length; x++) {
			System.out.println(arrayInt[x]);
		}

	}

	/**
	 * 
	 * @param arrayDouble
	 */
	public static void selectionSort(double[] arrayDouble) {
		int min = 0;
		for (int i = 0; i < arrayDouble.length; i++) {
			min = i;
			for (int j = i + 1; j < arrayDouble.length; j++) {
				if (arrayDouble[j] < arrayDouble[min]) {
					min = j;
				}

			}
			double temp = arrayDouble[i];
			arrayDouble[i] = arrayDouble[min];
			arrayDouble[min] = temp;

			System.out.println(arrayDouble[i]);
		}

	}

	/**
	 * 
	 * @param arrayDouble
	 */
	public static void insertionSort(double[] arrayDouble) {

		int j;
		double temp;
		for (int i = 1; i < arrayDouble.length; i++) {
			j = i - 1;

			while (j >= 0 && arrayDouble[j] > arrayDouble[i]) {
				temp = arrayDouble[i];
				arrayDouble[i] = arrayDouble[j];
				arrayDouble[j] = temp;
				i = j;
				j--;
			}
		}
		for (int x = 0; x < arrayDouble.length; x++) {
			System.out.println(arrayDouble[x]);

		}
	}

	/**
	 * 
	 * @param arrayDouble
	 */
	public static void bubbleSort(double[] arrayDouble) {

		for (int i = 0; i < arrayDouble.length; i++) {
			for (int j = 1; j < arrayDouble.length - i; j++) {
				if (arrayDouble[j - 1] > arrayDouble[j]) {
					double temp = arrayDouble[j - 1];
					arrayDouble[j - 1] = arrayDouble[j];
					arrayDouble[j] = temp;
				}
			}

		}
		for (int x = 0; x < arrayDouble.length; x++) {
			System.out.println(arrayDouble[x]);
		}

	}

	/**
	 * 
	 * @param arrayString
	 */
	public static void selectionSort(String[] arrayString) {
		int min = 0;
		for (int i = 0; i < arrayString.length; i++) {
			min = i;
			for (int j = i + 1; j < arrayString.length; j++) {
				if (arrayString[j].compareTo(arrayString[min]) < 0) {
					min = j;
				}

			}
			String temp = arrayString[i];
			arrayString[i] = arrayString[min];
			arrayString[min] = temp;

			System.out.println(arrayString[i]);
		}

	}

	/**
	 * 
	 * @param arrayString
	 */
	public static void insertionSort(String[] arrayString) {

		int j;
		String temp;
		for (int i = 1; i < arrayString.length; i++) {
			j = i - 1;

			while (j >= 0 && arrayString[j].compareTo(arrayString[i]) > 0) {
				temp = arrayString[i];
				arrayString[i] = arrayString[j];
				arrayString[j] = temp;
				i = j;
				j--;
			}
		}
		for (int x = 0; x < arrayString.length; x++) {
			System.out.println(arrayString[x]);

		}
	}
	public static void bubbleSort(String[] arrayString) {

		for (int i = 0; i < arrayString.length; i++) {
			for (int j = 1; j < arrayString.length - i; j++) {
				if (arrayString[j - 1].compareTo(arrayString[j])> 0) {
					String temp = arrayString[j - 1];
					arrayString[j - 1] = arrayString[j];
					arrayString[j] = temp;
				}
			}

		}
		for (int x = 0; x < arrayString.length; x++) {
			System.out.println(arrayString[x]);
		}

	}

	private static void mergeSort() {

	}
}
