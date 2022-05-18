import java.util.Iterator;

public class ModeLinner {

	public static void main(String[] args) {
//		Linear Search
		/*
		 arr=[1,3,5,7,9]
		 target =7;
		 for(int i=0;i<arr.length;i++){
		 if(target==arr[i]){
		 syout("Element found")
		 }
		 }
		 ==================================================
		    ---------------Binary Search----------------
		 ==================================================
		 
		   1. Find the mid element in an array
		   		mid=start_index+(end_index-start_index)/2
		   2. if mid is grater or less of my target element
		   3. if the target is greater then mid element move the start index to (mid+1)th index
		   4. if the target is less then mid element move the end index to (mid-1)th index
		   5. else return the mid element as a target element
		==========================================================
		 
		 */
		int[] n = {10, 20, 30, 40, 50, 60, 100, 110, 130, 170};
        int find = 20;
       int ans=  binnarySearchEle(n,find);
       System.out.println(ans);
        
}

	 static int binnarySearchEle(int[] arr, int target) {
		int start=0;
		int end=arr.length-1; // arr[end]=170
		while(start<=end) {
			int mid= start+(end-start)/2; // finds mid element
			if(target>arr[mid]) {
				start=mid+1;
			}else if(target<arr[mid]) {
				end=mid-1; //
			}else {
				return arr[mid];
			}
		}
		return -1;
	}
	}
