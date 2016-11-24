package seravalle;

public class testSort {

	public static void main(String[] args) {

		int[] arrayInt = { 42, 7, 1, 2, 9, 4, 14, 3, 29, 20 };

		System.out.println("Selection sort: integer");
		Sorts.selectionSort(arrayInt);
		System.out.println("Insertion sort: integer");
		Sorts.insertionSort(arrayInt);
		System.out.println("Bubble sort: integer");
		Sorts.bubbleSort(arrayInt);
		double[] arrayDouble = { 42.3, 7.5, 1.0, 2.9, 9.4, 4.6, 14.7, 3.1, 29.3, 20.2 };
		System.out.println("Selection sort: double");
		Sorts.selectionSort(arrayDouble);
		System.out.println("Insertion sort: double");
		Sorts.insertionSort(arrayDouble);
		System.out.println("Bubble sort: double");
		Sorts.bubbleSort(arrayDouble);
		String[] arrayString = { "j", "a", "h", "g", "e", "c", "i", "f", "d", "b" };
		System.out.println("Selection sort: string");
		Sorts.selectionSort(arrayString);
		System.out.println("Insertion sort: string");
		Sorts.insertionSort(arrayString);
		System.out.println("Bubble sort: string ");
		Sorts.bubbleSort(arrayString);
	}

}
