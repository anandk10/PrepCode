package binaryTreeOps;

public class BinaryTreeNode<T> {

	private T data;
	private BinaryTreeNode<T> left, right; 
	public BinaryTreeNode(T data) {
		// TODO Auto-generated constructor stub
		this.setData(data);
		this.setLeft(null);
		this.setRight(null);
		
	}
	public BinaryTreeNode() {
		this.setLeft(null);
		this.setRight(null);
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public BinaryTreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}
	public BinaryTreeNode<T> getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}
	
	
	
}
