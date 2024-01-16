package ST10;

import java.util.Arrays;
import java.util.stream.Stream;

public class ST10 {
	
	public static < T > T[] reverseArray( T[] inputArray ) {
		T[] rtrn = inputArray.clone();
		for(int i = 0; i < inputArray.length; i++) {
			rtrn[i] = inputArray[inputArray.length -1 - i];
		}
		return rtrn;
	}
	public static <T, E> boolean isEqualTo(T first, E second) {
		return first.equals(second);
	}
	public static < T > void printArray( T[] inputArray ) {
		int i = 0;
		 // display array elements
	      for ( T element : inputArray ) {
	         System.out.printf( "%s", element );
	         if(i == 3) {System.out.println(); i = 0;}
		     else {System.out.print("\t"); i++;}
	      }
	      // The use of %s will result in the toString() method 
	      // being called on the object, and thus will work for any type T.
	      
	      
	} // end method printArray
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array1 = {1, 2, 3, 4, 5, 6};
		Boolean[] array2 = {true};
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(reverseArray(array1)));
		System.out.println(isEqualTo(array1, array2));
		printArray(array1);
	}

}
