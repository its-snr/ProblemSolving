class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        PriorityQueue<Integer>q=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            q.add(sum(nums[i]));
        }

      return q.poll();  
    }
    public int sum(int n){
        int t=n;
        int sum=0;
        while(t>0){
            sum+=t%10;
            t=t/10;
        }
        return sum;
    }
}