package seravalle;

/**
 * 
 * program searches in an array by binary search and linear search for the target number or letter and displays the location in the array
 * Searches.java
 * @author Adam Seravalle 
 * November 11 2016
 */
public class Searches {
	/**
	 * The main method is not used
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/**
	 * Binary searches an array of ints
	 * 
	 * @param aInt
	 * @param target
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	private static int binarySearch(int[] aInt, int target, int startIndex, int endIndex) {

		int midIndex = (startIndex + endIndex) / 2;
		if (startIndex > endIndex) {
			return -1;
		}
		if (aInt[midIndex] == target) {
			return midIndex;
		} else if (target < aInt[midIndex]) {
			return binarySearch(aInt, target, startIndex, midIndex - 1);
		} else if (target > aInt[midIndex]) {
			return binarySearch(aInt, target, midIndex + 1, endIndex);
		}

		return 0;

	}

	/**
	 * Helper method for the binary search for ints
	 * 
	 * @param aInt
	 * @param target
	 * @return
	 */
	public static int binarySearch(int[] aInt, int target) {
		return binarySearch(aInt, target, 0, aInt.length - 1);
	}

	/**
	 * Binary searches an array of doubles
	 * 
	 * @param bDouble
	 * @param target1
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	private static double binarySearch(double[] bDouble, double target1, int startIndex, int endIndex) {

		int midIndex = ((startIndex + endIndex) / 2);
		if (startIndex > endIndex) {
			return -1;
		}
		if (bDouble[midIndex] == target1) {
			return midIndex;
		} else if (target1 < bDouble[midIndex]) {
			return binarySearch(bDouble, target1, startIndex, midIndex - 1);
		} else if (target1 > bDouble[midIndex]) {
			return binarySearch(bDouble, target1, midIndex + 1, endIndex);
		}

		return 0;

	}

	/**
	 * Helper method for the binary search for doubles
	 * 
	 * @param bDouble
	 * @param target1
	 * @return
	 */
	public static double binarySearch(double[] bDouble, double target1) {
		return binarySearch(bDouble, target1, 0, bDouble.length - 1);
	}

	/**
	 * Binary searches an array of strings
	 * 
	 * @param cString
	 * @param target2
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	private static int binarySearch(String[] cString, String target2, int startIndex, int endIndex) {

		int midIndex = ((startIndex + endIndex) / 2);

		if (startIndex > endIndex) {
			return -1;
		}
		if (cString[midIndex].equals(target2)) {
			return midIndex;
		} else if (target2.compareTo(cString[midIndex]) < 0) {
			return binarySearch(cString, target2, startIndex, midIndex - 1);
		} else if (target2.compareTo(cString[midIndex]) > 0) {
			return binarySearch(cString, target2, midIndex + 1, endIndex);
		}

		return 0;

	}

	/**
	 * Helper method for the binary search of strings
	 * 
	 * @param cString
	 * @param target2
	 * @return
	 */
	public static double binarySearch(String[] cString, String target2) {
		return binarySearch(cString, target2, 0, cString.length - 1);
	}

	/**
	 * Linear sorts an array of ints
	 * 
	 * @param aInt
	 * @param target
	 * @return
	 */
	public static int linearSearch(int[] aInt, int target) {
		for (int i = 0; i < aInt.length - 1; i++) {
			if (aInt[i] == (target)) {
				return i;

			}

		}
		return -1;
	}

	/**
	 * linear sorts an array of doubles
	 * 
	 * @param bDouble
	 * @param target1
	 * @return
	 */

	public static int linearSearch(double[] bDouble, double target1) {
		for (int i = 0; i < bDouble.length - 1; i++) {
			if (bDouble[i] == (target1)) {
				return i;

			}

		}
		return -1;
	}

	/**
	 * linear sorts an array of strings
	 * 
	 * @param cString
	 * @param target2
	 * @return
	 */
	public static int linearSearch(String[] cString, String target2) {
		for (int i = 0; i < cString.length - 1; i++) {
			if (cString[i].equals((target2))) {
				return i;

			}

		}
		return -1;
	}
}
