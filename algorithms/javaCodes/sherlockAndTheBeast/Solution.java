package sherlockAndTheBeast;

import java.util.Scanner;

/**
 * Problem link: https://www.hackerrank.com/challenges/sherlock-and-the-beast
 * @author Karandikar
 *
 */
public class Solution {

	
	private static void printFiveThrees(int n3){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n3;i++){
			sb.append("3");
		}
		System.out.print(sb);
	}
	
	private static void printThreeFives(int n5){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n5;i++){
			sb.append("5");
		}
		System.out.print(sb);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int numTestCases = in.nextInt();
		
		for(int i=0; i<numTestCases; i++){
			int N = in.nextInt();

			int test=0;
			for(int j=0; test>=0 ;j++){
				test = (N - (5 * j));
				if(test % 3 == 0 && test >=0){
					printThreeFives(test);
					printFiveThrees(j * 5);
					break;
				}				
			}
			if(test < 0){
				System.out.println("-1");
			}
		}
		
		
		
	}

}
