class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n][m];
        for(int[] row:dp)Arrays.fill(row,-1);
        return f(text1,text2,n-1,m-1,dp);
        
    }   
    public int f(String s1,String s2,int n,int m,int[][]dp){
        if(n<0||m<0)return 0;
        if(dp[n][m]!=-1)return dp[n][m];
        if(s1.charAt(n)==s2.charAt(m)){
            return dp[n][m]=1+f(s1,s2,n-1,m-1,dp);
        }
        return dp[n][m]=Math.max(f(s1,s2,n-1,m,dp),f(s1,s2,n,m-1,dp));
    }
}