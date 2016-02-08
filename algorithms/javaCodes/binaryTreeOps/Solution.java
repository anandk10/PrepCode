package binaryTreeOps;

/**
 * Given a Binary Tree make it right skewed tree where all the elements appear sorted. 
 * @author Karandikar
 *
 */

public class Solution{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree<Integer> bT = new BinaryTree<Integer>();
		int arr[] = {2,3,5,1,9,0,8};
		for(int i=0;i<arr.length;i++){
			bT.insert((Integer) arr[i]);
		}
		System.out.println("initial inorder traversal : ");
		bT.inorder();
		bT.makeItRight();
		bT.sort();
		System.out.println("\nTraversing only right : ");
		bT.traverseRight();

	}

}

/*
 Output:
 initial inorder traversal : 
 1 3 9 2 0 5 8
 Traversing only right : 
 0->1->2->3->5->8->9 
 */