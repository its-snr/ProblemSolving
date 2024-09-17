class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {


        String[] arr1=s1.split(" ");
        String[] arr2=s2.split(" ");
        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<String>ans=new ArrayList<String>();
        LinkedHashMap<String,Integer>map=new LinkedHashMap<String,Integer>();
        for(int i=0;i<n1;i++){

            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);

        }
        for(int i=0;i<n2;i++){

            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);

        }
        for(Map.Entry<String,Integer>hm:map.entrySet()){
            if(hm.getValue()<2)ans.add(hm.getKey());
            
        }
        String[] res=new String[ans.size()];
         res=ans.toArray(res);
         return res;
        
        
    }
}