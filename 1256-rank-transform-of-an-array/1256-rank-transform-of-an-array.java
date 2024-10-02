class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;

        int[]ans=new int[n];
        SortedSet<Integer>set=new TreeSet<Integer>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
        int rank=1;
        for(int num : set){
           // int num=set.remove();
            map.put(num,map.getOrDefault(num,rank++));
        }
        for(int i=0;i<n;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
        
    }
}