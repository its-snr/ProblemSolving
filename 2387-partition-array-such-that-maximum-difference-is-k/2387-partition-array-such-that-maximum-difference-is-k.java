class Solution {
    public int partitionArray(int[] nums, int k) {

        int max=0;
        int subsequenceCount=0;
        for(int num:nums)max=Math.max(num,max);
        int[] freq=new int[max+1];
        for(int num:nums){
            freq[num]++;
        }
        for(int i=0;i<=max;i++){
            if(freq[i]>0){
                subsequenceCount++;
                i+=k;
            }
        }
        return subsequenceCount;
    }
}