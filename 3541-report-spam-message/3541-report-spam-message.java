class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
       HashSet<String>set=new HashSet<String>();

        LinkedHashMap<String,Integer>map=new LinkedHashMap<String,Integer>();
        int n=message.length;
        int count=0;
        for(int i=0;i<n;i++){
           
            map.put(message[i],map.getOrDefault(message[i],0)+1);
        }
        int m=bannedWords.length;
        for(int i=0;i<m;i++){
            set.add(bannedWords[i]);
        }
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            String str=it.next();
            if(map.containsKey(str)){
           
            // map.put(bannedWords[i],map.getOrDefault(bannedWords[i],0)+1);
            count+=map.get(str);
            //System.out.println(count);
           }

        }
           
        
        return count>=2?true:false ;
        
    }
}