class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        
        while(k-->0){
            int min=nums[0];
            int index=0;
            for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                index=i;
            }
            
        }
        //System.out.println(index);
        nums[index]=nums[index]*multiplier;

        }
        
       return nums; 
    }
}