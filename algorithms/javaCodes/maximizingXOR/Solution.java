package maximizingXOR;

import java.util.Scanner;

/**
 * Problem link: https://www.hackerrank.com/challenges/maximizing-xor
 * @author Karandikar
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        int R = s.nextInt();
        int max = 0;
        for(int A = L; A <= R; A++){
            for(int B = L; B <= R; B++){
                if(max < (A ^ B)){
                    max = A ^ B;
                }
            }
        }
        System.out.println(max);
        s.close();
	}

}
