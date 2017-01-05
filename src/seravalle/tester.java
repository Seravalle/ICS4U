package seravalle;

import java.util.Arrays;

public class tester {

	public static void main(String[] args) {
		int[] arrayInt = { 42, 7, 1, 2, 9, 4, 14, 3, 29, 20 };

       Arrays.sort(arrayInt);
       for(int i:arrayInt){
    	   System.out.print(i + " ");
       }

	}

}
