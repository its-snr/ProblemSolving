class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=queries.length;
        //System.out.println(n);

        int[] ans=new int[n];
        
        for(int i=0;i<n;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            int temp=arr[start];
            // System.out.println(start);
            // System.out.println(end);
            for(int j=start+1;j<=end;j++){

                temp=temp^arr[j];
               // System.out.println(temp);
            }
            ans[i]=temp;
        }
        return ans;
        
    }
}