/**
 * 
 */
package seravalle;

public class testSearchs {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		int [] aInt = {1,2,4,7,9,10,14,20,29,42};
		int target = 9;
		System.out.println("Binary Search: Int");
		System.out.println(Searches.binarySearch(aInt, target));
		System.out.println("Linear Search: Int");
		System.out.println(Searches.linearSearch(aInt, target));
		
		double[] bDouble ={1.0,2.3,4.6,7.0,9.1,10.2,14.6,20.9,29.0,42.6};
		double target1 =9.1;
		System.out.println("Binary Search: Double");
		System.out.println(Searches.binarySearch(bDouble,target1));
		System.out.println("Linear Search:Double");
		System.out.println(Searches.linearSearch(bDouble, target1));
		
		String []cString = {"a","b","c","d","e","f","g","h","i","j"};
		String target2 = "d";
		System.out.println("Binary Search: String");
		System.out.println(Searches.binarySearch(cString, target2));
		System.out.println("Linear Search: String");
		System.out.println(Searches.linearSearch(cString, target2));
	
	
	}
	

}
