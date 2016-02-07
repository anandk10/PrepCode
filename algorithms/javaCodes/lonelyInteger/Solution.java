package lonelyInteger;
import java.util.Scanner;

/**
 * Problem link: https://www.hackerrank.com/challenges/lonely-integer
 * @author Karandikar
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int A[] = new int[N];
        int lonelyInt = 0;
        String nums[] = in.nextLine().split(" ");
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(nums[i]);
            lonelyInt = lonelyInt ^ A[i];
        }
        System.out.println(lonelyInt);
        in.close();
	}

}
