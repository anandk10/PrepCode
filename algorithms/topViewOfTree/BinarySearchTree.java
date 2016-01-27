package topViewOfTree;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;



public class BinarySearchTree {
	private TreeNode root;
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	void insert(int data){
		this.root = rInsert(this.root, data);
	}

	
	
	private TreeNode rInsert(TreeNode root, int data) {
		// TODO Auto-generated method stub
		if(root == null){
			return new TreeNode(data);
		}else{
			int d = root.getData();
			
			if(d > data){
				root.left = rInsert(root.getLeft(), data);
			}else{
				root.right = rInsert(root.getRight(), data);
			}
			return root;
		}
	}
	
	public void inorder(){
		rInorder(root);
	}
	
	private void rInorder(TreeNode root){
		if(root != null){
			rInorder(root.getLeft());
			System.out.print(" "+root.getData());
			rInorder(root.getRight());
		}
	}
	
	public void showTreeView(){
		if(this.root == null)
			return;
		
		/* TreeMap to hold the node's data and the horizontal distance */
		
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();

		/* Queue to enqueue nodes and do the search level wise */
		Queue<myQueue> queue = new LinkedList<myQueue>();
		
		queue.add(new myQueue(root, 0));
		
		while(!queue.isEmpty()){
			/* dequeue from the queue */
			myQueue temp = queue.remove();
			
			/* check if any node is present with this horizontal distance */
			if(tm.get(temp.horizontalDistance) == null){
				/* add it to the TreeMap  */
				tm.put(temp.horizontalDistance, temp.node.getData());
			}
			
			if(temp.node.getLeft() != null){
				/* if left child is present then enqueue it in the queue */
				queue.add(new myQueue(temp.node.getLeft(), temp.horizontalDistance-1));
			}
			if(temp.node.getRight() != null){
				/* if right child is present then enqueue it in the queue */
				queue.add(new myQueue(temp.node.getRight(), temp.horizontalDistance+1));
			}
			
		}
		
		/* printing the TreeMap object */
		Collection<Integer> c = tm.values();
		Iterator<Integer> i = c.iterator();
		
		while(i.hasNext()){
			System.out.print(" "+i.next());
		}
	}
}
