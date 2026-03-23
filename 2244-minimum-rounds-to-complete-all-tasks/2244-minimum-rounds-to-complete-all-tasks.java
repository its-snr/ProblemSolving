class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int noOfWays=0;
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int freq=entry.getValue();
            if(freq<2){
                return -1;
            }
            else if (freq==2 || freq==3){
                noOfWays++;

            }
            else {
                if(freq%3==0)noOfWays+=freq/3;
                else noOfWays+=(freq/3)+1;
            }
        }
        return noOfWays;
        
    }
}