class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
        int[] ans=new int[2];
        int j=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==2)ans[j++]=nums[i];
        }
        return ans;
    }
}