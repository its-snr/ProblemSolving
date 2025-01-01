class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int oCount=0;
        int ans=0;
        int zCount=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='1'){
                oCount++;
            }
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                zCount++;
                
            }
            else{
                oCount--;
            }
            //if(oCount==0)ans=n-1;
            ans=Math.max(ans,zCount+oCount);
            //ans=0;
        }
        return ans;
        
    }
}