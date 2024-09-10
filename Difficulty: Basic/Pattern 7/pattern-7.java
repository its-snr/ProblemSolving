//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        
        int m=(n*2)-1;
        int mid=m/2;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==mid)System.out.print("*");
                else if(j>=mid-i && j<=mid+i)System.out.print("*");
               // else if()System.out.print("*");
                else if(j<mid-i) System.out.print(" ");
                
            }
            System.out.println();
        }
        // code here
    }
}