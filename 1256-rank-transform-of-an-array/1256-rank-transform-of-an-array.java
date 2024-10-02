class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;

        int[]sort=arr.clone();
        Arrays.sort(sort);
        //SortedSet<Integer>set=new TreeSet<Integer>();
        // for(int i=0;i<n;i++){
        //     set.add(arr[i]);
        // }
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
        int rank=1;
        for(int num : sort){
           // int num=set.remove();
            if(map.containsKey(num)){
                map.put(num,map.get(num));
            }
            else {
                map.put(num,rank++);
            }
            //rank++;
        }
        for(int i=0;i<n;i++){
            sort[i]=map.get(arr[i]);
        }
        return sort;
        
    }
}