class Solution {
    public int[][] divideArray(int[] nums, int k) {

        int[][] ans=new int[nums.length/3][3];
        Arrays.sort(nums);
        int x=0;
        int y=0;
        int i=0;
        while(i<nums.length){
            int nums1=nums[i++];
            int nums2=nums[i++];
            int nums3=nums[i++];
            if(nums3-nums2<=k && nums2-nums1<=k && nums3-nums1<=k){                              
                ans[x][y++]=nums1;
                ans[x][y++]=nums2;
                ans[x][y]=nums3;
                y=0;
                x++;           
            }
            else return new int[0][0];
        }
        return ans;
        
    }
}