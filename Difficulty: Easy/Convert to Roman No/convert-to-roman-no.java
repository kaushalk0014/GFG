//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


// User function template for JAVA

class Solution {
    String convertToRoman(int num) {
       
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder roman = new StringBuilder();

		for (int i = 0; i < values.length && num > 0; i++) {
			while (num >= values[i]) {
				num=num-values[i];
				roman.append(symbols[i]);
			}
		}
		return roman.toString();

    }
}