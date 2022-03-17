package Fis.B2;

import java.util.Comparator;

public class InsertionSort implements ISortStrategy {

	@Override
	public void sort(Comparable[] data, int count) {
		// TODO Auto-generated method stub
		Comparable newVal ;
		int j;
		if(data == null) return;
		for(int i = 0; i < data.length; i++) {
			newVal = data[i];
			j = i;
			while(j > 0 && (data[j-1].compareTo(newVal) > 0)) {
				data[j] = data[j-1];
				j--;
			}
			data[j] = newVal;
		}
	}

}
