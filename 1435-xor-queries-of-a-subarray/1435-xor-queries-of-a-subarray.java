class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=queries.length;
        //System.out.println(n);

        int[] ans=new int[n];
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]^arr[i];

        }
        
        for(int i=0;i<n;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            if(start==0){
                ans[i]=prefix[end];
            }
            else{
                ans[i]=prefix[start-1]^prefix[end];
            }
        }
        return ans;
        
    }
}