//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
     ArrayList<String> ans=new ArrayList<>();
    public  ArrayList<String> findPath(int[][] m, int n) {
       findDis(m,n,0,0,"") ;
       return ans;
    }
    
    private  void findDis(int[][] m,int n,int i,int j, String direc){
        if(i==n-1&&j==n-1){
            if(m[i][j]==1){
                ans.add(direc);
                return;
            }
        }
        if(i<0||j<0||i>=n||j>=n||m[i][j]==0){
            return;
        }
        m[i][j]=0;
        //right
        findDis(m,n,i,j+1,direc+"R");
        //up
        findDis(m,n,i-1,j,direc+"U");
         //down
        findDis(m,n,i+1,j,direc+"D");
         //Left
        findDis(m,n,i,j-1,direc+"L");
        m[i][j]=1;
    }
}