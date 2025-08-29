class Solution {
    public int singleNumber(int[] nums) {

        int n=nums.length;
        if(n==1)return nums[0];
        int maxElement=Integer.MIN_VALUE;
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

            Integer num=entry.getKey();
            Integer val=entry.getValue();
            if(val==1)return num;

        }
       return 0;

    }
}