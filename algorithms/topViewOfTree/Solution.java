package topViewOfTree;

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
