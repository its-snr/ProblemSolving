class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
if(n==0)return arr;
        int[]sort=arr.clone();
        Arrays.sort(sort);
        //SortedSet<Integer>set=new TreeSet<Integer>();
        // for(int i=0;i<n;i++){
        //     set.add(arr[i]);
        // }
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
        int rank=2;
        map.put(sort[0],1);
        for(int i=1;i<n;i++){
           // int num=set.remove();
           if(sort[i-1]==sort[i]){
            continue;
           }
            else {
                map.put(sort[i],rank++);
            }
            //rank++;
        }
        for(int i=0;i<n;i++){
            sort[i]=map.get(arr[i]);
        }
        return sort;
        
    }
}