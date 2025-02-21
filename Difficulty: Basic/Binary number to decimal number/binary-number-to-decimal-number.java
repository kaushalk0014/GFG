//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.binaryToDecimal(str);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
       char ch[] = b.toCharArray();
       
       int power=1;
       int sum=0;
       for(int i= ch.length-1; i>=0; i--){
           if(ch[i]=='1'){
               sum= sum+power;
           }
           power=power*2;
       }
       return sum;
    }
}