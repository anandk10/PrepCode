package binaryTreeOps;

import java.util.LinkedList;

public class BinaryTree<T> {
	BinaryTreeNode<T> root = null;

	public BinaryTree(BinaryTreeNode<T> root) {
		super();
		this.root = root;
	}
	
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}
	


	public void inorder(){
		rInorder(root);
	}
	
	private void rInorder(BinaryTreeNode<T> root){
		if(root != null){
			rInorder(root.getLeft());
			//if(root == this.root)	System.out.print(" root-> ");
			System.out.print(" "+root.getData());
			rInorder(root.getRight());
		}
	}
	
	public void insert(T data){
		this.root = insert(this.root, data);
	}
	
	
	private BinaryTreeNode<T> insert(BinaryTreeNode<T> root, T data){
		boolean success = false;
		BinaryTreeNode<T> newNode = new BinaryTreeNode<T>(data);
		if(root == null){
			root = newNode;
			success=true;
		}else{
			
			LinkedList<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
			BinaryTreeNode<T> temp;
			queue.add(root);
			while(!queue.isEmpty() && !success){
				temp = queue.pollFirst();
				if(temp.getLeft() == null){
					/* set newNode as left child */
					temp.setLeft(newNode);
					success = true;
				}else if(temp.getRight() == null){
					/* set newNode as right child */
					temp.setRight(newNode);
					success = true;
				}else{
					queue.add(temp.getLeft());
					queue.add(temp.getRight());
				}
			}
			if(success){
				queue = null;
			}
		}
		return root;
		//return success;
		
	}
	
	
	
	private BinaryTreeNode<T> getRightMost(BinaryTreeNode<T> root){
		
		while(root!=null && root.getRight()!=null)
			root = root.getRight();
		
		return root;
	}
	
	@SuppressWarnings("unused")
	private BinaryTreeNode<T> makeItRight(BinaryTreeNode<T> root){
		/* purpose: make the tree pointed by root as right skewed tree */
		BinaryTreeNode<T> temp=null, tempR=null;
		
		if(root != null){
			
			if((temp = makeItRight(root.getLeft())) != null){
				tempR = this.getRightMost(temp);
				tempR.setRight(root.getRight());
				root.setRight(temp);
				temp.setLeft(null);
				root.setLeft(null);
			}
			
			if(tempR != null){
				/* when root had left subtree then tempR would have the right most node of the left subtree */
				makeItRight(tempR.getRight());
			}else{
				/* there was no left subtree to process */
				makeItRight(root.getRight());
			}
			
			
		}
		return root;
	}
	
	public void makeItRight(){
		this.root = makeItRight(root);
	}

	public void traverseRight(){
		BinaryTreeNode<T> temp = this.root;
		
		while(temp.getRight()!=null){
			System.out.print(temp.getData()+"->");
			temp = temp.getRight();
		}
		System.out.print(temp.getData());
	}
	
	/**
	 * Dummy method to create and test the skewing and sorting operation.
	 * @param integers
	 */
	private void create(Integer[] integers) {
		// TODO Auto-generated method stub
		
		
		this.root = (BinaryTreeNode<T>) new BinaryTreeNode<Integer>(integers[0]);
		this.root.setLeft((BinaryTreeNode<T>) new BinaryTreeNode<Integer>(integers[1]));
		this.root.getLeft().setRight((BinaryTreeNode<T>) new BinaryTreeNode<Integer>(integers[2]));
		this.root.getLeft().getRight().setLeft((BinaryTreeNode<T>) new BinaryTreeNode<Integer>(integers[3]));
		this.root.getLeft().getRight().getLeft().setRight((BinaryTreeNode<T>) new BinaryTreeNode<Integer>(integers[4]));
		this.root.getLeft().getRight().setRight((BinaryTreeNode<T>) new BinaryTreeNode<Integer>(integers[5]));
		this.root.getLeft().getRight().getRight().setRight((BinaryTreeNode<T>) new BinaryTreeNode<Integer>(integers[6]));
		
		
	}
	
	
	public void sort(){
		this.root = sortRight(this.root);
	}
	
	private BinaryTreeNode<T> sortRight(BinaryTreeNode<T> root){
		BinaryTreeNode<T> p=null,q=null;
		if(root != null){
			p = root;
			q = root;
		}
		
		while(p != null){
			q = root;
			
			while(q!= null && q.getRight() != null){
				if((Integer)q.getData() >(Integer) q.getRight().getData()){
					swap(q, q.getRight());
				}
				q = q.getRight();
			}
			p = p.getRight();
		}
		return root;
	}


	private void swap(BinaryTreeNode<T> q, BinaryTreeNode<T> right) {
		// TODO Auto-generated method stub
		T temp = right.getData();
		right.setData(q.getData());
		q.setData(temp);
	}
	
	
}
