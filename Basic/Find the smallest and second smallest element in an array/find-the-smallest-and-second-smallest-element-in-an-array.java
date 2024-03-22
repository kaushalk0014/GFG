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
        long sm=Long.MAX_VALUE;
        long secSm=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<sm){
                secSm=sm;
                sm=a[i];
            }else if(a[i]<secSm&&sm!=a[i]){
                secSm=a[i];
            }
        }
        
        long result[]={sm,secSm};
        if(secSm==Long.MAX_VALUE){
            result[0]=-1l;
            result[1]=-1l;
        }
        return result;
    }
}
