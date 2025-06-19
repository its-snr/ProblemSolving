class Solution {
    public int partitionArray(int[] nums, int k) {

        Arrays.sort(nums);
        int minVal=nums[0];
        int subsequenceCount=1;
        for(int i=1;i<nums.length;i++){

            if(nums[i]-minVal>k){
                subsequenceCount++;
                minVal=nums[i];
            }

        }
        return subsequenceCount;
        
    }
}