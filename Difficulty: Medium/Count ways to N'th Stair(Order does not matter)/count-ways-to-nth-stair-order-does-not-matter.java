//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.nthStair(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public long nthStair(int n) {
        
        // int[] dp=new int[n+1];
        // dp[0]=0;
        // dp[1]=1;
        if(n==0)return 1;
        int curr=0;
        int prev=1;
        for(int i=2;i<=n;i++){
            if(i%2==0)curr=prev+1;
            else curr=prev;
            prev=curr;
        }
        return prev;
        // Code here
    }
}