//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    int n=str1.length();
	    int m=str2.length();
	    int[][] dp=new int[n][m];
	    for(int row[]:dp)Arrays.fill(row,-1);
	    int lcs= f(str1,str2,n-1,m-1,dp);
	    int addition=n-lcs;
	    int deletion=m-lcs;
	    return addition+deletion;
	    //return dp[n-1][m-1];
	    // Your code goes here
	} 
	public int f(String s1,String s2,int n,int m,int[][] dp){
	    if(n<0|| m<0)return 0;
	    if(dp[n][m]!=-1)return dp[n][m];
	    if(s1.charAt(n)==s2.charAt(m)){
	        return dp[n][m]=1+f(s1,s2,n-1,m-1,dp);
	        
	    }
	    else{
	      return dp[n][m]= Math.max(f(s1,s2,n-1,m,dp),f(s1,s2,n,m-1,dp));
	       //return dp[n][m];
	        
	    } 
	    
	}
}