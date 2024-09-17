class Solution {
    public int countWords(String[] words1, String[] words2) {

        int n1=words1.length;
        int n2=words2.length;
        int count=0;

        LinkedHashMap<String,Integer>map1=new LinkedHashMap<String,Integer>();
        LinkedHashMap<String,Integer>map2=new LinkedHashMap<String,Integer>();

        for(int i=0;i<n1;i++){
            map1.put(words1[i],map1.getOrDefault(words1[i],0)+1);
        }
         for(int i=0;i<n2;i++){
            map2.put(words2[i],map2.getOrDefault(words2[i],0)+1);
        }
        for(String s: map1.keySet()){

            if(map2.containsKey(s)&&map2.get(s)==1&& map1.get(s)==1){
                count++;
            }

        }
        return count;
        
    }
}