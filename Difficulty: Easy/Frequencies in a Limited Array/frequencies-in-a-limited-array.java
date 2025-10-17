class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        
        int n=arr.length;
        
        int[]freq=new int[n];
        for(int i=0;i<freq.length;i++){
            freq[arr[i]-1]++;
        }
        List<Integer>ans=new ArrayList<Integer>();
        for(int i=0;i<freq.length;i++){
            ans.add(freq[i]);
        }
        return ans;
        // code here
        
    }
}
