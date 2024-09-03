//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    
    // compute reverse of a number
    public static long rev(long n)
    {
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
        //testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int N;
		    
		    
            //input N
		    N=sc.nextInt();
		    int R=0;
		    
		    	    
            // reverse the given number n
		    R=(int)rev(N);
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
		    System.out.println(ans);
		    
		    
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
      public int mod=1000000007;  
    long power(int N,int R)
    {
        //Your code here
        if(N==0)return 0;
        return f(R,N);
        
    }
    long f(int x,int n){
        if(x==1){
            return n;
        }
        else if(x==0)return 1;
        //else if(x==2)return (n*n);
        else {long ans=f(x/2,n);
        
           ans=(ans*ans)%1000000007;
            
        
        if(x%2==1) return (ans*n)%1000000007;
         return ans;}
         //return 1;
        
    }

}
