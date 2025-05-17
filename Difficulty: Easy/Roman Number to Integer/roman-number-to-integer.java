//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int resultTotal = 0;
        int prevValue = 0;
        
          for (int i = s.length() - 1; i >= 0; i--) {
            int current = roman.get(s.charAt(i));
            if (current < prevValue) {
                resultTotal = resultTotal- current;
            } else {
                resultTotal = resultTotal+ current;
            }
            prevValue = current;
        }

        return resultTotal;
        
    }
}