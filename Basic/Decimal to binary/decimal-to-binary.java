//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	void toBinary(int N) {
	    List<Integer> list=new ArrayList<Integer>();
	    while(N>0){
	        list.add(N%2);
	        N=N/2;
	    }
	    Collections.reverse(list);
	    for(int num:list){
	        System.out.print(num);
	    }
	    
	}
}