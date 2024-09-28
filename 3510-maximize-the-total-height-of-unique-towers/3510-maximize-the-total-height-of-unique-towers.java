class Solution {
    public long maximumTotalSum(int[] h) {

        int n=h.length;
        Arrays.sort(h);
        long sum=0;
        int lh=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){

            int ch=Math.min(h[i],lh-1);
            if(ch<1){
                return -1;
            }
            sum+=ch;
            lh=ch;

        }
        return sum;
    }
}