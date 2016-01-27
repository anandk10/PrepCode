
package balancingParantheses;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		StringBuilder output = new StringBuilder("");
		int openBracketCnt = 0;
		for(int i=0;i<input.length();i++){
			switch(input.charAt(i)){
				case '(':
					openBracketCnt++;
					output = output.append("(");
					break;
				case ')':
					output = output.append(")");
					if(openBracketCnt == 0){
						output = new StringBuilder("(").append(output);
					}else{
						openBracketCnt--;
					}
					break;
						
			}
		}
		
		while(openBracketCnt > 0){
			output = output.append(")");
			openBracketCnt--;
		}
		in.close();
		System.out.println(output);	
	}
}
