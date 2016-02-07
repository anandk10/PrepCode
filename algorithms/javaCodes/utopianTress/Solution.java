package utopianTress;

import java.util.Scanner;

/**
 * Problem link: https://www.hackerrank.com/challenges/utopian-tree
 * @author Karandikar
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T, N;
		int H = 1, initialH = 1;
		
		T = in.nextInt();
		for(int i=0; i<T; i++){
			N = in.nextInt();
			initialH = 1;
			//H = (int) (Math.pow(2, ((N + 2) / 2)) - 1);
			H = (1 << ((N + 2) >> 1)) - 1;
			if(N % 2 != 0){
				// (int) (Math.pow(2, ((N + 2) / 2)) - 1);
				H = H << 1;
			}
			System.out.println(H);
		}
		
		in.close();

	}

}
