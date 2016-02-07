package topViewOfTree;


/**
 * Problem link: https://www.hackerrank.com/challenges/tree-top-view
 * @author Karandikar
 * [This solution accepts static input, here an array of integers and then constructs a binary search tree.
 *	The method showTreeView() would remain the same for both binary search tree and binary tree.]
 */
 
public class Solution {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[] = {3,1,7,0,6};
		int arr[] = {10, 5, 20, 12, 18, 19, 17, 16, 14};
		
		BinarySearchTree bst = new BinarySearchTree();
		
		for(int data : arr){
			bst.insert(data);
		}
		
		
		bst.showTreeView();
		
		//bst.inorder();
		
	}

}
