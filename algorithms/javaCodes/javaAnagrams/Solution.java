package javaAnagrams;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Problem link: https://www.hackerrank.com/challenges/java-anagrams
 * @author Karandikar
 *
 */
public class Solution {

static boolean isAnagram(String A, String B) {
		      //Complete the function
		if(A.length() > B.length() || A.length() < B.length())
	           return false;
	    else{
            A = A.toLowerCase();
	    	B = B.toLowerCase();
	    	HashMap<Character, Integer> h = new HashMap<Character, Integer>();
	    	for(char c : A.toCharArray()){
	    		Integer freq = h.get(c);//new Character(c));
	    		if(freq == null){
	    			h.put(c, 1);
	    		}else{
	    			h.put(c, freq+1);
	    		}
	    	}
	    	
	    	
	    	for(char c: B.toCharArray()){
	    		Integer freq = h.get(c);
	    		if(freq == null){
	    			/* not an anagram */
	    			return false;
	    		}else{
	    			if(freq == 1){
	    				/* remove this only character */
	    				h.remove(c);
	    			}else{
	    				h.put(c, freq-1);
	    			}
	    		}
	    	}
	    	return h.isEmpty();
	    	
	    }  
	}
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}