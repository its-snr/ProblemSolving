//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        int n=arr.length;
        int[] freq=new int[n+1];
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
       // System.out.println(freq[5]);
        for(int i=1;i<=n;i++){
            if(freq[i]==2)ans[0]=i;
            if(freq[i]==0)ans[1]=i;
        }
        //System.out.println( n*(n+1)/2);
        return ans;
        // code here
    }
}