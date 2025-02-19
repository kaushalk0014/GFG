//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
         
        //  int count=0;
         
        //  for(int i =0; i< arr.length; i++){
        //      if(arr[i]==target){
        //          count++;
        //      }
        //  }
        //  return count;
        
        
        //other solution below
        
        if(arr!=null && arr.length ==0){
            return 0;
        }
        int first=countFreqFirst(arr, target);
		int last = countFreqLast(arr, target);
		
		if(first == -1){
		    return 0;
		}
		int count= last-first+1;
		
		
		return count;
    }
    
    private static int countFreqFirst(int[] arr, int target) {
		
		int low=0; int high=arr.length-1;
		int first= -1;
		
		while(low<=high) {
			int mid=  (low+high)/2;
			if(arr[mid]==target) {
				first =mid;
				high=mid-1;
			} else if (arr[mid] > target ) {
				high= mid-1;
			}else {
				low =mid+1;
			}
		}
		
		return first;
	}
	
	private static int countFreqLast(int[] arr, int target) {
		int last =-1;;
		
		int low=0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid]== target) {
				last=mid;
				low= mid+1;
			}else if(arr[mid]>target) {
				high =mid-1;
			}else {
				low = mid +1;
			}
		}
		
		return last;
	}
    
}
