class Solution {
    public int[] frequencySort(int[] nums) {

        // int[] freq=new int[201];
        // for(int n:num{
        //     freq[n+100]++;
        // }
        // sort(freq,nums,0,nums.length-1);\
        int n=nums.length;
        int[] sol=new int[n];
        ArrayList<Integer> ans=new ArrayList<Integer>();
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            // ans[i]=nums[i];
            ans.add(nums[i]);

        }
        Collections.sort(ans,(n1,n2)->{
            int f1=map.get(n1);
            int f2=map.get(n2);
            if(f1==f2){
                return n2-n1;
            }
            return f1-f2;

        });
        for(int i=0;i<n;i++){
            sol[i]=ans.get(i);
        }
        return sol;
    }
    public void sort(int[] freq,int[] nums,int leftIndex,int rightIndex){
        if(leftIndex<rightIndex){
            int mid=(leftIndex+rightIndex)/2;
            sort(freq,nums,leftIndex,mid);
            sort(freq,nums,mid+1,rightIndex);
            merge(freq,nums,leftIndex,mid,rightIndex);
        }
    }
    public void merge(int[] freq,int nums[],int leftIndex,int mid,int rightIndex){
        int i,j,k;
        int n1=leftIndex-mid-1;
        int n2=mid-rightIndex;

        int[] leftArray=new int[n1];
        int[] rightArray=new int[n2];

        for(i=0;i<n1;i++){
            leftArray[i]=nums[leftIndex-1];
        }
        for(i=0;i<n2;i++){
            rightArray[i]=nums[mid-rightIndex-1];
        }

        
        
        }
    
}
