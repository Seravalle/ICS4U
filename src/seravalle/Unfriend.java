package seravalle;
/**
 * not finished
 */
import java.util.Scanner;

public class Unfriend {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int [] numPeople = new int [input -1];
        for (int i = 0 ; i < numPeople.length ; i++){
        	numPeople[i] = scan.nextInt();        	
        }
        for(int y = 0 ; y< numPeople.length ; y++){
    		//System.out.println(numPeople[y]);
    	}
       System.out.println(removePeople(input, input, input));
	}
	
	public static int removePeople(int n,int x, int y){
		
		if(n == 1){
			return 0;
		}
		else {
		
		}
		return n;

}
}
