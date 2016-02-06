package findMedian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem link: https://www.hackerrank.com/challenges/find-median-1
 * @author Karandikar
 *
 */

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Heap heap = new Heap();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++){
			int in = Integer.parseInt(br.readLine());
			heap.addToHeap(in);
			System.out.println(heap.getMedian());
		}
		br.close();
	}
}
