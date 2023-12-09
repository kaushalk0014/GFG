//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long[] ans = new long[2];
		long smallest = Integer.MAX_VALUE;
		long secSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
				if(a[i]<smallest) {
					secSmallest=smallest;
					smallest=a[i];
				}else if(a[i]<secSmallest&&a[i]!=smallest) {
					secSmallest=a[i];
				} 
		}
		if (secSmallest == Integer.MAX_VALUE) {
		   long[] ans1 = new long[1];
		   ans1[0]=-1;
		   return ans1;
		}else{
		    ans[0]=smallest;
		    ans[1]=secSmallest;
		}
	
		return ans;
    }
}
