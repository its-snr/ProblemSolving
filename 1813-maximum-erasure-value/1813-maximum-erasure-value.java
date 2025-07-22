class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        int left=0;
        int right=0;
        int n=nums.length;

        HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();


        while(right<n){
            if(map.containsKey(nums[right])){
                map.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            else {
                map.put(nums[right],true);
                sum+=nums[right];
                maxSum=Math.max(sum,maxSum);
                right++;
            }
        }
        return maxSum;
    }
}