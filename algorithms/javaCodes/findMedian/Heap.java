package findMedian;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {

	PriorityQueue<Integer> maxH;
	PriorityQueue<Integer> minH;
	
	Heap(){
		maxH = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg1 - arg0;
			}
		
		});
		

		minH = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0 - arg1;
			}
		
		});
	}
	
	
	public void addToHeap(int value){
		
		if(maxH.size() == 0){
			maxH.add(value);
		}else{
			if(maxH.peek() < value){
				minH.add(value);
			}else{
				maxH.add(value);
			}
		}
		
		if(Math.abs(maxH.size() - minH.size()) > 1){
			this.balanceHeaps();
		}
		
		
	}


	private void balanceHeaps() {
		// TODO Auto-generated method stub
		if(maxH.size() > minH.size()){
			minH.add(maxH.poll());
		}else{
			maxH.add(minH.poll());
		}
		
	}
	
	public float getMedian(){
				
		if(maxH.size() == minH.size()){
			return (float) (maxH.peek() + minH.peek()) / 2;
		}
		if(maxH.size() < minH.size()){
			return (float) minH.peek();
		}
		return (float) maxH.peek();
		
		
	}
	
}
