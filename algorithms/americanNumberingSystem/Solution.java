package americanNumberingSystem;


import java.util.Scanner;

public class Solution {
	
	
	
	private static String numberTreatment(String number){
		StringBuilder temp = new StringBuilder();
		int i = number.length() % 3;
		if(i != 0){
			temp.append(number.substring(0,i));
		}
		if(number.length()>3 && i!=0)
			temp.append(",");
		
		for(;i<number.length();){
			if(i+3 < number.length()){
				//System.out.println(number.substring(i, i+3));
				temp.append(number.substring(i, i+3)+",");
				i+=3;
			}else{
				temp.append(number.substring(i, number.length()));
				i+=3;
			}
				
		}
		return temp.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String number = s.nextLine();
		s.close();
		Number americanNumber = new Number(numberTreatment(number));
		System.out.println("Ans: "+americanNumber.convert());
		
	}

}
