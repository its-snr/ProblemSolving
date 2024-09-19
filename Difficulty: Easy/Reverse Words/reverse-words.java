//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        StringBuilder sb=new StringBuilder();
        ArrayList<String>s=new ArrayList<String>();
        int n=str.length();
       
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            if(c=='.'){
              
                s.add(sb.toString());
                sb.setLength(0);
                
            }
            else {
                sb.append(c);
            }
            if(i==n-1)s.add(sb.toString());
        }
        sb.setLength(0);
        int size=s.size();
        for(int i=size-1;i>=0;i--){
            
            sb.append(s.get(i));
            if(i!=0)sb.append('.');
            
        }
        return sb.toString();
        // code here
    }
}