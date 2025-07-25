class Solution {
    public int maxSum(int[] nums) {

        int[] arr=new int[101];
        
        int sum=0;
        int max=Integer.MIN_VALUE;
        if(nums.length==1)return nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 &&arr[nums[i]]==0){
            sum+=nums[i];
            arr[nums[i]]++;

            }
            max=Math.max(nums[i],max);
            
        }
        return sum==0?max:sum;
        
    }
}