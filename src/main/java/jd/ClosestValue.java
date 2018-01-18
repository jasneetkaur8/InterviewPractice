package jd;
/*
 * Given an array of sorted integers and find the closest value to the given number. Array may contain duplicate values and negative numbers. 

Example : Array : 2,5,6,7,8,8,9 
Target number : 5 
Output : 5 

Target number : 11 
Output : 9 

Target Number : 4 
Output : 5
 */

public class ClosestValue {

	public static void main(String[] args) {
		int[] arr = {1, 4};
		int target = -1;
		System.out.println(closestValue(arr,target));
	}
		public static int closestValue(int[] arr, int target){
			if(arr==null || arr.length==0){
				throw new RuntimeException("Empty Array");
			}
			int length = arr.length;
			if(target<arr[0]){
				return arr[0];
			}
			if(target>arr[length-1]){
				return arr[length-1];
			}
			
			int start =0;
			int end = length-1;
			while(start<end){
				int window = end-start;
				int mid = window/2 + start;
				if (target<arr[mid]){
					end = mid;
				}else
				if(target>arr[mid]){
					
					start = mid;
				}else {
					return arr[mid];
				}	
				if(end-start==1){
					return Math.abs(arr[end])-Math.abs(target)>Math.abs(target)-Math.abs(arr[start])?arr[start]:arr[end];
						
				}
				
			}
			
			return target;
			
		}

	

}
