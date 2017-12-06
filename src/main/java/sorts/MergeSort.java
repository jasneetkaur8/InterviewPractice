package sorts;

import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {12,11,13,5,6,7};
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, arr.length-1);
		ms.printArray(arr);
	}
	
	public void sort(int[] arr, int l, int r){
		if(l<r){
			int m = (l+r)/2;
			sort(arr, l,m);
			sort(arr,m+1, r);
			merge(arr, l, m, r);
		}
		
		
	}
	public void merge(int[] arr, int l, int m, int r){
		int subArr1L = m-l+1;
		int subArr2L = r-m;
		
		int[] subArr1 = new int[subArr1L];
		int[] subArr2 = new int[subArr2L];
		for(int i=0;i<subArr1L;i++){
			subArr1[i] = arr[l+i];
		}
		for(int j=0;j<subArr2L;j++){
			subArr2[j] = arr[m+1+j];
		}
		int i=0,j=0,k=l;
		while(i<subArr1L && j<subArr2L){
			if(subArr1[i]<=subArr2[j]){
				arr[k] = subArr1[i];
				i++;
			}else{
				arr[k] = subArr2[j];
				j++;
			}
			k++;
		}
		while(i<subArr1L){
			arr[k] = subArr1[i];
			i++;
			k++;
		}
		while(j<subArr2L){
			arr[k] = subArr2[j];
			j++;
			k++;
		}
			
		
	}
	
	public void printArray(int arr[]){
		Arrays.stream(arr).forEach((a)->System.out.println(a));
	}

}
