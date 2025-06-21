class Solution {
    public int minimumDeletions(String word, int k) {

        int min=Integer.MAX_VALUE;

        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Integer>list=new ArrayList<>(map.values());
        Collections.sort(list);
        int n=list.size();
        for(int i=0;i<n;i++){
            int ans=0;
            int base=list.get(i);
            for(int j=0;j<i;j++){

               ans+=list.get(j); 
            }
            for(int j=i;j<n;j++){
                if(list.get(j)>base+k)ans+=list.get(j)-(base+k);
                
            }
            min=Math.min(ans,min);
        }

return min;
    }
}