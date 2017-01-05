package seravalle;



/**
 * This program sorts an int, double, and string array by selection sort ,
 * insertion sort , and bubble sort
 * 
 * @author Adam Seravalle 
 * Sorts.java 
 * November 14 2016
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
	 * Sorts an array of ints by selection sort
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
	 * Sorts and array of ints by insertion sort
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
	 * Sorts an array of ints by bubble sort
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
	 * Sorts an array of doubles by selection sort
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
	 * Sorts an array of doubles by insertion sort
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
	 * Sorts an array of doubles by bubble sort
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
	 * Sorts an array of strings by selection sort
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
	 * Sorts an array of strings by insertion sort
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

	/**
	 * Sorts an array of strings by bubble sort
	 * 
	 * @param arrayString
	 */
	public static void bubbleSort(String[] arrayString) {

		for (int i = 0; i < arrayString.length; i++) {
			for (int j = 1; j < arrayString.length - i; j++) {
				if (arrayString[j - 1].compareTo(arrayString[j]) > 0) {
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

	

	/**
	 * This method takes a array and splits it up continuously
	 * @param arrayInt 
	 * @param start 
	 * @param end 
	 */
	private static void mergeSort(int arrayInt[], int start, int end)
	{
		if(start<end)
		{
			int mid = (end + start) / 2;
			mergeSort(arrayInt, start, mid);
			mergeSort(arrayInt, mid+1, end);
			merge(arrayInt, start, mid, end);
		}
	}
	/**
	 * This method sets up values for merge sort
	 * 
	 * @param arrayInt
	 *            
	 * @return 
	 */
	public static int[] mergeSort(int[] arrayInt) {
		int start = 0;
		int end = arrayInt.length - 1;
		mergeSort(arrayInt, start, end);
		return arrayInt;
	}

	/**
	 * 
	 * @param arrayInt
	 *           
	 * @param start
	 *           
	 * @param mid
	 *           
	 * @param end
	 *            
	 */
	public static void merge(int[] arrayInt, int start, int mid, int end) {
		int[] temp = new int[arrayInt.length];
		for (int i = 0; i < arrayInt.length; i++) {
			temp[i] = arrayInt[i];
		}
		int count = start;
		int num = mid + 1;
		int i = start;
		while (count <= mid && num <= end) {
			if (temp[count] <= temp[num]) {
				arrayInt[i] = temp[count];
				count++;

			} else {
				arrayInt[i] = temp[num];
				num++;
			}
			i++;
		}
		while (count <= mid) {
			arrayInt[i] = temp[count];
			i++;
			count++;
		}
		while (num <= end) {
			arrayInt[i] = temp[num];
			i++;
			num++;
		}
	}

	/**
	 * This method takes a array and splits it up continuously
	 * @param arrayDouble 
	 * @param start 
	 * @param end 
	 */
	private static void mergeSort(double arrayDouble[], int start, int end)
	{
		if(start<end)
		{
			int mid = (end + start) / 2;
			mergeSort(arrayDouble, start, mid);
			mergeSort(arrayDouble, mid+1, end);
			merge(arrayDouble, start, mid, end);
		}
	
	}
	/**
	 * This method sets up values for merge sort
	 * 
	 * @param arrayDouble
	 *            
	 * @return 
	 */
	public static double[] mergeSort(double[] arrayDouble) {
		int start = 0;
		int end = arrayDouble.length - 1;
		mergeSort(arrayDouble, start, end);
		return arrayDouble;
	}

	/**
	 * 
	 * @param arrayDouble
	 *           
	 * @param start
	 *           
	 * @param mid
	 *           
	 * @param end
	 *            
	 */
	public static void merge(double[] arrayDouble, int start, int mid, int end) {
		double[] temp = new double[arrayDouble.length];
		for (int i = 0; i < arrayDouble.length; i++) {
			temp[i] = arrayDouble[i];
		}
		int count = start;
		int num = mid + 1;
		int i = start;
		while (count <= mid && num <= end) {
			if (temp[count] <= temp[num]) {
				arrayDouble[i] = temp[count];
				count++;

			} else {
				arrayDouble[i] = temp[num];
				num++;
			}
			i++;
		}
		while (count <= mid) {
			arrayDouble[i] = temp[count];
			i++;
			count++;
		}
		while (num <= end) {
			arrayDouble[i] = temp[num];
			i++;
			num++;
		}
	}
	
	
	/**
	 * This method takes a array and splits it up continuously
	 * @param arrayDouble 
	 * @param start 
	 * @param end 
	 */
	private static void mergeSort(String arrayString[], int start, int end)
	{
		if(start<end)
		{
			int mid = (end + start) / 2;
			mergeSort(arrayString, start, mid);
			mergeSort(arrayString, mid+1, end);
			merge(arrayString, start, mid, end);
		}
	
	}
	/**
	 * This method sets up values for merge sort
	 * 
	 * @param arrayDouble
	 *            
	 * @return 
	 */
	public static String[] mergeSort(String[] arrayString) {
		int start = 0;
		int end = arrayString.length - 1;
		mergeSort(arrayString, start, end);
		return arrayString;
	}

	/**
	 * 
	 * @param arrayString
	 * @param start 
	 * @param mid 
	 * @param end 
	 */
	private static void merge(String[] arrayString,int start, int mid, int end )
	{
		String [] temp = new String[arrayString.length];
		for (int i = 0; i < arrayString.length; i++)
		{
			temp[i] = arrayString[i];
		}
		int count = start;
		int num = mid+1;
		int i = start;
		while (count <= mid && num <= end)
		{
			if (temp[count].compareTo(temp[num]) <= 0) 
			{
				arrayString[i] =temp[count];
				count++;
				
			} 
			else
			{
				arrayString[i] = temp[num];
				num++;
			}
			i++;
		}
		while (count <= mid)
		{
			arrayString[i] = temp[count];
			i++;
			count++;
		}
		while(num <= end)
		{
			arrayString[i] = temp[num];
			i++;
			num++;
		}
	}
	
	
	/**
	 * This method takes an array and gets values ready for quicksort.
	 * @param arrayInt
	 * @return 
	 */
	public static int[] quickSort(int []arrayInt)
	{	
		int x=0;
		int y=arrayInt.length-1;
		quickSort(arrayInt, x, y);
		return arrayInt;

	}
	/**
	 * This method takes an array of ints and sorts its values recursively using a helper method
	 * @param arrayInt
	 * @param x
	 * @param y 
	 */
	private static void quickSort(int arrayInt[], int x, int y)
	{

		int num = partition(arrayInt, x, y);

		if (x< num - 1)
		{
			quickSort(arrayInt, x, num - 1);
		}
		if (num < y)
		{
			quickSort(arrayInt, num,y);
			
		}

	}
	/**
	 * This method takes an array, and sorts it using the quicksort method
	 * @param arrayInt
	 * @param x 
	 * @param y
	 * @return 
	 */
	private static int partition (int arrayInt[], int x, int y)
	{

		int  mid= (x+y)/2;
		int pivot = arrayInt[mid];

		while (x <= y) 
		{

			while (arrayInt[x] < pivot)
			{
				x++;
			}
			while (arrayInt[y] > pivot)
			{
				y= y-1;
			}
			if (x <= y) 
			{
				int temp=arrayInt[y];
				arrayInt[y]=arrayInt[x];
				arrayInt[x]=temp;		
				x++;
				y= y-1;
			}
		}

		return x;
	
	}
	/**
	 * This method takes an array of doubles and gets values ready for quicksort.
	 * @param arrayDouble
	 * @return 
	 */
	public static double[] quickSort(double []arrayDouble)
	{	
		int x=0;
		int y=arrayDouble.length-1;
		quickSort(arrayDouble, x, y);
		return arrayDouble;

	}
	/**
	 * This method takes an array of doubles and sorts its values recursively using a helper method
	 * @param arrayDouble
	 * @param x 
	 * @param y 
	 */
	private static void quickSort(double []arrayDouble, int x, int y)
	{

		int num = partition(arrayDouble, x, y);

		if (x< num - 1)
		{
			quickSort(arrayDouble, x, num - 1);
		}
		if (num < y)
		{
			quickSort(arrayDouble, num,y);
			
		}

	}
	/**
	 * This method takes an array of doubles, and sorts it using the quicksort method
	 * @param arrayDouble 
	 * @param x 
	 * @param y 
	 * @return 
	 */
	private static int partition (double []arrayDouble, int x, int y)
	{

		int  mid= (x+y)/2;
		double pivot = arrayDouble[mid];

		while (x <= y) 
		{

			while (arrayDouble[x] < pivot)
			{
				x++;
			}
			while (arrayDouble[y] > pivot)
			{
				y= y-1;
			}
			if (x <= y) 
			{
				double temp=arrayDouble[y];
				arrayDouble[y]=arrayDouble[x];
				arrayDouble[x]=temp;		
				x++;
				y= y-1;
			}
		}

		return x;
	
	}
	/**
	 * This method takes an array of strings and gets values ready for quicksort.
	 * @param arrayString 
	 * @return 
	 */
	public static String[] quickSort(String []arrayString)
	{	
		int x=0;
		int y=arrayString.length-1;
		quickSort(arrayString, x, y);
		return arrayString;

	}
	/**
	 * This method takes an array of strings and sorts its values recursively using a helper method
	 * @param arrayString 
	 * @param x 
	 * @param y 
	 */
	private static void quickSort(String []arrayString, int x, int y)
	{

		int num = partition(arrayString, x, y);

		if (x< num - 1)
		{
			quickSort(arrayString, x, num - 1);
		}
		if (num < y)
		{
			quickSort(arrayString, num,y);
			
		}

	}
	/**
	 * This method takes an array of strings , and sorts it using the quicksort method
	 * @param arrayString 
	 * @param x 
	 * @param y 
	 * @return 
	 */
	private static int partition (String arrayString[], int x, int y)
	{

		int  mid= (x+y)/2;
		String pivot = arrayString[mid];

		while (x <= y) 
		{

			while (arrayString[x].compareTo(pivot)<0)
			{
				x++;
			}
			while (arrayString[y].compareTo(pivot) > 0)
			{
				y= y-1;
			}
			if (x <= y) 
			{
				String temp=arrayString[y];
				arrayString[y]=arrayString[x];
				arrayString[x]=temp;		
				x++;
				y= y-1;
			}
		}

		return x;
	
	}
	}


	

