package americanNumberingSystem;

import java.util.HashMap;

public class Number {
	String[] splits;
	StringBuilder number;
	static String places[] = {
		"hundred",
		"thousand",
		"million",
		"billion",
		"trillion"
	};
	
	static HashMap<Integer, String> numberToWord;
	static{
		numberToWord = new HashMap<Integer, String>();
		numberToWord.put(0,"");
		numberToWord.put(1,"one");
		numberToWord.put(2,"two");
		numberToWord.put(3,"three");
		numberToWord.put(4,"four");
		numberToWord.put(5,"five");
		numberToWord.put(6,"six");
		numberToWord.put(7,"seven");
		numberToWord.put(8,"eight");
		numberToWord.put(9,"nine");
		numberToWord.put(10,"ten");
		numberToWord.put(11,"eleven");
		numberToWord.put(12,"twelve");
		numberToWord.put(13,"thirteen");
		numberToWord.put(14,"fourteen");
		numberToWord.put(15,"fifteen");
		numberToWord.put(16,"sixteen");
		numberToWord.put(17,"seventeen");
		numberToWord.put(18,"eighteen");
		numberToWord.put(19,"nineteen");
		numberToWord.put(20,"twenty");
		numberToWord.put(30,"thirty");
		numberToWord.put(40,"forty");
		numberToWord.put(50,"fifty");
		numberToWord.put(60,"sixty");
		numberToWord.put(70,"seventy");
		numberToWord.put(80,"eighty");
		numberToWord.put(90,"ninety");
	}
	
	
	public Number(String input){
		this.splits = input.split(",");
	}
	
	
	public String convert(){
		
		StringBuilder ret = new StringBuilder();
		int len = this.splits.length;
		int i=0;
		for(i = 0; i < this.splits.length-1; i++){
			
			if(this.identify(this.splits[i]).equals("") == false){
				ret.append(
					this.identify(this.splits[i]) +" "+
					Number.places[len - 1 - i] + " "
					);
			}
		}
		
		ret.append(
				this.identify(this.splits[i]));
		
		if(ret.length()==0){
			ret.append("zero");
		}
		
		return ret.toString();
	}
	
	
	private String identify(String split){
		StringBuilder ret = new StringBuilder("");
		
		int num = Integer.parseInt(split);
		if(num == 0){
			return ret.toString();
		}
		int di=0, div=0;
		if( (di = (num / 100)) != 0){
			ret.append(Number.numberToWord.get(di)+" "+Number.places[0]);
		}
		if((div = (num % 100)) != 0){
			String collect = Number.numberToWord.get(div);
			//System.out.println(collect);
			if(di != 0){
				ret.append(" and ");
			}
			if(collect == null){
				/* No value in the hash table found */
				/* split the remaining number into tens and units */
				int units = div % 10;
				int tens = div - units;
				ret.append(Number.numberToWord.get(tens) + " " + Number.numberToWord.get(units));
			}else{
				ret.append(collect);
			}
		}
		
		return ret.toString();
		
	}
	
	
}
