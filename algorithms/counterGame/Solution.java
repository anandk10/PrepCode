package counterGame;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/counter-game
 * @author Karandikar
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		s.nextLine();
		for(int i=0; i<T; i++){
			BigInteger b = new BigInteger(s.nextLine());
			b = b.subtract(BigInteger.ONE);
			//String res = (b.bitCount() & 1)==0 ? "Richard" : "Louise";
			System.out.println((b.bitCount() & 1)==0 ? "Richard" : "Louise");
		}
		
	}

}
