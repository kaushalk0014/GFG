//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n=arr.size()-1;
        for( int i=0; i<= n; i= i+k){
            int low= i;
            int high= i+k-1;
            if(high>n){
                high=n;
            }
            
            while(low<=high){
                Long temp=arr.get(low);
                arr.set(low, arr.get(high));
                arr.set(high, temp);
                low++;
                high--;
            }
        }
    }
}

//{ Driver Code Starts.

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            ArrayList<Long> arr = new ArrayList<>();
            Scanner ss = new Scanner(input);
            while (ss.hasNextLong()) {
                arr.add(ss.nextLong());
            }
            Solution ob = new Solution();
            ob.reverseInGroups(arr, k);
            for (long num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends