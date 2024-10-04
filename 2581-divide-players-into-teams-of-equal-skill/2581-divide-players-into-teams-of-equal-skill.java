class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=0;
        int j=skill.length-1;
        long sum=skill[i]+skill[j];
        long ans=0;
        while(i<j){
            if(skill[i]+skill[j]==sum){
                long temp=skill[i]*skill[j];
                ans+=temp;
                i++;
                j--;
            }
            else return -1;
        }
        return ans;
        
    }
}