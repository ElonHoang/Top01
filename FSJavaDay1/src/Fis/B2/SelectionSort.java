package Fis.B2;

import java.util.Comparator;

public class SelectionSort implements ISortStrategy {

	@Override
	public void sort(Comparable[] data, int count) {
		// TODO Auto-generated method stub
		for(int i = 0; i < count - 1; i++) {
			int smallInd = getSmallestNumberIndex(data,i,count);
			Comparable temp = data[i];
			data[i] = data[smallInd];
			data[smallInd] = temp;
		}
		
		
	}
	
	public int getSmallestNumberIndex(Comparable[] data, int ind, int elements) {
		Comparable min = data[ind];
		int minInd = ind;
		for(int i= 0; i< elements; i++) {
			if(min.compareTo(data[i]) > 0) {
				min = data[i];
				minInd = i;
			}
		}
		return minInd;
	}

}
