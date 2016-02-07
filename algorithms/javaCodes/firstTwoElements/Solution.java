/*
 * Given an integer array, find the first two largest elements in the array.
 * The array can have both positive and negative numbers.
 * */

package firstTwoElements;

/**
 * Find the two largest elements from a given array of integers.
 * @author Karandikar
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = new int[]{6, 2, 5};
		int arr2[] = new int[]{1, 2, 30, 100, 5, 6};
		int arr3[] = new int[]{-4, -6, -7, 2};
		int arr4[] = new int[]{10, 1};
		int arr5[] = new int[]{-3};
		
		find(arr1); find(arr2); find(arr3);
		find(arr4); find(arr5);
		
	}
	
	/**
	 * Find method
	 * @param arr
	 */
	private static void find(int arr[]){
		
		if(arr.length < 1){
			System.err.println("ERROR: Could not compute.");
			System.err.println("Length of array is less than 1.");
			return;
		}
		if(arr.length < 2){
			System.out.println("Largest element "+arr[0]);
			System.err.println("ERROR: Could not compute second largest element.");
			System.err.println("Length of array is less than 2.");
			return;
		}

		int first = 0; 	// naming the 0th index as the first largest
		int second;
		if(arr[first] < arr[1]){
			second = first;
			first = 1;
		}else{
			second = 1;
		}
		
		for(int i=2;i<arr.length;i++){
			if(arr[first] < arr[i] && arr[second] < arr[i]){
				second = first;
				first = i;
			}else if(arr[first] != arr[i] && arr[second] < arr[i]){
				second = i;
			}
		}
		System.out.println("Largest element "+arr[first]);
		System.out.println("Second largest element: "+arr[second]);
	}

}


/* Sample Output: */
/*
Largest element 6
Second largest element: 5
Largest element 100
Second largest element: 30
Largest element 2
Second largest element: -4
Largest element 10
Second largest element: 1
Largest element -3
ERROR: Could not compute second largest element.
Length of array is less than 2.
 */
