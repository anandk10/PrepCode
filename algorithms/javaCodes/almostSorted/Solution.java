package almostSorted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Problem link: https://www.hackerrank.com/challenges/almost-sorted
 * @author Karandikar
 *
 */
public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		String input[] = br.readLine().split(" ");
		
		for(int i=0; i < n; i++){
			arr[i] = Integer.parseInt(input[i]);
		}
		
		int i,j;
		for(i=0;i<n-1 && arr[i] < arr[i+1];i++);
		for(j=n-1;j>0 && arr[j] > arr[j-1];j--);

		int swaps=0;
		if(i > j)
			System.out.println("already sorted");
		else{
			
			/* Identify the steps to be taken to make the array sorted */
			/*
			 * from p to q if all elements are in increasing order then just one swap
			 * 
			 * */
			
			if(isValidSwap(arr, i, j, n)){
				swap(arr, i, j);
				/* possibility of a reversing a subarray */
				int p = i+1;
				int q = j-1;
				if(p>q){
					System.out.println("yes");
					System.out.println("swap "+(i+1)+" "+(j+1));
				}else{
					int maxSwaps = (j-i)/2;
					int z;
					
					for(z=0; p<q && z < maxSwaps;){
						if(arr[p] > arr[q]){
							if(isValidSwap(arr, p, q, n)){
								z++;
								swap(arr, p, q);
								swaps++;
							}
							p++; q--;
						}else{
							p++; q--;
						}
					}
					if(z==0){
						System.out.println("yes");
						System.out.println("swap "+(i+1)+" "+(j+1));
					}else if(z>=maxSwaps-1){
						System.out.println("yes");
						System.out.println("reverse "+(i+1)+" "+(j+1));
					}else{
						System.out.println(z);
						System.out.println("no");
					}
					
				}
			}else{
				System.out.println("no");
			}
			
				
		}
		
		br.close();

	}

	private static boolean isValidSwap(int[] arr, int i, int j, int n) {
		// TODO Auto-generated method stub
		if(	(i > 0 && i < n-1 && j > 0 && j < n-1 )
				&& (arr[i-1] <= arr[j] && arr[j] <= arr[i+1])
				&& (arr[j-1] <= arr[i] && arr[i] <= arr[j+1])){
			return true;
		}else if(i==0 && i < n-1 && j > 0 && j < n-1
				&& (arr[j] <= arr[i+1])
				&& (arr[j-1] <= arr[i] && arr[i] <= arr[j+1])){
			return true;
		}else if(i > 0 && i < n-1 && j > 0 && j == n-1
				&& (arr[i-1] <= arr[j] && arr[j] <= arr[i+1])
				&& (arr[j-1] <= arr[i])){
			return true;
		}else if(i==0 && i < n-1 && j > 0 && j==n-1 
				&& (arr[j] <= arr[i+1])
				&& (arr[j-1] <= arr[i])){
			return true;
		}
		
		return false;
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}

}
