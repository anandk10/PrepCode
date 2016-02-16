package maximizeSum;

import java.util.*;

/**
 * Problem link : https://www.hackerrank.com/challenges/maximise-sum
 * @author Karandikar
 * Helper link : https://www.quora.com/What-is-the-logic-used-in-the-HackerRank-Maximise-Sum-problem
 *
 */
public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int T = Integer.parseInt(s.nextLine());
        
        for(int j=0;j<T;j++){
        	
        	String in[] = s.nextLine().split(" ");
        	int N = Integer.parseInt(in[0]);
        	long M = Long.parseLong(in[1]);
        	long inputArr[] = new long[N];
        	PrefixArr[] prefixArr = new PrefixArr[N];
        	long curr = 0;
        	long max = Long.MIN_VALUE;
        	in = s.nextLine().split(" ");

        	for(int i=0;i<N;i++){
        		inputArr[i] = Long.parseLong(in[i]);
        		curr = (((inputArr[i] % M) + curr) % M);
        		prefixArr[i] = new PrefixArr(curr, i);
        		if(prefixArr[i].ele > max){
        			max = prefixArr[i].ele;
        		}
        	}

        	Arrays.sort(prefixArr,  new PrefixArrComp());
        	long  min = Long.MAX_VALUE;
        	for(int i=0;i<N-1;i++){
        		if(		(prefixArr[i].index > prefixArr[i+1].index)
        				&&
        				((prefixArr[i+1].ele - prefixArr[i].ele) < min	)){
        			min = prefixArr[i+1].ele - prefixArr[i].ele;
        		}
        	}
        	System.out.println(Math.max(max, M-min));
    	}
        s.close(); 
    }
}
