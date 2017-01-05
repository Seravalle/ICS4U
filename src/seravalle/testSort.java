package seravalle;
/**
 * sorts arrays with different methods 
 * testSort.java
 * @author Adam Seravalle
 * November 16 2016
 */
public class testSort {

	public static void main(String[] args) {

		int[] arrayInt = { 42, 7, 1, 2, 9, 4, 14, 3, 29, 20 };

		System.out.println("Selection sort: integer");
		Sorts.selectionSort(arrayInt);
		System.out.println("Insertion sort: integer");
		Sorts.insertionSort(arrayInt);
		System.out.println("Bubble sort: integer");
		Sorts.bubbleSort(arrayInt);
		System.out.println("Merge sort: integer ");
		Sorts.mergeSort(arrayInt);
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}
		System.out.println("Quick sort: integer ");
		Sorts.quickSort(arrayInt);
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}

		double[] arrayDouble = { 42.3, 7.5, 1.0, 2.9, 9.4, 4.6, 14.7, 3.1, 29.3, 20.2 };
		System.out.println("Selection sort: double");
		Sorts.selectionSort(arrayDouble);
		System.out.println("Insertion sort: double");
		Sorts.insertionSort(arrayDouble);
		System.out.println("Bubble sort: double");
		Sorts.bubbleSort(arrayDouble);
		System.out.println("Merge sort: double ");
		Sorts.mergeSort(arrayDouble);
		for (int j = 0; j < arrayDouble.length; j++) {
			System.out.println(arrayDouble[j]);
		}
		System.out.println("Quick sort: double ");
		Sorts.quickSort(arrayDouble);
		for (int i = 0; i < arrayDouble.length; i++) {
			System.out.println(arrayDouble[i]);
		}
		String[] arrayString = { "j", "a", "h", "g", "e", "c", "i", "f", "d", "b" };
		System.out.println("Selection sort: string");
		Sorts.selectionSort(arrayString);
		System.out.println("Insertion sort: string");
		Sorts.insertionSort(arrayString);
		System.out.println("Bubble sort: string ");
		Sorts.bubbleSort(arrayString);
		System.out.println("Merge sort: string ");
		Sorts.mergeSort(arrayString);
		for (int x = 0; x < arrayString.length; x++) {
			System.out.println(arrayString[x]);
		}
		System.out.println("Quick sort: string ");
		Sorts.quickSort(arrayString);
		for (int i = 0; i < arrayString.length; i++) {
			System.out.println(arrayString[i]);
		}

	}
}
