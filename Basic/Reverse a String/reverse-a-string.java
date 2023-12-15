//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        int low=0;
        int high=str.length()-1;
        char[] charArr=str.toCharArray();
        while(low<high){
            char temp=charArr[low];
            charArr[low]=charArr[high];
            charArr[high]=temp; 
            low++;high--;
        }
        return new String(charArr);
    }
}