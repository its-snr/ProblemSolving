class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long l=1;
        long h=Long.MAX_VALUE;
        long ans=h;
        while(l<=h){
            long m=(l+h)/2;
            if(f(mountainHeight,workerTimes,m)){
                ans=m;
                h=m-1;

            }
            else {
                l=m+1;
            }
        }
        return ans;
    }
    private boolean f(int mountainHeight, int[] workerTimes,long max){
        long tr=0;
        for( int t:workerTimes){
            long l=1;
            long h=mountainHeight;
            while(l<=h){
                long m=(l+h)/2;
                long c=(m*(m+1))/2*t;
                if(c<=max){
                    l=m+1;
                }
                else h=m-1;
            }
             tr+=h;
        if(tr>=mountainHeight)return true;
        }
        return tr>=mountainHeight;
       
    }
}