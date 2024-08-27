class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int maxElement=nums[n-1];
        int diff=-1;
        int ans=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<maxElement){
                diff=maxElement-nums[i];
                ans=Math.max(diff,ans);
            }
            else{
                maxElement=Math.max(maxElement,nums[i]);
            }
        }
        return ans;
    }
}